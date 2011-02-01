/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaRectangle <em>Area Rectangle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaCircle <em>Area Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType#getAreaPolygon <em>Area Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageMapType()
 * @model extendedMetaData="name='image-map_._type' kind='elementOnly'"
 * @generated
 */
public interface ImageMapType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageMapType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Area Rectangle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Rectangle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Rectangle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageMapType_AreaRectangle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-rectangle' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AreaRectangleType> getAreaRectangle();

	/**
	 * Returns the value of the '<em><b>Area Circle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Circle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Circle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageMapType_AreaCircle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-circle' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AreaCircleType> getAreaCircle();

	/**
	 * Returns the value of the '<em><b>Area Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageMapType_AreaPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-polygon' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AreaPolygonType> getAreaPolygon();

} // ImageMapType
