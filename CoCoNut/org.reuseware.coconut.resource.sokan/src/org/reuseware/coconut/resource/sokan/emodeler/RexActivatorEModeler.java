package org.reuseware.coconut.resource.sokan.emodeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.DefaultEModeler;

/**
 * A modeler for rex activator models. It extends the default 
 * modeler which means it essentially loads the model from
 * the corresponding file. In addition, it remembers the ID
 * of the loaded model to recall if it has modeled a certain 
 * element.
 */
public class RexActivatorEModeler extends DefaultEModeler {

	/**
	 * Adapter to used attach the ID to the modeled element.
	 */
	private class RexActivatorIDAdapter extends AdapterImpl {
		
		private List<String> id;
		
		public RexActivatorIDAdapter(List<String> id) {
			this.id = new ArrayList<String>(id);
		}
		
		public List<String> getID() {
			return id;
		}
	}
	
	/**
	 * Loads the activator list from the URI stored in the given row using
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
		if (SokanReuseResourceUtil.isRexActivator(row)) {
			List<? extends EObject> result = super.createMetaDataModel(row, resourceSet);
			for (EObject root : result) {
				root.eAdapters().add(
						new RexActivatorIDAdapter(row.getArtifactID().getSegments()));
			}
			return result;
		}
		return Collections.emptyList();
	}

	/**
	 * @param row the row from which to create the model
	 * @param eClass the type of the model to create
	 * 
	 * @return true if eClass is <code>ReuseExtensionActivatorList</code> and
	 *              if the given row has indexed a <code>ReuseExtensionActivatorList</code>
	 */
	public boolean canModel(IndexRow row, EClass eClass) {
		if (eClass != ReuseextensionactivatorPackage.Literals.REUSE_EXTENSION_ACTIVATOR_LIST) {
			return false;
		}
		return SokanReuseResourceUtil.isRexActivator(row);
	}

	/**
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * 
	 * @return true if element is a <code>ReuseExtensionActivatorList</code> and 
	 *              that has the correct ID adapter attached 
	 */
	public boolean wasModelled(EObject element, ID id) {
		if (element instanceof ReuseExtensionActivatorList) {
			for (Adapter a : element.eAdapters()) {
				if (a instanceof RexActivatorIDAdapter) {
					return ((RexActivatorIDAdapter) a).getID().equals(
							id.getSegments());
				}
			}
		}
		return false;
	}

}
