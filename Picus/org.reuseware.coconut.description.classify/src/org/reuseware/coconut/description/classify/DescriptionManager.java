/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.description.classify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DerivationState;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.classify.derive.DerivationManager;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.PackageableElement;
import org.reuseware.coconut.repository.RepositoryFactory;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.repository.util.IDUtil;
import org.reuseware.coconut.ui.eclipse.resource.WorkspaceFragmentStoreManager;

/**
 * This class provides a number of functionalities to work with concepts for
 * describing a <code>Fragment</code> in the Reuseware meaning. These include
 * <code>FragmentDescription</code> and <code>Facet</code>. <br>
 * <br>
 * Usually it stores all changes to these concepts into a file in the Reuseware
 * store. This file needs to be registered in a Reuseware fragment store, it has
 * the ending *.fdesc and the same name as the <code>Fragment</code>'s file it
 * describes.
 * 
 * @author Matthias Schmidt
 * 
 */
public class DescriptionManager {

	/**
	 * The file ending of a <code>FragmentDescription</code> in the store.
	 */
	private static String DESCRIPTION_FILE_ENDING = "fdesc";
	/**
	 * The name / label which is shown for the dummy fact in the GUI.
	 */
	public static String DUMMY_FACET_TYPE = "[Add Facet]";
	/**
	 * The default properties.
	 */
	public static String[] PROPERTY_TYPES = { "Name", "Author", "Version", "Hint" };

	/**
	 * Builds a <code>Facet</code> out of the given type and values and adds it
	 * to the given <code>FragmentDescription</code>.
	 * 
	 * @param context
	 *            The description the <code>Facet</code> should be added to.
	 * @param type
	 *            The <code>FacetType</code> of the description's facet.
	 * @param values
	 *            The <code>FacetValue</code>s which where selected for the
	 *            given <code>FacetType</code>.
	 * @return <code>True</code> if the build and adding process was successful,
	 *         else <code>false</code>;
	 */
	public static boolean addFacet(FragmentDescription context, FacetType type,
			List<FacetValue> values) {
		if (context == null || type == null || values == null)
			return false;

		Facet newFacet = buildFacet(type, values);

		// append to FragementDescription and save it
		context.getFacets().add(newFacet);
		return save(context);
	}

	public static boolean addFragmentenToDesc(Fragment fragment) {
		FragmentDescription desc = getDescriptionFor(fragment);
		if (desc == null)
			return false;

		desc.setSubject(fragment);
		return true;
	}

	/**
	 * Checks whether the given file is described by the given
	 * <code>FragmentDescription</code>. <br>
	 * <br>
	 * <b>Hint:</b><br>
	 * The file needs to be a <code>Fragment</code> in the Reuseware context and
	 * needs to be registered in the store.
	 * 
	 * @param fragmentFile
	 *            The file to check.
	 * @param potentialContext
	 *            The <code>FragmentDescription</code> object which could be the
	 *            description for the give file.
	 * @return <code>True</code> if both belong together, else
	 *         <code>false</code>.
	 */
	public static boolean belongTogether(IFile fragmentFile, FragmentDescription potentialContext) {
		if (potentialContext == null)
			return false;

		// get Fragment's URI
		URI fragURI = WorkspaceFragmentStoreManager.getURI(fragmentFile);

		// open corresponding FragmentDescription file
		FragmentDescription fDesc = DescriptionManager.getDescription(DescriptionManager
				.getDescriptionURI(fragURI));
		if (fDesc == null)
			return false;

		return potentialContext.equals(fDesc);
	}

	/**
	 * Takes a FragmentDescription and builds the it's inner structure.<br>
	 * Most importantly the Fragment is added to it.
	 * 
	 * @see FragmentDescription
	 * 
	 * @param desc
	 *            The description in focus.
	 * @return The updated FragmentDescription.
	 */
	public static FragmentDescription build(FragmentDescription desc) {
		System.out.println("try build");

		return desc;
	}

