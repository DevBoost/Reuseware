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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PageSequenceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getOfficeTextContentMain <em>Office Text Content Main</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getNumberedParagraph <em>Numbered Paragraph</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPageSequence <em>Page Sequence</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getRect1 <em>Rect1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getLine1 <em>Line1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPolyline1 <em>Polyline1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPolygon1 <em>Polygon1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getRegularPolygon1 <em>Regular Polygon1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPath1 <em>Path1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCircle1 <em>Circle1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getEllipse1 <em>Ellipse1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getG1 <em>G1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getPageThumbnail1 <em>Page Thumbnail1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getFrame1 <em>Frame1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getMeasure1 <em>Measure1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCaption1 <em>Caption1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getConnector1 <em>Connector1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getControl1 <em>Control1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getScene1 <em>Scene1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getCustomShape1 <em>Custom Shape1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getDdeLinks <em>Dde Links</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.TextTypeImpl#getUseSoftPageBreaks <em>Use Soft Page Breaks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextTypeImpl extends EObjectImpl implements TextType {
	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected FormsType forms;

	/**
	 * The cached value of the '{@link #getTrackedChanges() <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackedChanges()
	 * @generated
	 * @ordered
	 */
	protected TrackedChangesType trackedChanges;

	/**
	 * The cached value of the '{@link #getVariableDecls() <em>Variable Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDecls()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclsType variableDecls;

	/**
	 * The cached value of the '{@link #getSequenceDecls() <em>Sequence Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDecls()
	 * @generated
	 * @ordered
	 */
	protected SequenceDeclsType sequenceDecls;

	/**
	 * The cached value of the '{@link #getUserFieldDecls() <em>User Field Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFieldDecls()
	 * @generated
	 * @ordered
	 */
	protected UserFieldDeclsType userFieldDecls;

	/**
	 * The cached value of the '{@link #getDdeConnectionDecls() <em>Dde Connection Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeConnectionDecls()
	 * @generated
	 * @ordered
	 */
	protected DdeConnectionDeclsType ddeConnectionDecls;

	/**
	 * The cached value of the '{@link #getAlphabeticalIndexAutoMarkFile() <em>Alphabetical Index Auto Mark File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalIndexAutoMarkFile()
	 * @generated
	 * @ordered
	 */
	protected AlphabeticalIndexAutoMarkFileType alphabeticalIndexAutoMarkFile;

	/**
	 * The cached value of the '{@link #getCalculationSettings() <em>Calculation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationSettings()
	 * @generated
	 * @ordered
	 */
	protected CalculationSettingsType calculationSettings;

	/**
	 * The cached value of the '{@link #getContentValidations() <em>Content Validations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidations()
	 * @generated
	 * @ordered
	 */
	protected ContentValidationsType contentValidations;

	/**
	 * The cached value of the '{@link #getLabelRanges() <em>Label Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRanges()
	 * @generated
	 * @ordered
	 */
	protected LabelRangesType labelRanges;

	/**
	 * The cached value of the '{@link #getOfficeTextContentMain() <em>Office Text Content Main</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeTextContentMain()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap officeTextContentMain;

	/**
	 * The cached value of the '{@link #getNamedExpressions() <em>Named Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedExpressions()
	 * @generated
	 * @ordered
	 */
	protected NamedExpressionsType namedExpressions;

	/**
	 * The cached value of the '{@link #getDatabaseRanges() <em>Database Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseRanges()
	 * @generated
	 * @ordered
	 */
	protected DatabaseRangesType databaseRanges;

	/**
	 * The cached value of the '{@link #getDataPilotTables() <em>Data Pilot Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotTables()
	 * @generated
	 * @ordered
	 */
	protected DataPilotTablesType dataPilotTables;

	/**
	 * The cached value of the '{@link #getConsolidation() <em>Consolidation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidation()
	 * @generated
	 * @ordered
	 */
	protected ConsolidationType consolidation;

	/**
	 * The cached value of the '{@link #getDdeLinks() <em>Dde Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeLinks()
	 * @generated
	 * @ordered
	 */
	protected DdeLinksType ddeLinks;

	/**
	 * The default value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean GLOBAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean global = GLOBAL_EDEFAULT;

	/**
	 * This is true if the Global attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean globalESet;

	/**
	 * The default value of the '{@link #getUseSoftPageBreaks() <em>Use Soft Page Breaks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSoftPageBreaks()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_SOFT_PAGE_BREAKS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseSoftPageBreaks() <em>Use Soft Page Breaks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSoftPageBreaks()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useSoftPageBreaks = USE_SOFT_PAGE_BREAKS_EDEFAULT;

	/**
	 * This is true if the Use Soft Page Breaks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useSoftPageBreaksESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsType getForms() {
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForms(FormsType newForms, NotificationChain msgs) {
		FormsType oldForms = forms;
		forms = newForms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__FORMS, oldForms, newForms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForms(FormsType newForms) {
		if (newForms != forms) {
			NotificationChain msgs = null;
			if (forms != null)
				msgs = ((InternalEObject)forms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__FORMS, null, msgs);
			if (newForms != null)
				msgs = ((InternalEObject)newForms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__FORMS, null, msgs);
			msgs = basicSetForms(newForms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__FORMS, newForms, newForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType getTrackedChanges() {
		return trackedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackedChanges(TrackedChangesType newTrackedChanges, NotificationChain msgs) {
		TrackedChangesType oldTrackedChanges = trackedChanges;
		trackedChanges = newTrackedChanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__TRACKED_CHANGES, oldTrackedChanges, newTrackedChanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedChanges(TrackedChangesType newTrackedChanges) {
		if (newTrackedChanges != trackedChanges) {
			NotificationChain msgs = null;
			if (trackedChanges != null)
				msgs = ((InternalEObject)trackedChanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__TRACKED_CHANGES, null, msgs);
			if (newTrackedChanges != null)
				msgs = ((InternalEObject)newTrackedChanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__TRACKED_CHANGES, null, msgs);
			msgs = basicSetTrackedChanges(newTrackedChanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__TRACKED_CHANGES, newTrackedChanges, newTrackedChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclsType getVariableDecls() {
		return variableDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDecls(VariableDeclsType newVariableDecls, NotificationChain msgs) {
		VariableDeclsType oldVariableDecls = variableDecls;
		variableDecls = newVariableDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__VARIABLE_DECLS, oldVariableDecls, newVariableDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDecls(VariableDeclsType newVariableDecls) {
		if (newVariableDecls != variableDecls) {
			NotificationChain msgs = null;
			if (variableDecls != null)
				msgs = ((InternalEObject)variableDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__VARIABLE_DECLS, null, msgs);
			if (newVariableDecls != null)
				msgs = ((InternalEObject)newVariableDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__VARIABLE_DECLS, null, msgs);
			msgs = basicSetVariableDecls(newVariableDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__VARIABLE_DECLS, newVariableDecls, newVariableDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclsType getSequenceDecls() {
		return sequenceDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDecls(SequenceDeclsType newSequenceDecls, NotificationChain msgs) {
		SequenceDeclsType oldSequenceDecls = sequenceDecls;
		sequenceDecls = newSequenceDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__SEQUENCE_DECLS, oldSequenceDecls, newSequenceDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDecls(SequenceDeclsType newSequenceDecls) {
		if (newSequenceDecls != sequenceDecls) {
			NotificationChain msgs = null;
			if (sequenceDecls != null)
				msgs = ((InternalEObject)sequenceDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__SEQUENCE_DECLS, null, msgs);
			if (newSequenceDecls != null)
				msgs = ((InternalEObject)newSequenceDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__SEQUENCE_DECLS, null, msgs);
			msgs = basicSetSequenceDecls(newSequenceDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__SEQUENCE_DECLS, newSequenceDecls, newSequenceDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclsType getUserFieldDecls() {
		return userFieldDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldDecls(UserFieldDeclsType newUserFieldDecls, NotificationChain msgs) {
		UserFieldDeclsType oldUserFieldDecls = userFieldDecls;
		userFieldDecls = newUserFieldDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__USER_FIELD_DECLS, oldUserFieldDecls, newUserFieldDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldDecls(UserFieldDeclsType newUserFieldDecls) {
		if (newUserFieldDecls != userFieldDecls) {
			NotificationChain msgs = null;
			if (userFieldDecls != null)
				msgs = ((InternalEObject)userFieldDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__USER_FIELD_DECLS, null, msgs);
			if (newUserFieldDecls != null)
				msgs = ((InternalEObject)newUserFieldDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__USER_FIELD_DECLS, null, msgs);
			msgs = basicSetUserFieldDecls(newUserFieldDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__USER_FIELD_DECLS, newUserFieldDecls, newUserFieldDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclsType getDdeConnectionDecls() {
		return ddeConnectionDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls, NotificationChain msgs) {
		DdeConnectionDeclsType oldDdeConnectionDecls = ddeConnectionDecls;
		ddeConnectionDecls = newDdeConnectionDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS, oldDdeConnectionDecls, newDdeConnectionDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls) {
		if (newDdeConnectionDecls != ddeConnectionDecls) {
			NotificationChain msgs = null;
			if (ddeConnectionDecls != null)
				msgs = ((InternalEObject)ddeConnectionDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS, null, msgs);
			if (newDdeConnectionDecls != null)
				msgs = ((InternalEObject)newDdeConnectionDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS, null, msgs);
			msgs = basicSetDdeConnectionDecls(newDdeConnectionDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS, newDdeConnectionDecls, newDdeConnectionDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile() {
		return alphabeticalIndexAutoMarkFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile, NotificationChain msgs) {
		AlphabeticalIndexAutoMarkFileType oldAlphabeticalIndexAutoMarkFile = alphabeticalIndexAutoMarkFile;
		alphabeticalIndexAutoMarkFile = newAlphabeticalIndexAutoMarkFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, oldAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile) {
		if (newAlphabeticalIndexAutoMarkFile != alphabeticalIndexAutoMarkFile) {
			NotificationChain msgs = null;
			if (alphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)alphabeticalIndexAutoMarkFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			if (newAlphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)newAlphabeticalIndexAutoMarkFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			msgs = basicSetAlphabeticalIndexAutoMarkFile(newAlphabeticalIndexAutoMarkFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, newAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationSettingsType getCalculationSettings() {
		return calculationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculationSettings(CalculationSettingsType newCalculationSettings, NotificationChain msgs) {
		CalculationSettingsType oldCalculationSettings = calculationSettings;
		calculationSettings = newCalculationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS, oldCalculationSettings, newCalculationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationSettings(CalculationSettingsType newCalculationSettings) {
		if (newCalculationSettings != calculationSettings) {
			NotificationChain msgs = null;
			if (calculationSettings != null)
				msgs = ((InternalEObject)calculationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS, null, msgs);
			if (newCalculationSettings != null)
				msgs = ((InternalEObject)newCalculationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS, null, msgs);
			msgs = basicSetCalculationSettings(newCalculationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS, newCalculationSettings, newCalculationSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationsType getContentValidations() {
		return contentValidations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentValidations(ContentValidationsType newContentValidations, NotificationChain msgs) {
		ContentValidationsType oldContentValidations = contentValidations;
		contentValidations = newContentValidations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS, oldContentValidations, newContentValidations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidations(ContentValidationsType newContentValidations) {
		if (newContentValidations != contentValidations) {
			NotificationChain msgs = null;
			if (contentValidations != null)
				msgs = ((InternalEObject)contentValidations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS, null, msgs);
			if (newContentValidations != null)
				msgs = ((InternalEObject)newContentValidations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS, null, msgs);
			msgs = basicSetContentValidations(newContentValidations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS, newContentValidations, newContentValidations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangesType getLabelRanges() {
		return labelRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelRanges(LabelRangesType newLabelRanges, NotificationChain msgs) {
		LabelRangesType oldLabelRanges = labelRanges;
		labelRanges = newLabelRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__LABEL_RANGES, oldLabelRanges, newLabelRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRanges(LabelRangesType newLabelRanges) {
		if (newLabelRanges != labelRanges) {
			NotificationChain msgs = null;
			if (labelRanges != null)
				msgs = ((InternalEObject)labelRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__LABEL_RANGES, null, msgs);
			if (newLabelRanges != null)
				msgs = ((InternalEObject)newLabelRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__LABEL_RANGES, null, msgs);
			msgs = basicSetLabelRanges(newLabelRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__LABEL_RANGES, newLabelRanges, newLabelRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOfficeTextContentMain() {
		if (officeTextContentMain == null) {
			officeTextContentMain = new BasicFeatureMap(this, OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN);
		}
		return officeTextContentMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__H);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberedParagraphType> getNumberedParagraph() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__NUMBERED_PARAGRAPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__SOFT_PAGE_BREAK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__TABLE_OF_CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__ILLUSTRATION_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__TABLE_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__OBJECT_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__USER_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__ALPHABETICAL_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__BIBLIOGRAPHY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__RECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__POLYLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__POLYGON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__REGULAR_POLYGON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CIRCLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__ELLIPSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__G);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__PAGE_THUMBNAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__FRAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__MEASURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CAPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CONTROL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__SCENE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CUSTOM_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getOfficeTextContentMain().<FeatureMap.Entry>list(OfficePackage.Literals.TEXT_TYPE__CHANGE_MARKS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(OfficePackage.Literals.TEXT_TYPE__CHANGE_MARKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageSequenceType> getPageSequence() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__PAGE_SEQUENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__A1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__RECT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__LINE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__POLYLINE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__POLYGON1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__REGULAR_POLYGON1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__PATH1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CIRCLE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__ELLIPSE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__G1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__PAGE_THUMBNAIL1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__FRAME1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__MEASURE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CAPTION1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CONNECTOR1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CONTROL1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__SCENE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape1() {
		return getOfficeTextContentMain().list(OfficePackage.Literals.TEXT_TYPE__CUSTOM_SHAPE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionsType getNamedExpressions() {
		return namedExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedExpressions(NamedExpressionsType newNamedExpressions, NotificationChain msgs) {
		NamedExpressionsType oldNamedExpressions = namedExpressions;
		namedExpressions = newNamedExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS, oldNamedExpressions, newNamedExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedExpressions(NamedExpressionsType newNamedExpressions) {
		if (newNamedExpressions != namedExpressions) {
			NotificationChain msgs = null;
			if (namedExpressions != null)
				msgs = ((InternalEObject)namedExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS, null, msgs);
			if (newNamedExpressions != null)
				msgs = ((InternalEObject)newNamedExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS, null, msgs);
			msgs = basicSetNamedExpressions(newNamedExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS, newNamedExpressions, newNamedExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangesType getDatabaseRanges() {
		return databaseRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRanges(DatabaseRangesType newDatabaseRanges, NotificationChain msgs) {
		DatabaseRangesType oldDatabaseRanges = databaseRanges;
		databaseRanges = newDatabaseRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DATABASE_RANGES, oldDatabaseRanges, newDatabaseRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRanges(DatabaseRangesType newDatabaseRanges) {
		if (newDatabaseRanges != databaseRanges) {
			NotificationChain msgs = null;
			if (databaseRanges != null)
				msgs = ((InternalEObject)databaseRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DATABASE_RANGES, null, msgs);
			if (newDatabaseRanges != null)
				msgs = ((InternalEObject)newDatabaseRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DATABASE_RANGES, null, msgs);
			msgs = basicSetDatabaseRanges(newDatabaseRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DATABASE_RANGES, newDatabaseRanges, newDatabaseRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTablesType getDataPilotTables() {
		return dataPilotTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotTables(DataPilotTablesType newDataPilotTables, NotificationChain msgs) {
		DataPilotTablesType oldDataPilotTables = dataPilotTables;
		dataPilotTables = newDataPilotTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES, oldDataPilotTables, newDataPilotTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotTables(DataPilotTablesType newDataPilotTables) {
		if (newDataPilotTables != dataPilotTables) {
			NotificationChain msgs = null;
			if (dataPilotTables != null)
				msgs = ((InternalEObject)dataPilotTables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES, null, msgs);
			if (newDataPilotTables != null)
				msgs = ((InternalEObject)newDataPilotTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES, null, msgs);
			msgs = basicSetDataPilotTables(newDataPilotTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES, newDataPilotTables, newDataPilotTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidationType getConsolidation() {
		return consolidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsolidation(ConsolidationType newConsolidation, NotificationChain msgs) {
		ConsolidationType oldConsolidation = consolidation;
		consolidation = newConsolidation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CONSOLIDATION, oldConsolidation, newConsolidation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsolidation(ConsolidationType newConsolidation) {
		if (newConsolidation != consolidation) {
			NotificationChain msgs = null;
			if (consolidation != null)
				msgs = ((InternalEObject)consolidation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CONSOLIDATION, null, msgs);
			if (newConsolidation != null)
				msgs = ((InternalEObject)newConsolidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__CONSOLIDATION, null, msgs);
			msgs = basicSetConsolidation(newConsolidation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__CONSOLIDATION, newConsolidation, newConsolidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinksType getDdeLinks() {
		return ddeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeLinks(DdeLinksType newDdeLinks, NotificationChain msgs) {
		DdeLinksType oldDdeLinks = ddeLinks;
		ddeLinks = newDdeLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DDE_LINKS, oldDdeLinks, newDdeLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeLinks(DdeLinksType newDdeLinks) {
		if (newDdeLinks != ddeLinks) {
			NotificationChain msgs = null;
			if (ddeLinks != null)
				msgs = ((InternalEObject)ddeLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DDE_LINKS, null, msgs);
			if (newDdeLinks != null)
				msgs = ((InternalEObject)newDdeLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.TEXT_TYPE__DDE_LINKS, null, msgs);
			msgs = basicSetDdeLinks(newDdeLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__DDE_LINKS, newDdeLinks, newDdeLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newGlobal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGlobal = global;
		global = newGlobal == null ? GLOBAL_EDEFAULT : newGlobal;
		boolean oldGlobalESet = globalESet;
		globalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__GLOBAL, oldGlobal, global, !oldGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGlobal = global;
		boolean oldGlobalESet = globalESet;
		global = GLOBAL_EDEFAULT;
		globalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.TEXT_TYPE__GLOBAL, oldGlobal, GLOBAL_EDEFAULT, oldGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobal() {
		return globalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseSoftPageBreaks() {
		return useSoftPageBreaks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseSoftPageBreaks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseSoftPageBreaks) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseSoftPageBreaks = useSoftPageBreaks;
		useSoftPageBreaks = newUseSoftPageBreaks == null ? USE_SOFT_PAGE_BREAKS_EDEFAULT : newUseSoftPageBreaks;
		boolean oldUseSoftPageBreaksESet = useSoftPageBreaksESet;
		useSoftPageBreaksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS, oldUseSoftPageBreaks, useSoftPageBreaks, !oldUseSoftPageBreaksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseSoftPageBreaks() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseSoftPageBreaks = useSoftPageBreaks;
		boolean oldUseSoftPageBreaksESet = useSoftPageBreaksESet;
		useSoftPageBreaks = USE_SOFT_PAGE_BREAKS_EDEFAULT;
		useSoftPageBreaksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS, oldUseSoftPageBreaks, USE_SOFT_PAGE_BREAKS_EDEFAULT, oldUseSoftPageBreaksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseSoftPageBreaks() {
		return useSoftPageBreaksESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.TEXT_TYPE__FORMS:
				return basicSetForms(null, msgs);
			case OfficePackage.TEXT_TYPE__TRACKED_CHANGES:
				return basicSetTrackedChanges(null, msgs);
			case OfficePackage.TEXT_TYPE__VARIABLE_DECLS:
				return basicSetVariableDecls(null, msgs);
			case OfficePackage.TEXT_TYPE__SEQUENCE_DECLS:
				return basicSetSequenceDecls(null, msgs);
			case OfficePackage.TEXT_TYPE__USER_FIELD_DECLS:
				return basicSetUserFieldDecls(null, msgs);
			case OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS:
				return basicSetDdeConnectionDecls(null, msgs);
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return basicSetAlphabeticalIndexAutoMarkFile(null, msgs);
			case OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS:
				return basicSetCalculationSettings(null, msgs);
			case OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS:
				return basicSetContentValidations(null, msgs);
			case OfficePackage.TEXT_TYPE__LABEL_RANGES:
				return basicSetLabelRanges(null, msgs);
			case OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN:
				return ((InternalEList<?>)getOfficeTextContentMain()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__NUMBERED_PARAGRAPH:
				return ((InternalEList<?>)getNumberedParagraph()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__PAGE_SEQUENCE:
				return ((InternalEList<?>)getPageSequence()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__A1:
				return ((InternalEList<?>)getA1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__RECT1:
				return ((InternalEList<?>)getRect1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__LINE1:
				return ((InternalEList<?>)getLine1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__POLYLINE1:
				return ((InternalEList<?>)getPolyline1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__POLYGON1:
				return ((InternalEList<?>)getPolygon1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON1:
				return ((InternalEList<?>)getRegularPolygon1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__PATH1:
				return ((InternalEList<?>)getPath1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CIRCLE1:
				return ((InternalEList<?>)getCircle1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__ELLIPSE1:
				return ((InternalEList<?>)getEllipse1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__G1:
				return ((InternalEList<?>)getG1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL1:
				return ((InternalEList<?>)getPageThumbnail1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__FRAME1:
				return ((InternalEList<?>)getFrame1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__MEASURE1:
				return ((InternalEList<?>)getMeasure1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CAPTION1:
				return ((InternalEList<?>)getCaption1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CONNECTOR1:
				return ((InternalEList<?>)getConnector1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CONTROL1:
				return ((InternalEList<?>)getControl1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__SCENE1:
				return ((InternalEList<?>)getScene1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE1:
				return ((InternalEList<?>)getCustomShape1()).basicRemove(otherEnd, msgs);
			case OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS:
				return basicSetNamedExpressions(null, msgs);
			case OfficePackage.TEXT_TYPE__DATABASE_RANGES:
				return basicSetDatabaseRanges(null, msgs);
			case OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES:
				return basicSetDataPilotTables(null, msgs);
			case OfficePackage.TEXT_TYPE__CONSOLIDATION:
				return basicSetConsolidation(null, msgs);
			case OfficePackage.TEXT_TYPE__DDE_LINKS:
				return basicSetDdeLinks(null, msgs);
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
			case OfficePackage.TEXT_TYPE__FORMS:
				return getForms();
			case OfficePackage.TEXT_TYPE__TRACKED_CHANGES:
				return getTrackedChanges();
			case OfficePackage.TEXT_TYPE__VARIABLE_DECLS:
				return getVariableDecls();
			case OfficePackage.TEXT_TYPE__SEQUENCE_DECLS:
				return getSequenceDecls();
			case OfficePackage.TEXT_TYPE__USER_FIELD_DECLS:
				return getUserFieldDecls();
			case OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS:
				return getDdeConnectionDecls();
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return getAlphabeticalIndexAutoMarkFile();
			case OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS:
				return getCalculationSettings();
			case OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS:
				return getContentValidations();
			case OfficePackage.TEXT_TYPE__LABEL_RANGES:
				return getLabelRanges();
			case OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN:
				if (coreType) return getOfficeTextContentMain();
				return ((FeatureMap.Internal)getOfficeTextContentMain()).getWrapper();
			case OfficePackage.TEXT_TYPE__H:
				return getH();
			case OfficePackage.TEXT_TYPE__P:
				return getP();
			case OfficePackage.TEXT_TYPE__LIST:
				return getList();
			case OfficePackage.TEXT_TYPE__NUMBERED_PARAGRAPH:
				return getNumberedParagraph();
			case OfficePackage.TEXT_TYPE__TABLE:
				return getTable();
			case OfficePackage.TEXT_TYPE__A:
				return getA();
			case OfficePackage.TEXT_TYPE__SECTION:
				return getSection();
			case OfficePackage.TEXT_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case OfficePackage.TEXT_TYPE__TABLE_OF_CONTENT:
				return getTableOfContent();
			case OfficePackage.TEXT_TYPE__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case OfficePackage.TEXT_TYPE__TABLE_INDEX:
				return getTableIndex();
			case OfficePackage.TEXT_TYPE__OBJECT_INDEX:
				return getObjectIndex();
			case OfficePackage.TEXT_TYPE__USER_INDEX:
				return getUserIndex();
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case OfficePackage.TEXT_TYPE__BIBLIOGRAPHY:
				return getBibliography();
			case OfficePackage.TEXT_TYPE__RECT:
				return getRect();
			case OfficePackage.TEXT_TYPE__LINE:
				return getLine();
			case OfficePackage.TEXT_TYPE__POLYLINE:
				return getPolyline();
			case OfficePackage.TEXT_TYPE__POLYGON:
				return getPolygon();
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case OfficePackage.TEXT_TYPE__PATH:
				return getPath();
			case OfficePackage.TEXT_TYPE__CIRCLE:
				return getCircle();
			case OfficePackage.TEXT_TYPE__ELLIPSE:
				return getEllipse();
			case OfficePackage.TEXT_TYPE__G:
				return getG();
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case OfficePackage.TEXT_TYPE__FRAME:
				return getFrame();
			case OfficePackage.TEXT_TYPE__MEASURE:
				return getMeasure();
			case OfficePackage.TEXT_TYPE__CAPTION:
				return getCaption();
			case OfficePackage.TEXT_TYPE__CONNECTOR:
				return getConnector();
			case OfficePackage.TEXT_TYPE__CONTROL:
				return getControl();
			case OfficePackage.TEXT_TYPE__SCENE:
				return getScene();
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS:
				return getChangeMarks();
			case OfficePackage.TEXT_TYPE__PAGE_SEQUENCE:
				return getPageSequence();
			case OfficePackage.TEXT_TYPE__A1:
				return getA1();
			case OfficePackage.TEXT_TYPE__RECT1:
				return getRect1();
			case OfficePackage.TEXT_TYPE__LINE1:
				return getLine1();
			case OfficePackage.TEXT_TYPE__POLYLINE1:
				return getPolyline1();
			case OfficePackage.TEXT_TYPE__POLYGON1:
				return getPolygon1();
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON1:
				return getRegularPolygon1();
			case OfficePackage.TEXT_TYPE__PATH1:
				return getPath1();
			case OfficePackage.TEXT_TYPE__CIRCLE1:
				return getCircle1();
			case OfficePackage.TEXT_TYPE__ELLIPSE1:
				return getEllipse1();
			case OfficePackage.TEXT_TYPE__G1:
				return getG1();
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL1:
				return getPageThumbnail1();
			case OfficePackage.TEXT_TYPE__FRAME1:
				return getFrame1();
			case OfficePackage.TEXT_TYPE__MEASURE1:
				return getMeasure1();
			case OfficePackage.TEXT_TYPE__CAPTION1:
				return getCaption1();
			case OfficePackage.TEXT_TYPE__CONNECTOR1:
				return getConnector1();
			case OfficePackage.TEXT_TYPE__CONTROL1:
				return getControl1();
			case OfficePackage.TEXT_TYPE__SCENE1:
				return getScene1();
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE1:
				return getCustomShape1();
			case OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS:
				return getNamedExpressions();
			case OfficePackage.TEXT_TYPE__DATABASE_RANGES:
				return getDatabaseRanges();
			case OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES:
				return getDataPilotTables();
			case OfficePackage.TEXT_TYPE__CONSOLIDATION:
				return getConsolidation();
			case OfficePackage.TEXT_TYPE__DDE_LINKS:
				return getDdeLinks();
			case OfficePackage.TEXT_TYPE__GLOBAL:
				return getGlobal();
			case OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS:
				return getUseSoftPageBreaks();
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
			case OfficePackage.TEXT_TYPE__FORMS:
				setForms((FormsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__LABEL_RANGES:
				setLabelRanges((LabelRangesType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN:
				((FeatureMap.Internal)getOfficeTextContentMain()).set(newValue);
				return;
			case OfficePackage.TEXT_TYPE__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				getNumberedParagraph().addAll((Collection<? extends NumberedParagraphType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case OfficePackage.TEXT_TYPE__PAGE_SEQUENCE:
				getPageSequence().clear();
				getPageSequence().addAll((Collection<? extends PageSequenceType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__A1:
				getA1().clear();
				getA1().addAll((Collection<? extends AType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__RECT1:
				getRect1().clear();
				getRect1().addAll((Collection<? extends RectType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__LINE1:
				getLine1().clear();
				getLine1().addAll((Collection<? extends LineType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__POLYLINE1:
				getPolyline1().clear();
				getPolyline1().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__POLYGON1:
				getPolygon1().clear();
				getPolygon1().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON1:
				getRegularPolygon1().clear();
				getRegularPolygon1().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__PATH1:
				getPath1().clear();
				getPath1().addAll((Collection<? extends PathType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CIRCLE1:
				getCircle1().clear();
				getCircle1().addAll((Collection<? extends CircleType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__ELLIPSE1:
				getEllipse1().clear();
				getEllipse1().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__G1:
				getG1().clear();
				getG1().addAll((Collection<? extends GType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL1:
				getPageThumbnail1().clear();
				getPageThumbnail1().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__FRAME1:
				getFrame1().clear();
				getFrame1().addAll((Collection<? extends FrameType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__MEASURE1:
				getMeasure1().clear();
				getMeasure1().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CAPTION1:
				getCaption1().clear();
				getCaption1().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONNECTOR1:
				getConnector1().clear();
				getConnector1().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONTROL1:
				getControl1().clear();
				getControl1().addAll((Collection<? extends ControlType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__SCENE1:
				getScene1().clear();
				getScene1().addAll((Collection<? extends SceneType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE1:
				getCustomShape1().clear();
				getCustomShape1().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__CONSOLIDATION:
				setConsolidation((ConsolidationType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__DDE_LINKS:
				setDdeLinks((DdeLinksType)newValue);
				return;
			case OfficePackage.TEXT_TYPE__GLOBAL:
				setGlobal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS:
				setUseSoftPageBreaks((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case OfficePackage.TEXT_TYPE__FORMS:
				setForms((FormsType)null);
				return;
			case OfficePackage.TEXT_TYPE__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)null);
				return;
			case OfficePackage.TEXT_TYPE__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)null);
				return;
			case OfficePackage.TEXT_TYPE__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)null);
				return;
			case OfficePackage.TEXT_TYPE__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)null);
				return;
			case OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)null);
				return;
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)null);
				return;
			case OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)null);
				return;
			case OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)null);
				return;
			case OfficePackage.TEXT_TYPE__LABEL_RANGES:
				setLabelRanges((LabelRangesType)null);
				return;
			case OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN:
				getOfficeTextContentMain().clear();
				return;
			case OfficePackage.TEXT_TYPE__H:
				getH().clear();
				return;
			case OfficePackage.TEXT_TYPE__P:
				getP().clear();
				return;
			case OfficePackage.TEXT_TYPE__LIST:
				getList().clear();
				return;
			case OfficePackage.TEXT_TYPE__NUMBERED_PARAGRAPH:
				getNumberedParagraph().clear();
				return;
			case OfficePackage.TEXT_TYPE__TABLE:
				getTable().clear();
				return;
			case OfficePackage.TEXT_TYPE__A:
				getA().clear();
				return;
			case OfficePackage.TEXT_TYPE__SECTION:
				getSection().clear();
				return;
			case OfficePackage.TEXT_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case OfficePackage.TEXT_TYPE__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case OfficePackage.TEXT_TYPE__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case OfficePackage.TEXT_TYPE__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case OfficePackage.TEXT_TYPE__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case OfficePackage.TEXT_TYPE__USER_INDEX:
				getUserIndex().clear();
				return;
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case OfficePackage.TEXT_TYPE__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case OfficePackage.TEXT_TYPE__RECT:
				getRect().clear();
				return;
			case OfficePackage.TEXT_TYPE__LINE:
				getLine().clear();
				return;
			case OfficePackage.TEXT_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case OfficePackage.TEXT_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case OfficePackage.TEXT_TYPE__PATH:
				getPath().clear();
				return;
			case OfficePackage.TEXT_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case OfficePackage.TEXT_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case OfficePackage.TEXT_TYPE__G:
				getG().clear();
				return;
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case OfficePackage.TEXT_TYPE__FRAME:
				getFrame().clear();
				return;
			case OfficePackage.TEXT_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case OfficePackage.TEXT_TYPE__CAPTION:
				getCaption().clear();
				return;
			case OfficePackage.TEXT_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case OfficePackage.TEXT_TYPE__CONTROL:
				getControl().clear();
				return;
			case OfficePackage.TEXT_TYPE__SCENE:
				getScene().clear();
				return;
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case OfficePackage.TEXT_TYPE__PAGE_SEQUENCE:
				getPageSequence().clear();
				return;
			case OfficePackage.TEXT_TYPE__A1:
				getA1().clear();
				return;
			case OfficePackage.TEXT_TYPE__RECT1:
				getRect1().clear();
				return;
			case OfficePackage.TEXT_TYPE__LINE1:
				getLine1().clear();
				return;
			case OfficePackage.TEXT_TYPE__POLYLINE1:
				getPolyline1().clear();
				return;
			case OfficePackage.TEXT_TYPE__POLYGON1:
				getPolygon1().clear();
				return;
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON1:
				getRegularPolygon1().clear();
				return;
			case OfficePackage.TEXT_TYPE__PATH1:
				getPath1().clear();
				return;
			case OfficePackage.TEXT_TYPE__CIRCLE1:
				getCircle1().clear();
				return;
			case OfficePackage.TEXT_TYPE__ELLIPSE1:
				getEllipse1().clear();
				return;
			case OfficePackage.TEXT_TYPE__G1:
				getG1().clear();
				return;
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL1:
				getPageThumbnail1().clear();
				return;
			case OfficePackage.TEXT_TYPE__FRAME1:
				getFrame1().clear();
				return;
			case OfficePackage.TEXT_TYPE__MEASURE1:
				getMeasure1().clear();
				return;
			case OfficePackage.TEXT_TYPE__CAPTION1:
				getCaption1().clear();
				return;
			case OfficePackage.TEXT_TYPE__CONNECTOR1:
				getConnector1().clear();
				return;
			case OfficePackage.TEXT_TYPE__CONTROL1:
				getControl1().clear();
				return;
			case OfficePackage.TEXT_TYPE__SCENE1:
				getScene1().clear();
				return;
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE1:
				getCustomShape1().clear();
				return;
			case OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)null);
				return;
			case OfficePackage.TEXT_TYPE__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)null);
				return;
			case OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)null);
				return;
			case OfficePackage.TEXT_TYPE__CONSOLIDATION:
				setConsolidation((ConsolidationType)null);
				return;
			case OfficePackage.TEXT_TYPE__DDE_LINKS:
				setDdeLinks((DdeLinksType)null);
				return;
			case OfficePackage.TEXT_TYPE__GLOBAL:
				unsetGlobal();
				return;
			case OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS:
				unsetUseSoftPageBreaks();
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
			case OfficePackage.TEXT_TYPE__FORMS:
				return forms != null;
			case OfficePackage.TEXT_TYPE__TRACKED_CHANGES:
				return trackedChanges != null;
			case OfficePackage.TEXT_TYPE__VARIABLE_DECLS:
				return variableDecls != null;
			case OfficePackage.TEXT_TYPE__SEQUENCE_DECLS:
				return sequenceDecls != null;
			case OfficePackage.TEXT_TYPE__USER_FIELD_DECLS:
				return userFieldDecls != null;
			case OfficePackage.TEXT_TYPE__DDE_CONNECTION_DECLS:
				return ddeConnectionDecls != null;
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return alphabeticalIndexAutoMarkFile != null;
			case OfficePackage.TEXT_TYPE__CALCULATION_SETTINGS:
				return calculationSettings != null;
			case OfficePackage.TEXT_TYPE__CONTENT_VALIDATIONS:
				return contentValidations != null;
			case OfficePackage.TEXT_TYPE__LABEL_RANGES:
				return labelRanges != null;
			case OfficePackage.TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN:
				return officeTextContentMain != null && !officeTextContentMain.isEmpty();
			case OfficePackage.TEXT_TYPE__H:
				return !getH().isEmpty();
			case OfficePackage.TEXT_TYPE__P:
				return !getP().isEmpty();
			case OfficePackage.TEXT_TYPE__LIST:
				return !getList().isEmpty();
			case OfficePackage.TEXT_TYPE__NUMBERED_PARAGRAPH:
				return !getNumberedParagraph().isEmpty();
			case OfficePackage.TEXT_TYPE__TABLE:
				return !getTable().isEmpty();
			case OfficePackage.TEXT_TYPE__A:
				return !getA().isEmpty();
			case OfficePackage.TEXT_TYPE__SECTION:
				return !getSection().isEmpty();
			case OfficePackage.TEXT_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case OfficePackage.TEXT_TYPE__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case OfficePackage.TEXT_TYPE__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case OfficePackage.TEXT_TYPE__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case OfficePackage.TEXT_TYPE__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case OfficePackage.TEXT_TYPE__USER_INDEX:
				return !getUserIndex().isEmpty();
			case OfficePackage.TEXT_TYPE__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case OfficePackage.TEXT_TYPE__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case OfficePackage.TEXT_TYPE__RECT:
				return !getRect().isEmpty();
			case OfficePackage.TEXT_TYPE__LINE:
				return !getLine().isEmpty();
			case OfficePackage.TEXT_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case OfficePackage.TEXT_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case OfficePackage.TEXT_TYPE__PATH:
				return !getPath().isEmpty();
			case OfficePackage.TEXT_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case OfficePackage.TEXT_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case OfficePackage.TEXT_TYPE__G:
				return !getG().isEmpty();
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case OfficePackage.TEXT_TYPE__FRAME:
				return !getFrame().isEmpty();
			case OfficePackage.TEXT_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case OfficePackage.TEXT_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case OfficePackage.TEXT_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case OfficePackage.TEXT_TYPE__CONTROL:
				return !getControl().isEmpty();
			case OfficePackage.TEXT_TYPE__SCENE:
				return !getScene().isEmpty();
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case OfficePackage.TEXT_TYPE__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case OfficePackage.TEXT_TYPE__PAGE_SEQUENCE:
				return !getPageSequence().isEmpty();
			case OfficePackage.TEXT_TYPE__A1:
				return !getA1().isEmpty();
			case OfficePackage.TEXT_TYPE__RECT1:
				return !getRect1().isEmpty();
			case OfficePackage.TEXT_TYPE__LINE1:
				return !getLine1().isEmpty();
			case OfficePackage.TEXT_TYPE__POLYLINE1:
				return !getPolyline1().isEmpty();
			case OfficePackage.TEXT_TYPE__POLYGON1:
				return !getPolygon1().isEmpty();
			case OfficePackage.TEXT_TYPE__REGULAR_POLYGON1:
				return !getRegularPolygon1().isEmpty();
			case OfficePackage.TEXT_TYPE__PATH1:
				return !getPath1().isEmpty();
			case OfficePackage.TEXT_TYPE__CIRCLE1:
				return !getCircle1().isEmpty();
			case OfficePackage.TEXT_TYPE__ELLIPSE1:
				return !getEllipse1().isEmpty();
			case OfficePackage.TEXT_TYPE__G1:
				return !getG1().isEmpty();
			case OfficePackage.TEXT_TYPE__PAGE_THUMBNAIL1:
				return !getPageThumbnail1().isEmpty();
			case OfficePackage.TEXT_TYPE__FRAME1:
				return !getFrame1().isEmpty();
			case OfficePackage.TEXT_TYPE__MEASURE1:
				return !getMeasure1().isEmpty();
			case OfficePackage.TEXT_TYPE__CAPTION1:
				return !getCaption1().isEmpty();
			case OfficePackage.TEXT_TYPE__CONNECTOR1:
				return !getConnector1().isEmpty();
			case OfficePackage.TEXT_TYPE__CONTROL1:
				return !getControl1().isEmpty();
			case OfficePackage.TEXT_TYPE__SCENE1:
				return !getScene1().isEmpty();
			case OfficePackage.TEXT_TYPE__CUSTOM_SHAPE1:
				return !getCustomShape1().isEmpty();
			case OfficePackage.TEXT_TYPE__NAMED_EXPRESSIONS:
				return namedExpressions != null;
			case OfficePackage.TEXT_TYPE__DATABASE_RANGES:
				return databaseRanges != null;
			case OfficePackage.TEXT_TYPE__DATA_PILOT_TABLES:
				return dataPilotTables != null;
			case OfficePackage.TEXT_TYPE__CONSOLIDATION:
				return consolidation != null;
			case OfficePackage.TEXT_TYPE__DDE_LINKS:
				return ddeLinks != null;
			case OfficePackage.TEXT_TYPE__GLOBAL:
				return isSetGlobal();
			case OfficePackage.TEXT_TYPE__USE_SOFT_PAGE_BREAKS:
				return isSetUseSoftPageBreaks();
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
		result.append(" (officeTextContentMain: ");
		result.append(officeTextContentMain);
		result.append(", global: ");
		if (globalESet) result.append(global); else result.append("<unset>");
		result.append(", useSoftPageBreaks: ");
		if (useSoftPageBreaksESet) result.append(useSoftPageBreaks); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextTypeImpl
