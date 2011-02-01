package org.reuseware.air.coconut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.reuseware.air.algebra.GenericFragment;
import org.reuseware.air.coconut.IComplexOperator;
import org.reuseware.air.coconut.IParameterWrapper;
import org.reuseware.air.coconut.IUpperLevelInterpreter;
import org.reuseware.air.coconut.plugin.CoconutCore;
import org.reuseware.air.coconut.ReusewairComposer;
import org.reuseware.air.core.cm.IFragment;
import org.reuseware.air.coconut.util.FragmentUtil;
import org.reuseware.air.core.util.GenericCompositionAlgebra;
import org.reuseware.air.util.FileProcessingException;
import org.reuseware.air.util.FileProcessingProblem;

import org.reuseware.air.language.componentmodel.Location;

public class ComplexComposerInterpreter implements IUpperLevelInterpreter { 

	private static final String annotationSourceURI = "http://reuseware.org/annotation/location"; 
	private IFragmentRetriever fragmentRetriever = null;
	
	public ComplexComposerInterpreter() {}

	/**
	 * Interprets complex operators (active syntax) 
	 * @throws CoreException 
	 * 
	 */
	public void interpret(EObject fragment, Map<String, List<EObject>> env,
			Map<String, EClass> envTypes, List<FileProcessingProblem> problems) throws CoreException {

		IComplexOperator operator = 
			ComposerRegistry.getInstance().getComplexOperator(fragment.eClass()); 

		if (operator != null) {
			for (Method method : operator.getClass().getMethods()) {
				ReusewairComposer annotation = method.getAnnotation(ReusewairComposer.class); 
				if (annotation != null) {

						if (fragment.eClass().getName().equals(annotation.value())) {
							// 1. Construct parameters 
							ArrayList<ArrayList<EObject>> parameters = constructParameters(fragment); 

							// 2. Wrap parameters 
							List<Object> wrappedParameters = 
								wrapParameters(parameters, fragment.eClass()); 

							// 3. Invoke the method (operator)
							if (wrappedParameters != null) {

								IFragment returnFragment = null;
								try {
									returnFragment = (IFragment)method.invoke(operator, wrappedParameters.toArray());
								} catch (Exception e) {
									throw new CoreException(CoconutCore.createStatusWithStackTrace("Exception occured while visiting composers.", e));
								} 
								
								// replace the fragment with the result from the operator 
								GenericCompositionAlgebra.replace(fragment, ((GenericFragment)returnFragment).getFragments());
							}
						}

				}

			}

		}

		// remove the fragment (the operator) 
		FragmentUtil.selfRemove(fragment); 

		return;
	}

	/**
	 * Construct the parameter list to be passed to the composer (composition operator) 
	 * 
	 * The main job is to resolve locations into concrete fragments 
	 * 
	 * @param fragment
	 * @return
	 */
	private ArrayList<ArrayList<EObject>> constructParameters(EObject fragment) { 


		// holding the parameters to pass to the composer implementation 
		ArrayList<ArrayList<EObject>> parameters = new ArrayList<ArrayList<EObject>>(); 
		
		EList<EStructuralFeature> features = 
			fragment.eClass().getEAllStructuralFeatures();

		for (EStructuralFeature feature : features) { 

			//ArrayList<EObject> parameter = new ArrayList<EObject>();
			
			EObject param = (EObject)fragment.eGet(feature); 

			// if the fragment is not a Location, then it is a single fragment
			if (!(param instanceof Location)) {

				ArrayList<EObject> singleParam = new ArrayList<EObject>(); 
				singleParam.add(param); 
				
				// add the parameter to the parameter list
				parameters.add(singleParam); 
			}
			// if the fragment is a Location, then automatically resolve it 
			// into EObject instances  
			else if (param instanceof Location) {

				Location location = (Location)param;

				// get the annotation containing the type of the 
				// fragment referenced by the location
				EAnnotation annotatedType = feature.getEAnnotation(annotationSourceURI);
				EMap<String,String> details = annotatedType.getDetails();
				
				String language = null, construct = null; 
				
				/**
				 * Go through the details containing:
				 * 
				 * language -> http://www-st.inf.tu-dresden.de/reuseware/language/[language].ecore
				 * construct -> [construct]
				 * 
				 */
				for (Iterator<Entry<String,String>> detailIter = details.iterator(); detailIter.hasNext(); ) {

					Entry<String,String> detail = detailIter.next(); 
					
					if (detail.getKey().equals("language")) {
						language = detail.getValue();
					} else if (detail.getKey().equals("construct")) {
						construct = detail.getValue();
					}
				}
				
				try {
					
					// retrieve the exact location of the fragment and parse it
					InterpreterSystem is = InterpreterSystem.getInstance();

					/**
					 * Retrieve the fragment, using the exact type for parsing,
					 * as specified in the annotated model (see above) 
					 * 
					 */
					List<EObject> frgmt =
						fragmentRetriever.getFragmentFromLocation(location.getPath(), 
								getConstruct(language, construct), 
								null);

					/**
					 * HACK:
					 * 
					 * Make sure that the fragment is represented as an ArrayList, 
					 * and not something else, such as LinkedList. 
					 * 
					 * This just to guarantee that we don't encounter a cast problem
					 * during 
					 * 
					 */
					ArrayList<EObject> frgmtList = new ArrayList<EObject>();  
					for (EObject obj : frgmt) {

						frgmtList.add(obj); 
					}
					
					// use the resolved fragment as a parameter 
					parameters.add(frgmtList); 
					
				} catch (FileProcessingException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}

		return parameters; 
	}

	/**
	 * Wrap parameter list into composer appropriate types.
	 * 
	 * The wrapping is done by a component model specific wrapper function 
	 * which is specified using the extension mechanism of Eclipse 
	 * 
	 * @param parameters
	 * @param annotation
	 * @return
	 * @throws CoreException 
	 */
	private List<Object> wrapParameters(ArrayList<ArrayList<EObject>> parameters, EClass construct) throws CoreException { 

		IParameterWrapper wrapper = ComposerRegistry.getInstance().getWrapper(construct);  

		if (wrapper != null) {
			// call specified wrapper method 
			List<Object> wrappedParameters = wrapper.wrap(parameters); 

			return wrappedParameters;
		}
		
		// default 
		return null; 
	}
	
	/**
	 * Returns the construct type for a given language and construct 
	 * 
	 * @param language
	 * @param construct
	 * @return EClass representing the construct in the given language 
	 */
	private EClass getConstruct(String language, String construct) {
		
        EPackage ePackage = 
        	EPackage.Registry.INSTANCE.getEPackage(language);
        EClass eClass = (EClass) ePackage.getEClassifier(construct);

        return eClass;
	}

	public void initialize(IFragmentRetriever retriever) {
		this.fragmentRetriever = retriever;
		
	}

}
