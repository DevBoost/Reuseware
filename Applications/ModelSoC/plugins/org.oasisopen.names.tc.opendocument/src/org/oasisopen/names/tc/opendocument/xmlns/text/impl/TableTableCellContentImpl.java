/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
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
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Table Cell Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getCellRangeSource <em>Cell Range Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getDetective <em>Detective</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl#getChangeMarks <em>Change Marks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableTableCellContentImpl extends EObjectImpl implements TableTableCellContent {
	/**
	 * The cached value of the '{@link #getCellRangeSource() <em>Cell Range Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeSource()
	 * @generated
	 * @ordered
	 */
	protected CellRangeSourceType cellRangeSource;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected AnnotationType annotation;

	/**
	 * The cached value of the '{@link #getDetective() <em>Detective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetective()
	 * @generated
	 * @ordered
	 */
	protected DetectiveType detective;

	/**
	 * The cached value of the '{@link #getTextContent() <em>Text Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextContent()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap textContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTableCellContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTableTableCellContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellRangeSourceType getCellRangeSource() {
		return cellRangeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellRangeSource(CellRangeSourceType newCellRangeSource, NotificationChain msgs) {
		CellRangeSourceType oldCellRangeSource = cellRangeSource;
		cellRangeSource = newCellRangeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE, oldCellRangeSource, newCellRangeSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRangeSource(CellRangeSourceType newCellRangeSource) {
		if (newCellRangeSource != cellRangeSource) {
			NotificationChain msgs = null;
			if (cellRangeSource != null)
				msgs = ((InternalEObject)cellRangeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE, null, msgs);
			if (newCellRangeSource != null)
				msgs = ((InternalEObject)newCellRangeSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE, null, msgs);
			msgs = basicSetCellRangeSource(newCellRangeSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE, newCellRangeSource, newCellRangeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(AnnotationType newAnnotation, NotificationChain msgs) {
		AnnotationType oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(AnnotationType newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectiveType getDetective() {
		return detective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetective(DetectiveType newDetective, NotificationChain msgs) {
		DetectiveType oldDetective = detective;
		detective = newDetective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE, oldDetective, newDetective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetective(DetectiveType newDetective) {
		if (newDetective != detective) {
			NotificationChain msgs = null;
			if (detective != null)
				msgs = ((InternalEObject)detective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE, null, msgs);
			if (newDetective != null)
				msgs = ((InternalEObject)newDetective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE, null, msgs);
			msgs = basicSetDetective(newDetective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE, newDetective, newDetective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextContent() {
		if (textContent == null) {
			textContent = new BasicFeatureMap(this, TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT);
		}
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_NumberedParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getTextContent().list(TextPackage.eINSTANCE.getTableTableCellContent_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getTextContent().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getTableTableCellContent_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getTableTableCellContent_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE:
				return basicSetCellRangeSource(null, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE:
				return basicSetDetective(null, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT:
				return ((InternalEList<?>)getTextContent()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE:
				return getCellRangeSource();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION:
				return getAnnotation();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE:
				return getDetective();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT:
				if (coreType) return getTextContent();
				return ((FeatureMap.Internal)getTextContent()).getWrapper();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__H:
				return getH();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__P:
				return getP();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LIST:
				return getList();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE:
				return getTable();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__A:
				return getA();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION:
				return getSection();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX:
				return getUserIndex();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__RECT:
				return getRect();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LINE:
				return getLine();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE:
				return getPolyline();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON:
				return getPolygon();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PATH:
				return getPath();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE:
				return getCircle();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE:
				return getEllipse();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__G:
				return getG();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME:
				return getFrame();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE:
				return getMeasure();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION:
				return getCaption();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR:
				return getConnector();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL:
				return getControl();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE:
				return getScene();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS:
				return getChangeMarks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE:
				setCellRangeSource((CellRangeSourceType)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION:
				setAnnotation((AnnotationType)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE:
				setDetective((DetectiveType)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT:
				((FeatureMap.Internal)getTextContent()).set(newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE:
				setCellRangeSource((CellRangeSourceType)null);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION:
				setAnnotation((AnnotationType)null);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE:
				setDetective((DetectiveType)null);
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT:
				getTextContent().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__H:
				getH().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__P:
				getP().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LIST:
				getList().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE:
				getTable().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__A:
				getA().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION:
				getSection().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX:
				getUserIndex().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__RECT:
				getRect().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LINE:
				getLine().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PATH:
				getPath().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__G:
				getG().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME:
				getFrame().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL:
				getControl().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE:
				getScene().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CELL_RANGE_SOURCE:
				return cellRangeSource != null;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ANNOTATION:
				return annotation != null;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__DETECTIVE:
				return detective != null;
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TEXT_CONTENT:
				return textContent != null && !textContent.isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__H:
				return !getH().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__P:
				return !getP().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LIST:
				return !getList().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE:
				return !getTable().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__A:
				return !getA().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SECTION:
				return !getSection().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__USER_INDEX:
				return !getUserIndex().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__RECT:
				return !getRect().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__LINE:
				return !getLine().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PATH:
				return !getPath().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__G:
				return !getG().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__SCENE:
				return !getScene().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.TABLE_TABLE_CELL_CONTENT__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textContent: ");
		result.append(textContent);
		result.append(')');
		return result.toString();
	}

} //TableTableCellContentImpl
