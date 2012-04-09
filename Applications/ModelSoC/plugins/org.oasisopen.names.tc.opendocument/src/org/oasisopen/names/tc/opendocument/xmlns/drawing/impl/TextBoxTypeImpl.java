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
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getChainNextName <em>Chain Next Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.TextBoxTypeImpl#getMinWidth <em>Min Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextBoxTypeImpl extends EObjectImpl implements TextBoxType {
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
	 * The default value of the '{@link #getChainNextName() <em>Chain Next Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainNextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAIN_NEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChainNextName() <em>Chain Next Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainNextName()
	 * @generated
	 * @ordered
	 */
	protected String chainNextName = CHAIN_NEXT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String CORNER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected String cornerRadius = CORNER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected String maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected String maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected String minHeight = MIN_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected String minWidth = MIN_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getTextBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextContent() {
		if (textContent == null) {
			textContent = new BasicFeatureMap(this, DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT);
		}
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_NumberedParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getTextContent().list(DrawingPackage.eINSTANCE.getTextBoxType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getTextContent().<FeatureMap.Entry>list(DrawingPackage.eINSTANCE.getTextBoxType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(DrawingPackage.eINSTANCE.getTextBoxType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChainNextName() {
		return chainNextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainNextName(String newChainNextName) {
		String oldChainNextName = chainNextName;
		chainNextName = newChainNextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__CHAIN_NEXT_NAME, oldChainNextName, chainNextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerRadius(String newCornerRadius) {
		String oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__CORNER_RADIUS, oldCornerRadius, cornerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeight(String newMaxHeight) {
		String oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWidth(String newMaxWidth) {
		String oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(String newMinHeight) {
		String oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__MIN_HEIGHT, oldMinHeight, minHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(String newMinWidth) {
		String oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.TEXT_BOX_TYPE__MIN_WIDTH, oldMinWidth, minWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT:
				return ((InternalEList<?>)getTextContent()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS:
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
			case DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT:
				if (coreType) return getTextContent();
				return ((FeatureMap.Internal)getTextContent()).getWrapper();
			case DrawingPackage.TEXT_BOX_TYPE__H:
				return getH();
			case DrawingPackage.TEXT_BOX_TYPE__P:
				return getP();
			case DrawingPackage.TEXT_BOX_TYPE__LIST:
				return getList();
			case DrawingPackage.TEXT_BOX_TYPE__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE:
				return getTable();
			case DrawingPackage.TEXT_BOX_TYPE__A:
				return getA();
			case DrawingPackage.TEXT_BOX_TYPE__SECTION:
				return getSection();
			case DrawingPackage.TEXT_BOX_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_OF_CONTENT:
				return getTableOfContent();
			case DrawingPackage.TEXT_BOX_TYPE__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_INDEX:
				return getTableIndex();
			case DrawingPackage.TEXT_BOX_TYPE__OBJECT_INDEX:
				return getObjectIndex();
			case DrawingPackage.TEXT_BOX_TYPE__USER_INDEX:
				return getUserIndex();
			case DrawingPackage.TEXT_BOX_TYPE__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case DrawingPackage.TEXT_BOX_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case DrawingPackage.TEXT_BOX_TYPE__RECT:
				return getRect();
			case DrawingPackage.TEXT_BOX_TYPE__LINE:
				return getLine();
			case DrawingPackage.TEXT_BOX_TYPE__POLYLINE:
				return getPolyline();
			case DrawingPackage.TEXT_BOX_TYPE__POLYGON:
				return getPolygon();
			case DrawingPackage.TEXT_BOX_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case DrawingPackage.TEXT_BOX_TYPE__PATH:
				return getPath();
			case DrawingPackage.TEXT_BOX_TYPE__CIRCLE:
				return getCircle();
			case DrawingPackage.TEXT_BOX_TYPE__ELLIPSE:
				return getEllipse();
			case DrawingPackage.TEXT_BOX_TYPE__G:
				return getG();
			case DrawingPackage.TEXT_BOX_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case DrawingPackage.TEXT_BOX_TYPE__FRAME:
				return getFrame();
			case DrawingPackage.TEXT_BOX_TYPE__MEASURE:
				return getMeasure();
			case DrawingPackage.TEXT_BOX_TYPE__CAPTION:
				return getCaption();
			case DrawingPackage.TEXT_BOX_TYPE__CONNECTOR:
				return getConnector();
			case DrawingPackage.TEXT_BOX_TYPE__CONTROL:
				return getControl();
			case DrawingPackage.TEXT_BOX_TYPE__SCENE:
				return getScene();
			case DrawingPackage.TEXT_BOX_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case DrawingPackage.TEXT_BOX_TYPE__CHAIN_NEXT_NAME:
				return getChainNextName();
			case DrawingPackage.TEXT_BOX_TYPE__CORNER_RADIUS:
				return getCornerRadius();
			case DrawingPackage.TEXT_BOX_TYPE__ID:
				return getId();
			case DrawingPackage.TEXT_BOX_TYPE__MAX_HEIGHT:
				return getMaxHeight();
			case DrawingPackage.TEXT_BOX_TYPE__MAX_WIDTH:
				return getMaxWidth();
			case DrawingPackage.TEXT_BOX_TYPE__MIN_HEIGHT:
				return getMinHeight();
			case DrawingPackage.TEXT_BOX_TYPE__MIN_WIDTH:
				return getMinWidth();
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
			case DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT:
				((FeatureMap.Internal)getTextContent()).set(newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CHAIN_NEXT_NAME:
				setChainNextName((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CORNER_RADIUS:
				setCornerRadius((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ID:
				setId((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MAX_HEIGHT:
				setMaxHeight((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MAX_WIDTH:
				setMaxWidth((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MIN_HEIGHT:
				setMinHeight((String)newValue);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MIN_WIDTH:
				setMinWidth((String)newValue);
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
			case DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT:
				getTextContent().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__H:
				getH().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__P:
				getP().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__LIST:
				getList().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE:
				getTable().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__A:
				getA().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SECTION:
				getSection().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__USER_INDEX:
				getUserIndex().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__RECT:
				getRect().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__LINE:
				getLine().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__PATH:
				getPath().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__G:
				getG().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__FRAME:
				getFrame().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CAPTION:
				getCaption().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CONTROL:
				getControl().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__SCENE:
				getScene().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CHAIN_NEXT_NAME:
				setChainNextName(CHAIN_NEXT_NAME_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__CORNER_RADIUS:
				setCornerRadius(CORNER_RADIUS_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MIN_HEIGHT:
				setMinHeight(MIN_HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.TEXT_BOX_TYPE__MIN_WIDTH:
				setMinWidth(MIN_WIDTH_EDEFAULT);
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
			case DrawingPackage.TEXT_BOX_TYPE__TEXT_CONTENT:
				return textContent != null && !textContent.isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__H:
				return !getH().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__P:
				return !getP().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__LIST:
				return !getList().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE:
				return !getTable().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__A:
				return !getA().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__SECTION:
				return !getSection().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__USER_INDEX:
				return !getUserIndex().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__RECT:
				return !getRect().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__LINE:
				return !getLine().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__PATH:
				return !getPath().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__G:
				return !getG().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__FRAME:
				return !getFrame().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CONTROL:
				return !getControl().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__SCENE:
				return !getScene().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case DrawingPackage.TEXT_BOX_TYPE__CHAIN_NEXT_NAME:
				return CHAIN_NEXT_NAME_EDEFAULT == null ? chainNextName != null : !CHAIN_NEXT_NAME_EDEFAULT.equals(chainNextName);
			case DrawingPackage.TEXT_BOX_TYPE__CORNER_RADIUS:
				return CORNER_RADIUS_EDEFAULT == null ? cornerRadius != null : !CORNER_RADIUS_EDEFAULT.equals(cornerRadius);
			case DrawingPackage.TEXT_BOX_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DrawingPackage.TEXT_BOX_TYPE__MAX_HEIGHT:
				return MAX_HEIGHT_EDEFAULT == null ? maxHeight != null : !MAX_HEIGHT_EDEFAULT.equals(maxHeight);
			case DrawingPackage.TEXT_BOX_TYPE__MAX_WIDTH:
				return MAX_WIDTH_EDEFAULT == null ? maxWidth != null : !MAX_WIDTH_EDEFAULT.equals(maxWidth);
			case DrawingPackage.TEXT_BOX_TYPE__MIN_HEIGHT:
				return MIN_HEIGHT_EDEFAULT == null ? minHeight != null : !MIN_HEIGHT_EDEFAULT.equals(minHeight);
			case DrawingPackage.TEXT_BOX_TYPE__MIN_WIDTH:
				return MIN_WIDTH_EDEFAULT == null ? minWidth != null : !MIN_WIDTH_EDEFAULT.equals(minWidth);
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
		result.append(", chainNextName: ");
		result.append(chainNextName);
		result.append(", cornerRadius: ");
		result.append(cornerRadius);
		result.append(", id: ");
		result.append(id);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", minHeight: ");
		result.append(minHeight);
		result.append(", minWidth: ");
		result.append(minWidth);
		result.append(')');
		return result.toString();
	}

} //TextBoxTypeImpl
