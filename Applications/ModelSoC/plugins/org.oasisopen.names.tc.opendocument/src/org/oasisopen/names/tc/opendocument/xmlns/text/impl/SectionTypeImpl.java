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
import org.oasisopen.names.tc.opendocument.xmlns.text.DisplayType3;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getSectionSource <em>Section Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTextSectionSourceDdeGroup <em>Text Section Source Dde Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTextSectionSourceDde <em>Text Section Source Dde</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SectionTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionTypeImpl extends EObjectImpl implements SectionType {
	/**
	 * The cached value of the '{@link #getSectionSource() <em>Section Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionSource()
	 * @generated
	 * @ordered
	 */
	protected SectionSourceType sectionSource;

	/**
	 * The cached value of the '{@link #getTextSectionSourceDdeGroup() <em>Text Section Source Dde Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSectionSourceDdeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap textSectionSourceDdeGroup;

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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayType3 DISPLAY_EDEFAULT = DisplayType3.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected DisplayType3 display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

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
	protected SectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionSourceType getSectionSource() {
		return sectionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionSource(SectionSourceType newSectionSource, NotificationChain msgs) {
		SectionSourceType oldSectionSource = sectionSource;
		sectionSource = newSectionSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__SECTION_SOURCE, oldSectionSource, newSectionSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionSource(SectionSourceType newSectionSource) {
		if (newSectionSource != sectionSource) {
			NotificationChain msgs = null;
			if (sectionSource != null)
				msgs = ((InternalEObject)sectionSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.SECTION_TYPE__SECTION_SOURCE, null, msgs);
			if (newSectionSource != null)
				msgs = ((InternalEObject)newSectionSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.SECTION_TYPE__SECTION_SOURCE, null, msgs);
			msgs = basicSetSectionSource(newSectionSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__SECTION_SOURCE, newSectionSource, newSectionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextSectionSourceDdeGroup() {
		if (textSectionSourceDdeGroup == null) {
			textSectionSourceDdeGroup = new BasicFeatureMap(this, TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP);
		}
		return textSectionSourceDdeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType getTextSectionSourceDde() {
		return (TextSectionSourceDdeType)getTextSectionSourceDdeGroup().get(TextPackage.eINSTANCE.getSectionType_TextSectionSourceDde(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextSectionSourceDde(TextSectionSourceDdeType newTextSectionSourceDde, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTextSectionSourceDdeGroup()).basicAdd(TextPackage.eINSTANCE.getSectionType_TextSectionSourceDde(), newTextSectionSourceDde, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextContent() {
		if (textContent == null) {
			textContent = new BasicFeatureMap(this, TextPackage.SECTION_TYPE__TEXT_CONTENT);
		}
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_NumberedParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getTextContent().list(TextPackage.eINSTANCE.getSectionType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getTextContent().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getSectionType_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getSectionType_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType3 getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(DisplayType3 newDisplay) {
		DisplayType3 oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		DisplayType3 oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.SECTION_TYPE__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__PROTECTED, oldProtected, protected_, !oldProtectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.SECTION_TYPE__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__PROTECTION_KEY, oldProtectionKey, protectionKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SECTION_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.SECTION_TYPE__SECTION_SOURCE:
				return basicSetSectionSource(null, msgs);
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP:
				return ((InternalEList<?>)getTextSectionSourceDdeGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE:
				return basicSetTextSectionSourceDde(null, msgs);
			case TextPackage.SECTION_TYPE__TEXT_CONTENT:
				return ((InternalEList<?>)getTextContent()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.SECTION_TYPE__CHANGE_MARKS:
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
			case TextPackage.SECTION_TYPE__SECTION_SOURCE:
				return getSectionSource();
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP:
				if (coreType) return getTextSectionSourceDdeGroup();
				return ((FeatureMap.Internal)getTextSectionSourceDdeGroup()).getWrapper();
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE:
				return getTextSectionSourceDde();
			case TextPackage.SECTION_TYPE__TEXT_CONTENT:
				if (coreType) return getTextContent();
				return ((FeatureMap.Internal)getTextContent()).getWrapper();
			case TextPackage.SECTION_TYPE__H:
				return getH();
			case TextPackage.SECTION_TYPE__P:
				return getP();
			case TextPackage.SECTION_TYPE__LIST:
				return getList();
			case TextPackage.SECTION_TYPE__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case TextPackage.SECTION_TYPE__TABLE:
				return getTable();
			case TextPackage.SECTION_TYPE__A:
				return getA();
			case TextPackage.SECTION_TYPE__SECTION:
				return getSection();
			case TextPackage.SECTION_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TextPackage.SECTION_TYPE__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.SECTION_TYPE__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.SECTION_TYPE__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.SECTION_TYPE__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.SECTION_TYPE__USER_INDEX:
				return getUserIndex();
			case TextPackage.SECTION_TYPE__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.SECTION_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.SECTION_TYPE__RECT:
				return getRect();
			case TextPackage.SECTION_TYPE__LINE:
				return getLine();
			case TextPackage.SECTION_TYPE__POLYLINE:
				return getPolyline();
			case TextPackage.SECTION_TYPE__POLYGON:
				return getPolygon();
			case TextPackage.SECTION_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TextPackage.SECTION_TYPE__PATH:
				return getPath();
			case TextPackage.SECTION_TYPE__CIRCLE:
				return getCircle();
			case TextPackage.SECTION_TYPE__ELLIPSE:
				return getEllipse();
			case TextPackage.SECTION_TYPE__G:
				return getG();
			case TextPackage.SECTION_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TextPackage.SECTION_TYPE__FRAME:
				return getFrame();
			case TextPackage.SECTION_TYPE__MEASURE:
				return getMeasure();
			case TextPackage.SECTION_TYPE__CAPTION:
				return getCaption();
			case TextPackage.SECTION_TYPE__CONNECTOR:
				return getConnector();
			case TextPackage.SECTION_TYPE__CONTROL:
				return getControl();
			case TextPackage.SECTION_TYPE__SCENE:
				return getScene();
			case TextPackage.SECTION_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case TextPackage.SECTION_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.SECTION_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.SECTION_TYPE__CONDITION:
				return getCondition();
			case TextPackage.SECTION_TYPE__DISPLAY:
				return getDisplay();
			case TextPackage.SECTION_TYPE__NAME:
				return getName();
			case TextPackage.SECTION_TYPE__PROTECTED:
				return getProtected();
			case TextPackage.SECTION_TYPE__PROTECTION_KEY:
				return getProtectionKey();
			case TextPackage.SECTION_TYPE__STYLE_NAME:
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
			case TextPackage.SECTION_TYPE__SECTION_SOURCE:
				setSectionSource((SectionSourceType)newValue);
				return;
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP:
				((FeatureMap.Internal)getTextSectionSourceDdeGroup()).set(newValue);
				return;
			case TextPackage.SECTION_TYPE__TEXT_CONTENT:
				((FeatureMap.Internal)getTextContent()).set(newValue);
				return;
			case TextPackage.SECTION_TYPE__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case TextPackage.SECTION_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.SECTION_TYPE__CONDITION:
				setCondition((String)newValue);
				return;
			case TextPackage.SECTION_TYPE__DISPLAY:
				setDisplay((DisplayType3)newValue);
				return;
			case TextPackage.SECTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.SECTION_TYPE__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.SECTION_TYPE__PROTECTION_KEY:
				setProtectionKey((String)newValue);
				return;
			case TextPackage.SECTION_TYPE__STYLE_NAME:
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
			case TextPackage.SECTION_TYPE__SECTION_SOURCE:
				setSectionSource((SectionSourceType)null);
				return;
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP:
				getTextSectionSourceDdeGroup().clear();
				return;
			case TextPackage.SECTION_TYPE__TEXT_CONTENT:
				getTextContent().clear();
				return;
			case TextPackage.SECTION_TYPE__H:
				getH().clear();
				return;
			case TextPackage.SECTION_TYPE__P:
				getP().clear();
				return;
			case TextPackage.SECTION_TYPE__LIST:
				getList().clear();
				return;
			case TextPackage.SECTION_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case TextPackage.SECTION_TYPE__TABLE:
				getTable().clear();
				return;
			case TextPackage.SECTION_TYPE__A:
				getA().clear();
				return;
			case TextPackage.SECTION_TYPE__SECTION:
				getSection().clear();
				return;
			case TextPackage.SECTION_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TextPackage.SECTION_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case TextPackage.SECTION_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case TextPackage.SECTION_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case TextPackage.SECTION_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case TextPackage.SECTION_TYPE__USER_INDEX:
				getUserIndex().clear();
				return;
			case TextPackage.SECTION_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case TextPackage.SECTION_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case TextPackage.SECTION_TYPE__RECT:
				getRect().clear();
				return;
			case TextPackage.SECTION_TYPE__LINE:
				getLine().clear();
				return;
			case TextPackage.SECTION_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TextPackage.SECTION_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case TextPackage.SECTION_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TextPackage.SECTION_TYPE__PATH:
				getPath().clear();
				return;
			case TextPackage.SECTION_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case TextPackage.SECTION_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TextPackage.SECTION_TYPE__G:
				getG().clear();
				return;
			case TextPackage.SECTION_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TextPackage.SECTION_TYPE__FRAME:
				getFrame().clear();
				return;
			case TextPackage.SECTION_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case TextPackage.SECTION_TYPE__CAPTION:
				getCaption().clear();
				return;
			case TextPackage.SECTION_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TextPackage.SECTION_TYPE__CONTROL:
				getControl().clear();
				return;
			case TextPackage.SECTION_TYPE__SCENE:
				getScene().clear();
				return;
			case TextPackage.SECTION_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case TextPackage.SECTION_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.SECTION_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TextPackage.SECTION_TYPE__DISPLAY:
				unsetDisplay();
				return;
			case TextPackage.SECTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.SECTION_TYPE__PROTECTED:
				unsetProtected();
				return;
			case TextPackage.SECTION_TYPE__PROTECTION_KEY:
				setProtectionKey(PROTECTION_KEY_EDEFAULT);
				return;
			case TextPackage.SECTION_TYPE__STYLE_NAME:
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
			case TextPackage.SECTION_TYPE__SECTION_SOURCE:
				return sectionSource != null;
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE_GROUP:
				return textSectionSourceDdeGroup != null && !textSectionSourceDdeGroup.isEmpty();
			case TextPackage.SECTION_TYPE__TEXT_SECTION_SOURCE_DDE:
				return getTextSectionSourceDde() != null;
			case TextPackage.SECTION_TYPE__TEXT_CONTENT:
				return textContent != null && !textContent.isEmpty();
			case TextPackage.SECTION_TYPE__H:
				return !getH().isEmpty();
			case TextPackage.SECTION_TYPE__P:
				return !getP().isEmpty();
			case TextPackage.SECTION_TYPE__LIST:
				return !getList().isEmpty();
			case TextPackage.SECTION_TYPE__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case TextPackage.SECTION_TYPE__TABLE:
				return !getTable().isEmpty();
			case TextPackage.SECTION_TYPE__A:
				return !getA().isEmpty();
			case TextPackage.SECTION_TYPE__SECTION:
				return !getSection().isEmpty();
			case TextPackage.SECTION_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TextPackage.SECTION_TYPE__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case TextPackage.SECTION_TYPE__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case TextPackage.SECTION_TYPE__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case TextPackage.SECTION_TYPE__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case TextPackage.SECTION_TYPE__USER_INDEX:
				return !getUserIndex().isEmpty();
			case TextPackage.SECTION_TYPE__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case TextPackage.SECTION_TYPE__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case TextPackage.SECTION_TYPE__RECT:
				return !getRect().isEmpty();
			case TextPackage.SECTION_TYPE__LINE:
				return !getLine().isEmpty();
			case TextPackage.SECTION_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TextPackage.SECTION_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TextPackage.SECTION_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TextPackage.SECTION_TYPE__PATH:
				return !getPath().isEmpty();
			case TextPackage.SECTION_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TextPackage.SECTION_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TextPackage.SECTION_TYPE__G:
				return !getG().isEmpty();
			case TextPackage.SECTION_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TextPackage.SECTION_TYPE__FRAME:
				return !getFrame().isEmpty();
			case TextPackage.SECTION_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TextPackage.SECTION_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case TextPackage.SECTION_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TextPackage.SECTION_TYPE__CONTROL:
				return !getControl().isEmpty();
			case TextPackage.SECTION_TYPE__SCENE:
				return !getScene().isEmpty();
			case TextPackage.SECTION_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case TextPackage.SECTION_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.SECTION_TYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.SECTION_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TextPackage.SECTION_TYPE__DISPLAY:
				return isSetDisplay();
			case TextPackage.SECTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.SECTION_TYPE__PROTECTED:
				return isSetProtected();
			case TextPackage.SECTION_TYPE__PROTECTION_KEY:
				return PROTECTION_KEY_EDEFAULT == null ? protectionKey != null : !PROTECTION_KEY_EDEFAULT.equals(protectionKey);
			case TextPackage.SECTION_TYPE__STYLE_NAME:
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
		result.append(" (textSectionSourceDdeGroup: ");
		result.append(textSectionSourceDdeGroup);
		result.append(", textContent: ");
		result.append(textContent);
		result.append(", condition: ");
		result.append(condition);
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
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

} //SectionTypeImpl
