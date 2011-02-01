package org.reuseware.air.algebra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.reuseware.air.core.cm.IFragment;
import org.reuseware.air.core.util.GenericCompositionAlgebra;

import org.reuseware.air.language.componentmodel.FragmentType;
import org.reuseware.air.language.componentmodel.Slot;
import org.reuseware.air.language.componentmodel.VariationPointName;

public abstract class CompositionAlgebra extends EObjectImpl implements IFragment {

	String eURIPrefix = "http://www-st.inf.tu-dresden.de/reuseware/language/";
	
	// different ways to use extend() 
	protected enum ExtendVariant { DEFAULT, PREPEND, APPEND } 

	/**
	 * Replace a fragment (bind and replace)
	 * 
	 * @param value
	 */
	public void bind(IFragment value) {

		try {
			
			if (this instanceof GenericFragment) {
				GenericFragment fragment = (GenericFragment)this;

				if (fragment.isLoaded()) { 

					if (value instanceof GenericFragment) {

						// bind 
						bind(fragment, (GenericFragment)value); 
					}

				} else {

					// if the target fragment has not been loaded, then simply 
					// initialize the target fragment set with the value fragment set
					fragment.setFragments(GenericCompositionAlgebra.copyFragments(((GenericFragment)value).getFragments()));  

					//System.err.println("The target does not contain a concrete fragment."); 
				}
			}

		} catch (java.lang.ArrayStoreException e) {

			System.err.println("The fragment type '" + ((GenericFragment)value).getType() + 
			"' does not match the list structure it is being inserted into."); 

		} catch (java.lang.ClassCastException e) {

			System.err.println("The fragment type '" + ((GenericFragment)value).getType() + 
					"' cannot replace fragment type '" + ((GenericFragment)this).getType() + "'."); 
		}


		return; 
	}


	/**
	 * Bind a sub-fragment with a fragment
	 * 
	 *  aka "bind with default value" 
	 * 
	 * @param fragments
	 * @param value
	 */
	private void bind(GenericFragment target, GenericFragment value) { 

		// When this method is called, the 'target' only consist of one fragment
		if (target != null) {

			//  simple type check
			//if (typeValid(target, value)) {
			// -- for now: catch errors in bind/1 instead 
			if (true) {

				// replace fragment 
				List<EObject> result = 
					GenericCompositionAlgebra.replace(target.getFragment(), value.getFragments());

				// update transformed IFragment
				if (result != null)
					target.setFragments(result); 

			} else {

				System.out.println("TYPE ERROR");  
			}
		}

		return;
	}

	/**
	 * Bind a slot 
	 * 
	 * @param slotName
	 * @param value
	 */
	public void bind(String slotName, IFragment value) {

		if (this instanceof GenericFragment) {
			GenericFragment fragment = (GenericFragment)this;

			if (fragment.isLoaded()) { 

				if (value instanceof GenericFragment) {

					// bind
					bind(fragment.getFragments(), slotName, (GenericFragment)value);
				}
			} else {
				System.err.println("The target does not contain a concrete fragment."); 
			}
		}
	}

