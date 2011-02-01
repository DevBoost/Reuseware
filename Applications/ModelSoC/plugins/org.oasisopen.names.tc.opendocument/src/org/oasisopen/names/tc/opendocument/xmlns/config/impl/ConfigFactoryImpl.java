/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.config.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigFactory;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;
import org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.config.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigFactoryImpl extends EFactoryImpl implements ConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigFactory init() {
		try {
			ConfigFactory theConfigFactory = (ConfigFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:config:1.0"); 
			if (theConfigFactory != null) {
				return theConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactoryImpl() {
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
			case ConfigPackage.CONFIG_ITEM_MAP_ENTRY_TYPE: return createConfigItemMapEntryType();
			case ConfigPackage.CONFIG_ITEM_MAP_INDEXED_TYPE: return createConfigItemMapIndexedType();
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE: return createConfigItemMapNamedType();
			case ConfigPackage.CONFIG_ITEM_SET_TYPE: return createConfigItemSetType();
			case ConfigPackage.CONFIG_ITEM_TYPE: return createConfigItemType();
			case ConfigPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case ConfigPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case ConfigPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
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
			case ConfigPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case ConfigPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapEntryType createConfigItemMapEntryType() {
		ConfigItemMapEntryTypeImpl configItemMapEntryType = new ConfigItemMapEntryTypeImpl();
		return configItemMapEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapIndexedType createConfigItemMapIndexedType() {
		ConfigItemMapIndexedTypeImpl configItemMapIndexedType = new ConfigItemMapIndexedTypeImpl();
		return configItemMapIndexedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapNamedType createConfigItemMapNamedType() {
		ConfigItemMapNamedTypeImpl configItemMapNamedType = new ConfigItemMapNamedTypeImpl();
		return configItemMapNamedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemSetType createConfigItemSetType() {
		ConfigItemSetTypeImpl configItemSetType = new ConfigItemSetTypeImpl();
		return configItemSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemType createConfigItemType() {
		ConfigItemTypeImpl configItemType = new ConfigItemTypeImpl();
		return configItemType;
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
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(ConfigPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(ConfigPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigPackage getConfigPackage() {
		return (ConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigPackage getPackage() {
		return ConfigPackage.eINSTANCE;
	}

} //ConfigFactoryImpl
