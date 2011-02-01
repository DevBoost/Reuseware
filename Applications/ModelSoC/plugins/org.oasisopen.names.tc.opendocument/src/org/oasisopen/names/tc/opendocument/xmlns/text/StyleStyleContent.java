/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Style Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties <em>Paragraph Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties1 <em>Text Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getSectionProperties <em>Section Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getRubyProperties <em>Ruby Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableProperties <em>Table Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableColumnProperties <em>Table Column Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableRowProperties <em>Table Row Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableCellProperties <em>Table Cell Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties1 <em>Paragraph Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties2 <em>Text Properties2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getGraphicProperties <em>Graphic Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties2 <em>Paragraph Properties2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties3 <em>Text Properties3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getDrawingPageProperties <em>Drawing Page Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getChartProperties <em>Chart Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getGraphicProperties1 <em>Graphic Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties3 <em>Paragraph Properties3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties4 <em>Text Properties4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent()
 * @model extendedMetaData="name='style-style-content' kind='elementOnly'"
 * @generated
 */
public interface StyleStyleContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties</em>' containment reference.
	 * @see #setTextProperties(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TextProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Paragraph Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Properties</em>' containment reference.
	 * @see #setParagraphProperties(StyleParagraphPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_ParagraphProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paragraph-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleParagraphPropertiesContent getParagraphProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties <em>Paragraph Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Properties</em>' containment reference.
	 * @see #getParagraphProperties()
	 * @generated
	 */
	void setParagraphProperties(StyleParagraphPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties1</em>' containment reference.
	 * @see #setTextProperties1(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TextProperties1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties1 <em>Text Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties1</em>' containment reference.
	 * @see #getTextProperties1()
	 * @generated
	 */
	void setTextProperties1(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Section Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Properties</em>' containment reference.
	 * @see #setSectionProperties(StyleSectionPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_SectionProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleSectionPropertiesContent getSectionProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getSectionProperties <em>Section Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Properties</em>' containment reference.
	 * @see #getSectionProperties()
	 * @generated
	 */
	void setSectionProperties(StyleSectionPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Ruby Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Properties</em>' containment reference.
	 * @see #setRubyProperties(StyleRubyPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_RubyProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruby-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleRubyPropertiesContent getRubyProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getRubyProperties <em>Ruby Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Properties</em>' containment reference.
	 * @see #getRubyProperties()
	 * @generated
	 */
	void setRubyProperties(StyleRubyPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Table Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Properties</em>' containment reference.
	 * @see #setTableProperties(StyleTablePropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TableProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTablePropertiesContent getTableProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableProperties <em>Table Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Properties</em>' containment reference.
	 * @see #getTableProperties()
	 * @generated
	 */
	void setTableProperties(StyleTablePropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Table Column Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column Properties</em>' containment reference.
	 * @see #setTableColumnProperties(StyleTableColumnPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TableColumnProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-column-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTableColumnPropertiesContent getTableColumnProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableColumnProperties <em>Table Column Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Column Properties</em>' containment reference.
	 * @see #getTableColumnProperties()
	 * @generated
	 */
	void setTableColumnProperties(StyleTableColumnPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Table Row Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row Properties</em>' containment reference.
	 * @see #setTableRowProperties(StyleTableRowPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TableRowProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-row-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTableRowPropertiesContent getTableRowProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableRowProperties <em>Table Row Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Row Properties</em>' containment reference.
	 * @see #getTableRowProperties()
	 * @generated
	 */
	void setTableRowProperties(StyleTableRowPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Table Cell Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Cell Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cell Properties</em>' containment reference.
	 * @see #setTableCellProperties(StyleTableCellPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TableCellProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-cell-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTableCellPropertiesContent getTableCellProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTableCellProperties <em>Table Cell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cell Properties</em>' containment reference.
	 * @see #getTableCellProperties()
	 * @generated
	 */
	void setTableCellProperties(StyleTableCellPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Paragraph Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Properties1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Properties1</em>' containment reference.
	 * @see #setParagraphProperties1(StyleParagraphPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_ParagraphProperties1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paragraph-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleParagraphPropertiesContent getParagraphProperties1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties1 <em>Paragraph Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Properties1</em>' containment reference.
	 * @see #getParagraphProperties1()
	 * @generated
	 */
	void setParagraphProperties1(StyleParagraphPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text Properties2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties2</em>' containment reference.
	 * @see #setTextProperties2(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TextProperties2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties2 <em>Text Properties2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties2</em>' containment reference.
	 * @see #getTextProperties2()
	 * @generated
	 */
	void setTextProperties2(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Graphic Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Properties</em>' containment reference.
	 * @see #setGraphicProperties(StyleGraphicPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_GraphicProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphic-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleGraphicPropertiesContent getGraphicProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getGraphicProperties <em>Graphic Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Properties</em>' containment reference.
	 * @see #getGraphicProperties()
	 * @generated
	 */
	void setGraphicProperties(StyleGraphicPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Paragraph Properties2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Properties2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Properties2</em>' containment reference.
	 * @see #setParagraphProperties2(StyleParagraphPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_ParagraphProperties2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paragraph-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleParagraphPropertiesContent getParagraphProperties2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties2 <em>Paragraph Properties2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Properties2</em>' containment reference.
	 * @see #getParagraphProperties2()
	 * @generated
	 */
	void setParagraphProperties2(StyleParagraphPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text Properties3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties3</em>' containment reference.
	 * @see #setTextProperties3(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TextProperties3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties3();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties3 <em>Text Properties3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties3</em>' containment reference.
	 * @see #getTextProperties3()
	 * @generated
	 */
	void setTextProperties3(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Drawing Page Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing Page Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Page Properties</em>' containment reference.
	 * @see #setDrawingPageProperties(StyleDrawingPagePropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_DrawingPageProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='drawing-page-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleDrawingPagePropertiesContent getDrawingPageProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getDrawingPageProperties <em>Drawing Page Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Page Properties</em>' containment reference.
	 * @see #getDrawingPageProperties()
	 * @generated
	 */
	void setDrawingPageProperties(StyleDrawingPagePropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Chart Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Properties</em>' containment reference.
	 * @see #setChartProperties(StyleChartPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_ChartProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chart-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleChartPropertiesContent getChartProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getChartProperties <em>Chart Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Properties</em>' containment reference.
	 * @see #getChartProperties()
	 * @generated
	 */
	void setChartProperties(StyleChartPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Graphic Properties1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic Properties1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Properties1</em>' containment reference.
	 * @see #setGraphicProperties1(StyleGraphicPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_GraphicProperties1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphic-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleGraphicPropertiesContent getGraphicProperties1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getGraphicProperties1 <em>Graphic Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Properties1</em>' containment reference.
	 * @see #getGraphicProperties1()
	 * @generated
	 */
	void setGraphicProperties1(StyleGraphicPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Paragraph Properties3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Properties3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Properties3</em>' containment reference.
	 * @see #setParagraphProperties3(StyleParagraphPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_ParagraphProperties3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paragraph-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleParagraphPropertiesContent getParagraphProperties3();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getParagraphProperties3 <em>Paragraph Properties3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Properties3</em>' containment reference.
	 * @see #getParagraphProperties3()
	 * @generated
	 */
	void setParagraphProperties3(StyleParagraphPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Text Properties4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Properties4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Properties4</em>' containment reference.
	 * @see #setTextProperties4(StyleTextPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_TextProperties4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties4();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getTextProperties4 <em>Text Properties4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties4</em>' containment reference.
	 * @see #getTextProperties4()
	 * @generated
	 */
	void setTextProperties4(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @see #isSetFamily()
	 * @see #unsetFamily()
	 * @see #setFamily(FamilyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getStyleStyleContent_Family()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='family' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	FamilyType getFamily();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType
	 * @see #isSetFamily()
	 * @see #unsetFamily()
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(FamilyType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamily()
	 * @see #getFamily()
	 * @see #setFamily(FamilyType)
	 * @generated
	 */
	void unsetFamily();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent#getFamily <em>Family</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family</em>' attribute is set.
	 * @see #unsetFamily()
	 * @see #getFamily()
	 * @see #setFamily(FamilyType)
	 * @generated
	 */
	boolean isSetFamily();

} // StyleStyleContent
