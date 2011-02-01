package org.reuseware.air.algebra.fragment;

import java.util.HashMap;
import java.util.Map;

public class FragmentFactoryRegistry {
	
	private static FragmentFactoryRegistry instance = null;
	private Map<String,IFragmentFactory> factories = null;
	
	
	private FragmentFactoryRegistry(){
		factories = new HashMap<String,IFragmentFactory>();
	}
	
	public static synchronized FragmentFactoryRegistry getInstance(){
		if(instance==null)
			instance = new FragmentFactoryRegistry();
		return instance;
	}
	
	public IFragmentFactory addFragmentFactory(String nsURI, IFragmentFactory factory){
		if(nsURI==null||factory==null)
			throw new IllegalArgumentException("Arguments must not be null.");
		return factories.put(nsURI,factory);
	}
	
	public IFragmentFactory removeFragmentFactory(String nsURI){
		if(nsURI==null)
			throw new IllegalArgumentException("Arguments must not be null.");
		return factories.remove(nsURI);
	}
	
	public IFragmentFactory getFactory(String nsURI){
		return factories.get(nsURI);
	}

}