	/**
	 * 
	 * @param fragments
	 * @param slotName
	 * @param value
	 */
	private void bind(List<EObject> fragments, String slotName, GenericFragment value) {

		//System.out.println("BIND ABSTRACT");

		// holds all positions (if several) within a fragment where a fragment is to be bound 
		Collection<EObject> slotPositions    = new ArrayList<EObject>();
		EClass slotPositionType              = null;

		for (EObject fragment : fragments) {

			@ SuppressWarnings("unchecked") 
			Iterator j = fragment.eAllContents();
			while (j.hasNext()) { 

				EObject obj = (EObject) j.next();

				// found a slot
				if (obj instanceof Slot) {

					Slot slot = (Slot) obj;

					// found the slot with the right name 
					if (slotName.equals(((VariationPointName)slot.getName()).getName())) { 

						//System.out.println("Found slot: " + slotName);
						EClass currentSlotType = null;

						// get the declared type of the slot 
						if (slot.getType() != null) {

							String slotType = ((FragmentType)slot.getType()).getType();
							String valueType = value.getType();
							if (valueType.compareToIgnoreCase(slotType) != 0) {
								System.err.println("Invalid type! " + "Type '" + slotType + 
										"' demended, but type '" + valueType + "' provided.");
								return; 
							}
							currentSlotType = (EClass)slot.eContainmentFeature().getEType();
						}
						// if it was not declared, derive it 
						else {
							// check if the type is hard-coded
//							String name = slot.eClass().getName();
//							System.out.println("TEST: " + name);
//							EPackage pkg = slot.eClass().getEPackage(); 
//							System.out.println("PACKAGE (ext.): " + pkg); 
//							System.out.println("SEARCHING FOR: " + name.substring(0, name.indexOf("SLOT")));
//							
//							EPackage base = 
//								EPackage.Registry.INSTANCE.getEPackage(eURIPrefix + "datalog" + ".ecore"); 
//
//							System.out.println("PACKAGE (bas.): " + base); 
//							
//							EClassifier test = 
//								base.getEClassifier(name.substring(0, name.indexOf("SLOT")));
//							System.out.println("FOUND: " + test); 
//							
//							currentSlotType = (EClass)test;
							
							currentSlotType = (EClass)slot.eContainmentFeature().getEType();

						}

						// check the other occurrences of the same slot name 

						// compare with other slot occurrences
						if (slotPositionType == null) {
							slotPositionType = currentSlotType;
						}

						// check if it is a direct match
						else if (!currentSlotType.equals(slotPositionType)) {
							// check if it is a match via subclass-of in the type hierarchy
							if (currentSlotType.getEAllSuperTypes().contains(slotPositionType)) {
								slotPositionType = currentSlotType;
							}
							// if not, report a typing error
							else if (!slotPositionType.getEAllSuperTypes().contains(currentSlotType)) {

								// TODO: better error handling
								System.err.println("Slot '" + slotName + "' is typed inconsistently!"); 

								//problems.add(new FileProcessingProblem(slot, "Slot " + slotName.getName() + 
								//		" is typed inconsistently (" + thisType.getName() + " and " + positionType.getName() + ")"));
							}

						}

						//                        if (!slotPositionType.getEAllSuperTypes().contains(currentSlotType)) {
						//
						//                        	System.err.println("Wrong type! " + slotPositionType.toString());
						//                        	return;
						//                        }

						// remember the found slot position 
						slotPositions.add(slot);
					}
				}
			}
		}


		if (slotPositions.isEmpty()) {

			System.err.println("Slot " + slotName + " not found."); 
		} else {

			//System.out.println(slotPositions.size() + " slots of name '" + slotName + "' found.");
		}

		if (slotPositionType != null) {

			//System.out.println("Position type: '" + slotPositionType.getName() + "'");

			List<EObject> valueFragmentList = value.getFragments();


			if (valueFragmentList != null && valueFragmentList.isEmpty())
				System.out.println("EMPTY"); 

			if (valueFragmentList != null && !valueFragmentList.isEmpty())  {

				System.out.println("Super types: " + valueFragmentList.get(0).eClass().getEAllSuperTypes());
				System.out.println("Type to match: " + slotPositionType.getName()); 
				
				// TYPE CHECK
				if (!valueFragmentList.get(0).eClass().getEAllSuperTypes().contains(slotPositionType)) {

					System.err.println("Wrong type, the type '" + 
							valueFragmentList.get(0).eClass().getName() + "' does not match the type '" +
							slotPositionType.getName() + "'.");
					return;
				}


				// go through all the positions where the value fragment should be bound   
				for (EObject position : slotPositions) {

					EObject            container        = position.eContainer();
					EStructuralFeature containerFeature = position.eContainmentFeature();

					Object eo = container.eGet(containerFeature);

					// copy fragments
					List<EObject> fragmentsToBind = valueFragmentList;
					List<EObject> fCopies = GenericCompositionAlgebra.copyFragments(fragmentsToBind);

					//System.out.println("Fragment to bind: " + fCopies.get(0).toString()); 

					if (eo instanceof EList) {
						@ SuppressWarnings("unchecked") 
						EList<EObject> el = (EList<EObject>) eo; 

						if (!((EReference)containerFeature).isContainment()) {
							//System.out.println("OPT 1");

							// bind several fragments in one go
							for (EObject f : fCopies) {
								el.add(el.indexOf(position), f); 
							}
							// remove slot 
							el.remove(position); 
							//el.add(soloFragmentToBind); 
						}
						else {
							//System.out.println("OPT 2: " + position + ", Num Of Fragments: " + fCopies.size());

							// bind several fragments in one go
							for (EObject f : fCopies) {
								el.add(el.indexOf(position), f); 
							}
							// remove slot 
							el.remove(position); 
						}
					} else {
						//System.out.println("OPT 3");
						// only bind one copy 
						container.eSet(containerFeature, fCopies.get(0));
					}

				}
			}
		}

	}

