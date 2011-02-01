/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.xlink.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.DocumentRoot;
import org.w3.xlink.ShowType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.ShowType2;
import org.w3.xlink.TypeType;
import org.w3.xlink.XLinkFactory;
import org.w3.xlink.XLinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XLinkFactoryImpl extends EFactoryImpl implements XLinkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XLinkFactory init() {
		try {
			XLinkFactory theXLinkFactory = (XLinkFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/1999/xlink"); 
			if (theXLinkFactory != null) {
				return theXLinkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XLinkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLinkFactoryImpl() {
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
			case XLinkPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case XLinkPackage.ACTUATE_TYPE:
				return createActuateTypeFromString(eDataType, initialValue);
			case XLinkPackage.ACTUATE_TYPE1:
				return createActuateType1FromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE:
				return createShowTypeFromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE1:
				return createShowType1FromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE2:
				return createShowType2FromString(eDataType, initialValue);
			case XLinkPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT:
				return createActuateTypeObjectFromString(eDataType, initialValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT1:
				return createActuateTypeObject1FromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE_OBJECT:
				return createShowTypeObjectFromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE_OBJECT1:
				return createShowTypeObject1FromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE_OBJECT2:
				return createShowTypeObject2FromString(eDataType, initialValue);
			case XLinkPackage.TYPE_TYPE_OBJECT:
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
			case XLinkPackage.ACTUATE_TYPE:
				return convertActuateTypeToString(eDataType, instanceValue);
			case XLinkPackage.ACTUATE_TYPE1:
				return convertActuateType1ToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE:
				return convertShowTypeToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE1:
				return convertShowType1ToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE2:
				return convertShowType2ToString(eDataType, instanceValue);
			case XLinkPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT:
				return convertActuateTypeObjectToString(eDataType, instanceValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT1:
				return convertActuateTypeObject1ToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE_OBJECT:
				return convertShowTypeObjectToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE_OBJECT1:
				return convertShowTypeObject1ToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE_OBJECT2:
				return convertShowTypeObject2ToString(eDataType, instanceValue);
			case XLinkPackage.TYPE_TYPE_OBJECT:
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
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType createActuateTypeFromString(EDataType eDataType, String initialValue) {
		ActuateType result = ActuateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 createActuateType1FromString(EDataType eDataType, String initialValue) {
		ActuateType1 result = ActuateType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType createShowTypeFromString(EDataType eDataType, String initialValue) {
		ShowType result = ShowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType1 createShowType1FromString(EDataType eDataType, String initialValue) {
		ShowType1 result = ShowType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType2 createShowType2FromString(EDataType eDataType, String initialValue) {
		ShowType2 result = ShowType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public ActuateType createActuateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActuateTypeFromString(XLinkPackage.Literals.ACTUATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActuateTypeToString(XLinkPackage.Literals.ACTUATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 createActuateTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createActuateType1FromString(XLinkPackage.Literals.ACTUATE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertActuateType1ToString(XLinkPackage.Literals.ACTUATE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType1 createShowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShowType1FromString(XLinkPackage.Literals.SHOW_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShowType1ToString(XLinkPackage.Literals.SHOW_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType createShowTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createShowTypeFromString(XLinkPackage.Literals.SHOW_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertShowTypeToString(XLinkPackage.Literals.SHOW_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType2 createShowTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createShowType2FromString(XLinkPackage.Literals.SHOW_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertShowType2ToString(XLinkPackage.Literals.SHOW_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(XLinkPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(XLinkPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLinkPackage getXLinkPackage() {
		return (XLinkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XLinkPackage getPackage() {
		return XLinkPackage.eINSTANCE;
	}

} //XLinkFactoryImpl
