/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRx <em>Rx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRy <em>Ry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType()
 * @model extendedMetaData="name='ellipse_._type' kind='elementOnly'"
 * @generated
 */
public interface EllipseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference.
	 * @see #setEventListeners(EventListenersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_EventListeners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-listeners' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	EventListenersType getEventListeners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEventListeners <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listeners</em>' containment reference.
	 * @see #getEventListeners()
	 * @generated
	 */
	void setEventListeners(EventListenersType value);

	/**
	 * Returns the value of the '<em><b>Glue Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_GluePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='glue-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GluePointType> getGluePoint();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:4'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:4'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #setAnchorPageNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_AnchorPageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='anchor-page-number' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	BigInteger getAnchorPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorPageNumber <em>Anchor Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #getAnchorPageNumber()
	 * @generated
	 */
	void setAnchorPageNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Anchor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_AnchorType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='anchor-type' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	AnchorTypeType getAnchorType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @generated
	 */
	void setAnchorType(AnchorTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	void unsetAnchorType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getAnchorType <em>Anchor Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Type</em>' attribute is set.
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	boolean isSetAnchorType();

	/**
	 * Returns the value of the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Id</em>' attribute.
	 * @see #setCaptionId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_CaptionId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='caption-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCaptionId <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Id</em>' attribute.
	 * @see #getCaptionId()
	 * @generated
	 */
	void setCaptionId(String value);

	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute.
	 * @see #setClassNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names1</em>' attribute.
	 * @see #setClassNames1(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_ClassNames1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	List<String> getClassNames1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getClassNames1 <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names1</em>' attribute.
	 * @see #getClassNames1()
	 * @generated
	 */
	void setClassNames1(List<String> value);

	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Cx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='cx' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getCx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(String value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #setCy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Cy()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='cy' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getCy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(String value);

	/**
	 * Returns the value of the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Angle</em>' attribute.
	 * @see #isSetEndAngle()
	 * @see #unsetEndAngle()
	 * @see #setEndAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_EndAngle()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='end-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEndAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Angle</em>' attribute.
	 * @see #isSetEndAngle()
	 * @see #unsetEndAngle()
	 * @see #getEndAngle()
	 * @generated
	 */
	void setEndAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndAngle()
	 * @see #getEndAngle()
	 * @see #setEndAngle(double)
	 * @generated
	 */
	void unsetEndAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndAngle <em>End Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Angle</em>' attribute is set.
	 * @see #unsetEndAngle()
	 * @see #getEndAngle()
	 * @see #setEndAngle(double)
	 * @generated
	 */
	boolean isSetEndAngle();

	/**
	 * Returns the value of the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cell Address</em>' attribute.
	 * @see #setEndCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_EndCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='end-cell-address' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndCellAddress <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cell Address</em>' attribute.
	 * @see #getEndCellAddress()
	 * @generated
	 */
	void setEndCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End X</em>' attribute.
	 * @see #setEndX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_EndX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-x' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndX <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' attribute.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(String value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_EndY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-y' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"full"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(KindType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Kind()
	 * @model default="full" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	KindType getKind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KindType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see #setLayer(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Layer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='layer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayer();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' attribute.
	 * @see #setRx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Rx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='rx' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getRx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRx <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' attribute.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(String value);

	/**
	 * Returns the value of the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ry</em>' attribute.
	 * @see #setRy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Ry()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='ry' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getRy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getRy <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' attribute.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(String value);

	/**
	 * Returns the value of the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Angle</em>' attribute.
	 * @see #isSetStartAngle()
	 * @see #unsetStartAngle()
	 * @see #setStartAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_StartAngle()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='start-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStartAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Angle</em>' attribute.
	 * @see #isSetStartAngle()
	 * @see #unsetStartAngle()
	 * @see #getStartAngle()
	 * @generated
	 */
	void setStartAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartAngle()
	 * @see #getStartAngle()
	 * @see #setStartAngle(double)
	 * @generated
	 */
	void unsetStartAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStartAngle <em>Start Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Angle</em>' attribute is set.
	 * @see #unsetStartAngle()
	 * @see #getStartAngle()
	 * @see #setStartAngle(double)
	 * @generated
	 */
	boolean isSetStartAngle();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name1</em>' attribute.
	 * @see #setStyleName1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_StyleName1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getStyleName1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getStyleName1 <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name1</em>' attribute.
	 * @see #getStyleName1()
	 * @generated
	 */
	void setStyleName1(String value);

	/**
	 * Returns the value of the '<em><b>Table Background</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_TableBackground()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-background' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @generated
	 */
	void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTableBackground();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTableBackground <em>Table Background</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Background</em>' attribute is set.
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTableBackground();

	/**
	 * Returns the value of the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style Name</em>' attribute.
	 * @see #setTextStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_TextStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextStyleNameType"
	 *        extendedMetaData="kind='attribute' name='text-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTextStyleName <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style Name</em>' attribute.
	 * @see #getTextStyleName()
	 * @generated
	 */
	void setTextStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Transform()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_X()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='x' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #setZIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEllipseType_ZIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='z-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // EllipseType