	/**
	 * Extend a target fragment with the value fragment 
	 * 
	 * @param target
	 * @param value
	 */
	public void extend(IFragment value) {
		if (this instanceof GenericFragment) {
			extend((GenericFragment)this, ((GenericFragment)value).copy(), ExtendVariant.DEFAULT);  
		}
	}

	/**
	 * Prepend a fragment 
	 * 
	 * @param target
	 * @param value
	 */
	public void prepend(IFragment value) {
		if (this instanceof GenericFragment) {
			extend((GenericFragment)this, ((GenericFragment)value).copy(), ExtendVariant.PREPEND);   
		}
	}

	/**
	 * Append a fragment 
	 * 
	 * @param target
	 * @param value
	 */
	public void append(IFragment value) {
		if (this instanceof GenericFragment) {
			extend((GenericFragment)this, ((GenericFragment)value).copy(), ExtendVariant.APPEND);  
		}
	}

	/**
	 * Extend a target fragment with the value fragment 
	 * 
	 * @param target
	 * @param value
	 */
	private void extend(GenericFragment target, IFragment valueFragment, ExtendVariant extend) {

		// if the target fragment box is not loaded, then extend the fragment box 
		if (!target.isLoaded()) { 

			//target.setFragments(GenericCompositionAlgebra.copyFragments(((GenericFragment)valueFragment).getFragments()));
			target.setFragments(((GenericFragment)valueFragment).getFragments()); 
			return; 
		}


		try {
			List<EObject> fragments = target.getFragments(); 

			if (fragments != null && valueFragment != null) {

				if (valueFragment instanceof GenericFragment) {

					GenericFragment value = (GenericFragment)valueFragment; 

					// add to existing loaded fragments, if:
					// 	1. the fragment already contains a list of fragments, or
					//  2. the fragment does not have a container 
					if (fragments.size() > 1 || 
							(target.getFragment().eContainer() == null)) 
					{
						// simple type check
						//EObject fragment = fragments.get(0);
						// check if the types are of the same kind  
						// TODO: fix proper type check  
						//if (fragment.eClass().equals(value.getFragment().eClass())) {
						if (true) {
							//System.out.println("SIZE>1"); 

							// if fragments are the same, then copy the value fragments
							List<EObject> copies = 
								//GenericCompositionAlgebra.copyFragments(value.getFragments()); 
								value.getFragments();

							for (EObject frgmt : copies) { 
								target.getFragments().add(frgmt); 
							}

						}
					}
					// only for single fragments, that have containers
					else if (fragments.size() < 2 && 
							(target.getFragment().eContainer() != null)) 
					{

						EObject fragment = fragments.get(0); 

//						System.out.println("SINGLE: " + fragment); 

						EObject container = fragment.eContainer();
						EStructuralFeature containerFeature = fragment.eContainmentFeature();

						Object eo = container.eGet(containerFeature); 

						if (eo instanceof EList) {
							@ SuppressWarnings("unchecked") 
							EList<EObject> el = (EList<EObject>) eo;
							// extend by adding the value fragment(s)
							// add fragments in correct place
							int position = el.indexOf(fragment);

							if (extend == ExtendVariant.PREPEND) {
								; 
							} 
							else if (extend == ExtendVariant.APPEND) {
								
								position++;
							}
							// use as default 
							else {
								// if the referenced object is last, extend after that object 
								if (el.indexOf(fragment) == (el.size() - 1)) {
									position++;  
								}
							} 

							for (EObject frgmt : value.getFragments()) {
								el.add(position++, frgmt); 
							}
						}
					} 

					//System.out.println("CON: " + fragment.eContainer()); 
				}
			}
			
		} catch (java.lang.ArrayStoreException e) {

			System.err.println("The fragment type '" + ((GenericFragment)valueFragment).getType() + 
			"' does not match the list structure it is being inserted into."); 
		}
	}

	
	/**
	 * Extract a fragment (by reference) 
	 * 
	 * @param value
	 */
	public void collect(IFragment value) {
		if (this instanceof GenericFragment) {
			extract((GenericFragment)this, value);  
		}
	}
	
	/**
	 * Extract a fragment (by reference)  
	 * 
	 * @param target
	 * @param value
	 */
	private void extract(GenericFragment target, IFragment valueFragment) {

		if (valueFragment instanceof GenericFragment) {
			GenericFragment value = (GenericFragment)valueFragment;

			if (!target.isLoaded()) {

				target.setFragments(value.getFragments());

			} else {

				List<EObject> copies = value.getFragments(); 			

				for (EObject frgmt : copies) { 
					target.getFragments().add(frgmt); 
				}
			}
		}

		return;
	}
	
