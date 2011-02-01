package org.reuseware.air.algebra;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.air.algebra.fragment.FragmentSystem;
import org.reuseware.air.core.cm.IFragment;

public class GenericFragment extends CompositionAlgebra {

	// context
	public enum CONTEXT { ROOT, CONTAINER }

	private List<EObject> fragments = null;

	public GenericFragment() {

	}

	public boolean isLoaded() {

		return (fragments != null);
	}

	/**
	 * Implementing IFragment interface
	 * 
	 */
	public void setFragments(List<EObject> fragments) {
		this.fragments = fragments;  
	}

	/**
	 * Implementing IFragment interface
	 * 
	 */
	public List<EObject> getFragments() {
		return fragments;
	}

	/**
	 * Implementing IFragment interface
	 * 
	 */
	public EObject getFragment() {
		return fragments.get(0); 
	}


	/**
	 * Load a fragment 
	 * 
	 */
	protected static void load(IFragment construct, String file) {

		FragmentSystem fr = FragmentSystem.getInstance(); 

		if (construct instanceof GenericFragment) {
			GenericFragment gf = (GenericFragment)construct; 
			List<EObject> result = fr.load(gf.getType(), file);
			gf.setFragments(result);
		}

		return;
	}


	/**
	 * Retrieves the content of the fragment 
	 * 
	 * @return
	 */
	public String toString() {
		//TODO
		if (isLoaded()) {
			FragmentSystem fr = FragmentSystem.getInstance();
			//return fr.printToString(getFragments()).trim(); 
		}
		return null;
	}

	/**
	 * Print fragment 
	 * 
	 * @param file
	 */
	public void print(String file) { 

		if (this instanceof GenericFragment) {
			GenericFragment gf = (GenericFragment)this;
			FragmentSystem fs = FragmentSystem.getInstance();
			fs.print(gf.getFragments(), file); 
		}
	}

	/**
	 * Implementing IFragment interface
	 * 
	 */
	public String getType() {
		if (this instanceof IFragment) {
			String type = this.getClass().getName(); 
			// For example: 
			// "de.tudresden.reuseware.language.xcerpt.IVariableImpl"
			// ->
			// "Variable" 
			return type.substring(type.lastIndexOf('.') + 2, type.indexOf("Impl"));
		}
		// default 
		return null;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	//	public GenericFragment getRoot2() { 
	//		if (this instanceof GenericFragment) {
	//			GenericFragment fragment = (GenericFragment)this;
	//			if (fragment.getFragment() != null) {
	//				// only get the first fragment
	//				EObject eFrgmt = fragment.getFragment(); 
	//				// get the root object
	//				EObject contextRoot = EcoreUtil.getRootContainer(eFrgmt);
	//				// repackage the root object in a fragment 
	//				GenericFragment genRoot = new GenericFragment(); 
	//				LinkedList<EObject> list = new LinkedList<EObject>();
	//				list.add(contextRoot);
	//				genRoot.setFragments(list); 
	//				return genRoot; 
	//			}
	//		}
	//		// default
	//		return null;
	//	}


	/**
	 * 
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public EObject getContextObject(Enum<CONTEXT> context) {

		if (this instanceof GenericFragment) {
			GenericFragment fragment = (GenericFragment)this; 
			if (fragment.getFragment() != null) {
				// only get the first fragment
				EObject eFrgmt = fragment.getFragment();

				// check context
				EObject contextObj = null; 
				if (((Enum<CONTEXT>) context).compareTo(CONTEXT.ROOT) == 0) {

					// get the root object
					contextObj = EcoreUtil.getRootContainer(eFrgmt);

				} else if (((Enum<CONTEXT>) context).compareTo(CONTEXT.CONTAINER) == 0) {

					contextObj = eFrgmt.eContainer();
					if (contextObj == null) {
						contextObj = eFrgmt;
					}
				}

				return contextObj;
			}
		}
		// default
		return null;
	}


	public static void getContextInstance(EObject contextObj, Object objOfRootCls) {

		try {

			List<EObject> list = new LinkedList<EObject>();
			list.add(contextObj);

			// get class with method
			Class genClass = Class.forName("org.reuseware.air.algebra.GenericFragment");

			Class[] types = new Class[] {java.util.List.class};
			Method method = genClass.getDeclaredMethod("setFragments", types); 
			method.invoke(objOfRootCls, list); 

//			return objOfRootCls;  

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// default
		return;
//		return null;
	}

	/**
	 * Needs to be here due to inheritance, but is not used. 
	 * 
	 * @return
	 */
	public IFragment copy() {
		// TODO Auto-generated method stub
		return null;
	}

}
