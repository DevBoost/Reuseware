/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getIndexContentMain <em>Index Content Main</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType#getIndexTitle <em>Index Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType()
 * @model extendedMetaData="name='index-body_._type' kind='elementOnly'"
 * @generated
 */
public interface IndexBodyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Content Main</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Content Main</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Content Main</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_IndexContentMain()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IndexContentMain:0'"
	 * @generated
	 */
	FeatureMap getIndexContentMain();

	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.HType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_H()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<HType> getH();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#IndexContentMain:0'"
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Numbered Paragraph</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbered Paragraph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbered Paragraph</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_NumberedParagraph()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='numbered-paragraph' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<NumberedParagraphType> getNumberedParagraph();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<AType> getA();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Section()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<SectionType> getSection();

	/**
	 * Returns the value of the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_SoftPageBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<SoftPageBreakType> getSoftPageBreak();

	/**
	 * Returns the value of the '<em><b>Table Of Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Of Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Content</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_TableOfContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-of-content' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<TableOfContentType> getTableOfContent();

	/**
	 * Returns the value of the '<em><b>Illustration Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illustration Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illustration Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_IllustrationIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='illustration-index' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<IllustrationIndexType> getIllustrationIndex();

	/**
	 * Returns the value of the '<em><b>Table Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_TableIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-index' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<TableIndexType> getTableIndex();

	/**
	 * Returns the value of the '<em><b>Object Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_ObjectIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-index' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<ObjectIndexType> getObjectIndex();

	/**
	 * Returns the value of the '<em><b>User Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_UserIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<UserIndexType> getUserIndex();

	/**
	 * Returns the value of the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_AlphabeticalIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<AlphabeticalIndexType> getAlphabeticalIndex();

	/**
	 * Returns the value of the '<em><b>Bibliography</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Bibliography()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<BibliographyType> getBibliography();

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Rect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<RectType> getRect();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Line()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<LineType> getLine();

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Polyline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<PolylineType> getPolyline();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Polygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<PolygonType> getPolygon();

	/**
	 * Returns the value of the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_RegularPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<RegularPolygonType> getRegularPolygon();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Path()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<PathType> getPath();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Circle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<CircleType> getCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Ellipse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<EllipseType> getEllipse();

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_G()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<GType> getG();

	/**
	 * Returns the value of the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Thumbnail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Thumbnail</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_PageThumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<PageThumbnailType> getPageThumbnail();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Frame()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<FrameType> getFrame();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<MeasureType> getMeasure();

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Caption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<CaptionType> getCaption();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<ControlType> getControl();

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_Scene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<SceneType> getScene();

	/**
	 * Returns the value of the '<em><b>Custom Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Shape</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_CustomShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<CustomShapeType> getCustomShape();

	/**
	 * Returns the value of the '<em><b>Change Marks Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_ChangeMarksGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='change-marks:group' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	FeatureMap getChangeMarksGroup();

	/**
	 * Returns the value of the '<em><b>Change Marks</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_ChangeMarks()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-marks' namespace='##targetNamespace' group='change-marks:group'"
	 * @generated
	 */
	EList<ChangeMarksType> getChangeMarks();

	/**
	 * Returns the value of the '<em><b>Index Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Title</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Title</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexBodyType_IndexTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-title' namespace='##targetNamespace' group='#IndexContentMain:0'"
	 * @generated
	 */
	EList<IndexTitleType> getIndexTitle();

} // IndexBodyType