	/**
	 * Extract a fragment (by reference)  
	 * 
	 * @param target
	 * @param value
	 */
//	private void extract2(GenericFragment target, IFragment valueFragment) {
//
//		// if the target fragment box is not loaded, then extend the fragment box 
//		if (!target.isLoaded()) { 
//
//			target.setFragments(((GenericFragment)valueFragment).getFragments()); 
//			return; 
//		}
//
//
//		try {
//			List<EObject> fragments = target.getFragments(); 
//
//			if (fragments != null && valueFragment != null) {
//
//				if (valueFragment instanceof GenericFragment) {
//
//					GenericFragment value = (GenericFragment)valueFragment; 
//
//					// add to existing loaded fragments, if:
//					// 	1. the fragment already contains a list of fragments, or
//					//  2. the fragment does not have a container 
//					if (fragments.size() > 1 || 
//							(target.getFragment().eContainer() == null)) 
//					{
//						// simple type check
//						EObject fragment = fragments.get(0);
//						// check if the types are of the same kind  
//						// TODO: fix proper type check  
//						//if (fragment.eClass().equals(value.getFragment().eClass())) {
//						if (true) {
//							//System.out.println("SIZE>1"); 
//
//							// if fragments are the same, then copy the value fragments
//							List<EObject> copies = 
//								//GenericCompositionAlgebra.copyFragments(value.getFragments()); 
//								value.getFragments();
//
//							for (EObject frgmt : copies) { 
//								target.getFragments().add(frgmt); 
//							}
//
//						}
//					}
//					// only for single fragments, that have containers
//					else if (fragments.size() < 2 && 
//							(target.getFragment().eContainer() != null)) 
//					{
//
//						EObject fragment = fragments.get(0); 
//
////						System.out.println("SINGLE: " + fragment); 
//
//						EObject container = fragment.eContainer();
//						EStructuralFeature containerFeature = fragment.eContainmentFeature();
//
//						Object eo = container.eGet(containerFeature); 
//
//						if (eo instanceof EList) {
//							@ SuppressWarnings("unchecked") 
//							EList<EObject> el = (EList<EObject>) eo;
//							// extend by adding the value fragment(s)
//							// add fragments in correct place
//							int position = el.indexOf(fragment);
//
//							for (EObject frgmt : value.getFragments()) {
//								el.add(position++, frgmt); 
//							}
//						}
//					} 
//
//				}
//			}
//			
//		} catch (java.lang.ArrayStoreException e) {
//
//			System.err.println("The fragment type '" + ((GenericFragment)valueFragment).getType() + 
//			"' does not match the list structure it is being inserted into."); 
//		}
//	}


	/**
	 * Checks if the target fragment can be replaced by the value fragment 
	 * 
	 * @param target
	 * @param value
	 * @return
	 */
	private boolean typeMatch(GenericFragment target, GenericFragment value) {

		if (target.getType().equals(value.getType())) {

			return true; 
		}

		return false;
	}


	/**
	 * Copy a fragment
	 * 
	 * @param construct
	 */
	public static void copy(IFragment copy, IFragment value) {
		
		if (value instanceof GenericFragment) {
			GenericFragment gf = (GenericFragment)value;

			if (gf.getFragment() != null) {
			
				List<EObject> cp =
					GenericCompositionAlgebra.copyFragments(gf.getFragments());
			
				if (copy instanceof GenericFragment) {
					GenericFragment cgf = (GenericFragment)copy;
					cgf.setFragments(cp);
				}
			}
		}
		
		// default
		return;
	}


