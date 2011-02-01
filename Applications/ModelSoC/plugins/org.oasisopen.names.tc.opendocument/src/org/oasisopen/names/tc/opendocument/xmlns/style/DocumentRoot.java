/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineMode;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.text.RegionContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleChartPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleDrawingPagePropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleGraphicPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StylePageLayoutPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleParagraphPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleRubyPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleSectionPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableCellPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableColumnPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTablePropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableRowPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChartProperties <em>Chart Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnSep <em>Column Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultStyle <em>Default Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDrawingPageProperties <em>Drawing Page Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDropCap <em>Drop Cap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFace <em>Font Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterLeft <em>Footer Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterStyle <em>Footer Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteSep <em>Footnote Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGraphicProperties <em>Graphic Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHandoutMaster <em>Handout Master</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderFooterProperties <em>Header Footer Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderLeft <em>Header Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderStyle <em>Header Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPage <em>Master Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayout <em>Page Layout</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutProperties <em>Page Layout Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParagraphProperties <em>Paragraph Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPresentationPageLayout <em>Presentation Page Layout</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionCenter <em>Region Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionLeft <em>Region Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionRight <em>Region Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyProperties <em>Ruby Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSectionProperties <em>Section Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCellProperties <em>Table Cell Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableColumnProperties <em>Table Column Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableProperties <em>Table Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableRowProperties <em>Table Row Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStops <em>Tab Stops</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getApplyStyleName <em>Apply Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent <em>Auto Text Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate <em>Auto Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundTransparency <em>Background Transparency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidth <em>Border Line Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthBottom <em>Border Line Width Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthLeft <em>Border Line Width Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthRight <em>Border Line Width Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthTop <em>Border Line Width Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCellProtect <em>Cell Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChar <em>Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryAsian <em>Country Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryComplex <em>Country Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultOutlineLevel <em>Default Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTr <em>Diagonal Bl Tr</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTrWidths <em>Diagonal Bl Tr Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBr <em>Diagonal Tl Br</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBrWidths <em>Diagonal Tl Br Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceAfterSep <em>Distance After Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceBeforeSep <em>Distance Before Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing <em>Dynamic Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily <em>Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFirstPageNumber <em>First Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText <em>Flow With Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontAdornments <em>Font Adornments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharset <em>Font Charset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetAsian <em>Font Charset Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetComplex <em>Font Charset Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyAsian <em>Font Family Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyComplex <em>Font Family Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric <em>Font Family Generic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameAsian <em>Font Name Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameComplex <em>Font Name Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch <em>Font Pitch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian <em>Font Pitch Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex <em>Font Pitch Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief <em>Font Relief</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeAsian <em>Font Size Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeComplex <em>Font Size Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRel <em>Font Size Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelAsian <em>Font Size Rel Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelComplex <em>Font Size Rel Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian <em>Font Style Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex <em>Font Style Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleName <em>Font Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameAsian <em>Font Style Name Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameComplex <em>Font Style Name Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian <em>Font Weight Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex <em>Font Weight Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteMaxHeight <em>Footnote Max Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos <em>Horizontal Pos</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel <em>Horizontal Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord <em>Justify Single Word</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageAsian <em>Language Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageComplex <em>Language Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridBaseHeight <em>Layout Grid Base Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridColor <em>Layout Grid Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay <em>Layout Grid Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridLines <em>Layout Grid Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode <em>Layout Grid Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint <em>Layout Grid Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyHeight <em>Layout Grid Ruby Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderChar <em>Leader Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderColor <em>Leader Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle <em>Leader Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderText <em>Leader Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderTextStyle <em>Leader Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType <em>Leader Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderWidth <em>Leader Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion <em>Legend Expansion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLength <em>Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning <em>Letter Kerning</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineHeightAtLeast <em>Line Height At Least</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLines <em>Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineSpacing <em>Line Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListStyleName <em>List Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows <em>May Break Between Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMinRowHeight <em>Min Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMirror <em>Mirror</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNextStyleName <em>Next Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumberWrappedParagraphs <em>Number Wrapped Paragraphs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior <em>Overflow Behavior</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutName <em>Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage <em>Page Usage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPaperTrayName <em>Paper Tray Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParentStyleName <em>Parent Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent <em>Print Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation <em>Print Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder <em>Print Page Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap <em>Punctuation Wrap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue <em>Register True</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTruthRefStyleName <em>Register Truth Ref Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelColumnWidth <em>Rel Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent <em>Repeat Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign <em>Rotation Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAngle <em>Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRowHeight <em>Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign <em>Ruby Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition <em>Ruby Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough <em>Run Through</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleTo <em>Scale To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleToPages <em>Scale To Pages</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType <em>Script Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit <em>Shrink To Fit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering <em>Table Centering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStopDistance <em>Tab Stop Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource <em>Text Align Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace <em>Text Autospace</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking <em>Text Blinking</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine <em>Text Combine</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineEndChar <em>Text Combine End Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineStartChar <em>Text Combine Start Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextEmphasize <em>Text Emphasize</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughColor <em>Text Line Through Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode <em>Text Line Through Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle <em>Text Line Through Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughText <em>Text Line Through Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughTextStyle <em>Text Line Through Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType <em>Text Line Through Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughWidth <em>Text Line Through Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline <em>Text Outline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationAngle <em>Text Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale <em>Text Rotation Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextScale <em>Text Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineColor <em>Text Underline Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode <em>Text Underline Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle <em>Text Underline Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType <em>Text Underline Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineWidth <em>Text Underline Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor <em>Use Window Font Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos <em>Vertical Pos</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel <em>Vertical Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap <em>Wrap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour <em>Wrap Contour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode <em>Wrap Contour Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapDynamicThreshold <em>Wrap Dynamic Threshold</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode <em>Writing Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic <em>Writing Mode Automatic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Background Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Image</em>' containment reference.
	 * @see #setBackgroundImage(BackgroundImageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BackgroundImage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='background-image' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundImageType getBackgroundImage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundImage <em>Background Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Image</em>' containment reference.
	 * @see #getBackgroundImage()
	 * @generated
	 */
	void setBackgroundImage(BackgroundImageType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ChartProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chart-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleChartPropertiesContent getChartProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChartProperties <em>Chart Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Properties</em>' containment reference.
	 * @see #getChartProperties()
	 * @generated
	 */
	void setChartProperties(StyleChartPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(ColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Column()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnType getColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(ColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Columns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='columns' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnsType getColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(ColumnsType value);

	/**
	 * Returns the value of the '<em><b>Column Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Sep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Sep</em>' containment reference.
	 * @see #setColumnSep(ColumnSepType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ColumnSep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnSepType getColumnSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnSep <em>Column Sep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Sep</em>' containment reference.
	 * @see #getColumnSep()
	 * @generated
	 */
	void setColumnSep(ColumnSepType value);

	/**
	 * Returns the value of the '<em><b>Default Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Style</em>' containment reference.
	 * @see #setDefaultStyle(StyleStyleContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DefaultStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='default-style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleStyleContent getDefaultStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultStyle <em>Default Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Style</em>' containment reference.
	 * @see #getDefaultStyle()
	 * @generated
	 */
	void setDefaultStyle(StyleStyleContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DrawingPageProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='drawing-page-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleDrawingPagePropertiesContent getDrawingPageProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDrawingPageProperties <em>Drawing Page Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Page Properties</em>' containment reference.
	 * @see #getDrawingPageProperties()
	 * @generated
	 */
	void setDrawingPageProperties(StyleDrawingPagePropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Drop Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Cap</em>' containment reference.
	 * @see #setDropCap(DropCapType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DropCap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='drop-cap' namespace='##targetNamespace'"
	 * @generated
	 */
	DropCapType getDropCap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDropCap <em>Drop Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Cap</em>' containment reference.
	 * @see #getDropCap()
	 * @generated
	 */
	void setDropCap(DropCapType value);

	/**
	 * Returns the value of the '<em><b>Font Face</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face</em>' containment reference.
	 * @see #setFontFace(FontFaceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceType getFontFace();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFace <em>Font Face</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face</em>' containment reference.
	 * @see #getFontFace()
	 * @generated
	 */
	void setFontFace(FontFaceType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Footer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterType getFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(FooterType value);

	/**
	 * Returns the value of the '<em><b>Footer Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Left</em>' containment reference.
	 * @see #setFooterLeft(FooterLeftType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FooterLeft()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer-left' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterLeftType getFooterLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterLeft <em>Footer Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Left</em>' containment reference.
	 * @see #getFooterLeft()
	 * @generated
	 */
	void setFooterLeft(FooterLeftType value);

	/**
	 * Returns the value of the '<em><b>Footer Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Style</em>' containment reference.
	 * @see #setFooterStyle(FooterStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FooterStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer-style' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterStyleType getFooterStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFooterStyle <em>Footer Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Style</em>' containment reference.
	 * @see #getFooterStyle()
	 * @generated
	 */
	void setFooterStyle(FooterStyleType value);

	/**
	 * Returns the value of the '<em><b>Footnote Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footnote Sep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote Sep</em>' containment reference.
	 * @see #setFootnoteSep(FootnoteSepType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FootnoteSep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footnote-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	FootnoteSepType getFootnoteSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteSep <em>Footnote Sep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnote Sep</em>' containment reference.
	 * @see #getFootnoteSep()
	 * @generated
	 */
	void setFootnoteSep(FootnoteSepType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_GraphicProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='graphic-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleGraphicPropertiesContent getGraphicProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGraphicProperties <em>Graphic Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Properties</em>' containment reference.
	 * @see #getGraphicProperties()
	 * @generated
	 */
	void setGraphicProperties(StyleGraphicPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Handout Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handout Master</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handout Master</em>' containment reference.
	 * @see #setHandoutMaster(HandoutMasterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HandoutMaster()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='handout-master' namespace='##targetNamespace'"
	 * @generated
	 */
	HandoutMasterType getHandoutMaster();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHandoutMaster <em>Handout Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handout Master</em>' containment reference.
	 * @see #getHandoutMaster()
	 * @generated
	 */
	void setHandoutMaster(HandoutMasterType value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Footer Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #setHeaderFooterProperties(StyleHeaderFooterPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HeaderFooterProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header-footer-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleHeaderFooterPropertiesContent getHeaderFooterProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderFooterProperties <em>Header Footer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #getHeaderFooterProperties()
	 * @generated
	 */
	void setHeaderFooterProperties(StyleHeaderFooterPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Header Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Left</em>' containment reference.
	 * @see #setHeaderLeft(HeaderLeftType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HeaderLeft()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header-left' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderLeftType getHeaderLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderLeft <em>Header Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Left</em>' containment reference.
	 * @see #getHeaderLeft()
	 * @generated
	 */
	void setHeaderLeft(HeaderLeftType value);

	/**
	 * Returns the value of the '<em><b>Header Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Style</em>' containment reference.
	 * @see #setHeaderStyle(HeaderStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HeaderStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header-style' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderStyleType getHeaderStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeaderStyle <em>Header Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Style</em>' containment reference.
	 * @see #getHeaderStyle()
	 * @generated
	 */
	void setHeaderStyle(HeaderStyleType value);

	/**
	 * Returns the value of the '<em><b>List Level Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Level Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Level Properties</em>' containment reference.
	 * @see #setListLevelProperties(StyleListLevelPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ListLevelProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-level-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleListLevelPropertiesContent getListLevelProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListLevelProperties <em>List Level Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Level Properties</em>' containment reference.
	 * @see #getListLevelProperties()
	 * @generated
	 */
	void setListLevelProperties(StyleListLevelPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(MapType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Map()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getMap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(MapType value);

	/**
	 * Returns the value of the '<em><b>Master Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page</em>' containment reference.
	 * @see #setMasterPage(MasterPageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_MasterPage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='master-page' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterPageType getMasterPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPage <em>Master Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page</em>' containment reference.
	 * @see #getMasterPage()
	 * @generated
	 */
	void setMasterPage(MasterPageType value);

	/**
	 * Returns the value of the '<em><b>Page Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Layout</em>' containment reference.
	 * @see #setPageLayout(PageLayoutType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PageLayout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-layout' namespace='##targetNamespace'"
	 * @generated
	 */
	PageLayoutType getPageLayout();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayout <em>Page Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Layout</em>' containment reference.
	 * @see #getPageLayout()
	 * @generated
	 */
	void setPageLayout(PageLayoutType value);

	/**
	 * Returns the value of the '<em><b>Page Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Layout Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Layout Properties</em>' containment reference.
	 * @see #setPageLayoutProperties(StylePageLayoutPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PageLayoutProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-layout-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StylePageLayoutPropertiesContent getPageLayoutProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutProperties <em>Page Layout Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Layout Properties</em>' containment reference.
	 * @see #getPageLayoutProperties()
	 * @generated
	 */
	void setPageLayoutProperties(StylePageLayoutPropertiesContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ParagraphProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='paragraph-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleParagraphPropertiesContent getParagraphProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParagraphProperties <em>Paragraph Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Properties</em>' containment reference.
	 * @see #getParagraphProperties()
	 * @generated
	 */
	void setParagraphProperties(StyleParagraphPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Presentation Page Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Page Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Page Layout</em>' containment reference.
	 * @see #setPresentationPageLayout(PresentationPageLayoutType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PresentationPageLayout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='presentation-page-layout' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationPageLayoutType getPresentationPageLayout();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPresentationPageLayout <em>Presentation Page Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Page Layout</em>' containment reference.
	 * @see #getPresentationPageLayout()
	 * @generated
	 */
	void setPresentationPageLayout(PresentationPageLayoutType value);

	/**
	 * Returns the value of the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Center</em>' containment reference.
	 * @see #setRegionCenter(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RegionCenter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region-center' namespace='##targetNamespace'"
	 * @generated
	 */
	RegionContent getRegionCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionCenter <em>Region Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Center</em>' containment reference.
	 * @see #getRegionCenter()
	 * @generated
	 */
	void setRegionCenter(RegionContent value);

	/**
	 * Returns the value of the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Left</em>' containment reference.
	 * @see #setRegionLeft(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RegionLeft()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region-left' namespace='##targetNamespace'"
	 * @generated
	 */
	RegionContent getRegionLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionLeft <em>Region Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Left</em>' containment reference.
	 * @see #getRegionLeft()
	 * @generated
	 */
	void setRegionLeft(RegionContent value);

	/**
	 * Returns the value of the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Right</em>' containment reference.
	 * @see #setRegionRight(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RegionRight()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region-right' namespace='##targetNamespace'"
	 * @generated
	 */
	RegionContent getRegionRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegionRight <em>Region Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Right</em>' containment reference.
	 * @see #getRegionRight()
	 * @generated
	 */
	void setRegionRight(RegionContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RubyProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleRubyPropertiesContent getRubyProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyProperties <em>Ruby Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Properties</em>' containment reference.
	 * @see #getRubyProperties()
	 * @generated
	 */
	void setRubyProperties(StyleRubyPropertiesContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_SectionProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='section-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleSectionPropertiesContent getSectionProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSectionProperties <em>Section Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Properties</em>' containment reference.
	 * @see #getSectionProperties()
	 * @generated
	 */
	void setSectionProperties(StyleSectionPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleType1 getStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType1 value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TableCellProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-cell-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleTableCellPropertiesContent getTableCellProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCellProperties <em>Table Cell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cell Properties</em>' containment reference.
	 * @see #getTableCellProperties()
	 * @generated
	 */
	void setTableCellProperties(StyleTableCellPropertiesContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TableColumnProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleTableColumnPropertiesContent getTableColumnProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableColumnProperties <em>Table Column Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Column Properties</em>' containment reference.
	 * @see #getTableColumnProperties()
	 * @generated
	 */
	void setTableColumnProperties(StyleTableColumnPropertiesContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TableProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleTablePropertiesContent getTableProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableProperties <em>Table Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Properties</em>' containment reference.
	 * @see #getTableProperties()
	 * @generated
	 */
	void setTableProperties(StyleTablePropertiesContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TableRowProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleTableRowPropertiesContent getTableRowProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableRowProperties <em>Table Row Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Row Properties</em>' containment reference.
	 * @see #getTableRowProperties()
	 * @generated
	 */
	void setTableRowProperties(StyleTableRowPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Tab Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stop</em>' containment reference.
	 * @see #setTabStop(TabStopType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TabStop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	TabStopType getTabStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStop <em>Tab Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stop</em>' containment reference.
	 * @see #getTabStop()
	 * @generated
	 */
	void setTabStop(TabStopType value);

	/**
	 * Returns the value of the '<em><b>Tab Stops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stops</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stops</em>' containment reference.
	 * @see #setTabStops(TabStopsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TabStops()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tab-stops' namespace='##targetNamespace'"
	 * @generated
	 */
	TabStopsType getTabStops();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStops <em>Tab Stops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stops</em>' containment reference.
	 * @see #getTabStops()
	 * @generated
	 */
	void setTabStops(TabStopsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleTextPropertiesContent getTextProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextProperties <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Properties</em>' containment reference.
	 * @see #getTextProperties()
	 * @generated
	 */
	void setTextProperties(StyleTextPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Adjustment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdjustmentType getAdjustment();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(AdjustmentType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	void unsetAdjustment();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAdjustment <em>Adjustment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adjustment</em>' attribute is set.
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	boolean isSetAdjustment();

	/**
	 * Returns the value of the '<em><b>Apply Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Style Name</em>' attribute.
	 * @see #setApplyStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ApplyStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.ApplyStyleNameType"
	 *        extendedMetaData="kind='attribute' name='apply-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplyStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getApplyStyleName <em>Apply Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Style Name</em>' attribute.
	 * @see #getApplyStyleName()
	 * @generated
	 */
	void setApplyStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Text Indent</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Text Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Text Indent</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoTextIndent()
	 * @see #unsetAutoTextIndent()
	 * @see #setAutoTextIndent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_AutoTextIndent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-text-indent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoTextIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent <em>Auto Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Text Indent</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoTextIndent()
	 * @see #unsetAutoTextIndent()
	 * @see #getAutoTextIndent()
	 * @generated
	 */
	void setAutoTextIndent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent <em>Auto Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoTextIndent()
	 * @see #getAutoTextIndent()
	 * @see #setAutoTextIndent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoTextIndent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoTextIndent <em>Auto Text Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Text Indent</em>' attribute is set.
	 * @see #unsetAutoTextIndent()
	 * @see #getAutoTextIndent()
	 * @see #setAutoTextIndent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoTextIndent();

	/**
	 * Returns the value of the '<em><b>Auto Update</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoUpdate()
	 * @see #unsetAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_AutoUpdate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-update' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoUpdate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoUpdate()
	 * @see #unsetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @generated
	 */
	void setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoUpdate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getAutoUpdate <em>Auto Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Update</em>' attribute is set.
	 * @see #unsetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoUpdate();

	/**
	 * Returns the value of the '<em><b>Background Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Transparency</em>' attribute.
	 * @see #setBackgroundTransparency(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BackgroundTransparency()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='background-transparency' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBackgroundTransparency();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBackgroundTransparency <em>Background Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Transparency</em>' attribute.
	 * @see #getBackgroundTransparency()
	 * @generated
	 */
	void setBackgroundTransparency(String value);

	/**
	 * Returns the value of the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Cell Address</em>' attribute.
	 * @see #setBaseCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BaseCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='base-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Cell Address</em>' attribute.
	 * @see #getBaseCellAddress()
	 * @generated
	 */
	void setBaseCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Border Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Line Width</em>' attribute.
	 * @see #setBorderLineWidth(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BorderLineWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='border-line-width' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getBorderLineWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidth <em>Border Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Line Width</em>' attribute.
	 * @see #getBorderLineWidth()
	 * @generated
	 */
	void setBorderLineWidth(List<String> value);

	/**
	 * Returns the value of the '<em><b>Border Line Width Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Line Width Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Line Width Bottom</em>' attribute.
	 * @see #setBorderLineWidthBottom(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BorderLineWidthBottom()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='border-line-width-bottom' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getBorderLineWidthBottom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthBottom <em>Border Line Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Line Width Bottom</em>' attribute.
	 * @see #getBorderLineWidthBottom()
	 * @generated
	 */
	void setBorderLineWidthBottom(List<String> value);

	/**
	 * Returns the value of the '<em><b>Border Line Width Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Line Width Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Line Width Left</em>' attribute.
	 * @see #setBorderLineWidthLeft(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BorderLineWidthLeft()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='border-line-width-left' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getBorderLineWidthLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthLeft <em>Border Line Width Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Line Width Left</em>' attribute.
	 * @see #getBorderLineWidthLeft()
	 * @generated
	 */
	void setBorderLineWidthLeft(List<String> value);

	/**
	 * Returns the value of the '<em><b>Border Line Width Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Line Width Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Line Width Right</em>' attribute.
	 * @see #setBorderLineWidthRight(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BorderLineWidthRight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='border-line-width-right' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getBorderLineWidthRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthRight <em>Border Line Width Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Line Width Right</em>' attribute.
	 * @see #getBorderLineWidthRight()
	 * @generated
	 */
	void setBorderLineWidthRight(List<String> value);

	/**
	 * Returns the value of the '<em><b>Border Line Width Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Line Width Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Line Width Top</em>' attribute.
	 * @see #setBorderLineWidthTop(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_BorderLineWidthTop()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='border-line-width-top' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getBorderLineWidthTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getBorderLineWidthTop <em>Border Line Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Line Width Top</em>' attribute.
	 * @see #getBorderLineWidthTop()
	 * @generated
	 */
	void setBorderLineWidthTop(List<String> value);

	/**
	 * Returns the value of the '<em><b>Cell Protect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Protect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Protect</em>' attribute.
	 * @see #setCellProtect(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_CellProtect()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectType"
	 *        extendedMetaData="kind='attribute' name='cell-protect' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCellProtect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCellProtect <em>Cell Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Protect</em>' attribute.
	 * @see #getCellProtect()
	 * @generated
	 */
	void setCellProtect(Object value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Char()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Class()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Color()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width</em>' attribute.
	 * @see #setColumnWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ColumnWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='column-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getColumnWidth <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width</em>' attribute.
	 * @see #getColumnWidth()
	 * @generated
	 */
	void setColumnWidth(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Condition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Country Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Asian</em>' attribute.
	 * @see #setCountryAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_CountryAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountryAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryAsian <em>Country Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Asian</em>' attribute.
	 * @see #getCountryAsian()
	 * @generated
	 */
	void setCountryAsian(String value);

	/**
	 * Returns the value of the '<em><b>Country Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Complex</em>' attribute.
	 * @see #setCountryComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_CountryComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountryComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getCountryComplex <em>Country Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Complex</em>' attribute.
	 * @see #getCountryComplex()
	 * @generated
	 */
	void setCountryComplex(String value);

	/**
	 * Returns the value of the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Style Name</em>' attribute.
	 * @see #setDataStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DataStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.DataStyleNameType"
	 *        extendedMetaData="kind='attribute' name='data-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDataStyleName <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Style Name</em>' attribute.
	 * @see #getDataStyleName()
	 * @generated
	 */
	void setDataStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Places</em>' attribute.
	 * @see #setDecimalPlaces(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DecimalPlaces()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='decimal-places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecimalPlaces();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Places</em>' attribute.
	 * @see #getDecimalPlaces()
	 * @generated
	 */
	void setDecimalPlaces(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Default Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Outline Level</em>' attribute.
	 * @see #setDefaultOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DefaultOutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='default-outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDefaultOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDefaultOutlineLevel <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Outline Level</em>' attribute.
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 */
	void setDefaultOutlineLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Diagonal Bl Tr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagonal Bl Tr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Bl Tr</em>' attribute.
	 * @see #setDiagonalBlTr(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DiagonalBlTr()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='diagonal-bl-tr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDiagonalBlTr();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTr <em>Diagonal Bl Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Bl Tr</em>' attribute.
	 * @see #getDiagonalBlTr()
	 * @generated
	 */
	void setDiagonalBlTr(String value);

	/**
	 * Returns the value of the '<em><b>Diagonal Bl Tr Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagonal Bl Tr Widths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Bl Tr Widths</em>' attribute.
	 * @see #setDiagonalBlTrWidths(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DiagonalBlTrWidths()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='diagonal-bl-tr-widths' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getDiagonalBlTrWidths();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalBlTrWidths <em>Diagonal Bl Tr Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Bl Tr Widths</em>' attribute.
	 * @see #getDiagonalBlTrWidths()
	 * @generated
	 */
	void setDiagonalBlTrWidths(List<String> value);

	/**
	 * Returns the value of the '<em><b>Diagonal Tl Br</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagonal Tl Br</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Tl Br</em>' attribute.
	 * @see #setDiagonalTlBr(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DiagonalTlBr()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='diagonal-tl-br' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDiagonalTlBr();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBr <em>Diagonal Tl Br</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Tl Br</em>' attribute.
	 * @see #getDiagonalTlBr()
	 * @generated
	 */
	void setDiagonalTlBr(String value);

	/**
	 * Returns the value of the '<em><b>Diagonal Tl Br Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagonal Tl Br Widths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Tl Br Widths</em>' attribute.
	 * @see #setDiagonalTlBrWidths(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DiagonalTlBrWidths()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.BorderWidths" many="false"
	 *        extendedMetaData="kind='attribute' name='diagonal-tl-br-widths' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getDiagonalTlBrWidths();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDiagonalTlBrWidths <em>Diagonal Tl Br Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Tl Br Widths</em>' attribute.
	 * @see #getDiagonalTlBrWidths()
	 * @generated
	 */
	void setDiagonalTlBrWidths(List<String> value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Display()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplay <em>Display</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display</em>' attribute is set.
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplay();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Distance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Returns the value of the '<em><b>Distance After Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance After Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance After Sep</em>' attribute.
	 * @see #setDistanceAfterSep(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DistanceAfterSep()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance-after-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistanceAfterSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceAfterSep <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance After Sep</em>' attribute.
	 * @see #getDistanceAfterSep()
	 * @generated
	 */
	void setDistanceAfterSep(String value);

	/**
	 * Returns the value of the '<em><b>Distance Before Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Before Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Before Sep</em>' attribute.
	 * @see #setDistanceBeforeSep(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DistanceBeforeSep()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance-before-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistanceBeforeSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDistanceBeforeSep <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Before Sep</em>' attribute.
	 * @see #getDistanceBeforeSep()
	 * @generated
	 */
	void setDistanceBeforeSep(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Spacing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Spacing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDynamicSpacing()
	 * @see #unsetDynamicSpacing()
	 * @see #setDynamicSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_DynamicSpacing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dynamic-spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDynamicSpacing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing <em>Dynamic Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Spacing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDynamicSpacing()
	 * @see #unsetDynamicSpacing()
	 * @see #getDynamicSpacing()
	 * @generated
	 */
	void setDynamicSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing <em>Dynamic Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamicSpacing()
	 * @see #getDynamicSpacing()
	 * @see #setDynamicSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDynamicSpacing();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getDynamicSpacing <em>Dynamic Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic Spacing</em>' attribute is set.
	 * @see #unsetDynamicSpacing()
	 * @see #getDynamicSpacing()
	 * @see #setDynamicSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDynamicSpacing();

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #setEditable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Editable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='editable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEditable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditable()
	 * @see #getEditable()
	 * @see #setEditable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEditable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getEditable <em>Editable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editable</em>' attribute is set.
	 * @see #unsetEditable()
	 * @see #getEditable()
	 * @see #setEditable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEditable();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Family()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='family' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyType getFamily();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily <em>Family</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamily()
	 * @see #getFamily()
	 * @see #setFamily(FamilyType)
	 * @generated
	 */
	void unsetFamily();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFamily <em>Family</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family</em>' attribute is set.
	 * @see #unsetFamily()
	 * @see #getFamily()
	 * @see #setFamily(FamilyType)
	 * @generated
	 */
	boolean isSetFamily();

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' attribute.
	 * @see #setFilterName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FilterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

	/**
	 * Returns the value of the '<em><b>First Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Number</em>' attribute.
	 * @see #setFirstPageNumber(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FirstPageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberType"
	 *        extendedMetaData="kind='attribute' name='first-page-number' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFirstPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFirstPageNumber <em>First Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Number</em>' attribute.
	 * @see #getFirstPageNumber()
	 * @generated
	 */
	void setFirstPageNumber(Object value);

	/**
	 * Returns the value of the '<em><b>Flow With Text</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow With Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow With Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFlowWithText()
	 * @see #unsetFlowWithText()
	 * @see #setFlowWithText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FlowWithText()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='flow-with-text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFlowWithText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText <em>Flow With Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow With Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFlowWithText()
	 * @see #unsetFlowWithText()
	 * @see #getFlowWithText()
	 * @generated
	 */
	void setFlowWithText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText <em>Flow With Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowWithText()
	 * @see #getFlowWithText()
	 * @see #setFlowWithText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFlowWithText();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFlowWithText <em>Flow With Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow With Text</em>' attribute is set.
	 * @see #unsetFlowWithText()
	 * @see #getFlowWithText()
	 * @see #setFlowWithText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFlowWithText();

	/**
	 * Returns the value of the '<em><b>Font Adornments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Adornments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Adornments</em>' attribute.
	 * @see #setFontAdornments(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontAdornments()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-adornments' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontAdornments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontAdornments <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Adornments</em>' attribute.
	 * @see #getFontAdornments()
	 * @generated
	 */
	void setFontAdornments(String value);

	/**
	 * Returns the value of the '<em><b>Font Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Charset</em>' attribute.
	 * @see #setFontCharset(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontCharset()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TextEncoding"
	 *        extendedMetaData="kind='attribute' name='font-charset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontCharset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharset <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Charset</em>' attribute.
	 * @see #getFontCharset()
	 * @generated
	 */
	void setFontCharset(String value);

	/**
	 * Returns the value of the '<em><b>Font Charset Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Charset Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Charset Asian</em>' attribute.
	 * @see #setFontCharsetAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontCharsetAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TextEncoding"
	 *        extendedMetaData="kind='attribute' name='font-charset-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontCharsetAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetAsian <em>Font Charset Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Charset Asian</em>' attribute.
	 * @see #getFontCharsetAsian()
	 * @generated
	 */
	void setFontCharsetAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Charset Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Charset Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Charset Complex</em>' attribute.
	 * @see #setFontCharsetComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontCharsetComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TextEncoding"
	 *        extendedMetaData="kind='attribute' name='font-charset-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontCharsetComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontCharsetComplex <em>Font Charset Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Charset Complex</em>' attribute.
	 * @see #getFontCharsetComplex()
	 * @generated
	 */
	void setFontCharsetComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Family Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Asian</em>' attribute.
	 * @see #setFontFamilyAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFamilyAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-family-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontFamilyAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyAsian <em>Font Family Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Asian</em>' attribute.
	 * @see #getFontFamilyAsian()
	 * @generated
	 */
	void setFontFamilyAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Family Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Complex</em>' attribute.
	 * @see #setFontFamilyComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFamilyComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-family-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontFamilyComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyComplex <em>Font Family Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Complex</em>' attribute.
	 * @see #getFontFamilyComplex()
	 * @generated
	 */
	void setFontFamilyComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Family Generic</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Generic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Generic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGeneric()
	 * @see #unsetFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFamilyGeneric()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-family-generic' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFamilyGeneric getFontFamilyGeneric();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Generic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGeneric()
	 * @see #unsetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @generated
	 */
	void setFontFamilyGeneric(FontFamilyGeneric value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @generated
	 */
	void unsetFontFamilyGeneric();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Family Generic</em>' attribute is set.
	 * @see #unsetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @generated
	 */
	boolean isSetFontFamilyGeneric();

	/**
	 * Returns the value of the '<em><b>Font Family Generic Asian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Generic Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Generic Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGenericAsian()
	 * @see #unsetFontFamilyGenericAsian()
	 * @see #setFontFamilyGenericAsian(FontFamilyGeneric)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFamilyGenericAsian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-family-generic-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFamilyGeneric getFontFamilyGenericAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Generic Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGenericAsian()
	 * @see #unsetFontFamilyGenericAsian()
	 * @see #getFontFamilyGenericAsian()
	 * @generated
	 */
	void setFontFamilyGenericAsian(FontFamilyGeneric value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontFamilyGenericAsian()
	 * @see #getFontFamilyGenericAsian()
	 * @see #setFontFamilyGenericAsian(FontFamilyGeneric)
	 * @generated
	 */
	void unsetFontFamilyGenericAsian();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Family Generic Asian</em>' attribute is set.
	 * @see #unsetFontFamilyGenericAsian()
	 * @see #getFontFamilyGenericAsian()
	 * @see #setFontFamilyGenericAsian(FontFamilyGeneric)
	 * @generated
	 */
	boolean isSetFontFamilyGenericAsian();

	/**
	 * Returns the value of the '<em><b>Font Family Generic Complex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Generic Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Generic Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGenericComplex()
	 * @see #unsetFontFamilyGenericComplex()
	 * @see #setFontFamilyGenericComplex(FontFamilyGeneric)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontFamilyGenericComplex()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-family-generic-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFamilyGeneric getFontFamilyGenericComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Generic Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGenericComplex()
	 * @see #unsetFontFamilyGenericComplex()
	 * @see #getFontFamilyGenericComplex()
	 * @generated
	 */
	void setFontFamilyGenericComplex(FontFamilyGeneric value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontFamilyGenericComplex()
	 * @see #getFontFamilyGenericComplex()
	 * @see #setFontFamilyGenericComplex(FontFamilyGeneric)
	 * @generated
	 */
	void unsetFontFamilyGenericComplex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Family Generic Complex</em>' attribute is set.
	 * @see #unsetFontFamilyGenericComplex()
	 * @see #getFontFamilyGenericComplex()
	 * @see #setFontFamilyGenericComplex(FontFamilyGeneric)
	 * @generated
	 */
	boolean isSetFontFamilyGenericComplex();

	/**
	 * Returns the value of the '<em><b>Font Independent Line Spacing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Independent Line Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Independent Line Spacing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFontIndependentLineSpacing()
	 * @see #unsetFontIndependentLineSpacing()
	 * @see #setFontIndependentLineSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontIndependentLineSpacing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-independent-line-spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFontIndependentLineSpacing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Independent Line Spacing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFontIndependentLineSpacing()
	 * @see #unsetFontIndependentLineSpacing()
	 * @see #getFontIndependentLineSpacing()
	 * @generated
	 */
	void setFontIndependentLineSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontIndependentLineSpacing()
	 * @see #getFontIndependentLineSpacing()
	 * @see #setFontIndependentLineSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFontIndependentLineSpacing();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Independent Line Spacing</em>' attribute is set.
	 * @see #unsetFontIndependentLineSpacing()
	 * @see #getFontIndependentLineSpacing()
	 * @see #setFontIndependentLineSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFontIndependentLineSpacing();

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Font Name Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name Asian</em>' attribute.
	 * @see #setFontNameAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontNameAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-name-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontNameAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameAsian <em>Font Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name Asian</em>' attribute.
	 * @see #getFontNameAsian()
	 * @generated
	 */
	void setFontNameAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Name Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name Complex</em>' attribute.
	 * @see #setFontNameComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontNameComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-name-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontNameComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontNameComplex <em>Font Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name Complex</em>' attribute.
	 * @see #getFontNameComplex()
	 * @generated
	 */
	void setFontNameComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Pitch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Pitch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitch()
	 * @see #unsetFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontPitch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-pitch' namespace='##targetNamespace'"
	 * @generated
	 */
	FontPitch getFontPitch();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Pitch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitch()
	 * @see #unsetFontPitch()
	 * @see #getFontPitch()
	 * @generated
	 */
	void setFontPitch(FontPitch value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontPitch()
	 * @see #getFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @generated
	 */
	void unsetFontPitch();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitch <em>Font Pitch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Pitch</em>' attribute is set.
	 * @see #unsetFontPitch()
	 * @see #getFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @generated
	 */
	boolean isSetFontPitch();

	/**
	 * Returns the value of the '<em><b>Font Pitch Asian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Pitch Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Pitch Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitchAsian()
	 * @see #unsetFontPitchAsian()
	 * @see #setFontPitchAsian(FontPitch)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontPitchAsian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-pitch-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	FontPitch getFontPitchAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian <em>Font Pitch Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Pitch Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitchAsian()
	 * @see #unsetFontPitchAsian()
	 * @see #getFontPitchAsian()
	 * @generated
	 */
	void setFontPitchAsian(FontPitch value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian <em>Font Pitch Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontPitchAsian()
	 * @see #getFontPitchAsian()
	 * @see #setFontPitchAsian(FontPitch)
	 * @generated
	 */
	void unsetFontPitchAsian();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchAsian <em>Font Pitch Asian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Pitch Asian</em>' attribute is set.
	 * @see #unsetFontPitchAsian()
	 * @see #getFontPitchAsian()
	 * @see #setFontPitchAsian(FontPitch)
	 * @generated
	 */
	boolean isSetFontPitchAsian();

	/**
	 * Returns the value of the '<em><b>Font Pitch Complex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Pitch Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Pitch Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitchComplex()
	 * @see #unsetFontPitchComplex()
	 * @see #setFontPitchComplex(FontPitch)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontPitchComplex()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-pitch-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	FontPitch getFontPitchComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex <em>Font Pitch Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Pitch Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitchComplex()
	 * @see #unsetFontPitchComplex()
	 * @see #getFontPitchComplex()
	 * @generated
	 */
	void setFontPitchComplex(FontPitch value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex <em>Font Pitch Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontPitchComplex()
	 * @see #getFontPitchComplex()
	 * @see #setFontPitchComplex(FontPitch)
	 * @generated
	 */
	void unsetFontPitchComplex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontPitchComplex <em>Font Pitch Complex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Pitch Complex</em>' attribute is set.
	 * @see #unsetFontPitchComplex()
	 * @see #getFontPitchComplex()
	 * @see #setFontPitchComplex(FontPitch)
	 * @generated
	 */
	boolean isSetFontPitchComplex();

	/**
	 * Returns the value of the '<em><b>Font Relief</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Relief</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Relief</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @see #isSetFontRelief()
	 * @see #unsetFontRelief()
	 * @see #setFontRelief(FontReliefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontRelief()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-relief' namespace='##targetNamespace'"
	 * @generated
	 */
	FontReliefType getFontRelief();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief <em>Font Relief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Relief</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType
	 * @see #isSetFontRelief()
	 * @see #unsetFontRelief()
	 * @see #getFontRelief()
	 * @generated
	 */
	void setFontRelief(FontReliefType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief <em>Font Relief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontRelief()
	 * @see #getFontRelief()
	 * @see #setFontRelief(FontReliefType)
	 * @generated
	 */
	void unsetFontRelief();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontRelief <em>Font Relief</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Relief</em>' attribute is set.
	 * @see #unsetFontRelief()
	 * @see #getFontRelief()
	 * @see #setFontRelief(FontReliefType)
	 * @generated
	 */
	boolean isSetFontRelief();

	/**
	 * Returns the value of the '<em><b>Font Size Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size Asian</em>' attribute.
	 * @see #setFontSizeAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontSizeAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.FontSizeAsianType"
	 *        extendedMetaData="kind='attribute' name='font-size-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSizeAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeAsian <em>Font Size Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Asian</em>' attribute.
	 * @see #getFontSizeAsian()
	 * @generated
	 */
	void setFontSizeAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Size Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size Complex</em>' attribute.
	 * @see #setFontSizeComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontSizeComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.FontSizeComplexType"
	 *        extendedMetaData="kind='attribute' name='font-size-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSizeComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeComplex <em>Font Size Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Complex</em>' attribute.
	 * @see #getFontSizeComplex()
	 * @generated
	 */
	void setFontSizeComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Size Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size Rel</em>' attribute.
	 * @see #setFontSizeRel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontSizeRel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='font-size-rel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSizeRel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRel <em>Font Size Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Rel</em>' attribute.
	 * @see #getFontSizeRel()
	 * @generated
	 */
	void setFontSizeRel(String value);

	/**
	 * Returns the value of the '<em><b>Font Size Rel Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size Rel Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size Rel Asian</em>' attribute.
	 * @see #setFontSizeRelAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontSizeRelAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='font-size-rel-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSizeRelAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelAsian <em>Font Size Rel Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Rel Asian</em>' attribute.
	 * @see #getFontSizeRelAsian()
	 * @generated
	 */
	void setFontSizeRelAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Size Rel Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size Rel Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size Rel Complex</em>' attribute.
	 * @see #setFontSizeRelComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontSizeRelComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='font-size-rel-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSizeRelComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontSizeRelComplex <em>Font Size Rel Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size Rel Complex</em>' attribute.
	 * @see #getFontSizeRelComplex()
	 * @generated
	 */
	void setFontSizeRelComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Style Asian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyleAsian()
	 * @see #unsetFontStyleAsian()
	 * @see #setFontStyleAsian(FontStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontStyleAsian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-style-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStyle getFontStyleAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian <em>Font Style Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyleAsian()
	 * @see #unsetFontStyleAsian()
	 * @see #getFontStyleAsian()
	 * @generated
	 */
	void setFontStyleAsian(FontStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian <em>Font Style Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyleAsian()
	 * @see #getFontStyleAsian()
	 * @see #setFontStyleAsian(FontStyle)
	 * @generated
	 */
	void unsetFontStyleAsian();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleAsian <em>Font Style Asian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style Asian</em>' attribute is set.
	 * @see #unsetFontStyleAsian()
	 * @see #getFontStyleAsian()
	 * @see #setFontStyleAsian(FontStyle)
	 * @generated
	 */
	boolean isSetFontStyleAsian();

	/**
	 * Returns the value of the '<em><b>Font Style Complex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyleComplex()
	 * @see #unsetFontStyleComplex()
	 * @see #setFontStyleComplex(FontStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontStyleComplex()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-style-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStyle getFontStyleComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex <em>Font Style Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyleComplex()
	 * @see #unsetFontStyleComplex()
	 * @see #getFontStyleComplex()
	 * @generated
	 */
	void setFontStyleComplex(FontStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex <em>Font Style Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyleComplex()
	 * @see #getFontStyleComplex()
	 * @see #setFontStyleComplex(FontStyle)
	 * @generated
	 */
	void unsetFontStyleComplex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleComplex <em>Font Style Complex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style Complex</em>' attribute is set.
	 * @see #unsetFontStyleComplex()
	 * @see #getFontStyleComplex()
	 * @see #setFontStyleComplex(FontStyle)
	 * @generated
	 */
	boolean isSetFontStyleComplex();

	/**
	 * Returns the value of the '<em><b>Font Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style Name</em>' attribute.
	 * @see #setFontStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleName <em>Font Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style Name</em>' attribute.
	 * @see #getFontStyleName()
	 * @generated
	 */
	void setFontStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Font Style Name Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style Name Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style Name Asian</em>' attribute.
	 * @see #setFontStyleNameAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontStyleNameAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-style-name-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontStyleNameAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameAsian <em>Font Style Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style Name Asian</em>' attribute.
	 * @see #getFontStyleNameAsian()
	 * @generated
	 */
	void setFontStyleNameAsian(String value);

	/**
	 * Returns the value of the '<em><b>Font Style Name Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style Name Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style Name Complex</em>' attribute.
	 * @see #setFontStyleNameComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontStyleNameComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-style-name-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontStyleNameComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontStyleNameComplex <em>Font Style Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style Name Complex</em>' attribute.
	 * @see #getFontStyleNameComplex()
	 * @generated
	 */
	void setFontStyleNameComplex(String value);

	/**
	 * Returns the value of the '<em><b>Font Weight Asian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeightAsian()
	 * @see #unsetFontWeightAsian()
	 * @see #setFontWeightAsian(FontWeight)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontWeightAsian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-weight-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	FontWeight getFontWeightAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian <em>Font Weight Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight Asian</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeightAsian()
	 * @see #unsetFontWeightAsian()
	 * @see #getFontWeightAsian()
	 * @generated
	 */
	void setFontWeightAsian(FontWeight value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian <em>Font Weight Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeightAsian()
	 * @see #getFontWeightAsian()
	 * @see #setFontWeightAsian(FontWeight)
	 * @generated
	 */
	void unsetFontWeightAsian();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightAsian <em>Font Weight Asian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Weight Asian</em>' attribute is set.
	 * @see #unsetFontWeightAsian()
	 * @see #getFontWeightAsian()
	 * @see #setFontWeightAsian(FontWeight)
	 * @generated
	 */
	boolean isSetFontWeightAsian();

	/**
	 * Returns the value of the '<em><b>Font Weight Complex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeightComplex()
	 * @see #unsetFontWeightComplex()
	 * @see #setFontWeightComplex(FontWeight)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FontWeightComplex()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-weight-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	FontWeight getFontWeightComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex <em>Font Weight Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight Complex</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeightComplex()
	 * @see #unsetFontWeightComplex()
	 * @see #getFontWeightComplex()
	 * @generated
	 */
	void setFontWeightComplex(FontWeight value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex <em>Font Weight Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeightComplex()
	 * @see #getFontWeightComplex()
	 * @see #setFontWeightComplex(FontWeight)
	 * @generated
	 */
	void unsetFontWeightComplex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFontWeightComplex <em>Font Weight Complex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Weight Complex</em>' attribute is set.
	 * @see #unsetFontWeightComplex()
	 * @see #getFontWeightComplex()
	 * @see #setFontWeightComplex(FontWeight)
	 * @generated
	 */
	boolean isSetFontWeightComplex();

	/**
	 * Returns the value of the '<em><b>Footnote Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footnote Max Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote Max Height</em>' attribute.
	 * @see #setFootnoteMaxHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_FootnoteMaxHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='footnote-max-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFootnoteMaxHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getFootnoteMaxHeight <em>Footnote Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnote Max Height</em>' attribute.
	 * @see #getFootnoteMaxHeight()
	 * @generated
	 */
	void setFootnoteMaxHeight(String value);

	/**
	 * Returns the value of the '<em><b>Glyph Orientation Vertical</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glyph Orientation Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glyph Orientation Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @see #isSetGlyphOrientationVertical()
	 * @see #unsetGlyphOrientationVertical()
	 * @see #setGlyphOrientationVertical(GlyphOrientationVerticalType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_GlyphOrientationVertical()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='glyph-orientation-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	GlyphOrientationVerticalType getGlyphOrientationVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyph Orientation Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType
	 * @see #isSetGlyphOrientationVertical()
	 * @see #unsetGlyphOrientationVertical()
	 * @see #getGlyphOrientationVertical()
	 * @generated
	 */
	void setGlyphOrientationVertical(GlyphOrientationVerticalType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlyphOrientationVertical()
	 * @see #getGlyphOrientationVertical()
	 * @see #setGlyphOrientationVertical(GlyphOrientationVerticalType)
	 * @generated
	 */
	void unsetGlyphOrientationVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Glyph Orientation Vertical</em>' attribute is set.
	 * @see #unsetGlyphOrientationVertical()
	 * @see #getGlyphOrientationVertical()
	 * @see #setGlyphOrientationVertical(GlyphOrientationVerticalType)
	 * @generated
	 */
	boolean isSetGlyphOrientationVertical();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Pos</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Pos</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @see #isSetHorizontalPos()
	 * @see #unsetHorizontalPos()
	 * @see #setHorizontalPos(HorizontalPosType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HorizontalPos()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='horizontal-pos' namespace='##targetNamespace'"
	 * @generated
	 */
	HorizontalPosType getHorizontalPos();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos <em>Horizontal Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Pos</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType
	 * @see #isSetHorizontalPos()
	 * @see #unsetHorizontalPos()
	 * @see #getHorizontalPos()
	 * @generated
	 */
	void setHorizontalPos(HorizontalPosType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos <em>Horizontal Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalPos()
	 * @see #getHorizontalPos()
	 * @see #setHorizontalPos(HorizontalPosType)
	 * @generated
	 */
	void unsetHorizontalPos();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalPos <em>Horizontal Pos</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Pos</em>' attribute is set.
	 * @see #unsetHorizontalPos()
	 * @see #getHorizontalPos()
	 * @see #setHorizontalPos(HorizontalPosType)
	 * @generated
	 */
	boolean isSetHorizontalPos();

	/**
	 * Returns the value of the '<em><b>Horizontal Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Rel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @see #isSetHorizontalRel()
	 * @see #unsetHorizontalRel()
	 * @see #setHorizontalRel(HorizontalRelType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_HorizontalRel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='horizontal-rel' namespace='##targetNamespace'"
	 * @generated
	 */
	HorizontalRelType getHorizontalRel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel <em>Horizontal Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Rel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType
	 * @see #isSetHorizontalRel()
	 * @see #unsetHorizontalRel()
	 * @see #getHorizontalRel()
	 * @generated
	 */
	void setHorizontalRel(HorizontalRelType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel <em>Horizontal Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalRel()
	 * @see #getHorizontalRel()
	 * @see #setHorizontalRel(HorizontalRelType)
	 * @generated
	 */
	void unsetHorizontalRel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getHorizontalRel <em>Horizontal Rel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Rel</em>' attribute is set.
	 * @see #unsetHorizontalRel()
	 * @see #getHorizontalRel()
	 * @see #setHorizontalRel(HorizontalRelType)
	 * @generated
	 */
	boolean isSetHorizontalRel();

	/**
	 * Returns the value of the '<em><b>Justify Single Word</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify Single Word</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify Single Word</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetJustifySingleWord()
	 * @see #unsetJustifySingleWord()
	 * @see #setJustifySingleWord(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_JustifySingleWord()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='justify-single-word' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getJustifySingleWord();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord <em>Justify Single Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify Single Word</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetJustifySingleWord()
	 * @see #unsetJustifySingleWord()
	 * @see #getJustifySingleWord()
	 * @generated
	 */
	void setJustifySingleWord(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord <em>Justify Single Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJustifySingleWord()
	 * @see #getJustifySingleWord()
	 * @see #setJustifySingleWord(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetJustifySingleWord();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getJustifySingleWord <em>Justify Single Word</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Justify Single Word</em>' attribute is set.
	 * @see #unsetJustifySingleWord()
	 * @see #getJustifySingleWord()
	 * @see #setJustifySingleWord(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetJustifySingleWord();

	/**
	 * Returns the value of the '<em><b>Language Asian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Asian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Asian</em>' attribute.
	 * @see #setLanguageAsian(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LanguageAsian()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language-asian' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguageAsian();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageAsian <em>Language Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Asian</em>' attribute.
	 * @see #getLanguageAsian()
	 * @generated
	 */
	void setLanguageAsian(String value);

	/**
	 * Returns the value of the '<em><b>Language Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Complex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Complex</em>' attribute.
	 * @see #setLanguageComplex(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LanguageComplex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language-complex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguageComplex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLanguageComplex <em>Language Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Complex</em>' attribute.
	 * @see #getLanguageComplex()
	 * @generated
	 */
	void setLanguageComplex(String value);

	/**
	 * Returns the value of the '<em><b>Layout Grid Base Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Base Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Base Height</em>' attribute.
	 * @see #setLayoutGridBaseHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridBaseHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='layout-grid-base-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayoutGridBaseHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridBaseHeight <em>Layout Grid Base Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Base Height</em>' attribute.
	 * @see #getLayoutGridBaseHeight()
	 * @generated
	 */
	void setLayoutGridBaseHeight(String value);

	/**
	 * Returns the value of the '<em><b>Layout Grid Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Color</em>' attribute.
	 * @see #setLayoutGridColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='layout-grid-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayoutGridColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridColor <em>Layout Grid Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Color</em>' attribute.
	 * @see #getLayoutGridColor()
	 * @generated
	 */
	void setLayoutGridColor(String value);

	/**
	 * Returns the value of the '<em><b>Layout Grid Display</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridDisplay()
	 * @see #unsetLayoutGridDisplay()
	 * @see #setLayoutGridDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridDisplay()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='layout-grid-display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay <em>Layout Grid Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridDisplay()
	 * @see #unsetLayoutGridDisplay()
	 * @see #getLayoutGridDisplay()
	 * @generated
	 */
	void setLayoutGridDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay <em>Layout Grid Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutGridDisplay()
	 * @see #getLayoutGridDisplay()
	 * @see #setLayoutGridDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLayoutGridDisplay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridDisplay <em>Layout Grid Display</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Grid Display</em>' attribute is set.
	 * @see #unsetLayoutGridDisplay()
	 * @see #getLayoutGridDisplay()
	 * @see #setLayoutGridDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLayoutGridDisplay();

	/**
	 * Returns the value of the '<em><b>Layout Grid Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Lines</em>' attribute.
	 * @see #setLayoutGridLines(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridLines()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='layout-grid-lines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLayoutGridLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridLines <em>Layout Grid Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Lines</em>' attribute.
	 * @see #getLayoutGridLines()
	 * @generated
	 */
	void setLayoutGridLines(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Layout Grid Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @see #isSetLayoutGridMode()
	 * @see #unsetLayoutGridMode()
	 * @see #setLayoutGridMode(LayoutGridModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='layout-grid-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LayoutGridModeType getLayoutGridMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode <em>Layout Grid Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType
	 * @see #isSetLayoutGridMode()
	 * @see #unsetLayoutGridMode()
	 * @see #getLayoutGridMode()
	 * @generated
	 */
	void setLayoutGridMode(LayoutGridModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode <em>Layout Grid Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutGridMode()
	 * @see #getLayoutGridMode()
	 * @see #setLayoutGridMode(LayoutGridModeType)
	 * @generated
	 */
	void unsetLayoutGridMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridMode <em>Layout Grid Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Grid Mode</em>' attribute is set.
	 * @see #unsetLayoutGridMode()
	 * @see #getLayoutGridMode()
	 * @see #setLayoutGridMode(LayoutGridModeType)
	 * @generated
	 */
	boolean isSetLayoutGridMode();

	/**
	 * Returns the value of the '<em><b>Layout Grid Print</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Print</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridPrint()
	 * @see #unsetLayoutGridPrint()
	 * @see #setLayoutGridPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridPrint()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='layout-grid-print' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridPrint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint <em>Layout Grid Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Print</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridPrint()
	 * @see #unsetLayoutGridPrint()
	 * @see #getLayoutGridPrint()
	 * @generated
	 */
	void setLayoutGridPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint <em>Layout Grid Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutGridPrint()
	 * @see #getLayoutGridPrint()
	 * @see #setLayoutGridPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLayoutGridPrint();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridPrint <em>Layout Grid Print</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Grid Print</em>' attribute is set.
	 * @see #unsetLayoutGridPrint()
	 * @see #getLayoutGridPrint()
	 * @see #setLayoutGridPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLayoutGridPrint();

	/**
	 * Returns the value of the '<em><b>Layout Grid Ruby Below</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Ruby Below</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Ruby Below</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridRubyBelow()
	 * @see #unsetLayoutGridRubyBelow()
	 * @see #setLayoutGridRubyBelow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridRubyBelow()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='layout-grid-ruby-below' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridRubyBelow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Ruby Below</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLayoutGridRubyBelow()
	 * @see #unsetLayoutGridRubyBelow()
	 * @see #getLayoutGridRubyBelow()
	 * @generated
	 */
	void setLayoutGridRubyBelow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutGridRubyBelow()
	 * @see #getLayoutGridRubyBelow()
	 * @see #setLayoutGridRubyBelow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLayoutGridRubyBelow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Grid Ruby Below</em>' attribute is set.
	 * @see #unsetLayoutGridRubyBelow()
	 * @see #getLayoutGridRubyBelow()
	 * @see #setLayoutGridRubyBelow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLayoutGridRubyBelow();

	/**
	 * Returns the value of the '<em><b>Layout Grid Ruby Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Grid Ruby Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Grid Ruby Height</em>' attribute.
	 * @see #setLayoutGridRubyHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LayoutGridRubyHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='layout-grid-ruby-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayoutGridRubyHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLayoutGridRubyHeight <em>Layout Grid Ruby Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Grid Ruby Height</em>' attribute.
	 * @see #getLayoutGridRubyHeight()
	 * @generated
	 */
	void setLayoutGridRubyHeight(String value);

	/**
	 * Returns the value of the '<em><b>Leader Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Char</em>' attribute.
	 * @see #setLeaderChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderChar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='leader-char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeaderChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderChar <em>Leader Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Char</em>' attribute.
	 * @see #getLeaderChar()
	 * @generated
	 */
	void setLeaderChar(String value);

	/**
	 * Returns the value of the '<em><b>Leader Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Color</em>' attribute.
	 * @see #setLeaderColor(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorType"
	 *        extendedMetaData="kind='attribute' name='leader-color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLeaderColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderColor <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Color</em>' attribute.
	 * @see #getLeaderColor()
	 * @generated
	 */
	void setLeaderColor(Object value);

	/**
	 * Returns the value of the '<em><b>Leader Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLeaderStyle()
	 * @see #unsetLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='leader-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getLeaderStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLeaderStyle()
	 * @see #unsetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @generated
	 */
	void setLeaderStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @generated
	 */
	void unsetLeaderStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderStyle <em>Leader Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leader Style</em>' attribute is set.
	 * @see #unsetLeaderStyle()
	 * @see #getLeaderStyle()
	 * @see #setLeaderStyle(LineStyle)
	 * @generated
	 */
	boolean isSetLeaderStyle();

	/**
	 * Returns the value of the '<em><b>Leader Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Text</em>' attribute.
	 * @see #setLeaderText(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderText()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='leader-text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeaderText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderText <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Text</em>' attribute.
	 * @see #getLeaderText()
	 * @generated
	 */
	void setLeaderText(String value);

	/**
	 * Returns the value of the '<em><b>Leader Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Text Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Text Style</em>' attribute.
	 * @see #setLeaderTextStyle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderTextStyle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LeaderTextStyleType"
	 *        extendedMetaData="kind='attribute' name='leader-text-style' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeaderTextStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderTextStyle <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Text Style</em>' attribute.
	 * @see #getLeaderTextStyle()
	 * @generated
	 */
	void setLeaderTextStyle(String value);

	/**
	 * Returns the value of the '<em><b>Leader Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetLeaderType()
	 * @see #unsetLeaderType()
	 * @see #setLeaderType(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='leader-type' namespace='##targetNamespace'"
	 * @generated
	 */
	LineType getLeaderType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetLeaderType()
	 * @see #unsetLeaderType()
	 * @see #getLeaderType()
	 * @generated
	 */
	void setLeaderType(LineType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeaderType()
	 * @see #getLeaderType()
	 * @see #setLeaderType(LineType)
	 * @generated
	 */
	void unsetLeaderType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderType <em>Leader Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leader Type</em>' attribute is set.
	 * @see #unsetLeaderType()
	 * @see #getLeaderType()
	 * @see #setLeaderType(LineType)
	 * @generated
	 */
	boolean isSetLeaderType();

	/**
	 * Returns the value of the '<em><b>Leader Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Width</em>' attribute.
	 * @see #setLeaderWidth(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LeaderWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LineWidth"
	 *        extendedMetaData="kind='attribute' name='leader-width' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLeaderWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLeaderWidth <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Width</em>' attribute.
	 * @see #getLeaderWidth()
	 * @generated
	 */
	void setLeaderWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Legend Expansion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Expansion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Expansion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see #isSetLegendExpansion()
	 * @see #unsetLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LegendExpansion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-expansion' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendExpansionType getLegendExpansion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Expansion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see #isSetLegendExpansion()
	 * @see #unsetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @generated
	 */
	void setLegendExpansion(LegendExpansionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @generated
	 */
	void unsetLegendExpansion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansion <em>Legend Expansion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Expansion</em>' attribute is set.
	 * @see #unsetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @generated
	 */
	boolean isSetLegendExpansion();

	/**
	 * Returns the value of the '<em><b>Legend Expansion Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Expansion Aspect Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Expansion Aspect Ratio</em>' attribute.
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LegendExpansionAspectRatio()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='legend-expansion-aspect-ratio' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLegendExpansionAspectRatio();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Expansion Aspect Ratio</em>' attribute.
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 */
	void setLegendExpansionAspectRatio(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @generated
	 */
	void unsetLegendExpansionAspectRatio();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Expansion Aspect Ratio</em>' attribute is set.
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @generated
	 */
	boolean isSetLegendExpansionAspectRatio();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Length()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LengthType"
	 *        extendedMetaData="kind='attribute' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Object value);

	/**
	 * Returns the value of the '<em><b>Letter Kerning</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter Kerning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Kerning</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLetterKerning()
	 * @see #unsetLetterKerning()
	 * @see #setLetterKerning(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LetterKerning()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='letter-kerning' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLetterKerning();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning <em>Letter Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Kerning</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLetterKerning()
	 * @see #unsetLetterKerning()
	 * @see #getLetterKerning()
	 * @generated
	 */
	void setLetterKerning(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning <em>Letter Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLetterKerning()
	 * @see #getLetterKerning()
	 * @see #setLetterKerning(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLetterKerning();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLetterKerning <em>Letter Kerning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Letter Kerning</em>' attribute is set.
	 * @see #unsetLetterKerning()
	 * @see #getLetterKerning()
	 * @see #setLetterKerning(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLetterKerning();

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @see #isSetLineBreak()
	 * @see #unsetLineBreak()
	 * @see #setLineBreak(LineBreakType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LineBreak()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='line-break' namespace='##targetNamespace'"
	 * @generated
	 */
	LineBreakType getLineBreak();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Break</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType
	 * @see #isSetLineBreak()
	 * @see #unsetLineBreak()
	 * @see #getLineBreak()
	 * @generated
	 */
	void setLineBreak(LineBreakType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineBreak()
	 * @see #getLineBreak()
	 * @see #setLineBreak(LineBreakType)
	 * @generated
	 */
	void unsetLineBreak();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineBreak <em>Line Break</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Break</em>' attribute is set.
	 * @see #unsetLineBreak()
	 * @see #getLineBreak()
	 * @see #setLineBreak(LineBreakType)
	 * @generated
	 */
	boolean isSetLineBreak();

	/**
	 * Returns the value of the '<em><b>Line Height At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Height At Least</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Height At Least</em>' attribute.
	 * @see #setLineHeightAtLeast(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LineHeightAtLeast()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='line-height-at-least' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLineHeightAtLeast();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineHeightAtLeast <em>Line Height At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height At Least</em>' attribute.
	 * @see #getLineHeightAtLeast()
	 * @generated
	 */
	void setLineHeightAtLeast(String value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #setLines(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Lines()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='lines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #getLines()
	 * @generated
	 */
	void setLines(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Line Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Spacing</em>' attribute.
	 * @see #setLineSpacing(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LineSpacing()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='line-spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLineSpacing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineSpacing <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Spacing</em>' attribute.
	 * @see #getLineSpacing()
	 * @generated
	 */
	void setLineSpacing(String value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_LineStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='line-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @generated
	 */
	void unsetLineStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getLineStyle <em>Line Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Style</em>' attribute is set.
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @generated
	 */
	boolean isSetLineStyle();

	/**
	 * Returns the value of the '<em><b>List Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Name</em>' attribute.
	 * @see #setListStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ListStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.ListStyleNameType"
	 *        extendedMetaData="kind='attribute' name='list-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getListStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getListStyleName <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style Name</em>' attribute.
	 * @see #getListStyleName()
	 * @generated
	 */
	void setListStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page Name</em>' attribute.
	 * @see #setMasterPageName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_MasterPageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageNameType"
	 *        extendedMetaData="kind='attribute' name='master-page-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterPageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMasterPageName <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page Name</em>' attribute.
	 * @see #getMasterPageName()
	 * @generated
	 */
	void setMasterPageName(String value);

	/**
	 * Returns the value of the '<em><b>May Break Between Rows</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Break Between Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Break Between Rows</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayBreakBetweenRows()
	 * @see #unsetMayBreakBetweenRows()
	 * @see #setMayBreakBetweenRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_MayBreakBetweenRows()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='may-break-between-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMayBreakBetweenRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows <em>May Break Between Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Break Between Rows</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayBreakBetweenRows()
	 * @see #unsetMayBreakBetweenRows()
	 * @see #getMayBreakBetweenRows()
	 * @generated
	 */
	void setMayBreakBetweenRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows <em>May Break Between Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMayBreakBetweenRows()
	 * @see #getMayBreakBetweenRows()
	 * @see #setMayBreakBetweenRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMayBreakBetweenRows();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMayBreakBetweenRows <em>May Break Between Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>May Break Between Rows</em>' attribute is set.
	 * @see #unsetMayBreakBetweenRows()
	 * @see #getMayBreakBetweenRows()
	 * @see #setMayBreakBetweenRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMayBreakBetweenRows();

	/**
	 * Returns the value of the '<em><b>Min Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Row Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Row Height</em>' attribute.
	 * @see #setMinRowHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_MinRowHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='min-row-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinRowHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMinRowHeight <em>Min Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Row Height</em>' attribute.
	 * @see #getMinRowHeight()
	 * @generated
	 */
	void setMinRowHeight(String value);

	/**
	 * Returns the value of the '<em><b>Mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror</em>' attribute.
	 * @see #setMirror(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Mirror()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.MirrorType"
	 *        extendedMetaData="kind='attribute' name='mirror' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMirror();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getMirror <em>Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror</em>' attribute.
	 * @see #getMirror()
	 * @generated
	 */
	void setMirror(Object value);

	/**
	 * Returns the value of the '<em><b>Next Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Style Name</em>' attribute.
	 * @see #setNextStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NextStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NextStyleNameType"
	 *        extendedMetaData="kind='attribute' name='next-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNextStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNextStyleName <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Style Name</em>' attribute.
	 * @see #getNextStyleName()
	 * @generated
	 */
	void setNextStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Number Wrapped Paragraphs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Wrapped Paragraphs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Wrapped Paragraphs</em>' attribute.
	 * @see #setNumberWrappedParagraphs(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NumberWrappedParagraphs()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsType"
	 *        extendedMetaData="kind='attribute' name='number-wrapped-paragraphs' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNumberWrappedParagraphs();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumberWrappedParagraphs <em>Number Wrapped Paragraphs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Wrapped Paragraphs</em>' attribute.
	 * @see #getNumberWrappedParagraphs()
	 * @generated
	 */
	void setNumberWrappedParagraphs(Object value);

	/**
	 * Returns the value of the '<em><b>Num Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Format</em>' attribute.
	 * @see #setNumFormat(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NumFormat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatType"
	 *        extendedMetaData="kind='attribute' name='num-format' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNumFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumFormat <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Format</em>' attribute.
	 * @see #getNumFormat()
	 * @generated
	 */
	void setNumFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Num Letter Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Letter Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NumLetterSync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='num-letter-sync' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @generated
	 */
	void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumLetterSync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumLetterSync <em>Num Letter Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Letter Sync</em>' attribute is set.
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumLetterSync();

	/**
	 * Returns the value of the '<em><b>Num Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Prefix</em>' attribute.
	 * @see #setNumPrefix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NumPrefix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNumPrefix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumPrefix <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Prefix</em>' attribute.
	 * @see #getNumPrefix()
	 * @generated
	 */
	void setNumPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Num Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Suffix</em>' attribute.
	 * @see #setNumSuffix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_NumSuffix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='num-suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNumSuffix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getNumSuffix <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Suffix</em>' attribute.
	 * @see #getNumSuffix()
	 * @generated
	 */
	void setNumSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Overflow Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow Behavior</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @see #isSetOverflowBehavior()
	 * @see #unsetOverflowBehavior()
	 * @see #setOverflowBehavior(OverflowBehaviorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_OverflowBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='overflow-behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	OverflowBehaviorType getOverflowBehavior();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior <em>Overflow Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow Behavior</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType
	 * @see #isSetOverflowBehavior()
	 * @see #unsetOverflowBehavior()
	 * @see #getOverflowBehavior()
	 * @generated
	 */
	void setOverflowBehavior(OverflowBehaviorType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior <em>Overflow Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverflowBehavior()
	 * @see #getOverflowBehavior()
	 * @see #setOverflowBehavior(OverflowBehaviorType)
	 * @generated
	 */
	void unsetOverflowBehavior();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getOverflowBehavior <em>Overflow Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overflow Behavior</em>' attribute is set.
	 * @see #unsetOverflowBehavior()
	 * @see #getOverflowBehavior()
	 * @see #setOverflowBehavior(OverflowBehaviorType)
	 * @generated
	 */
	boolean isSetOverflowBehavior();

	/**
	 * Returns the value of the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Layout Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Layout Name</em>' attribute.
	 * @see #setPageLayoutName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PageLayoutName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutNameType"
	 *        extendedMetaData="kind='attribute' name='page-layout-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPageLayoutName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageLayoutName <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Layout Name</em>' attribute.
	 * @see #getPageLayoutName()
	 * @generated
	 */
	void setPageLayoutName(String value);

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' attribute.
	 * @see #setPageNumber(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberType"
	 *        extendedMetaData="kind='attribute' name='page-number' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageNumber <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Number</em>' attribute.
	 * @see #getPageNumber()
	 * @generated
	 */
	void setPageNumber(Object value);

	/**
	 * Returns the value of the '<em><b>Page Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Usage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see #isSetPageUsage()
	 * @see #unsetPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PageUsage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='page-usage' namespace='##targetNamespace'"
	 * @generated
	 */
	PageUsageType getPageUsage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Usage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see #isSetPageUsage()
	 * @see #unsetPageUsage()
	 * @see #getPageUsage()
	 * @generated
	 */
	void setPageUsage(PageUsageType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageUsage()
	 * @see #getPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @generated
	 */
	void unsetPageUsage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPageUsage <em>Page Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Usage</em>' attribute is set.
	 * @see #unsetPageUsage()
	 * @see #getPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @generated
	 */
	boolean isSetPageUsage();

	/**
	 * Returns the value of the '<em><b>Paper Tray Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paper Tray Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paper Tray Name</em>' attribute.
	 * @see #setPaperTrayName(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PaperTrayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameType"
	 *        extendedMetaData="kind='attribute' name='paper-tray-name' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPaperTrayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPaperTrayName <em>Paper Tray Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paper Tray Name</em>' attribute.
	 * @see #getPaperTrayName()
	 * @generated
	 */
	void setPaperTrayName(Object value);

	/**
	 * Returns the value of the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Style Name</em>' attribute.
	 * @see #setParentStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ParentStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.ParentStyleNameType"
	 *        extendedMetaData="kind='attribute' name='parent-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getParentStyleName <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Style Name</em>' attribute.
	 * @see #getParentStyleName()
	 * @generated
	 */
	void setParentStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print</em>' attribute.
	 * @see #setPrint(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Print()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.PrintType" many="false"
	 *        extendedMetaData="kind='attribute' name='print' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PrintTypeItem> getPrint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrint <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print</em>' attribute.
	 * @see #getPrint()
	 * @generated
	 */
	void setPrint(List<PrintTypeItem> value);

	/**
	 * Returns the value of the '<em><b>Print Content</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintContent()
	 * @see #unsetPrintContent()
	 * @see #setPrintContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PrintContent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='print-content' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintContent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent <em>Print Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintContent()
	 * @see #unsetPrintContent()
	 * @see #getPrintContent()
	 * @generated
	 */
	void setPrintContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent <em>Print Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintContent()
	 * @see #getPrintContent()
	 * @see #setPrintContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrintContent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintContent <em>Print Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Print Content</em>' attribute is set.
	 * @see #unsetPrintContent()
	 * @see #getPrintContent()
	 * @see #setPrintContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrintContent();

	/**
	 * Returns the value of the '<em><b>Print Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @see #isSetPrintOrientation()
	 * @see #unsetPrintOrientation()
	 * @see #setPrintOrientation(PrintOrientationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PrintOrientation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='print-orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	PrintOrientationType getPrintOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation <em>Print Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType
	 * @see #isSetPrintOrientation()
	 * @see #unsetPrintOrientation()
	 * @see #getPrintOrientation()
	 * @generated
	 */
	void setPrintOrientation(PrintOrientationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation <em>Print Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintOrientation()
	 * @see #getPrintOrientation()
	 * @see #setPrintOrientation(PrintOrientationType)
	 * @generated
	 */
	void unsetPrintOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintOrientation <em>Print Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Print Orientation</em>' attribute is set.
	 * @see #unsetPrintOrientation()
	 * @see #getPrintOrientation()
	 * @see #setPrintOrientation(PrintOrientationType)
	 * @generated
	 */
	boolean isSetPrintOrientation();

	/**
	 * Returns the value of the '<em><b>Print Page Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Page Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Page Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @see #isSetPrintPageOrder()
	 * @see #unsetPrintPageOrder()
	 * @see #setPrintPageOrder(PrintPageOrderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PrintPageOrder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='print-page-order' namespace='##targetNamespace'"
	 * @generated
	 */
	PrintPageOrderType getPrintPageOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder <em>Print Page Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Page Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType
	 * @see #isSetPrintPageOrder()
	 * @see #unsetPrintPageOrder()
	 * @see #getPrintPageOrder()
	 * @generated
	 */
	void setPrintPageOrder(PrintPageOrderType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder <em>Print Page Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintPageOrder()
	 * @see #getPrintPageOrder()
	 * @see #setPrintPageOrder(PrintPageOrderType)
	 * @generated
	 */
	void unsetPrintPageOrder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPrintPageOrder <em>Print Page Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Print Page Order</em>' attribute is set.
	 * @see #unsetPrintPageOrder()
	 * @see #getPrintPageOrder()
	 * @see #setPrintPageOrder(PrintPageOrderType)
	 * @generated
	 */
	boolean isSetPrintPageOrder();

	/**
	 * Returns the value of the '<em><b>Punctuation Wrap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punctuation Wrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punctuation Wrap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @see #isSetPunctuationWrap()
	 * @see #unsetPunctuationWrap()
	 * @see #setPunctuationWrap(PunctuationWrapType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_PunctuationWrap()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='punctuation-wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	PunctuationWrapType getPunctuationWrap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap <em>Punctuation Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punctuation Wrap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType
	 * @see #isSetPunctuationWrap()
	 * @see #unsetPunctuationWrap()
	 * @see #getPunctuationWrap()
	 * @generated
	 */
	void setPunctuationWrap(PunctuationWrapType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap <em>Punctuation Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPunctuationWrap()
	 * @see #getPunctuationWrap()
	 * @see #setPunctuationWrap(PunctuationWrapType)
	 * @generated
	 */
	void unsetPunctuationWrap();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getPunctuationWrap <em>Punctuation Wrap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Punctuation Wrap</em>' attribute is set.
	 * @see #unsetPunctuationWrap()
	 * @see #getPunctuationWrap()
	 * @see #setPunctuationWrap(PunctuationWrapType)
	 * @generated
	 */
	boolean isSetPunctuationWrap();

	/**
	 * Returns the value of the '<em><b>Register True</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register True</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRegisterTrue()
	 * @see #unsetRegisterTrue()
	 * @see #setRegisterTrue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RegisterTrue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='register-true' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRegisterTrue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue <em>Register True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register True</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRegisterTrue()
	 * @see #unsetRegisterTrue()
	 * @see #getRegisterTrue()
	 * @generated
	 */
	void setRegisterTrue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue <em>Register True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegisterTrue()
	 * @see #getRegisterTrue()
	 * @see #setRegisterTrue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRegisterTrue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTrue <em>Register True</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Register True</em>' attribute is set.
	 * @see #unsetRegisterTrue()
	 * @see #getRegisterTrue()
	 * @see #setRegisterTrue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRegisterTrue();

	/**
	 * Returns the value of the '<em><b>Register Truth Ref Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Truth Ref Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Truth Ref Style Name</em>' attribute.
	 * @see #setRegisterTruthRefStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RegisterTruthRefStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.RegisterTruthRefStyleNameType"
	 *        extendedMetaData="kind='attribute' name='register-truth-ref-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegisterTruthRefStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRegisterTruthRefStyleName <em>Register Truth Ref Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Truth Ref Style Name</em>' attribute.
	 * @see #getRegisterTruthRefStyleName()
	 * @generated
	 */
	void setRegisterTruthRefStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Rel Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Column Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Column Width</em>' attribute.
	 * @see #setRelColumnWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RelColumnWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.RelativeLength"
	 *        extendedMetaData="kind='attribute' name='rel-column-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRelColumnWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelColumnWidth <em>Rel Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Column Width</em>' attribute.
	 * @see #getRelColumnWidth()
	 * @generated
	 */
	void setRelColumnWidth(String value);

	/**
	 * Returns the value of the '<em><b>Rel Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Height</em>' attribute.
	 * @see #setRelHeight(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RelHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightType"
	 *        extendedMetaData="kind='attribute' name='rel-height' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRelHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRelHeight <em>Rel Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height</em>' attribute.
	 * @see #getRelHeight()
	 * @generated
	 */
	void setRelHeight(Object value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @see #isSetRepeat()
	 * @see #unsetRepeat()
	 * @see #setRepeat(RepeatType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Repeat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatType getRepeat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType
	 * @see #isSetRepeat()
	 * @see #unsetRepeat()
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(RepeatType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepeat()
	 * @see #getRepeat()
	 * @see #setRepeat(RepeatType)
	 * @generated
	 */
	void unsetRepeat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeat <em>Repeat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repeat</em>' attribute is set.
	 * @see #unsetRepeat()
	 * @see #getRepeat()
	 * @see #setRepeat(RepeatType)
	 * @generated
	 */
	boolean isSetRepeat();

	/**
	 * Returns the value of the '<em><b>Repeat Content</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRepeatContent()
	 * @see #unsetRepeatContent()
	 * @see #setRepeatContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RepeatContent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='repeat-content' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRepeatContent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent <em>Repeat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRepeatContent()
	 * @see #unsetRepeatContent()
	 * @see #getRepeatContent()
	 * @generated
	 */
	void setRepeatContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent <em>Repeat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepeatContent()
	 * @see #getRepeatContent()
	 * @see #setRepeatContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRepeatContent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRepeatContent <em>Repeat Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repeat Content</em>' attribute is set.
	 * @see #unsetRepeatContent()
	 * @see #getRepeatContent()
	 * @see #setRepeatContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRepeatContent();

	/**
	 * Returns the value of the '<em><b>Rotation Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @see #isSetRotationAlign()
	 * @see #unsetRotationAlign()
	 * @see #setRotationAlign(RotationAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RotationAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rotation-align' namespace='##targetNamespace'"
	 * @generated
	 */
	RotationAlignType getRotationAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign <em>Rotation Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType
	 * @see #isSetRotationAlign()
	 * @see #unsetRotationAlign()
	 * @see #getRotationAlign()
	 * @generated
	 */
	void setRotationAlign(RotationAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign <em>Rotation Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationAlign()
	 * @see #getRotationAlign()
	 * @see #setRotationAlign(RotationAlignType)
	 * @generated
	 */
	void unsetRotationAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAlign <em>Rotation Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation Align</em>' attribute is set.
	 * @see #unsetRotationAlign()
	 * @see #getRotationAlign()
	 * @see #setRotationAlign(RotationAlignType)
	 * @generated
	 */
	boolean isSetRotationAlign();

	/**
	 * Returns the value of the '<em><b>Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Angle</em>' attribute.
	 * @see #setRotationAngle(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RotationAngle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='rotation-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRotationAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRotationAngle <em>Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Angle</em>' attribute.
	 * @see #getRotationAngle()
	 * @generated
	 */
	void setRotationAngle(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Row Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Height</em>' attribute.
	 * @see #setRowHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RowHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='row-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRowHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRowHeight <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Height</em>' attribute.
	 * @see #getRowHeight()
	 * @generated
	 */
	void setRowHeight(String value);

	/**
	 * Returns the value of the '<em><b>Ruby Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @see #isSetRubyAlign()
	 * @see #unsetRubyAlign()
	 * @see #setRubyAlign(RubyAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RubyAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ruby-align' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyAlignType getRubyAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign <em>Ruby Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType
	 * @see #isSetRubyAlign()
	 * @see #unsetRubyAlign()
	 * @see #getRubyAlign()
	 * @generated
	 */
	void setRubyAlign(RubyAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign <em>Ruby Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRubyAlign()
	 * @see #getRubyAlign()
	 * @see #setRubyAlign(RubyAlignType)
	 * @generated
	 */
	void unsetRubyAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyAlign <em>Ruby Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ruby Align</em>' attribute is set.
	 * @see #unsetRubyAlign()
	 * @see #getRubyAlign()
	 * @see #setRubyAlign(RubyAlignType)
	 * @generated
	 */
	boolean isSetRubyAlign();

	/**
	 * Returns the value of the '<em><b>Ruby Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @see #isSetRubyPosition()
	 * @see #unsetRubyPosition()
	 * @see #setRubyPosition(RubyPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RubyPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ruby-position' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyPositionType getRubyPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition <em>Ruby Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType
	 * @see #isSetRubyPosition()
	 * @see #unsetRubyPosition()
	 * @see #getRubyPosition()
	 * @generated
	 */
	void setRubyPosition(RubyPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition <em>Ruby Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRubyPosition()
	 * @see #getRubyPosition()
	 * @see #setRubyPosition(RubyPositionType)
	 * @generated
	 */
	void unsetRubyPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRubyPosition <em>Ruby Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ruby Position</em>' attribute is set.
	 * @see #unsetRubyPosition()
	 * @see #getRubyPosition()
	 * @see #setRubyPosition(RubyPositionType)
	 * @generated
	 */
	boolean isSetRubyPosition();

	/**
	 * Returns the value of the '<em><b>Run Through</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Through</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Through</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @see #isSetRunThrough()
	 * @see #unsetRunThrough()
	 * @see #setRunThrough(RunThroughType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_RunThrough()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='run-through' namespace='##targetNamespace'"
	 * @generated
	 */
	RunThroughType getRunThrough();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough <em>Run Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Through</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType
	 * @see #isSetRunThrough()
	 * @see #unsetRunThrough()
	 * @see #getRunThrough()
	 * @generated
	 */
	void setRunThrough(RunThroughType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough <em>Run Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunThrough()
	 * @see #getRunThrough()
	 * @see #setRunThrough(RunThroughType)
	 * @generated
	 */
	void unsetRunThrough();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getRunThrough <em>Run Through</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Run Through</em>' attribute is set.
	 * @see #unsetRunThrough()
	 * @see #getRunThrough()
	 * @see #setRunThrough(RunThroughType)
	 * @generated
	 */
	boolean isSetRunThrough();

	/**
	 * Returns the value of the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale To</em>' attribute.
	 * @see #setScaleTo(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ScaleTo()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='scale-to' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScaleTo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleTo <em>Scale To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale To</em>' attribute.
	 * @see #getScaleTo()
	 * @generated
	 */
	void setScaleTo(String value);

	/**
	 * Returns the value of the '<em><b>Scale To Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale To Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale To Pages</em>' attribute.
	 * @see #setScaleToPages(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ScaleToPages()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='scale-to-pages' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getScaleToPages();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScaleToPages <em>Scale To Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale To Pages</em>' attribute.
	 * @see #getScaleToPages()
	 * @generated
	 */
	void setScaleToPages(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Script Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @see #isSetScriptType()
	 * @see #unsetScriptType()
	 * @see #setScriptType(ScriptTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ScriptType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='script-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ScriptTypeType getScriptType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType
	 * @see #isSetScriptType()
	 * @see #unsetScriptType()
	 * @see #getScriptType()
	 * @generated
	 */
	void setScriptType(ScriptTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScriptType()
	 * @see #getScriptType()
	 * @see #setScriptType(ScriptTypeType)
	 * @generated
	 */
	void unsetScriptType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getScriptType <em>Script Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Script Type</em>' attribute is set.
	 * @see #unsetScriptType()
	 * @see #getScriptType()
	 * @see #setScriptType(ScriptTypeType)
	 * @generated
	 */
	boolean isSetScriptType();

	/**
	 * Returns the value of the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow</em>' attribute.
	 * @see #setShadow(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Shadow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ShadowType"
	 *        extendedMetaData="kind='attribute' name='shadow' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getShadow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow</em>' attribute.
	 * @see #getShadow()
	 * @generated
	 */
	void setShadow(Object value);

	/**
	 * Returns the value of the '<em><b>Shrink To Fit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shrink To Fit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shrink To Fit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShrinkToFit()
	 * @see #unsetShrinkToFit()
	 * @see #setShrinkToFit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_ShrinkToFit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shrink-to-fit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShrinkToFit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit <em>Shrink To Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shrink To Fit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShrinkToFit()
	 * @see #unsetShrinkToFit()
	 * @see #getShrinkToFit()
	 * @generated
	 */
	void setShrinkToFit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit <em>Shrink To Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShrinkToFit()
	 * @see #getShrinkToFit()
	 * @see #setShrinkToFit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShrinkToFit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getShrinkToFit <em>Shrink To Fit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shrink To Fit</em>' attribute is set.
	 * @see #unsetShrinkToFit()
	 * @see #getShrinkToFit()
	 * @see #setShrinkToFit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShrinkToFit();

	/**
	 * Returns the value of the '<em><b>Snap To Layout Grid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snap To Layout Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snap To Layout Grid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSnapToLayoutGrid()
	 * @see #unsetSnapToLayoutGrid()
	 * @see #setSnapToLayoutGrid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_SnapToLayoutGrid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='snap-to-layout-grid' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSnapToLayoutGrid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snap To Layout Grid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSnapToLayoutGrid()
	 * @see #unsetSnapToLayoutGrid()
	 * @see #getSnapToLayoutGrid()
	 * @generated
	 */
	void setSnapToLayoutGrid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSnapToLayoutGrid()
	 * @see #getSnapToLayoutGrid()
	 * @see #setSnapToLayoutGrid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSnapToLayoutGrid();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Snap To Layout Grid</em>' attribute is set.
	 * @see #unsetSnapToLayoutGrid()
	 * @see #getSnapToLayoutGrid()
	 * @see #setSnapToLayoutGrid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSnapToLayoutGrid();

	/**
	 * Returns the value of the '<em><b>Style1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see #isSetStyle1()
	 * @see #unsetStyle1()
	 * @see #setStyle1(StyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Style1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleType getStyle1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1 <em>Style1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see #isSetStyle1()
	 * @see #unsetStyle1()
	 * @see #getStyle1()
	 * @generated
	 */
	void setStyle1(StyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1 <em>Style1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle1()
	 * @see #getStyle1()
	 * @see #setStyle1(StyleType)
	 * @generated
	 */
	void unsetStyle1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyle1 <em>Style1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style1</em>' attribute is set.
	 * @see #unsetStyle1()
	 * @see #getStyle1()
	 * @see #setStyle1(StyleType)
	 * @generated
	 */
	boolean isSetStyle1();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Table Centering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Centering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Centering</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @see #isSetTableCentering()
	 * @see #unsetTableCentering()
	 * @see #setTableCentering(TableCenteringType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TableCentering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-centering' namespace='##targetNamespace'"
	 * @generated
	 */
	TableCenteringType getTableCentering();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering <em>Table Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Centering</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType
	 * @see #isSetTableCentering()
	 * @see #unsetTableCentering()
	 * @see #getTableCentering()
	 * @generated
	 */
	void setTableCentering(TableCenteringType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering <em>Table Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableCentering()
	 * @see #getTableCentering()
	 * @see #setTableCentering(TableCenteringType)
	 * @generated
	 */
	void unsetTableCentering();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTableCentering <em>Table Centering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Centering</em>' attribute is set.
	 * @see #unsetTableCentering()
	 * @see #getTableCentering()
	 * @see #setTableCentering(TableCenteringType)
	 * @generated
	 */
	boolean isSetTableCentering();

	/**
	 * Returns the value of the '<em><b>Tab Stop Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stop Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stop Distance</em>' attribute.
	 * @see #setTabStopDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TabStopDistance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='tab-stop-distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTabStopDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTabStopDistance <em>Tab Stop Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stop Distance</em>' attribute.
	 * @see #getTabStopDistance()
	 * @generated
	 */
	void setTabStopDistance(String value);

	/**
	 * Returns the value of the '<em><b>Text Align Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @see #isSetTextAlignSource()
	 * @see #unsetTextAlignSource()
	 * @see #setTextAlignSource(TextAlignSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextAlignSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-align-source' namespace='##targetNamespace'"
	 * @generated
	 */
	TextAlignSourceType getTextAlignSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource <em>Text Align Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType
	 * @see #isSetTextAlignSource()
	 * @see #unsetTextAlignSource()
	 * @see #getTextAlignSource()
	 * @generated
	 */
	void setTextAlignSource(TextAlignSourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource <em>Text Align Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAlignSource()
	 * @see #getTextAlignSource()
	 * @see #setTextAlignSource(TextAlignSourceType)
	 * @generated
	 */
	void unsetTextAlignSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAlignSource <em>Text Align Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Align Source</em>' attribute is set.
	 * @see #unsetTextAlignSource()
	 * @see #getTextAlignSource()
	 * @see #setTextAlignSource(TextAlignSourceType)
	 * @generated
	 */
	boolean isSetTextAlignSource();

	/**
	 * Returns the value of the '<em><b>Text Autospace</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Autospace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Autospace</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @see #isSetTextAutospace()
	 * @see #unsetTextAutospace()
	 * @see #setTextAutospace(TextAutospaceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextAutospace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-autospace' namespace='##targetNamespace'"
	 * @generated
	 */
	TextAutospaceType getTextAutospace();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace <em>Text Autospace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Autospace</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType
	 * @see #isSetTextAutospace()
	 * @see #unsetTextAutospace()
	 * @see #getTextAutospace()
	 * @generated
	 */
	void setTextAutospace(TextAutospaceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace <em>Text Autospace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAutospace()
	 * @see #getTextAutospace()
	 * @see #setTextAutospace(TextAutospaceType)
	 * @generated
	 */
	void unsetTextAutospace();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextAutospace <em>Text Autospace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Autospace</em>' attribute is set.
	 * @see #unsetTextAutospace()
	 * @see #getTextAutospace()
	 * @see #setTextAutospace(TextAutospaceType)
	 * @generated
	 */
	boolean isSetTextAutospace();

	/**
	 * Returns the value of the '<em><b>Text Blinking</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Blinking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Blinking</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextBlinking()
	 * @see #unsetTextBlinking()
	 * @see #setTextBlinking(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextBlinking()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-blinking' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextBlinking();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking <em>Text Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Blinking</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextBlinking()
	 * @see #unsetTextBlinking()
	 * @see #getTextBlinking()
	 * @generated
	 */
	void setTextBlinking(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking <em>Text Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextBlinking()
	 * @see #getTextBlinking()
	 * @see #setTextBlinking(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextBlinking();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextBlinking <em>Text Blinking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Blinking</em>' attribute is set.
	 * @see #unsetTextBlinking()
	 * @see #getTextBlinking()
	 * @see #setTextBlinking(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextBlinking();

	/**
	 * Returns the value of the '<em><b>Text Combine</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Combine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Combine</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @see #isSetTextCombine()
	 * @see #unsetTextCombine()
	 * @see #setTextCombine(TextCombineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextCombine()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-combine' namespace='##targetNamespace'"
	 * @generated
	 */
	TextCombineType getTextCombine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine <em>Text Combine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Combine</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType
	 * @see #isSetTextCombine()
	 * @see #unsetTextCombine()
	 * @see #getTextCombine()
	 * @generated
	 */
	void setTextCombine(TextCombineType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine <em>Text Combine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextCombine()
	 * @see #getTextCombine()
	 * @see #setTextCombine(TextCombineType)
	 * @generated
	 */
	void unsetTextCombine();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombine <em>Text Combine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Combine</em>' attribute is set.
	 * @see #unsetTextCombine()
	 * @see #getTextCombine()
	 * @see #setTextCombine(TextCombineType)
	 * @generated
	 */
	boolean isSetTextCombine();

	/**
	 * Returns the value of the '<em><b>Text Combine End Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Combine End Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Combine End Char</em>' attribute.
	 * @see #setTextCombineEndChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextCombineEndChar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='text-combine-end-char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextCombineEndChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineEndChar <em>Text Combine End Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Combine End Char</em>' attribute.
	 * @see #getTextCombineEndChar()
	 * @generated
	 */
	void setTextCombineEndChar(String value);

	/**
	 * Returns the value of the '<em><b>Text Combine Start Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Combine Start Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Combine Start Char</em>' attribute.
	 * @see #setTextCombineStartChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextCombineStartChar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='text-combine-start-char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextCombineStartChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextCombineStartChar <em>Text Combine Start Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Combine Start Char</em>' attribute.
	 * @see #getTextCombineStartChar()
	 * @generated
	 */
	void setTextCombineStartChar(String value);

	/**
	 * Returns the value of the '<em><b>Text Emphasize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Emphasize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Emphasize</em>' attribute.
	 * @see #setTextEmphasize(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextEmphasize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeType"
	 *        extendedMetaData="kind='attribute' name='text-emphasize' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextEmphasize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextEmphasize <em>Text Emphasize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Emphasize</em>' attribute.
	 * @see #getTextEmphasize()
	 * @generated
	 */
	void setTextEmphasize(Object value);

	/**
	 * Returns the value of the '<em><b>Text Line Through Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Color</em>' attribute.
	 * @see #setTextLineThroughColor(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorType"
	 *        extendedMetaData="kind='attribute' name='text-line-through-color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextLineThroughColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughColor <em>Text Line Through Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Color</em>' attribute.
	 * @see #getTextLineThroughColor()
	 * @generated
	 */
	void setTextLineThroughColor(Object value);

	/**
	 * Returns the value of the '<em><b>Text Line Through Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineMode
	 * @see #isSetTextLineThroughMode()
	 * @see #unsetTextLineThroughMode()
	 * @see #setTextLineThroughMode(LineMode)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-line-through-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LineMode getTextLineThroughMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode <em>Text Line Through Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineMode
	 * @see #isSetTextLineThroughMode()
	 * @see #unsetTextLineThroughMode()
	 * @see #getTextLineThroughMode()
	 * @generated
	 */
	void setTextLineThroughMode(LineMode value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode <em>Text Line Through Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextLineThroughMode()
	 * @see #getTextLineThroughMode()
	 * @see #setTextLineThroughMode(LineMode)
	 * @generated
	 */
	void unsetTextLineThroughMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughMode <em>Text Line Through Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Line Through Mode</em>' attribute is set.
	 * @see #unsetTextLineThroughMode()
	 * @see #getTextLineThroughMode()
	 * @see #setTextLineThroughMode(LineMode)
	 * @generated
	 */
	boolean isSetTextLineThroughMode();

	/**
	 * Returns the value of the '<em><b>Text Line Through Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetTextLineThroughStyle()
	 * @see #unsetTextLineThroughStyle()
	 * @see #setTextLineThroughStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-line-through-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getTextLineThroughStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle <em>Text Line Through Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetTextLineThroughStyle()
	 * @see #unsetTextLineThroughStyle()
	 * @see #getTextLineThroughStyle()
	 * @generated
	 */
	void setTextLineThroughStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle <em>Text Line Through Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextLineThroughStyle()
	 * @see #getTextLineThroughStyle()
	 * @see #setTextLineThroughStyle(LineStyle)
	 * @generated
	 */
	void unsetTextLineThroughStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughStyle <em>Text Line Through Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Line Through Style</em>' attribute is set.
	 * @see #unsetTextLineThroughStyle()
	 * @see #getTextLineThroughStyle()
	 * @see #setTextLineThroughStyle(LineStyle)
	 * @generated
	 */
	boolean isSetTextLineThroughStyle();

	/**
	 * Returns the value of the '<em><b>Text Line Through Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Text</em>' attribute.
	 * @see #setTextLineThroughText(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughText()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='text-line-through-text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextLineThroughText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughText <em>Text Line Through Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Text</em>' attribute.
	 * @see #getTextLineThroughText()
	 * @generated
	 */
	void setTextLineThroughText(String value);

	/**
	 * Returns the value of the '<em><b>Text Line Through Text Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Text Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Text Style</em>' attribute.
	 * @see #setTextLineThroughTextStyle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughTextStyle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughTextStyleType"
	 *        extendedMetaData="kind='attribute' name='text-line-through-text-style' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextLineThroughTextStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughTextStyle <em>Text Line Through Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Text Style</em>' attribute.
	 * @see #getTextLineThroughTextStyle()
	 * @generated
	 */
	void setTextLineThroughTextStyle(String value);

	/**
	 * Returns the value of the '<em><b>Text Line Through Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetTextLineThroughType()
	 * @see #unsetTextLineThroughType()
	 * @see #setTextLineThroughType(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-line-through-type' namespace='##targetNamespace'"
	 * @generated
	 */
	LineType getTextLineThroughType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType <em>Text Line Through Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetTextLineThroughType()
	 * @see #unsetTextLineThroughType()
	 * @see #getTextLineThroughType()
	 * @generated
	 */
	void setTextLineThroughType(LineType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType <em>Text Line Through Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextLineThroughType()
	 * @see #getTextLineThroughType()
	 * @see #setTextLineThroughType(LineType)
	 * @generated
	 */
	void unsetTextLineThroughType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughType <em>Text Line Through Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Line Through Type</em>' attribute is set.
	 * @see #unsetTextLineThroughType()
	 * @see #getTextLineThroughType()
	 * @see #setTextLineThroughType(LineType)
	 * @generated
	 */
	boolean isSetTextLineThroughType();

	/**
	 * Returns the value of the '<em><b>Text Line Through Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Line Through Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Line Through Width</em>' attribute.
	 * @see #setTextLineThroughWidth(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextLineThroughWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LineWidth"
	 *        extendedMetaData="kind='attribute' name='text-line-through-width' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextLineThroughWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextLineThroughWidth <em>Text Line Through Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Line Through Width</em>' attribute.
	 * @see #getTextLineThroughWidth()
	 * @generated
	 */
	void setTextLineThroughWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Text Outline</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Outline</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextOutline()
	 * @see #unsetTextOutline()
	 * @see #setTextOutline(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextOutline()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-outline' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextOutline();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline <em>Text Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Outline</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextOutline()
	 * @see #unsetTextOutline()
	 * @see #getTextOutline()
	 * @generated
	 */
	void setTextOutline(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline <em>Text Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextOutline()
	 * @see #getTextOutline()
	 * @see #setTextOutline(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextOutline();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextOutline <em>Text Outline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Outline</em>' attribute is set.
	 * @see #unsetTextOutline()
	 * @see #getTextOutline()
	 * @see #setTextOutline(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextOutline();

	/**
	 * Returns the value of the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Position</em>' attribute.
	 * @see #setTextPosition(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextPosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionType" many="false"
	 *        extendedMetaData="kind='attribute' name='text-position' namespace='##targetNamespace'"
	 * @generated
	 */
	List getTextPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextPosition <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Position</em>' attribute.
	 * @see #getTextPosition()
	 * @generated
	 */
	void setTextPosition(List value);

	/**
	 * Returns the value of the '<em><b>Text Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Rotation Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Rotation Angle</em>' attribute.
	 * @see #setTextRotationAngle(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextRotationAngle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='text-rotation-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTextRotationAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationAngle <em>Text Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Rotation Angle</em>' attribute.
	 * @see #getTextRotationAngle()
	 * @generated
	 */
	void setTextRotationAngle(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Text Rotation Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Rotation Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Rotation Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @see #isSetTextRotationScale()
	 * @see #unsetTextRotationScale()
	 * @see #setTextRotationScale(TextRotationScaleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextRotationScale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-rotation-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	TextRotationScaleType getTextRotationScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale <em>Text Rotation Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Rotation Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType
	 * @see #isSetTextRotationScale()
	 * @see #unsetTextRotationScale()
	 * @see #getTextRotationScale()
	 * @generated
	 */
	void setTextRotationScale(TextRotationScaleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale <em>Text Rotation Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextRotationScale()
	 * @see #getTextRotationScale()
	 * @see #setTextRotationScale(TextRotationScaleType)
	 * @generated
	 */
	void unsetTextRotationScale();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextRotationScale <em>Text Rotation Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Rotation Scale</em>' attribute is set.
	 * @see #unsetTextRotationScale()
	 * @see #getTextRotationScale()
	 * @see #setTextRotationScale(TextRotationScaleType)
	 * @generated
	 */
	boolean isSetTextRotationScale();

	/**
	 * Returns the value of the '<em><b>Text Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Scale</em>' attribute.
	 * @see #setTextScale(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextScale()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='text-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextScale <em>Text Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Scale</em>' attribute.
	 * @see #getTextScale()
	 * @generated
	 */
	void setTextScale(String value);

	/**
	 * Returns the value of the '<em><b>Text Underline Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Underline Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Underline Color</em>' attribute.
	 * @see #setTextUnderlineColor(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextUnderlineColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorType"
	 *        extendedMetaData="kind='attribute' name='text-underline-color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextUnderlineColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineColor <em>Text Underline Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Underline Color</em>' attribute.
	 * @see #getTextUnderlineColor()
	 * @generated
	 */
	void setTextUnderlineColor(Object value);

	/**
	 * Returns the value of the '<em><b>Text Underline Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Underline Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Underline Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineMode
	 * @see #isSetTextUnderlineMode()
	 * @see #unsetTextUnderlineMode()
	 * @see #setTextUnderlineMode(LineMode)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextUnderlineMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-underline-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LineMode getTextUnderlineMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode <em>Text Underline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Underline Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineMode
	 * @see #isSetTextUnderlineMode()
	 * @see #unsetTextUnderlineMode()
	 * @see #getTextUnderlineMode()
	 * @generated
	 */
	void setTextUnderlineMode(LineMode value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode <em>Text Underline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextUnderlineMode()
	 * @see #getTextUnderlineMode()
	 * @see #setTextUnderlineMode(LineMode)
	 * @generated
	 */
	void unsetTextUnderlineMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineMode <em>Text Underline Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Underline Mode</em>' attribute is set.
	 * @see #unsetTextUnderlineMode()
	 * @see #getTextUnderlineMode()
	 * @see #setTextUnderlineMode(LineMode)
	 * @generated
	 */
	boolean isSetTextUnderlineMode();

	/**
	 * Returns the value of the '<em><b>Text Underline Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Underline Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Underline Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetTextUnderlineStyle()
	 * @see #unsetTextUnderlineStyle()
	 * @see #setTextUnderlineStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextUnderlineStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-underline-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getTextUnderlineStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle <em>Text Underline Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Underline Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetTextUnderlineStyle()
	 * @see #unsetTextUnderlineStyle()
	 * @see #getTextUnderlineStyle()
	 * @generated
	 */
	void setTextUnderlineStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle <em>Text Underline Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextUnderlineStyle()
	 * @see #getTextUnderlineStyle()
	 * @see #setTextUnderlineStyle(LineStyle)
	 * @generated
	 */
	void unsetTextUnderlineStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineStyle <em>Text Underline Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Underline Style</em>' attribute is set.
	 * @see #unsetTextUnderlineStyle()
	 * @see #getTextUnderlineStyle()
	 * @see #setTextUnderlineStyle(LineStyle)
	 * @generated
	 */
	boolean isSetTextUnderlineStyle();

	/**
	 * Returns the value of the '<em><b>Text Underline Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Underline Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Underline Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetTextUnderlineType()
	 * @see #unsetTextUnderlineType()
	 * @see #setTextUnderlineType(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextUnderlineType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-underline-type' namespace='##targetNamespace'"
	 * @generated
	 */
	LineType getTextUnderlineType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType <em>Text Underline Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Underline Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineType
	 * @see #isSetTextUnderlineType()
	 * @see #unsetTextUnderlineType()
	 * @see #getTextUnderlineType()
	 * @generated
	 */
	void setTextUnderlineType(LineType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType <em>Text Underline Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextUnderlineType()
	 * @see #getTextUnderlineType()
	 * @see #setTextUnderlineType(LineType)
	 * @generated
	 */
	void unsetTextUnderlineType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineType <em>Text Underline Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Underline Type</em>' attribute is set.
	 * @see #unsetTextUnderlineType()
	 * @see #getTextUnderlineType()
	 * @see #setTextUnderlineType(LineType)
	 * @generated
	 */
	boolean isSetTextUnderlineType();

	/**
	 * Returns the value of the '<em><b>Text Underline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Underline Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Underline Width</em>' attribute.
	 * @see #setTextUnderlineWidth(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_TextUnderlineWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LineWidth"
	 *        extendedMetaData="kind='attribute' name='text-underline-width' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextUnderlineWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getTextUnderlineWidth <em>Text Underline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Underline Width</em>' attribute.
	 * @see #getTextUnderlineWidth()
	 * @generated
	 */
	void setTextUnderlineWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Use Optimal Column Width</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Optimal Column Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Optimal Column Width</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOptimalColumnWidth()
	 * @see #unsetUseOptimalColumnWidth()
	 * @see #setUseOptimalColumnWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_UseOptimalColumnWidth()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-optimal-column-width' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOptimalColumnWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Optimal Column Width</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOptimalColumnWidth()
	 * @see #unsetUseOptimalColumnWidth()
	 * @see #getUseOptimalColumnWidth()
	 * @generated
	 */
	void setUseOptimalColumnWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOptimalColumnWidth()
	 * @see #getUseOptimalColumnWidth()
	 * @see #setUseOptimalColumnWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseOptimalColumnWidth();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Optimal Column Width</em>' attribute is set.
	 * @see #unsetUseOptimalColumnWidth()
	 * @see #getUseOptimalColumnWidth()
	 * @see #setUseOptimalColumnWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseOptimalColumnWidth();

	/**
	 * Returns the value of the '<em><b>Use Optimal Row Height</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Optimal Row Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Optimal Row Height</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOptimalRowHeight()
	 * @see #unsetUseOptimalRowHeight()
	 * @see #setUseOptimalRowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_UseOptimalRowHeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-optimal-row-height' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOptimalRowHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Optimal Row Height</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOptimalRowHeight()
	 * @see #unsetUseOptimalRowHeight()
	 * @see #getUseOptimalRowHeight()
	 * @generated
	 */
	void setUseOptimalRowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOptimalRowHeight()
	 * @see #getUseOptimalRowHeight()
	 * @see #setUseOptimalRowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseOptimalRowHeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Optimal Row Height</em>' attribute is set.
	 * @see #unsetUseOptimalRowHeight()
	 * @see #getUseOptimalRowHeight()
	 * @see #setUseOptimalRowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseOptimalRowHeight();

	/**
	 * Returns the value of the '<em><b>Use Window Font Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Window Font Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Window Font Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseWindowFontColor()
	 * @see #unsetUseWindowFontColor()
	 * @see #setUseWindowFontColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_UseWindowFontColor()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-window-font-color' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseWindowFontColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor <em>Use Window Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Window Font Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseWindowFontColor()
	 * @see #unsetUseWindowFontColor()
	 * @see #getUseWindowFontColor()
	 * @generated
	 */
	void setUseWindowFontColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor <em>Use Window Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseWindowFontColor()
	 * @see #getUseWindowFontColor()
	 * @see #setUseWindowFontColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseWindowFontColor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getUseWindowFontColor <em>Use Window Font Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Window Font Color</em>' attribute is set.
	 * @see #unsetUseWindowFontColor()
	 * @see #getUseWindowFontColor()
	 * @see #setUseWindowFontColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseWindowFontColor();

	/**
	 * Returns the value of the '<em><b>Vertical Pos</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Pos</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @see #isSetVerticalPos()
	 * @see #unsetVerticalPos()
	 * @see #setVerticalPos(VerticalPosType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_VerticalPos()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='vertical-pos' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalPosType getVerticalPos();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos <em>Vertical Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Pos</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType
	 * @see #isSetVerticalPos()
	 * @see #unsetVerticalPos()
	 * @see #getVerticalPos()
	 * @generated
	 */
	void setVerticalPos(VerticalPosType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos <em>Vertical Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalPos()
	 * @see #getVerticalPos()
	 * @see #setVerticalPos(VerticalPosType)
	 * @generated
	 */
	void unsetVerticalPos();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalPos <em>Vertical Pos</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Pos</em>' attribute is set.
	 * @see #unsetVerticalPos()
	 * @see #getVerticalPos()
	 * @see #setVerticalPos(VerticalPosType)
	 * @generated
	 */
	boolean isSetVerticalPos();

	/**
	 * Returns the value of the '<em><b>Vertical Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Rel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @see #isSetVerticalRel()
	 * @see #unsetVerticalRel()
	 * @see #setVerticalRel(VerticalRelType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_VerticalRel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='vertical-rel' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalRelType getVerticalRel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel <em>Vertical Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Rel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType
	 * @see #isSetVerticalRel()
	 * @see #unsetVerticalRel()
	 * @see #getVerticalRel()
	 * @generated
	 */
	void setVerticalRel(VerticalRelType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel <em>Vertical Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalRel()
	 * @see #getVerticalRel()
	 * @see #setVerticalRel(VerticalRelType)
	 * @generated
	 */
	void unsetVerticalRel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVerticalRel <em>Vertical Rel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Rel</em>' attribute is set.
	 * @see #unsetVerticalRel()
	 * @see #getVerticalRel()
	 * @see #setVerticalRel(VerticalRelType)
	 * @generated
	 */
	boolean isSetVerticalRel();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Volatile()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='volatile' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetVolatile();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getVolatile <em>Volatile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile</em>' attribute is set.
	 * @see #unsetVolatile()
	 * @see #getVolatile()
	 * @see #setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetVolatile();

	/**
	 * Returns the value of the '<em><b>Wrap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @see #isSetWrap()
	 * @see #unsetWrap()
	 * @see #setWrap(WrapType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_Wrap()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrap' namespace='##targetNamespace'"
	 * @generated
	 */
	WrapType getWrap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapType
	 * @see #isSetWrap()
	 * @see #unsetWrap()
	 * @see #getWrap()
	 * @generated
	 */
	void setWrap(WrapType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrap()
	 * @see #getWrap()
	 * @see #setWrap(WrapType)
	 * @generated
	 */
	void unsetWrap();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrap <em>Wrap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap</em>' attribute is set.
	 * @see #unsetWrap()
	 * @see #getWrap()
	 * @see #setWrap(WrapType)
	 * @generated
	 */
	boolean isSetWrap();

	/**
	 * Returns the value of the '<em><b>Wrap Contour</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Contour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Contour</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetWrapContour()
	 * @see #unsetWrapContour()
	 * @see #setWrapContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_WrapContour()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrap-contour' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getWrapContour();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour <em>Wrap Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Contour</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetWrapContour()
	 * @see #unsetWrapContour()
	 * @see #getWrapContour()
	 * @generated
	 */
	void setWrapContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour <em>Wrap Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapContour()
	 * @see #getWrapContour()
	 * @see #setWrapContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetWrapContour();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContour <em>Wrap Contour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap Contour</em>' attribute is set.
	 * @see #unsetWrapContour()
	 * @see #getWrapContour()
	 * @see #setWrapContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetWrapContour();

	/**
	 * Returns the value of the '<em><b>Wrap Contour Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Contour Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Contour Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @see #isSetWrapContourMode()
	 * @see #unsetWrapContourMode()
	 * @see #setWrapContourMode(WrapContourModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_WrapContourMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrap-contour-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	WrapContourModeType getWrapContourMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode <em>Wrap Contour Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Contour Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType
	 * @see #isSetWrapContourMode()
	 * @see #unsetWrapContourMode()
	 * @see #getWrapContourMode()
	 * @generated
	 */
	void setWrapContourMode(WrapContourModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode <em>Wrap Contour Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapContourMode()
	 * @see #getWrapContourMode()
	 * @see #setWrapContourMode(WrapContourModeType)
	 * @generated
	 */
	void unsetWrapContourMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapContourMode <em>Wrap Contour Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap Contour Mode</em>' attribute is set.
	 * @see #unsetWrapContourMode()
	 * @see #getWrapContourMode()
	 * @see #setWrapContourMode(WrapContourModeType)
	 * @generated
	 */
	boolean isSetWrapContourMode();

	/**
	 * Returns the value of the '<em><b>Wrap Dynamic Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Dynamic Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Dynamic Threshold</em>' attribute.
	 * @see #setWrapDynamicThreshold(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_WrapDynamicThreshold()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='wrap-dynamic-threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWrapDynamicThreshold();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWrapDynamicThreshold <em>Wrap Dynamic Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Dynamic Threshold</em>' attribute.
	 * @see #getWrapDynamicThreshold()
	 * @generated
	 */
	void setWrapDynamicThreshold(String value);

	/**
	 * Returns the value of the '<em><b>Writing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @see #isSetWritingMode()
	 * @see #unsetWritingMode()
	 * @see #setWritingMode(WritingModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_WritingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='writing-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	WritingModeType getWritingMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode <em>Writing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writing Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType
	 * @see #isSetWritingMode()
	 * @see #unsetWritingMode()
	 * @see #getWritingMode()
	 * @generated
	 */
	void setWritingMode(WritingModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode <em>Writing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWritingMode()
	 * @see #getWritingMode()
	 * @see #setWritingMode(WritingModeType)
	 * @generated
	 */
	void unsetWritingMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingMode <em>Writing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Writing Mode</em>' attribute is set.
	 * @see #unsetWritingMode()
	 * @see #getWritingMode()
	 * @see #setWritingMode(WritingModeType)
	 * @generated
	 */
	boolean isSetWritingMode();

	/**
	 * Returns the value of the '<em><b>Writing Mode Automatic</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing Mode Automatic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing Mode Automatic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetWritingModeAutomatic()
	 * @see #unsetWritingModeAutomatic()
	 * @see #setWritingModeAutomatic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDocumentRoot_WritingModeAutomatic()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='writing-mode-automatic' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getWritingModeAutomatic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic <em>Writing Mode Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writing Mode Automatic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetWritingModeAutomatic()
	 * @see #unsetWritingModeAutomatic()
	 * @see #getWritingModeAutomatic()
	 * @generated
	 */
	void setWritingModeAutomatic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic <em>Writing Mode Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWritingModeAutomatic()
	 * @see #getWritingModeAutomatic()
	 * @see #setWritingModeAutomatic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetWritingModeAutomatic();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot#getWritingModeAutomatic <em>Writing Mode Automatic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Writing Mode Automatic</em>' attribute is set.
	 * @see #unsetWritingModeAutomatic()
	 * @see #getWritingModeAutomatic()
	 * @see #setWritingModeAutomatic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetWritingModeAutomatic();

} // DocumentRoot
