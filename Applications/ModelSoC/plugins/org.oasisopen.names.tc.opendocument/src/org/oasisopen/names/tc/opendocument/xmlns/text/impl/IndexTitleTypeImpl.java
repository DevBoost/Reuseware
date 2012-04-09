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
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Title Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getIndexContentMain <em>Index Content Main</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getIndexTitle <em>Index Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexTitleTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexTitleTypeImpl extends EObjectImpl implements IndexTitleType {
	/**
	 * The cached value of the '{@link #getIndexContentMain() <em>Index Content Main</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexContentMain()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap indexContentMain;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected String protectionKey = PROTECTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexTitleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getIndexTitleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIndexContentMain() {
		if (indexContentMain == null) {
			indexContentMain = new BasicFeatureMap(this, TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN);
		}
		return indexContentMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_NumberedParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getIndexContentMain().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getIndexTitleType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getIndexTitleType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexTitleType> getIndexTitle() {
		return getIndexContentMain().list(TextPackage.eINSTANCE.getIndexTitleType_IndexTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_TITLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_TITLE_TYPE__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.INDEX_TITLE_TYPE__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtectionKey() {
		return protectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionKey(String newProtectionKey) {
		String oldProtectionKey = protectionKey;
		protectionKey = newProtectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_TITLE_TYPE__PROTECTION_KEY, oldProtectionKey, protectionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_TITLE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN:
				return ((InternalEList<?>)getIndexContentMain()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case TextPackage.INDEX_TITLE_TYPE__INDEX_TITLE:
				return ((InternalEList<?>)getIndexTitle()).basicRemove(otherEnd, msgs);
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
			case TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN:
				if (coreType) return getIndexContentMain();
				return ((FeatureMap.Internal)getIndexContentMain()).getWrapper();
			case TextPackage.INDEX_TITLE_TYPE__H:
				return getH();
			case TextPackage.INDEX_TITLE_TYPE__P:
				return getP();
			case TextPackage.INDEX_TITLE_TYPE__LIST:
				return getList();
			case TextPackage.INDEX_TITLE_TYPE__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case TextPackage.INDEX_TITLE_TYPE__TABLE:
				return getTable();
			case TextPackage.INDEX_TITLE_TYPE__A:
				return getA();
			case TextPackage.INDEX_TITLE_TYPE__SECTION:
				return getSection();
			case TextPackage.INDEX_TITLE_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.INDEX_TITLE_TYPE__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.INDEX_TITLE_TYPE__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.INDEX_TITLE_TYPE__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.INDEX_TITLE_TYPE__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.INDEX_TITLE_TYPE__USER_INDEX:
				return getUserIndex();
			case TextPackage.INDEX_TITLE_TYPE__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.INDEX_TITLE_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.INDEX_TITLE_TYPE__RECT:
				return getRect();
			case TextPackage.INDEX_TITLE_TYPE__LINE:
				return getLine();
			case TextPackage.INDEX_TITLE_TYPE__POLYLINE:
				return getPolyline();
			case TextPackage.INDEX_TITLE_TYPE__POLYGON:
				return getPolygon();
			case TextPackage.INDEX_TITLE_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.INDEX_TITLE_TYPE__PATH:
				return getPath();
			case TextPackage.INDEX_TITLE_TYPE__CIRCLE:
				return getCircle();
			case TextPackage.INDEX_TITLE_TYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.INDEX_TITLE_TYPE__G:
				return getG();
			case TextPackage.INDEX_TITLE_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.INDEX_TITLE_TYPE__FRAME:
				return getFrame();
			case TextPackage.INDEX_TITLE_TYPE__MEASURE:
				return getMeasure();
			case TextPackage.INDEX_TITLE_TYPE__CAPTION:
				return getCaption();
			case TextPackage.INDEX_TITLE_TYPE__CONNECTOR:
				return getConnector();
			case TextPackage.INDEX_TITLE_TYPE__CONTROL:
				return getControl();
			case TextPackage.INDEX_TITLE_TYPE__SCENE:
				return getScene();
			case TextPackage.INDEX_TITLE_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.INDEX_TITLE_TYPE__INDEX_TITLE:
				return getIndexTitle();
			case TextPackage.INDEX_TITLE_TYPE__NAME:
				return getName();
			case TextPackage.INDEX_TITLE_TYPE__PROTECTED:
				return getProtected();
			case TextPackage.INDEX_TITLE_TYPE__PROTECTION_KEY:
				return getProtectionKey();
			case TextPackage.INDEX_TITLE_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN:
				((FeatureMap.Internal)getIndexContentMain()).set(newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__INDEX_TITLE:
				getIndexTitle().clear();
				getIndexTitle().addAll((Collection<? extends IndexTitleType>)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__PROTECTION_KEY:
				setProtectionKey((String)newValue);
				return;
			case TextPackage.INDEX_TITLE_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN:
				getIndexContentMain().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__H:
				getH().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__P:
				getP().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__LIST:
				getList().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE:
				getTable().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__A:
				getA().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__SECTION:
				getSection().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__USER_INDEX:
				getUserIndex().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__G:
				getG().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__INDEX_TITLE:
				getIndexTitle().clear();
				return;
			case TextPackage.INDEX_TITLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.INDEX_TITLE_TYPE__PROTECTED:
				unsetProtected();
				return;
			case TextPackage.INDEX_TITLE_TYPE__PROTECTION_KEY:
				setProtectionKey(PROTECTION_KEY_EDEFAULT);
				return;
			case TextPackage.INDEX_TITLE_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.INDEX_TITLE_TYPE__INDEX_CONTENT_MAIN:
				return indexContentMain != null && !indexContentMain.isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__H:
				return !getH().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__P:
				return !getP().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__LIST:
				return !getList().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__TABLE:
				return !getTable().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__A:
				return !getA().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__SECTION:
				return !getSection().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__USER_INDEX:
				return !getUserIndex().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__G:
				return !getG().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__INDEX_TITLE:
				return !getIndexTitle().isEmpty();
			case TextPackage.INDEX_TITLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.INDEX_TITLE_TYPE__PROTECTED:
				return isSetProtected();
			case TextPackage.INDEX_TITLE_TYPE__PROTECTION_KEY:
				return PROTECTION_KEY_EDEFAULT == null ? protectionKey != null : !PROTECTION_KEY_EDEFAULT.equals(protectionKey);
			case TextPackage.INDEX_TITLE_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (indexContentMain: ");
		result.append(indexContentMain);
		result.append(", name: ");
		result.append(name);
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", protectionKey: ");
		result.append(protectionKey);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //IndexTitleTypeImpl