	/**
	 * Simply build an <code>Facet</code> instance out of the given details.
	 * 
	 * @param type
	 *            The <code>Facet</code>'s type.
	 * @param values
	 *            The <code>FacetValue</code>s which where selected for the
	 *            given <code>FacetType</code>.
	 * @return The new created <code>Facet</code> object.
	 */
	public static Facet buildFacet(FacetType type, List<FacetValue> values) {
		Facet newFacet = DescriptionFactory.eINSTANCE.createFacet();

		// set FacetType and typeID
		newFacet.setType(type);
		newFacet.getTypeID().addAll(FacetManager.getTypeID(type).getSegments());

		// set FacetValues and valuesNames
		newFacet.getValues().addAll(values);
		for (FacetValue facetValue : values)
			newFacet.getValueNames().add(facetValue.getName());
		return newFacet;
	}

	/**
	 * Creates a <code>FragmentDescription</code> object out of details stored
	 * in the given file. <br>
	 * <br>
	 * <b>Hint:</b><br>
	 * The file needs to be in a Reuseware store.
	 * 
	 * @param fragmentFile
	 *            The file which intents to be the on which stores the
	 *            <code>FragmentDescription</code>.
	 * @return A new created <code>FragmentDescription</code> object, or
	 *         <code>null</code> if anything goes wrong.
	 */
	public static FragmentDescription createDescription(IFile fragmentFile) {
		return build(fragmentFile, true);
	}

	/**
	 * Retrieves a <code>List</code> of <code>FragmentDescription</code>s which
	 * represents all registered descriptions in the Reuseware store.
	 * 
	 * @return All available <code>FragmentDescription</code>s.
	 */
	public static List<FragmentDescription> getRegisteredDescriptions() {
		List<FragmentDescription> descriptions = new LinkedList<FragmentDescription>();

		FragmentDescription desc;
		for (PackageableElement packedElement : ReuseResources.INSTANCE.getRootPackage()
				.getAllElements()) {
			if (packedElement instanceof FragmentDescription) {
				desc = (FragmentDescription) packedElement;
				refresh(desc);
				descriptions.add(desc);
			}
		}

		return descriptions;
	}

	/**
	 * Allows the client to edit a given <code>Facet</code>.
	 * 
	 * @param context
	 *            The <code>FragmentDescription</code> which owns the
	 *            <code>Facet</code>.
	 * @param editFacet
	 *            The <code>Facet</code> which should be changed.
	 * @param newValues
	 *            The <code>FacetValue</code>s which where selected to change
	 *            the <code>Facet</code>.
	 */
	public static void editFacet(FragmentDescription context, Facet editFacet,
			EList<FacetValue> newValues) {
		if (context == null || editFacet == null || newValues == null)
			return;
		removeFacet(context, editFacet);
		addFacet(context, editFacet.getType(), newValues);
	}

	/**
	 * The dummy facet is a place holder for the GUI and is simply used to allow
	 * adding new <code>Facet</code>s to the <code>FragmentDescription</code>. <br>
	 * <br>
	 * This method checks whether the given <code>Object</code> is the dummy
	 * facet.
	 * 
	 * @param obj
	 *            The <code>Object</code> to check.
	 * @return <code>True</code> if it is a dummy facet, else <code>false</code>
	 *         .
	 */
	public static boolean isDummyFacet(Object obj) {
		if (obj == null || !(obj instanceof Facet))
			return false;
		Facet facet = (Facet) obj;
		return facet.getTypeID().get(0).equals(DUMMY_FACET_TYPE);
	}

	/**
	 * Derived <code>Facets</code>s are facets with values which were calculated
	 * out of the <code>Fragment</code> linked to the
	 * <code>FragmentDescription</code> and <code>DerivationData</code> linked
	 * to the <code>FacetType</code>.
	 * 
	 * @see DerivationData
	 * 
	 * @param obj
	 *            The <code>Object</code> to test.
	 * @return <code>True</code> if it is a derived facet, else
	 *         <code>false</code> .
	 */
	public static boolean isDerivedFacet(Object obj) {
		if (obj == null || !(obj instanceof Facet))
			return false;
		Facet facet = (Facet) obj;
		return FacetManager.isDerivableType(facet.getType());
	}

	/**
	 * Builds the inner structure of a newly created
	 * <code>FragmentDescription</code> object. The information needed is read
	 * out of the *.fdesc file in the Reuseware store.
	 * 
	 * @param fDesc
	 *            The fragment description which needs a new inner structure.
	 */
	public static void loadDescription(FragmentDescription fDesc) {
		// try to add the subject!
		if (fDesc.getSubject() == null)
			fDesc.setSubject(getFragmentFor(fDesc));

		// solve FacetType and FavetValue ids
		solveFacets(fDesc);

		// add some more facets (derived by the fragment)
		addDeriveFacets(fDesc);

		// add the dummy facet
		addDummyFacet(fDesc);
	}

