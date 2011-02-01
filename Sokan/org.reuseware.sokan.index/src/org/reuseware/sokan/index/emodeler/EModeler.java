package org.reuseware.sokan.index.emodeler;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;

/**
 * Interface for modelers which create models with the help of information
 * from the index.
 */
public interface EModeler {

	/**
	 * Allows to obtain a list of <code>EObject</code>s out of an index row.
	 * Furthermore, these <code>EObject</code>s need to be of the type specified
	 * by this <code>EModeler</code> extension.
	 * 
	 * @see IndexUtil#getEModel(ID, EClass)
	 * 
	 * @param row
	 *            data stored in the index that is the base for the creation of
	 *            the model object
	 * @param resourceSet
     *            the resource set to use when loading models
	 *            
	 * @return A list of <code>EObject</code>s.
	 */
	List<? extends EObject> createMetaDataModel(IndexRow row,
			ResourceSet resourceSet);

	/**
	 * Determines if the modeler can create some model for the
	 * given index row with the given EClass as type.
	 * 
	 * @param row the row from which to create the model
	 * @param eClass the type of the model to create
	 * 
	 * @return true if a model of desired type can be created
	 */
	boolean canModel(IndexRow row, EClass eClass);

	/**
	 * Determines whether the given element was created
	 * by this modeler for the row with the given ID.
	 * 
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * 
	 * @return true if the element was modeled by this modeler
	 */
	boolean wasModelled(EObject element, ID id);
}
