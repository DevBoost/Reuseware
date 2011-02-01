package org.reuseware.sokan.test.exampleindexer.emodeler;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanPackage;
import org.reuseware.sokan.index.emodeler.EModeler;

public class TestEModeler implements EModeler {

	public List<EObject> createMetaDataModel(IndexRow row, ResourceSet resourceSet) {
		return Collections.emptyList();
	}

	public boolean canModel(IndexRow row, EClass eClass) {
		return SokanPackage.Literals.ID.equals(eClass);
	}

	public boolean wasModelled(EObject element, ID id) {
		return SokanPackage.Literals.ID.isInstance(element);
	}
}
