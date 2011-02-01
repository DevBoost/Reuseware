package org.reuseware.coconut.resource.sokan.emodeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.DefaultEModeler;

/**
 * A modeler for fracol and rex models. It extends the default 
 * modeler which means it essentially loads the model from
 * the corresponding file. In addition, the wasModelled() 
 * implementation makes use of the IDs stored inside
 * the models.
 */
public class MetaArtifactEModeler extends DefaultEModeler {

	/**
	 * Loads the model from the URI stored in the given row using
	 * the given resource set and attaches the ID  stored in the row to
	 * the loaded model using an adapter.
	 * 
	 * @param row
	 *            data stored in the index that is the base for the creation of
	 *            the model object
	 * @param resourceSet
     *            the resource set to use when loading models
     *            
	 * @return list of loaded root <code>EObject</code>s
	 */
	public List<? extends EObject> createMetaDataModel(IndexRow row, ResourceSet resourceSet) {
		if (SokanReuseResourceUtil.isMetaArtifact(row)) {
			return super.createMetaDataModel(row, resourceSet);
		}
		return Collections.emptyList();
	}

	/**
	 * @param row the row from which to create the model
	 * @param eClass the type of the model to create
	 * 
	 * @return true if eClass is
	 *              <code>FragmentCollaboration</code>,
	 *              <code>ComponentModelSpecification</code>, or
	 *              <code>CompositionLanguageSpecification</code>.
	 */
	public boolean canModel(IndexRow row, EClass eClass) {
		if (eClass == null) {
			return false;
		}
		if (eClass != ReuseextensionPackage.Literals.COMPONENT_MODEL_SPECIFICATION
				&& eClass != ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION
				&& eClass != FracolPackage.Literals.FRAGMENT_COLLABORATION) {
			return false;
		}
		return SokanReuseResourceUtil.isMetaArtifact(row);
	}

	/**
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * 
	 * @return true if element is a <code>FragmentCollaboration</code> 
	 *              or a <code>ReuseExtension</code> and if the given ID 
	 *              corresponds to the ID stored in the model
	 */
	public boolean wasModelled(EObject element, ID id) {
		if (element instanceof ReuseExtension) {
			List<String> rexID = new ArrayList<String>(((ReuseExtension) element).getRexNamespace());
			rexID.add(((ReuseExtension) element).getRexName());
			return id.getSegments().equals(rexID);
		} else if (element instanceof FragmentCollaboration) {
			List<String> fracolID = new ArrayList<String>(((FragmentCollaboration) element).getFracolNamespace());
			fracolID.add(((FragmentCollaboration) element).getFracolName());
			return id.getSegments().equals(fracolID);
		}
		return false;
	}
}
