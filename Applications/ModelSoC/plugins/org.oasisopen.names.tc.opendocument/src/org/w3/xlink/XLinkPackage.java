/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.xlink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.w3.xlink.XLinkFactory
 * @model kind="package"
 * @generated
 */
public interface XLinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xlink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xlink";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xlink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XLinkPackage eINSTANCE = org.w3.xlink.impl.XLinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.xlink.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.impl.DocumentRootImpl
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HREF = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.w3.xlink.ActuateType <em>Actuate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ActuateType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateType()
	 * @generated
	 */
	int ACTUATE_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.w3.xlink.ActuateType1 <em>Actuate Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ActuateType1
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateType1()
	 * @generated
	 */
	int ACTUATE_TYPE1 = 2;

	/**
	 * The meta object id for the '{@link org.w3.xlink.ShowType <em>Show Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType()
	 * @generated
	 */
	int SHOW_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.w3.xlink.ShowType1 <em>Show Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType1
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType1()
	 * @generated
	 */
	int SHOW_TYPE1 = 4;

	/**
	 * The meta object id for the '{@link org.w3.xlink.ShowType2 <em>Show Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType2
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType2()
	 * @generated
	 */
	int SHOW_TYPE2 = 5;

	/**
	 * The meta object id for the '{@link org.w3.xlink.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.TypeType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 6;

	/**
	 * The meta object id for the '<em>Actuate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ActuateType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateTypeObject()
	 * @generated
	 */
	int ACTUATE_TYPE_OBJECT = 7;

	/**
	 * The meta object id for the '<em>Actuate Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ActuateType1
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateTypeObject1()
	 * @generated
	 */
	int ACTUATE_TYPE_OBJECT1 = 8;

	/**
	 * The meta object id for the '<em>Show Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType1
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject()
	 * @generated
	 */
	int SHOW_TYPE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Show Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject1()
	 * @generated
	 */
	int SHOW_TYPE_OBJECT1 = 10;

	/**
	 * The meta object id for the '<em>Show Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.ShowType2
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject2()
	 * @generated
	 */
	int SHOW_TYPE_OBJECT2 = 11;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.xlink.TypeType
	 * @see org.w3.xlink.impl.XLinkPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 12;


	/**
	 * Returns the meta object for class '{@link org.w3.xlink.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3.xlink.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3.xlink.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3.xlink.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3.xlink.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3.xlink.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3.xlink.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3.xlink.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.xlink.DocumentRoot#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3.xlink.DocumentRoot#getHref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.xlink.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.w3.xlink.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.xlink.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.w3.xlink.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.ActuateType <em>Actuate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuate Type</em>'.
	 * @see org.w3.xlink.ActuateType
	 * @generated
	 */
	EEnum getActuateType();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.ActuateType1 <em>Actuate Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuate Type1</em>'.
	 * @see org.w3.xlink.ActuateType1
	 * @generated
	 */
	EEnum getActuateType1();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.ShowType <em>Show Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Show Type</em>'.
	 * @see org.w3.xlink.ShowType
	 * @generated
	 */
	EEnum getShowType();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.ShowType1 <em>Show Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Show Type1</em>'.
	 * @see org.w3.xlink.ShowType1
	 * @generated
	 */
	EEnum getShowType1();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.ShowType2 <em>Show Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Show Type2</em>'.
	 * @see org.w3.xlink.ShowType2
	 * @generated
	 */
	EEnum getShowType2();

	/**
	 * Returns the meta object for enum '{@link org.w3.xlink.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.w3.xlink.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.ActuateType <em>Actuate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Actuate Type Object</em>'.
	 * @see org.w3.xlink.ActuateType
	 * @model instanceClass="org.w3.xlink.ActuateType"
	 *        extendedMetaData="name='actuate_._type:Object' baseType='actuate_._type'"
	 * @generated
	 */
	EDataType getActuateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.ActuateType1 <em>Actuate Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Actuate Type Object1</em>'.
	 * @see org.w3.xlink.ActuateType1
	 * @model instanceClass="org.w3.xlink.ActuateType1"
	 *        extendedMetaData="name='actuate_._1_._type:Object' baseType='actuate_._1_._type'"
	 * @generated
	 */
	EDataType getActuateTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.ShowType1 <em>Show Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Show Type Object</em>'.
	 * @see org.w3.xlink.ShowType1
	 * @model instanceClass="org.w3.xlink.ShowType1"
	 *        extendedMetaData="name='show_._1_._type:Object' baseType='show_._1_._type'"
	 * @generated
	 */
	EDataType getShowTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.ShowType <em>Show Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Show Type Object1</em>'.
	 * @see org.w3.xlink.ShowType
	 * @model instanceClass="org.w3.xlink.ShowType"
	 *        extendedMetaData="name='show_._type:Object' baseType='show_._type'"
	 * @generated
	 */
	EDataType getShowTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.ShowType2 <em>Show Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Show Type Object2</em>'.
	 * @see org.w3.xlink.ShowType2
	 * @model instanceClass="org.w3.xlink.ShowType2"
	 *        extendedMetaData="name='show_._2_._type:Object' baseType='show_._2_._type'"
	 * @generated
	 */
	EDataType getShowTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.w3.xlink.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.w3.xlink.TypeType
	 * @model instanceClass="org.w3.xlink.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XLinkFactory getXLinkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3.xlink.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.impl.DocumentRootImpl
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HREF = eINSTANCE.getDocumentRoot_Href();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.ActuateType <em>Actuate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ActuateType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateType()
		 * @generated
		 */
		EEnum ACTUATE_TYPE = eINSTANCE.getActuateType();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.ActuateType1 <em>Actuate Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ActuateType1
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateType1()
		 * @generated
		 */
		EEnum ACTUATE_TYPE1 = eINSTANCE.getActuateType1();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.ShowType <em>Show Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType()
		 * @generated
		 */
		EEnum SHOW_TYPE = eINSTANCE.getShowType();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.ShowType1 <em>Show Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType1
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType1()
		 * @generated
		 */
		EEnum SHOW_TYPE1 = eINSTANCE.getShowType1();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.ShowType2 <em>Show Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType2
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowType2()
		 * @generated
		 */
		EEnum SHOW_TYPE2 = eINSTANCE.getShowType2();

		/**
		 * The meta object literal for the '{@link org.w3.xlink.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.TypeType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>Actuate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ActuateType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateTypeObject()
		 * @generated
		 */
		EDataType ACTUATE_TYPE_OBJECT = eINSTANCE.getActuateTypeObject();

		/**
		 * The meta object literal for the '<em>Actuate Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ActuateType1
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getActuateTypeObject1()
		 * @generated
		 */
		EDataType ACTUATE_TYPE_OBJECT1 = eINSTANCE.getActuateTypeObject1();

		/**
		 * The meta object literal for the '<em>Show Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType1
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject()
		 * @generated
		 */
		EDataType SHOW_TYPE_OBJECT = eINSTANCE.getShowTypeObject();

		/**
		 * The meta object literal for the '<em>Show Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject1()
		 * @generated
		 */
		EDataType SHOW_TYPE_OBJECT1 = eINSTANCE.getShowTypeObject1();

		/**
		 * The meta object literal for the '<em>Show Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.ShowType2
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getShowTypeObject2()
		 * @generated
		 */
		EDataType SHOW_TYPE_OBJECT2 = eINSTANCE.getShowTypeObject2();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.xlink.TypeType
		 * @see org.w3.xlink.impl.XLinkPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //XLinkPackage
