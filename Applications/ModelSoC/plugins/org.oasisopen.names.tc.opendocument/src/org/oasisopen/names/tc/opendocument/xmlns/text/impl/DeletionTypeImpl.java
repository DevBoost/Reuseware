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
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DeletionType;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deletion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DeletionTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletionTypeImpl extends EObjectImpl implements DeletionType {
	/**
	 * The cached value of the '{@link #getChangeInfo() <em>Change Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInfo()
	 * @generated
	 * @ordered
	 */
	protected ChangeInfoType changeInfo;

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
	protected DeletionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDeletionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInfoType getChangeInfo() {
		return changeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInfo(ChangeInfoType newChangeInfo, NotificationChain msgs) {
		ChangeInfoType oldChangeInfo = changeInfo;
		changeInfo = newChangeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.DELETION_TYPE__CHANGE_INFO, oldChangeInfo, newChangeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInfo(ChangeInfoType newChangeInfo) {
		if (newChangeInfo != changeInfo) {
			NotificationChain msgs = null;
			if (changeInfo != null)
				msgs = ((InternalEObject)changeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.DELETION_TYPE__CHANGE_INFO, null, msgs);
			if (newChangeInfo != null)
				msgs = ((InternalEObject)newChangeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.DELETION_TYPE__CHANGE_INFO, null, msgs);
			msgs = basicSetChangeInfo(newChangeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DELETION_TYPE__CHANGE_INFO, newChangeInfo, newChangeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextContent() {
		if (textContent == null) {
			textContent = new BasicFeatureMap(this, TextPackage.DELETION_TYPE__TEXT_CONTENT);
		}
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_NumberedParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getTextContent().list(TextPackage.eINSTANCE.getDeletionType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getTextContent().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getDeletionType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getDeletionType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DELETION_TYPE__CHANGE_INFO:
				return basicSetChangeInfo(null, msgs);
			case TextPackage.DELETION_TYPE__TEXT_CONTENT:
				return ((InternalEList<?>)getTextContent()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.DELETION_TYPE__CHANGE_MARKS:
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
			case TextPackage.DELETION_TYPE__CHANGE_INFO:
				return getChangeInfo();
			case TextPackage.DELETION_TYPE__TEXT_CONTENT:
				if (coreType) return getTextContent();
				return ((FeatureMap.Internal)getTextContent()).getWrapper();
			case TextPackage.DELETION_TYPE__H:
				return getH();
			case TextPackage.DELETION_TYPE__P:
				return getP();
			case TextPackage.DELETION_TYPE__LIST:
				return getList();
			case TextPackage.DELETION_TYPE__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case TextPackage.DELETION_TYPE__TABLE:
				return getTable();
			case TextPackage.DELETION_TYPE__A:
				return getA();
			case TextPackage.DELETION_TYPE__SECTION:
				return getSection();
			case TextPackage.DELETION_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.DELETION_TYPE__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.DELETION_TYPE__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.DELETION_TYPE__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.DELETION_TYPE__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.DELETION_TYPE__USER_INDEX:
				return getUserIndex();
			case TextPackage.DELETION_TYPE__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.DELETION_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.DELETION_TYPE__RECT:
				return getRect();
			case TextPackage.DELETION_TYPE__LINE:
				return getLine();
			case TextPackage.DELETION_TYPE__POLYLINE:
				return getPolyline();
			case TextPackage.DELETION_TYPE__POLYGON:
				return getPolygon();
			case TextPackage.DELETION_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.DELETION_TYPE__PATH:
				return getPath();
			case TextPackage.DELETION_TYPE__CIRCLE:
				return getCircle();
			case TextPackage.DELETION_TYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.DELETION_TYPE__G:
				return getG();
			case TextPackage.DELETION_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.DELETION_TYPE__FRAME:
				return getFrame();
			case TextPackage.DELETION_TYPE__MEASURE:
				return getMeasure();
			case TextPackage.DELETION_TYPE__CAPTION:
				return getCaption();
			case TextPackage.DELETION_TYPE__CONNECTOR:
				return getConnector();
			case TextPackage.DELETION_TYPE__CONTROL:
				return getControl();
			case TextPackage.DELETION_TYPE__SCENE:
				return getScene();
			case TextPackage.DELETION_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.DELETION_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.DELETION_TYPE__CHANGE_MARKS:
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
			case TextPackage.DELETION_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)newValue);
				return;
			case TextPackage.DELETION_TYPE__TEXT_CONTENT:
				((FeatureMap.Internal)getTextContent()).set(newValue);
				return;
			case TextPackage.DELETION_TYPE__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.DELETION_TYPE__CHANGE_MARKS_GROUP:
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
			case TextPackage.DELETION_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)null);
				return;
			case TextPackage.DELETION_TYPE__TEXT_CONTENT:
				getTextContent().clear();
				return;
			case TextPackage.DELETION_TYPE__H:
				getH().clear();
				return;
			case TextPackage.DELETION_TYPE__P:
				getP().clear();
				return;
			case TextPackage.DELETION_TYPE__LIST:
				getList().clear();
				return;
			case TextPackage.DELETION_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case TextPackage.DELETION_TYPE__TABLE:
				getTable().clear();
				return;
			case TextPackage.DELETION_TYPE__A:
				getA().clear();
				return;
			case TextPackage.DELETION_TYPE__SECTION:
				getSection().clear();
				return;
			case TextPackage.DELETION_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.DELETION_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case TextPackage.DELETION_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case TextPackage.DELETION_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case TextPackage.DELETION_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case TextPackage.DELETION_TYPE__USER_INDEX:
				getUserIndex().clear();
				return;
			case TextPackage.DELETION_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case TextPackage.DELETION_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case TextPackage.DELETION_TYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.DELETION_TYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.DELETION_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.DELETION_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.DELETION_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.DELETION_TYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.DELETION_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.DELETION_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.DELETION_TYPE__G:
				getG().clear();
				return;
			case TextPackage.DELETION_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.DELETION_TYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.DELETION_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.DELETION_TYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.DELETION_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.DELETION_TYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.DELETION_TYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.DELETION_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.DELETION_TYPE__CHANGE_MARKS_GROUP:
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
			case TextPackage.DELETION_TYPE__CHANGE_INFO:
				return changeInfo != null;
			case TextPackage.DELETION_TYPE__TEXT_CONTENT:
				return textContent != null && !textContent.isEmpty();
			case TextPackage.DELETION_TYPE__H:
				return !getH().isEmpty();
			case TextPackage.DELETION_TYPE__P:
				return !getP().isEmpty();
			case TextPackage.DELETION_TYPE__LIST:
				return !getList().isEmpty();
			case TextPackage.DELETION_TYPE__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case TextPackage.DELETION_TYPE__TABLE:
				return !getTable().isEmpty();
			case TextPackage.DELETION_TYPE__A:
				return !getA().isEmpty();
			case TextPackage.DELETION_TYPE__SECTION:
				return !getSection().isEmpty();
			case TextPackage.DELETION_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.DELETION_TYPE__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case TextPackage.DELETION_TYPE__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case TextPackage.DELETION_TYPE__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case TextPackage.DELETION_TYPE__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case TextPackage.DELETION_TYPE__USER_INDEX:
				return !getUserIndex().isEmpty();
			case TextPackage.DELETION_TYPE__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case TextPackage.DELETION_TYPE__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case TextPackage.DELETION_TYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.DELETION_TYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.DELETION_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.DELETION_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.DELETION_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.DELETION_TYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.DELETION_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.DELETION_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.DELETION_TYPE__G:
				return !getG().isEmpty();
			case TextPackage.DELETION_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.DELETION_TYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.DELETION_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.DELETION_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.DELETION_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.DELETION_TYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.DELETION_TYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.DELETION_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.DELETION_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.DELETION_TYPE__CHANGE_MARKS:
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

} //DeletionTypeImpl
