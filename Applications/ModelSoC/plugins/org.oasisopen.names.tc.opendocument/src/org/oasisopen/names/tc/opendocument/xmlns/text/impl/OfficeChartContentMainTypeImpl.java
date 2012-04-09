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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Office Chart Content Main Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getPlotArea <em>Plot Area</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getColumnMapping <em>Column Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getRowMapping <em>Row Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeChartContentMainTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfficeChartContentMainTypeImpl extends EObjectImpl implements OfficeChartContentMainType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected SubtitleType subtitle;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected FooterType footer;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected LegendType legend;

	/**
	 * The cached value of the '{@link #getPlotArea() <em>Plot Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlotArea()
	 * @generated
	 * @ordered
	 */
	protected PlotAreaType plotArea;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected TableType table;

	/**
	 * The default value of the '{@link #getColumnMapping() <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnMapping() <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMapping()
	 * @generated
	 * @ordered
	 */
	protected String columnMapping = COLUMN_MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowMapping() <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowMapping() <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowMapping()
	 * @generated
	 * @ordered
	 */
	protected String rowMapping = ROW_MAPPING_EDEFAULT;

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
	protected OfficeChartContentMainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getOfficeChartContentMainType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleType getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		SubtitleType oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE, oldSubtitle, newSubtitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(SubtitleType newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		FooterType oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER, oldFooter, newFooter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		if (newFooter != footer) {
			NotificationChain msgs = null;
			if (footer != null)
				msgs = ((InternalEObject)footer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER, null, msgs);
			if (newFooter != null)
				msgs = ((InternalEObject)newFooter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER, null, msgs);
			msgs = basicSetFooter(newFooter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER, newFooter, newFooter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendType getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegend(LegendType newLegend, NotificationChain msgs) {
		LegendType oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND, oldLegend, newLegend);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(LegendType newLegend) {
		if (newLegend != legend) {
			NotificationChain msgs = null;
			if (legend != null)
				msgs = ((InternalEObject)legend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND, null, msgs);
			if (newLegend != null)
				msgs = ((InternalEObject)newLegend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND, null, msgs);
			msgs = basicSetLegend(newLegend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND, newLegend, newLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlotAreaType getPlotArea() {
		return plotArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlotArea(PlotAreaType newPlotArea, NotificationChain msgs) {
		PlotAreaType oldPlotArea = plotArea;
		plotArea = newPlotArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA, oldPlotArea, newPlotArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlotArea(PlotAreaType newPlotArea) {
		if (newPlotArea != plotArea) {
			NotificationChain msgs = null;
			if (plotArea != null)
				msgs = ((InternalEObject)plotArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA, null, msgs);
			if (newPlotArea != null)
				msgs = ((InternalEObject)newPlotArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA, null, msgs);
			msgs = basicSetPlotArea(newPlotArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA, newPlotArea, newPlotArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		TableType oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TableType newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnMapping() {
		return columnMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnMapping(String newColumnMapping) {
		String oldColumnMapping = columnMapping;
		columnMapping = newColumnMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__COLUMN_MAPPING, oldColumnMapping, columnMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowMapping() {
		return rowMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowMapping(String newRowMapping) {
		String oldRowMapping = rowMapping;
		rowMapping = newRowMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__ROW_MAPPING, oldRowMapping, rowMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER:
				return basicSetFooter(null, msgs);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND:
				return basicSetLegend(null, msgs);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA:
				return basicSetPlotArea(null, msgs);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE:
				return basicSetTable(null, msgs);
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
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE:
				return getTitle();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE:
				return getSubtitle();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER:
				return getFooter();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND:
				return getLegend();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA:
				return getPlotArea();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE:
				return getTable();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__COLUMN_MAPPING:
				return getColumnMapping();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__ROW_MAPPING:
				return getRowMapping();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__STYLE_NAME:
				return getStyleName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND:
				setLegend((LegendType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA:
				setPlotArea((PlotAreaType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE:
				setTable((TableType)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__COLUMN_MAPPING:
				setColumnMapping((String)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__ROW_MAPPING:
				setRowMapping((String)newValue);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__STYLE_NAME:
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
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER:
				setFooter((FooterType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND:
				setLegend((LegendType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA:
				setPlotArea((PlotAreaType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE:
				setTable((TableType)null);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__COLUMN_MAPPING:
				setColumnMapping(COLUMN_MAPPING_EDEFAULT);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__ROW_MAPPING:
				setRowMapping(ROW_MAPPING_EDEFAULT);
				return;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__STYLE_NAME:
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
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TITLE:
				return title != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__SUBTITLE:
				return subtitle != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__FOOTER:
				return footer != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__LEGEND:
				return legend != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__PLOT_AREA:
				return plotArea != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__TABLE:
				return table != null;
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__COLUMN_MAPPING:
				return COLUMN_MAPPING_EDEFAULT == null ? columnMapping != null : !COLUMN_MAPPING_EDEFAULT.equals(columnMapping);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__ROW_MAPPING:
				return ROW_MAPPING_EDEFAULT == null ? rowMapping != null : !ROW_MAPPING_EDEFAULT.equals(rowMapping);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE__STYLE_NAME:
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
		result.append(" (columnMapping: ");
		result.append(columnMapping);
		result.append(", rowMapping: ");
		result.append(rowMapping);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //OfficeChartContentMainTypeImpl
