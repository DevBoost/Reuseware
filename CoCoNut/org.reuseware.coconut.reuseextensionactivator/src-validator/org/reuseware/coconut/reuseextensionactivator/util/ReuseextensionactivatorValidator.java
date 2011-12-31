/**
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 */
package org.reuseware.coconut.reuseextensionactivator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.reuseware.coconut.reuseextensionactivator.*;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ComponentModelSpecificationActivator;
import org.reuseware.coconut.reuseextensionactivator.CompositionLanguageSpecificationActivator;
import org.reuseware.coconut.reuseextensionactivator.CompositionLanguageSyntaxSpecificationActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage
 * @generated
 */
public class ReuseextensionactivatorValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final ReuseextensionactivatorValidator INSTANCE = new ReuseextensionactivatorValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.reuseware.coconut.reuseextensionactivator";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReuseextensionactivatorValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return ReuseextensionactivatorPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case ReuseextensionactivatorPackage.ARGUMENT:
        return validateArgument((Argument)value, diagnostics, context);
      case ReuseextensionactivatorPackage.COMPONENT_MODEL_SPECIFICATION_ACTIVATOR:
        return validateComponentModelSpecificationActivator((ComponentModelSpecificationActivator)value, diagnostics, context);
      case ReuseextensionactivatorPackage.COMPOSITION_LANGUAGE_SPECIFICATION_ACTIVATOR:
        return validateCompositionLanguageSpecificationActivator((CompositionLanguageSpecificationActivator)value, diagnostics, context);
      case ReuseextensionactivatorPackage.COMPOSITION_LANGUAGE_SYNTAX_SPECIFICATION_ACTIVATOR:
        return validateCompositionLanguageSyntaxSpecificationActivator((CompositionLanguageSyntaxSpecificationActivator)value, diagnostics, context);
      case ReuseextensionactivatorPackage.REUSE_EXTENSION_ACTIVATOR_LIST:
        return validateReuseExtensionActivatorList((ReuseExtensionActivatorList)value, diagnostics, context);
      case ReuseextensionactivatorPackage.REUSE_EXTENSION_ACTIVATOR:
        return validateReuseExtensionActivator((ReuseExtensionActivator)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(argument, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComponentModelSpecificationActivator(ComponentModelSpecificationActivator componentModelSpecificationActivator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(componentModelSpecificationActivator, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentModelSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validateReuseExtensionActivator_AllArgumentsDefined(componentModelSpecificationActivator, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCompositionLanguageSpecificationActivator(CompositionLanguageSpecificationActivator compositionLanguageSpecificationActivator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(compositionLanguageSpecificationActivator, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositionLanguageSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validateReuseExtensionActivator_AllArgumentsDefined(compositionLanguageSpecificationActivator, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCompositionLanguageSyntaxSpecificationActivator(CompositionLanguageSyntaxSpecificationActivator compositionLanguageSyntaxSpecificationActivator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(compositionLanguageSyntaxSpecificationActivator, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validateReuseExtensionActivator_AllArgumentsDefined(compositionLanguageSyntaxSpecificationActivator, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReuseExtensionActivatorList(ReuseExtensionActivatorList reuseExtensionActivatorList, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(reuseExtensionActivatorList, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReuseExtensionActivator(ReuseExtensionActivator reuseExtensionActivator, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reuseExtensionActivator, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reuseExtensionActivator, diagnostics, context);
    if (result || diagnostics != null) result &= validateReuseExtensionActivator_AllArgumentsDefined(reuseExtensionActivator, diagnostics, context);
    return result;
  }

	/**
	 * Validates the AllArgumentsDefined constraint of '
	 * <em>Reuse Extension Activator</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateReuseExtensionActivator_AllArgumentsDefined(
			ReuseExtensionActivator reuseExtensionActivator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = false;
		ReuseExtension rex = reuseExtensionActivator.getReuseExtension();
		if (rex != null) {
			List<String> definedArguments = new ArrayList<String>();
			for(Argument argument : reuseExtensionActivator.getArguments()) {
				if (definedArguments.contains(argument.getParameter())) {
					addError(diagnostics, "Multiple definitions of argument '" + argument.getParameter() + "'", 
							reuseExtensionActivator);
					result = false;
				}
				else {
					definedArguments.add(argument.getParameter());
				}
			}
			for(String parameter : rex.getParameters()) {
				if (!definedArguments.contains(parameter)) {
					addError(diagnostics, "Missing definition of argument '" + parameter + "'", 
							reuseExtensionActivator);
					result = false;
				}
			}
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// Specialize this to return a resource locator for messages specific to
		// this validator.
		return super.getResourceLocator();
	}
	
	@Override
	public boolean validate_EveryProxyResolves(EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// errors are sufficiently reported by EMFText
		return true;
	}

	protected void addError(DiagnosticChain diagnostics, String message, EObject data) {
		if (diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					DIAGNOSTIC_SOURCE,
					0,
					message,
					new Object[] { data }));
		}
	}

} //ReuseextensionactivatorValidator
