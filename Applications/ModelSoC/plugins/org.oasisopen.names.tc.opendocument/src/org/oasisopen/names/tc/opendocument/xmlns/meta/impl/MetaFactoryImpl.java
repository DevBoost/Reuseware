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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaFactory;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaFactoryImpl extends EFactoryImpl implements MetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaFactory init() {
		try {
			MetaFactory theMetaFactory = (MetaFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:meta:1.0"); 
			if (theMetaFactory != null) {
				return theMetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaPackage.AUTO_RELOAD_TYPE: return createAutoReloadType();
			case MetaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE: return createDocumentStatisticType();
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE: return createHyperlinkBehaviourType();
			case MetaPackage.TEMPLATE_TYPE: return createTemplateType();
			case MetaPackage.USER_DEFINED_TYPE: return createUserDefinedType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.VALUE_TYPE_TYPE:
				return createValueTypeTypeFromString(eDataType, initialValue);
			case MetaPackage.VALUE_TYPE_TYPE_OBJECT:
				return createValueTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.VALUE_TYPE_TYPE:
				return convertValueTypeTypeToString(eDataType, instanceValue);
			case MetaPackage.VALUE_TYPE_TYPE_OBJECT:
				return convertValueTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoReloadType createAutoReloadType() {
		AutoReloadTypeImpl autoReloadType = new AutoReloadTypeImpl();
		return autoReloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatisticType createDocumentStatisticType() {
		DocumentStatisticTypeImpl documentStatisticType = new DocumentStatisticTypeImpl();
		return documentStatisticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperlinkBehaviourType createHyperlinkBehaviourType() {
		HyperlinkBehaviourTypeImpl hyperlinkBehaviourType = new HyperlinkBehaviourTypeImpl();
		return hyperlinkBehaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType createTemplateType() {
		TemplateTypeImpl templateType = new TemplateTypeImpl();
		return templateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType createUserDefinedType() {
		UserDefinedTypeImpl userDefinedType = new UserDefinedTypeImpl();
		return userDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType createValueTypeTypeFromString(EDataType eDataType, String initialValue) {
		ValueTypeType result = ValueTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType createValueTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeTypeFromString(MetaPackage.Literals.VALUE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeTypeToString(MetaPackage.Literals.VALUE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaPackage getMetaPackage() {
		return (MetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaPackage getPackage() {
		return MetaPackage.eINSTANCE;
	}

} //MetaFactoryImpl
