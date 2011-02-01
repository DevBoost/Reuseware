/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office Chart Content Main Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getPlotArea <em>Plot Area</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getColumnMapping <em>Column Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getRowMapping <em>Row Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType()
 * @model extendedMetaData="name='office-chart-content-main_._type' kind='elementOnly'"
 * @generated
 */
public interface OfficeChartContentMainType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_Subtitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(FooterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_Footer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	FooterType getFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(FooterType value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference.
	 * @see #setLegend(LegendType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_Legend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legend' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	LegendType getLegend();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(LegendType value);

	/**
	 * Returns the value of the '<em><b>Plot Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot Area</em>' containment reference.
	 * @see #setPlotArea(PlotAreaType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_PlotArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='plot-area' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	PlotAreaType getPlotArea();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getPlotArea <em>Plot Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plot Area</em>' containment reference.
	 * @see #getPlotArea()
	 * @generated
	 */
	void setPlotArea(PlotAreaType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_Table()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Column Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Mapping</em>' attribute.
	 * @see #setColumnMapping(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_ColumnMapping()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='column-mapping' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	String getColumnMapping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getColumnMapping <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Mapping</em>' attribute.
	 * @see #getColumnMapping()
	 * @generated
	 */
	void setColumnMapping(String value);

	/**
	 * Returns the value of the '<em><b>Row Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Mapping</em>' attribute.
	 * @see #setRowMapping(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_RowMapping()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='row-mapping' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	String getRowMapping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getRowMapping <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Mapping</em>' attribute.
	 * @see #getRowMapping()
	 * @generated
	 */
	void setRowMapping(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOfficeChartContentMainType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:chart:1.0'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // OfficeChartContentMainType