	/**
	 * Opens the <code>FragmentDescription</code> for the given
	 * <code>Fragment</code> file.
	 * 
	 * @param fragmentFile
	 *            The file which stores the <code>Fragment</code>.
	 * @return The new <code>FragmentDescription</code> object or
	 *         <code>null</code> if anything went wrong.
	 */
	public static FragmentDescription open(IFile fragmentFile) {
		return build(fragmentFile, false);
	}

	/**
	 * Sets the <code>FragmentDescription</code>'s subject attribute and derives
	 * new facets.<br>
	 * Both if needed!
	 * 
	 * @param desc
	 *            The description to change.
	 */
	public static void refresh(FragmentDescription desc) {
		if (desc == null)
			return;

		// refresh the subject
		if (desc.getSubject() == null) {
			Fragment fragment = getFragmentFor(desc);
			if (fragment == null)
				return;
			desc.setSubject(fragment);
		}

		// derive facets
		addDeriveFacets(desc);
	}

	/**
	 * Deletes a <code>Facet</code> from the given
	 * <code>FragmentDescription</code>.
	 * 
	 * @param context
	 *            The <code>FragmentDescription</code> which owns the
	 *            <code>Facet</code>.
	 * @param selectedFacet
	 *            The one to delete.
	 */
	public static void removeFacet(FragmentDescription context, Facet selectedFacet) {
		if (selectedFacet == null || isDummyFacet(selectedFacet))
			return;

		context.getFacets().remove(selectedFacet);
		save(context);
	}

	/**
	 * Stores the given <code>FragmentDescription</code> into a file.
	 * 
	 * @param fDesc
	 *            The <code>FragmentDescription</code> recently changed.
	 * @return <code>True</code> if the process was successful, else
	 *         <code>false</code>.
	 */
	public static boolean save(FragmentDescription fDesc) {
		if (fDesc.eResource().getURI() == null)
			return false;
		System.err.println("**Save**");
		return save(fDesc, fDesc.eResource().getURI());
	}

