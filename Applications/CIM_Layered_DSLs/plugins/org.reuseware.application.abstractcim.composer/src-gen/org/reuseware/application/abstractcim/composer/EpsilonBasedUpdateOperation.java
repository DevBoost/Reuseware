/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.application.abstractcim.composer;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.etl.EtlModule;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.util.IDerivedCompositionProgramUpdateOperation;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.repository.util.IDUtil;

public class EpsilonBasedUpdateOperation implements IDerivedCompositionProgramUpdateOperation {

	public static final String fileExtension = "abstractcim";
	public static final String nsURI = "http://www.reuseware.org/application/abstractcim";
	
	public boolean canUpdate(Fragment fragment) {
		return fragment != null && fragment.getID() != null && fragment.getID().segment(-1).endsWith("." + fileExtension);
	}
	
	public DerivedCompositionProgram update(Fragment fragment) {
		if (fragment == null || fragment.getID() == null) {
			return null;
		}
		
		DerivedCompositionProgram derivedCompositionProgram = null;
		ID cpID = fragment.getID().appendExtension("fc");
		
		URI physicalFragmentURI = ReuseResources.INSTANCE.getResourceSet(
				).getURIConverter().normalize(IDUtil.idToURI(fragment.getID()));
		URI physicalCpURI = physicalFragmentURI.appendFileExtension("temp_fc");
		
		if (!IDUtil.equals(physicalFragmentURI, fragment.getID())) {
			EtlModule module = new EtlModule();
			try {
				module.parse(this.getClass().getClassLoader().getResource("transformations/builder.etl").toURI());
				EmfModel source = new EmfModel();
				StringProperties properties = new StringProperties();
				properties.put(EmfModel.PROPERTY_NAME, "Source");
				properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
				properties.put(EmfModel.PROPERTY_METAMODEL_URI, nsURI);
				properties.put(EmfModel.PROPERTY_MODEL_FILE, physicalFragmentURI.toPlatformString(true));
				properties.put(EmfModel.PROPERTY_READONLOAD, "true");
				properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,"false");
				source.load(properties, ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toPortableString());
				module.getContext().getModelRepository().addModel(source);
				
				EmfModel fc = new EmfModel();
				properties = new StringProperties();
				properties.put(EmfModel.PROPERTY_NAME, "Fc");
				properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
				properties.put(EmfModel.PROPERTY_METAMODEL_URI, CompositionprogramPackage.eNS_URI);
				properties.put(EmfModel.PROPERTY_MODEL_FILE, physicalCpURI.toPlatformString(true));
				properties.put(EmfModel.PROPERTY_READONLOAD, "false");
				properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,"false");
				fc.load(properties, ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toPortableString());
				
				module.getContext().getModelRepository().addModel(fc);
				
				ID targetUFI = fragment.getID(); //Reuseware will change the file extensions
				module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("targetUFI", targetUFI.getSegments()));
				
				module.execute();
				
				for(EObject result : fc.allContents()) {
					if(result instanceof DerivedCompositionProgram) {
						derivedCompositionProgram = (DerivedCompositionProgram) EcoreUtil.copy(result);
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				module.getContext().getModelRepository().dispose();
			}		}

		if (derivedCompositionProgram == null) {
			derivedCompositionProgram = 
				CompositionprogramFactory.eINSTANCE.createDerivedCompositionProgram();
		}
		derivedCompositionProgram.setID(cpID);
		
		return derivedCompositionProgram;
	}
}
