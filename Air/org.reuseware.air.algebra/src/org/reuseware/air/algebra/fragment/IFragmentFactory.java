package org.reuseware.air.algebra.fragment;

import org.eclipse.emf.ecore.EClass;
import org.reuseware.air.core.cm.IFragment;

public interface IFragmentFactory {
	
	public IFragment createFragmentInstance(EClass fragmentType);
	
}