	/**
	 * Stores the given <code>FragmentDescription</code> into a file described
	 * by the <code>URI</code>.
	 * 
	 * @param fDesc
	 *            The <code>FragmentDescription</code> recently changed.
	 * @param uri
	 *            The <code>URI</code> which identifies the *.fdesc file.
	 * @return <code>True</code> if the process was successful, else
	 *         <code>false</code>.
	 */
	public static boolean save(FragmentDescription fDesc, URI uri) {
		// don't store ID in the file
		ID id = fDesc.getID();
		fDesc.setID(null);

		// don't store dummy facet
		Facet dummy = null;
		for (Facet facet : fDesc.getFacets()) {
			if (isDummyFacet(facet)) {
				dummy = facet;
				break;
			}
		}
		if (dummy != null)
			fDesc.getFacets().remove(dummy);

		// don't store derived facets
		List<Facet> derivedFacets = new LinkedList<Facet>();
		for (Facet facet : fDesc.getFacets()) {
			if (isDerivedFacet(facet)) {
				derivedFacets.add(facet);
				fDesc.getFacets().remove(facet);
			}
		}

		// begin serialization
		ResourceSet rs = ReuseResources.INSTANCE.getResourceSet();
		Resource res = rs.createResource(uri);
		try {
			res.unload();
			res.getContents().add(fDesc);
			res.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		// bring back in the data, which should not be stored in the file
		fDesc.setID(id);
		if (dummy != null)
			fDesc.getFacets().add(dummy);
		fDesc.getFacets().addAll(derivedFacets);

		return true;
	}

	public static void setDirty(FragmentDescription fDesc){
		fDesc.setDerivationState(DerivationState.REFRESH_ALL);
	}
	
	private static void addDeriveFacets(FragmentDescription focus) {
		if (focus.getDerivationState().equals(DerivationState.UP_TO_DATE))
			return;

		focus = DerivationManager.getInstance().derive(focus);
		focus.setDerivationState(DerivationState.UP_TO_DATE);
	}

	private static void addProperties(FragmentDescription focus) {
		for (String type : PROPERTY_TYPES) {
			Property property = DescriptionFactory.eINSTANCE.createProperty();
			property.setName(type);

			if (type.equals("Name")) {
				ID id = focus.getSubject().getID();
				String name = id.segment(-1);
				name = name.substring(0, name.lastIndexOf('.'));
				property.setValue(name);
			} else
				property.setValue("");

			focus.getProperties().add(property);
		}
	}

	private static FragmentDescription build(IFile fragmentFile, boolean createNew) {
		// get the Fragment as subject
		URI fragURI = WorkspaceFragmentStoreManager.getURI(fragmentFile);
		Fragment subject = DescriptionManager.getFragment(fragURI);
		if (subject == null)
			return null;

		// try to open existing FragmentDescription file
		FragmentDescription fDesc = DescriptionManager.getDescription(DescriptionManager
				.getDescriptionURI(fragURI));

		if (fDesc != null) {
			// opening was successful, first set the subject
			fDesc.setSubject(subject);

			loadDescription(fDesc);
		} else if (createNew) {
			// no FragmentDescription found, create a new one from scratch
			fDesc = DescriptionFactory.eINSTANCE.createFragmentDescription();

			// set ID
			String idString = ReuseResources.INSTANCE.getLogicalURI(getDescriptionURI(fragURI))
					.toString();
			idString = idString.substring(idString.indexOf("/") + 1, idString.length());
			System.out.println("idString: " + idString);
			fDesc.setIDAsString(idString);

			// set the subject
			fDesc.setSubject(subject);

			// set the initial list of properties
			addProperties(fDesc);

			// set some facets (inferred by the fragment)
			// addDeriveFacets(fDesc);

			// add the dummy facet
			addDummyFacet(fDesc);

			// try to save FragementDescription
			URI descURI = DescriptionManager.getDescriptionURI(fragURI);
			if (!DescriptionManager.save(fDesc, descURI))
				fDesc = null;
		}

		return fDesc;
	}

	private static void addDummyFacet(FragmentDescription desc) {
		for (Facet facet : desc.getFacets()) {
			if (isDummyFacet(facet))
				return;
		}

		Facet dummyFacet = DescriptionFactory.eINSTANCE.createFacet();
		dummyFacet.getTypeID().add(DUMMY_FACET_TYPE);
		dummyFacet.getValueNames().add("");

		FacetType dummyType = DescriptionFactory.eINSTANCE.createListFacet();
		dummyType.setName(DUMMY_FACET_TYPE);
		dummyType.setDescription("A Placeholder");

		FacetValue dummyValue = DescriptionFactory.eINSTANCE.createFacetValue();
		dummyValue.setName("");
		dummyValue.setDescription("");

		dummyFacet.setType(dummyType);
		dummyFacet.getValues().add(dummyValue);

		desc.getFacets().add(dummyFacet);
	}

	private static URI getDescriptionURI(URI fragmentURI) {
		URIConverter internalURIConverter = new ExtensibleURIConverterImpl();
		URI descURI = internalURIConverter.normalize(fragmentURI);

		descURI = descURI.appendFileExtension(DESCRIPTION_FILE_ENDING);

		// descURI = descURI.appendFileExtension(
		// DESCRIPTION_FILE_ENDING);

		return descURI;
	}

	private static URI getFragmentURI(URI descURI) {
		URIConverter internalURIConverter = new ExtensibleURIConverterImpl();
		URI fragmentURI = internalURIConverter.normalize(descURI);

		if (!descURI.fileExtension().equals(DESCRIPTION_FILE_ENDING)) {
			// description URI's format not correct
			System.err.println("Error!");
			return null;
		}
				
		try {
			fragmentURI = descURI.trimFileExtension();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}

		return fragmentURI;
	}

	private static PackageableElement getElement(URI fragURI) {
		if (fragURI == null)
			return null;

		URI logic = ReuseResources.INSTANCE.getLogicalURI(fragURI);
		if (logic == null)
			return null;

		PackageableElement element = ReuseResources.INSTANCE.getElement(
				IDUtil.uriToID(logic));
		return element;
	}

	private static Fragment getFragment(URI fragURI) {
		PackageableElement element = DescriptionManager.getElement(fragURI);
		if (element instanceof Fragment)
			return (Fragment) element;
		return null;
	}

	private static FragmentDescription getDescription(URI descURI) {
		PackageableElement element = DescriptionManager.getElement(descURI);
		if (element instanceof FragmentDescription) {
			FragmentDescription fDesc = (FragmentDescription) element;
			return fDesc;
		}
		return null;
	}
		
	private static FragmentDescription getDescriptionFor(Fragment fragment) {
		if (fragment == null)
			return null;

		URI fragURI = null;
		if (fragment.eResource() != null)
			fragURI = fragment.eResource().getURI();
		else {
			fragURI = IDUtil.idToURI(fragment.getID());
		}
		if (fragURI == null)
			return null;

		URI descURI = getDescriptionURI(fragURI);
		if (descURI == null)
			return null;

		return getDescription(descURI);
	}

	private static Fragment getFragmentFor(FragmentDescription desc) {
		if (desc == null)
			return null;

		URI descURI;
		if (desc.eResource() != null)
			descURI = desc.eResource().getURI();
		else {
			if (desc.getID() == null) {
				System.err.println("Getting the fragment for the description was not possible.");
				return null;
			}
			descURI = IDUtil.idToURI(desc.getID());
		}
		if (descURI == null)
			return null;

		URI fragURI = getFragmentURI(descURI);
		if (fragURI == null)
			return null;

		return getFragment(fragURI);
	}

	/**
	 * Uses a FacetType id string to retrieve the right FacetType instance. <br>
	 * This instance needs to be registered with the ReuseResources object and
	 * the id string needs to be in the following format: <br>
	 * <br>
	 * {s0,s1,...,sn-1,sn | s0...sn-1=FacetDefinition.getID(),
	 * sn=FacetType.getName()}
	 * 
	 * @param id
	 *            The <code>List</code> of <code>String</code>s describing the
	 *            FacetType we look for.
	 * @return
	 */
	private static FacetType getTypeByID(ID id) {
		if (id == null || id.getSegments().size() == 0)
			return null;

		FacetType back = null;
		String facetTypeName = id.getSegments().remove(id.getSegments().size() - 1);

		// search for FacetDefinition in registered Elements
		PackageableElement elem = ReuseResources.INSTANCE.getElement(id);
		if (elem instanceof FacetDefinition) {
			// browse FacetType names for given type name
			FacetDefinition fDef = (FacetDefinition) elem;
			for (FacetType fType : fDef.getFacetTypes()) {
				if (fType.getName().equals(facetTypeName)) {
					back = fType;
					break;
				}
			}
		}
		id.getSegments().add(facetTypeName);
		return back;
	}

	private static List<FacetValue> getValuesByID(EList<String> valueList, FacetType facetType) {
		List<FacetValue> back = new ArrayList<FacetValue>();
		if (facetType == null || valueList == null || valueList.size() == 0)
			return back;

		// browse the FacetType and look for the given FacetValue name
		for (String value : valueList) {
			for (FacetValue fValue : facetType.getValues()) {
				if (fValue.getName().equals(value)) {
					back.add(fValue);
					break;
				}
			}
		}
		return back;
	}

	private static boolean solveFacets(FragmentDescription desc) {
		// return if there are no facets stored
		if (desc == null || desc.getFacets() == null || desc.getFacets().size() == 0)
			return false;

		// for each facet: add facetValue and facetType
		List<Facet> facets = desc.getFacets();
		for (Facet facet : facets) {
			if (facet.getType() == null) {
				ID typeID = RepositoryFactory.eINSTANCE.createID();
				typeID.getSegments().addAll(facet.getTypeID());
				facet.setType(getTypeByID(typeID));
			}
			facet.getValues().addAll(getValuesByID(facet.getValueNames(), facet.getType()));
		}
		return true;
	}

	// public URI getURIFor(List<String> id) {
	// if (id == null)
	// return null;
	//		
	// URI back = ReuseResources.REUSEWARE_BASE_URI;
	// try {
	// String[] template = {};
	// back = back.appendSegments(id.toArray(template));
	// } catch (IllegalArgumentException e) {
	// return null;
	// }
	//		
	// return back;
	// }
}