	/**
	 * 
	 * @param curObject
	 * @param goal
	 * @return
	 */
	private boolean inContextOf(EObject curObject, EClass goal) {
		//System.out.println("**** TMP START, with curObject: " + curObject);

		EObject container = curObject.eContainer(); 

		// TODO: this is too general
		// 	     E.g. a positiveAtom in a Datalog Body will match on filtering with HEAD
		// base case 
		if (goal.isInstance(curObject))
			return true; 

		if (container != null) {

			EList<EStructuralFeature> features = 
				container.eClass().getEAllStructuralFeatures();  

			// go through features 
			for (EStructuralFeature feat : features) {
				//System.out.println("FEATURE: " + feat);

				// get the feature 
				Object featObj = container.eGet(feat); 
				//System.out.println("OBJ: " + featObj); 

				if (featObj != null && !(featObj instanceof EList)) {

					if (featObj.equals(curObject)) {
						//System.out.println("MID MATCH"); 

						if (goal.isInstance(featObj)) {
							//System.out.println("FOUND INSTANCE"); 
							return true; 
						}

						// recursive call 
						boolean ret = inContextOf(container, goal);
						if (ret)
							return ret; 
					}
				}
				// list structure 
				else if (featObj != null && featObj instanceof EList) {
					//System.out.println("LIST"); 
					@ SuppressWarnings("unchecked") 
					EList<EObject> list = (EList<EObject>)featObj;
					for (EObject obj : list) {

						//System.out.println("LIST MATCH: " + obj);
						//System.out.println("TRYING MATCH: " + curObject); 

						if (obj.equals(curObject)) {
							//System.out.println("MID MATCH in LIST"); 

							// recursive call 
							boolean ret = inContextOf(container, goal); 
							if (ret)
								return ret; 
						}
					}
				}

			}
		}

		return false; 
	}

	/**
	 * Check if fragment is in the context of a container  
	 * 
	 * @param fragment
	 * @param requiredType
	 * @return
	 */
	public boolean inContextOf(EClass requiredType) {

		// make sure we are a fragment
		if (this instanceof GenericFragment) {
			GenericFragment fragment = (GenericFragment)this;

			// Only get the first fragment
			EObject obj = fragment.getFragment(); 

			boolean ret = inContextOf(obj, requiredType);
			if (ret)
				return ret;
		}
		return false; 
	}
	

	/**
	 * Checks if a fragment is directly contained in a container 
	 * 
	 * @param container
	 */
	public boolean isContainedIn(EClass container) {
		
		// make sure we are a fragment
		if (this instanceof GenericFragment) {
			GenericFragment fragment = (GenericFragment)this;

			// Only get the first fragment
			EObject obj = fragment.getFragment(); 

			EClass cls = obj.eContainer().eClass();
			if (cls.equals(container))
				return true; 
		}
		
		return false;
	}
	
	/**
	 * Checks if a fragment is of certain type
	 * 
	 */
	public boolean isType(EClass type) {
		
		// make sure we are a fragment
		if (this instanceof GenericFragment) {
			GenericFragment fragment = (GenericFragment)this;

			// Only get the first fragment
			EObject obj = fragment.getFragment(); 

			if (obj.eClass().equals(type))
				return true; 
		}
		
		return false;
	}

	/**
	 * Checks if the fragment is last in a list 
	 * 
	 * @return
	 */
	public boolean isLast() { 

		// make sure this object is a fragment 
		if (this instanceof GenericFragment) {
			GenericFragment target = (GenericFragment)this; 

			// assume only one fragment 
			EObject fragment = target.getFragment();

			return isLast(fragment); 
		}

		// default 
		return false; 
	}

	/**
	 * Checks if the fragment is last in a list
	 * 
	 * @param fragment
	 * @return
	 */
	private boolean isLast(EObject fragment) {

		if (fragment != null) {
			EObject container = fragment.eContainer();
			EStructuralFeature containerFeature = fragment.eContainmentFeature();

			Object eo = container.eGet(containerFeature); 
			if (eo instanceof EList) {
				@ SuppressWarnings("unchecked") 
				EList<EObject> list = (EList<EObject>)eo;
				// check if last
				if (list.contains(fragment) && 
						(list.indexOf(fragment) == (list.size() - 1))) 
					return true;
			}
		}

		// default 
		return false; 
	}

	/**
	 * Checks if the fragment is last in a list 
	 * 
	 * @return
	 */
	public boolean isFirst() { 

		// make sure this object is a fragment 
		if (this instanceof GenericFragment) {
			GenericFragment target = (GenericFragment)this; 

			// assume only one fragment 
			EObject fragment = target.getFragment();

			return isFirst(fragment); 
		}

		// default 
		return false; 
	}

	/**
	 * Checks if the fragment is last in a list 
	 * 
	 * @param fragment
	 * @return
	 */
	private boolean isFirst(EObject fragment) {

		if (fragment != null) {
			EObject container = fragment.eContainer(); 
			EStructuralFeature containerFeature = fragment.eContainmentFeature();

			Object eo = container.eGet(containerFeature); 
			if (eo instanceof EList) {
				@ SuppressWarnings("unchecked") 
				EList<EObject> list = (EList<EObject>)eo; 

				if (list.contains(fragment) && (list.get(0).equals(fragment))) 
					return true; 
			}
		}

		// default 
		return false; 
	}


}
