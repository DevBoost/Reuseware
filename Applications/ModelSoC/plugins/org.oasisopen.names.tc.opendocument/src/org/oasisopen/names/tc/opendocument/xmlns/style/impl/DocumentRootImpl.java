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
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType;
import org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem;
import org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WrapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType;
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
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getChartProperties <em>Chart Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getColumnSep <em>Column Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDefaultStyle <em>Default Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDrawingPageProperties <em>Drawing Page Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDropCap <em>Drop Cap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFace <em>Font Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFooterLeft <em>Footer Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFooterStyle <em>Footer Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFootnoteSep <em>Footnote Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getGraphicProperties <em>Graphic Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHandoutMaster <em>Handout Master</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHeaderFooterProperties <em>Header Footer Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHeaderLeft <em>Header Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHeaderStyle <em>Header Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getListLevelProperties <em>List Level Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMasterPage <em>Master Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPageLayout <em>Page Layout</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPageLayoutProperties <em>Page Layout Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getParagraphProperties <em>Paragraph Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPresentationPageLayout <em>Presentation Page Layout</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRegionCenter <em>Region Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRegionLeft <em>Region Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRegionRight <em>Region Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRubyProperties <em>Ruby Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getSectionProperties <em>Section Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTableCellProperties <em>Table Cell Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTableColumnProperties <em>Table Column Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTableProperties <em>Table Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTableRowProperties <em>Table Row Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTabStops <em>Tab Stops</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getApplyStyleName <em>Apply Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getAutoTextIndent <em>Auto Text Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getAutoUpdate <em>Auto Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBackgroundTransparency <em>Background Transparency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBorderLineWidth <em>Border Line Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBorderLineWidthBottom <em>Border Line Width Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBorderLineWidthLeft <em>Border Line Width Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBorderLineWidthRight <em>Border Line Width Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getBorderLineWidthTop <em>Border Line Width Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getCellProtect <em>Cell Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getCountryAsian <em>Country Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getCountryComplex <em>Country Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDefaultOutlineLevel <em>Default Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDiagonalBlTr <em>Diagonal Bl Tr</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDiagonalBlTrWidths <em>Diagonal Bl Tr Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDiagonalTlBr <em>Diagonal Tl Br</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDiagonalTlBrWidths <em>Diagonal Tl Br Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDistanceAfterSep <em>Distance After Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDistanceBeforeSep <em>Distance Before Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getDynamicSpacing <em>Dynamic Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFirstPageNumber <em>First Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFlowWithText <em>Flow With Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontAdornments <em>Font Adornments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontCharset <em>Font Charset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontCharsetAsian <em>Font Charset Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontCharsetComplex <em>Font Charset Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFamilyAsian <em>Font Family Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFamilyComplex <em>Font Family Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFamilyGeneric <em>Font Family Generic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFamilyGenericAsian <em>Font Family Generic Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontFamilyGenericComplex <em>Font Family Generic Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontIndependentLineSpacing <em>Font Independent Line Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontNameAsian <em>Font Name Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontNameComplex <em>Font Name Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontPitch <em>Font Pitch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontPitchAsian <em>Font Pitch Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontPitchComplex <em>Font Pitch Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontRelief <em>Font Relief</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontSizeAsian <em>Font Size Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontSizeComplex <em>Font Size Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontSizeRel <em>Font Size Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontSizeRelAsian <em>Font Size Rel Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontSizeRelComplex <em>Font Size Rel Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontStyleAsian <em>Font Style Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontStyleComplex <em>Font Style Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontStyleName <em>Font Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontStyleNameAsian <em>Font Style Name Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontStyleNameComplex <em>Font Style Name Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontWeightAsian <em>Font Weight Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFontWeightComplex <em>Font Weight Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getFootnoteMaxHeight <em>Footnote Max Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getGlyphOrientationVertical <em>Glyph Orientation Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHorizontalPos <em>Horizontal Pos</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getHorizontalRel <em>Horizontal Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getJustifySingleWord <em>Justify Single Word</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLanguageAsian <em>Language Asian</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLanguageComplex <em>Language Complex</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridBaseHeight <em>Layout Grid Base Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridColor <em>Layout Grid Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridDisplay <em>Layout Grid Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridLines <em>Layout Grid Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridMode <em>Layout Grid Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridPrint <em>Layout Grid Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridRubyBelow <em>Layout Grid Ruby Below</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLayoutGridRubyHeight <em>Layout Grid Ruby Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderChar <em>Leader Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderColor <em>Leader Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderStyle <em>Leader Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderText <em>Leader Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderTextStyle <em>Leader Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderType <em>Leader Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLeaderWidth <em>Leader Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLegendExpansion <em>Legend Expansion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLetterKerning <em>Letter Kerning</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLineHeightAtLeast <em>Line Height At Least</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLineSpacing <em>Line Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getListStyleName <em>List Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMayBreakBetweenRows <em>May Break Between Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMinRowHeight <em>Min Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getMirror <em>Mirror</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNextStyleName <em>Next Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNumberWrappedParagraphs <em>Number Wrapped Paragraphs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getOverflowBehavior <em>Overflow Behavior</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPageLayoutName <em>Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPageUsage <em>Page Usage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPaperTrayName <em>Paper Tray Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getParentStyleName <em>Parent Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPrintContent <em>Print Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPrintOrientation <em>Print Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPrintPageOrder <em>Print Page Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getPunctuationWrap <em>Punctuation Wrap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRegisterTrue <em>Register True</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRegisterTruthRefStyleName <em>Register Truth Ref Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRelColumnWidth <em>Rel Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRepeatContent <em>Repeat Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRotationAlign <em>Rotation Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRotationAngle <em>Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRowHeight <em>Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRubyAlign <em>Ruby Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRubyPosition <em>Ruby Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getRunThrough <em>Run Through</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getScaleTo <em>Scale To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getScaleToPages <em>Scale To Pages</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getScriptType <em>Script Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getShrinkToFit <em>Shrink To Fit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getSnapToLayoutGrid <em>Snap To Layout Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTableCentering <em>Table Centering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTabStopDistance <em>Tab Stop Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextAlignSource <em>Text Align Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextAutospace <em>Text Autospace</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextBlinking <em>Text Blinking</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextCombine <em>Text Combine</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextCombineEndChar <em>Text Combine End Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextCombineStartChar <em>Text Combine Start Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextEmphasize <em>Text Emphasize</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughColor <em>Text Line Through Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughMode <em>Text Line Through Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughStyle <em>Text Line Through Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughText <em>Text Line Through Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughTextStyle <em>Text Line Through Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughType <em>Text Line Through Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextLineThroughWidth <em>Text Line Through Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextOutline <em>Text Outline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextRotationAngle <em>Text Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextRotationScale <em>Text Rotation Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextScale <em>Text Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextUnderlineColor <em>Text Underline Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextUnderlineMode <em>Text Underline Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextUnderlineStyle <em>Text Underline Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextUnderlineType <em>Text Underline Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getTextUnderlineWidth <em>Text Underline Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getUseOptimalColumnWidth <em>Use Optimal Column Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getUseOptimalRowHeight <em>Use Optimal Row Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getUseWindowFontColor <em>Use Window Font Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getVerticalPos <em>Vertical Pos</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getVerticalRel <em>Vertical Rel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWrap <em>Wrap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWrapContour <em>Wrap Contour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWrapContourMode <em>Wrap Contour Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWrapDynamicThreshold <em>Wrap Dynamic Threshold</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWritingMode <em>Writing Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.DocumentRootImpl#getWritingModeAutomatic <em>Writing Mode Automatic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final AdjustmentType ADJUSTMENT_EDEFAULT = AdjustmentType.LEFT;

	/**
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustment = ADJUSTMENT_EDEFAULT;

	/**
	 * This is true if the Adjustment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adjustmentESet;

	/**
	 * The default value of the '{@link #getApplyStyleName() <em>Apply Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLY_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyStyleName() <em>Apply Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyStyleName()
	 * @generated
	 * @ordered
	 */
	protected String applyStyleName = APPLY_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoTextIndent() <em>Auto Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTextIndent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_TEXT_INDENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoTextIndent() <em>Auto Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTextIndent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoTextIndent = AUTO_TEXT_INDENT_EDEFAULT;

	/**
	 * This is true if the Auto Text Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoTextIndentESet;

	/**
	 * The default value of the '{@link #getAutoUpdate() <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_UPDATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoUpdate() <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoUpdate = AUTO_UPDATE_EDEFAULT;

	/**
	 * This is true if the Auto Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoUpdateESet;

	/**
	 * The default value of the '{@link #getBackgroundTransparency() <em>Background Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_TRANSPARENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundTransparency() <em>Background Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundTransparency()
	 * @generated
	 * @ordered
	 */
	protected String backgroundTransparency = BACKGROUND_TRANSPARENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String baseCellAddress = BASE_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLineWidth() <em>Border Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> BORDER_LINE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLineWidth() <em>Border Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidth()
	 * @generated
	 * @ordered
	 */
	protected List<String> borderLineWidth = BORDER_LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLineWidthBottom() <em>Border Line Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthBottom()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> BORDER_LINE_WIDTH_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLineWidthBottom() <em>Border Line Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthBottom()
	 * @generated
	 * @ordered
	 */
	protected List<String> borderLineWidthBottom = BORDER_LINE_WIDTH_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLineWidthLeft() <em>Border Line Width Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthLeft()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> BORDER_LINE_WIDTH_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLineWidthLeft() <em>Border Line Width Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthLeft()
	 * @generated
	 * @ordered
	 */
	protected List<String> borderLineWidthLeft = BORDER_LINE_WIDTH_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLineWidthRight() <em>Border Line Width Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthRight()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> BORDER_LINE_WIDTH_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLineWidthRight() <em>Border Line Width Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthRight()
	 * @generated
	 * @ordered
	 */
	protected List<String> borderLineWidthRight = BORDER_LINE_WIDTH_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLineWidthTop() <em>Border Line Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthTop()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> BORDER_LINE_WIDTH_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLineWidthTop() <em>Border Line Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLineWidthTop()
	 * @generated
	 * @ordered
	 */
	protected List<String> borderLineWidthTop = BORDER_LINE_WIDTH_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellProtect() <em>Cell Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellProtect()
	 * @generated
	 * @ordered
	 */
	protected static final Object CELL_PROTECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellProtect() <em>Cell Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellProtect()
	 * @generated
	 * @ordered
	 */
	protected Object cellProtect = CELL_PROTECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected String columnWidth = COLUMN_WIDTH_EDEFAULT;

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
	 * The default value of the '{@link #getCountryAsian() <em>Country Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryAsian() <em>Country Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryAsian()
	 * @generated
	 * @ordered
	 */
	protected String countryAsian = COUNTRY_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryComplex() <em>Country Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryComplex() <em>Country Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryComplex()
	 * @generated
	 * @ordered
	 */
	protected String countryComplex = COUNTRY_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected String dataStyleName = DATA_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decimalPlaces = DECIMAL_PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultOutlineLevel() <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEFAULT_OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultOutlineLevel() <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger defaultOutlineLevel = DEFAULT_OUTLINE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagonalBlTr() <em>Diagonal Bl Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalBlTr()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGONAL_BL_TR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagonalBlTr() <em>Diagonal Bl Tr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalBlTr()
	 * @generated
	 * @ordered
	 */
	protected String diagonalBlTr = DIAGONAL_BL_TR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagonalBlTrWidths() <em>Diagonal Bl Tr Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalBlTrWidths()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> DIAGONAL_BL_TR_WIDTHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagonalBlTrWidths() <em>Diagonal Bl Tr Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalBlTrWidths()
	 * @generated
	 * @ordered
	 */
	protected List<String> diagonalBlTrWidths = DIAGONAL_BL_TR_WIDTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagonalTlBr() <em>Diagonal Tl Br</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalTlBr()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGONAL_TL_BR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagonalTlBr() <em>Diagonal Tl Br</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalTlBr()
	 * @generated
	 * @ordered
	 */
	protected String diagonalTlBr = DIAGONAL_TL_BR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagonalTlBrWidths() <em>Diagonal Tl Br Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalTlBrWidths()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> DIAGONAL_TL_BR_WIDTHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagonalTlBrWidths() <em>Diagonal Tl Br Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalTlBrWidths()
	 * @generated
	 * @ordered
	 */
	protected List<String> diagonalTlBrWidths = DIAGONAL_TL_BR_WIDTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.LTR;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAfterSep() <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAfterSep()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_AFTER_SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceAfterSep() <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAfterSep()
	 * @generated
	 * @ordered
	 */
	protected String distanceAfterSep = DISTANCE_AFTER_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceBeforeSep() <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBeforeSep()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_BEFORE_SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceBeforeSep() <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBeforeSep()
	 * @generated
	 * @ordered
	 */
	protected String distanceBeforeSep = DISTANCE_BEFORE_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamicSpacing() <em>Dynamic Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DYNAMIC_SPACING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDynamicSpacing() <em>Dynamic Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicSpacing()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean dynamicSpacing = DYNAMIC_SPACING_EDEFAULT;

	/**
	 * This is true if the Dynamic Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicSpacingESet;

	/**
	 * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EDITABLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean editable = EDITABLE_EDEFAULT;

	/**
	 * This is true if the Editable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editableESet;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final FamilyType FAMILY_EDEFAULT = FamilyType.TEXT;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected FamilyType family = FAMILY_EDEFAULT;

	/**
	 * This is true if the Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean familyESet;

	/**
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageNumber() <em>First Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRST_PAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstPageNumber() <em>First Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageNumber()
	 * @generated
	 * @ordered
	 */
	protected Object firstPageNumber = FIRST_PAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowWithText() <em>Flow With Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowWithText()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FLOW_WITH_TEXT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFlowWithText() <em>Flow With Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowWithText()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean flowWithText = FLOW_WITH_TEXT_EDEFAULT;

	/**
	 * This is true if the Flow With Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowWithTextESet;

	/**
	 * The default value of the '{@link #getFontAdornments() <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontAdornments()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_ADORNMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontAdornments() <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontAdornments()
	 * @generated
	 * @ordered
	 */
	protected String fontAdornments = FONT_ADORNMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontCharset() <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontCharset() <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharset()
	 * @generated
	 * @ordered
	 */
	protected String fontCharset = FONT_CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontCharsetAsian() <em>Font Charset Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharsetAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_CHARSET_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontCharsetAsian() <em>Font Charset Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharsetAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontCharsetAsian = FONT_CHARSET_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontCharsetComplex() <em>Font Charset Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharsetComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_CHARSET_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontCharsetComplex() <em>Font Charset Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharsetComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontCharsetComplex = FONT_CHARSET_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamilyAsian() <em>Font Family Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamilyAsian() <em>Font Family Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontFamilyAsian = FONT_FAMILY_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamilyComplex() <em>Font Family Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamilyComplex() <em>Font Family Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontFamilyComplex = FONT_FAMILY_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamilyGeneric() <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGeneric()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamilyGeneric FONT_FAMILY_GENERIC_EDEFAULT = FontFamilyGeneric.ROMAN;

	/**
	 * The cached value of the '{@link #getFontFamilyGeneric() <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGeneric()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyGeneric fontFamilyGeneric = FONT_FAMILY_GENERIC_EDEFAULT;

	/**
	 * This is true if the Font Family Generic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontFamilyGenericESet;

	/**
	 * The default value of the '{@link #getFontFamilyGenericAsian() <em>Font Family Generic Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGenericAsian()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamilyGeneric FONT_FAMILY_GENERIC_ASIAN_EDEFAULT = FontFamilyGeneric.ROMAN;

	/**
	 * The cached value of the '{@link #getFontFamilyGenericAsian() <em>Font Family Generic Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGenericAsian()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyGeneric fontFamilyGenericAsian = FONT_FAMILY_GENERIC_ASIAN_EDEFAULT;

	/**
	 * This is true if the Font Family Generic Asian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontFamilyGenericAsianESet;

	/**
	 * The default value of the '{@link #getFontFamilyGenericComplex() <em>Font Family Generic Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGenericComplex()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamilyGeneric FONT_FAMILY_GENERIC_COMPLEX_EDEFAULT = FontFamilyGeneric.ROMAN;

	/**
	 * The cached value of the '{@link #getFontFamilyGenericComplex() <em>Font Family Generic Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGenericComplex()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyGeneric fontFamilyGenericComplex = FONT_FAMILY_GENERIC_COMPLEX_EDEFAULT;

	/**
	 * This is true if the Font Family Generic Complex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontFamilyGenericComplexESet;

	/**
	 * The default value of the '{@link #getFontIndependentLineSpacing() <em>Font Independent Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontIndependentLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FONT_INDEPENDENT_LINE_SPACING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFontIndependentLineSpacing() <em>Font Independent Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontIndependentLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fontIndependentLineSpacing = FONT_INDEPENDENT_LINE_SPACING_EDEFAULT;

	/**
	 * This is true if the Font Independent Line Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontIndependentLineSpacingESet;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontNameAsian() <em>Font Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontNameAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontNameAsian() <em>Font Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontNameAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontNameAsian = FONT_NAME_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontNameComplex() <em>Font Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontNameComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontNameComplex() <em>Font Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontNameComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontNameComplex = FONT_NAME_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontPitch() <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitch()
	 * @generated
	 * @ordered
	 */
	protected static final FontPitch FONT_PITCH_EDEFAULT = FontPitch.FIXED;

	/**
	 * The cached value of the '{@link #getFontPitch() <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitch()
	 * @generated
	 * @ordered
	 */
	protected FontPitch fontPitch = FONT_PITCH_EDEFAULT;

	/**
	 * This is true if the Font Pitch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontPitchESet;

	/**
	 * The default value of the '{@link #getFontPitchAsian() <em>Font Pitch Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitchAsian()
	 * @generated
	 * @ordered
	 */
	protected static final FontPitch FONT_PITCH_ASIAN_EDEFAULT = FontPitch.FIXED;

	/**
	 * The cached value of the '{@link #getFontPitchAsian() <em>Font Pitch Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitchAsian()
	 * @generated
	 * @ordered
	 */
	protected FontPitch fontPitchAsian = FONT_PITCH_ASIAN_EDEFAULT;

	/**
	 * This is true if the Font Pitch Asian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontPitchAsianESet;

	/**
	 * The default value of the '{@link #getFontPitchComplex() <em>Font Pitch Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitchComplex()
	 * @generated
	 * @ordered
	 */
	protected static final FontPitch FONT_PITCH_COMPLEX_EDEFAULT = FontPitch.FIXED;

	/**
	 * The cached value of the '{@link #getFontPitchComplex() <em>Font Pitch Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitchComplex()
	 * @generated
	 * @ordered
	 */
	protected FontPitch fontPitchComplex = FONT_PITCH_COMPLEX_EDEFAULT;

	/**
	 * This is true if the Font Pitch Complex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontPitchComplexESet;

	/**
	 * The default value of the '{@link #getFontRelief() <em>Font Relief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontRelief()
	 * @generated
	 * @ordered
	 */
	protected static final FontReliefType FONT_RELIEF_EDEFAULT = FontReliefType.NONE;

	/**
	 * The cached value of the '{@link #getFontRelief() <em>Font Relief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontRelief()
	 * @generated
	 * @ordered
	 */
	protected FontReliefType fontRelief = FONT_RELIEF_EDEFAULT;

	/**
	 * This is true if the Font Relief attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontReliefESet;

	/**
	 * The default value of the '{@link #getFontSizeAsian() <em>Font Size Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeAsian() <em>Font Size Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeAsian = FONT_SIZE_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSizeComplex() <em>Font Size Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeComplex() <em>Font Size Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeComplex = FONT_SIZE_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSizeRel() <em>Font Size Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRel()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeRel() <em>Font Size Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRel()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeRel = FONT_SIZE_REL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSizeRelAsian() <em>Font Size Rel Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRelAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_REL_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeRelAsian() <em>Font Size Rel Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRelAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeRelAsian = FONT_SIZE_REL_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSizeRelComplex() <em>Font Size Rel Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRelComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_REL_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSizeRelComplex() <em>Font Size Rel Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSizeRelComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontSizeRelComplex = FONT_SIZE_REL_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyleAsian() <em>Font Style Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleAsian()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_ASIAN_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStyleAsian() <em>Font Style Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleAsian()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyleAsian = FONT_STYLE_ASIAN_EDEFAULT;

	/**
	 * This is true if the Font Style Asian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleAsianESet;

	/**
	 * The default value of the '{@link #getFontStyleComplex() <em>Font Style Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleComplex()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_COMPLEX_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStyleComplex() <em>Font Style Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleComplex()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyleComplex = FONT_STYLE_COMPLEX_EDEFAULT;

	/**
	 * This is true if the Font Style Complex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleComplexESet;

	/**
	 * The default value of the '{@link #getFontStyleName() <em>Font Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyleName() <em>Font Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleName()
	 * @generated
	 * @ordered
	 */
	protected String fontStyleName = FONT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyleNameAsian() <em>Font Style Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleNameAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_NAME_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyleNameAsian() <em>Font Style Name Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleNameAsian()
	 * @generated
	 * @ordered
	 */
	protected String fontStyleNameAsian = FONT_STYLE_NAME_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyleNameComplex() <em>Font Style Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleNameComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_NAME_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontStyleNameComplex() <em>Font Style Name Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyleNameComplex()
	 * @generated
	 * @ordered
	 */
	protected String fontStyleNameComplex = FONT_STYLE_NAME_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontWeightAsian() <em>Font Weight Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeightAsian()
	 * @generated
	 * @ordered
	 */
	protected static final FontWeight FONT_WEIGHT_ASIAN_EDEFAULT = FontWeight.NORMAL;

	/**
	 * The cached value of the '{@link #getFontWeightAsian() <em>Font Weight Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeightAsian()
	 * @generated
	 * @ordered
	 */
	protected FontWeight fontWeightAsian = FONT_WEIGHT_ASIAN_EDEFAULT;

	/**
	 * This is true if the Font Weight Asian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontWeightAsianESet;

	/**
	 * The default value of the '{@link #getFontWeightComplex() <em>Font Weight Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeightComplex()
	 * @generated
	 * @ordered
	 */
	protected static final FontWeight FONT_WEIGHT_COMPLEX_EDEFAULT = FontWeight.NORMAL;

	/**
	 * The cached value of the '{@link #getFontWeightComplex() <em>Font Weight Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeightComplex()
	 * @generated
	 * @ordered
	 */
	protected FontWeight fontWeightComplex = FONT_WEIGHT_COMPLEX_EDEFAULT;

	/**
	 * This is true if the Font Weight Complex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontWeightComplexESet;

	/**
	 * The default value of the '{@link #getFootnoteMaxHeight() <em>Footnote Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootnoteMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTNOTE_MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFootnoteMaxHeight() <em>Footnote Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootnoteMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected String footnoteMaxHeight = FOOTNOTE_MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlyphOrientationVertical() <em>Glyph Orientation Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphOrientationVertical()
	 * @generated
	 * @ordered
	 */
	protected static final GlyphOrientationVerticalType GLYPH_ORIENTATION_VERTICAL_EDEFAULT = GlyphOrientationVerticalType.AUTO;

	/**
	 * The cached value of the '{@link #getGlyphOrientationVertical() <em>Glyph Orientation Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphOrientationVertical()
	 * @generated
	 * @ordered
	 */
	protected GlyphOrientationVerticalType glyphOrientationVertical = GLYPH_ORIENTATION_VERTICAL_EDEFAULT;

	/**
	 * This is true if the Glyph Orientation Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean glyphOrientationVerticalESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalPos() <em>Horizontal Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPos()
	 * @generated
	 * @ordered
	 */
	protected static final HorizontalPosType HORIZONTAL_POS_EDEFAULT = HorizontalPosType.LEFT;

	/**
	 * The cached value of the '{@link #getHorizontalPos() <em>Horizontal Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPos()
	 * @generated
	 * @ordered
	 */
	protected HorizontalPosType horizontalPos = HORIZONTAL_POS_EDEFAULT;

	/**
	 * This is true if the Horizontal Pos attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalPosESet;

	/**
	 * The default value of the '{@link #getHorizontalRel() <em>Horizontal Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalRel()
	 * @generated
	 * @ordered
	 */
	protected static final HorizontalRelType HORIZONTAL_REL_EDEFAULT = HorizontalRelType.PAGE;

	/**
	 * The cached value of the '{@link #getHorizontalRel() <em>Horizontal Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalRel()
	 * @generated
	 * @ordered
	 */
	protected HorizontalRelType horizontalRel = HORIZONTAL_REL_EDEFAULT;

	/**
	 * This is true if the Horizontal Rel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalRelESet;

	/**
	 * The default value of the '{@link #getJustifySingleWord() <em>Justify Single Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifySingleWord()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean JUSTIFY_SINGLE_WORD_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getJustifySingleWord() <em>Justify Single Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifySingleWord()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean justifySingleWord = JUSTIFY_SINGLE_WORD_EDEFAULT;

	/**
	 * This is true if the Justify Single Word attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean justifySingleWordESet;

	/**
	 * The default value of the '{@link #getLanguageAsian() <em>Language Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageAsian()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_ASIAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageAsian() <em>Language Asian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageAsian()
	 * @generated
	 * @ordered
	 */
	protected String languageAsian = LANGUAGE_ASIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageComplex() <em>Language Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageComplex()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_COMPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageComplex() <em>Language Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageComplex()
	 * @generated
	 * @ordered
	 */
	protected String languageComplex = LANGUAGE_COMPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutGridBaseHeight() <em>Layout Grid Base Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridBaseHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_GRID_BASE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutGridBaseHeight() <em>Layout Grid Base Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridBaseHeight()
	 * @generated
	 * @ordered
	 */
	protected String layoutGridBaseHeight = LAYOUT_GRID_BASE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutGridColor() <em>Layout Grid Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_GRID_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutGridColor() <em>Layout Grid Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridColor()
	 * @generated
	 * @ordered
	 */
	protected String layoutGridColor = LAYOUT_GRID_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutGridDisplay() <em>Layout Grid Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LAYOUT_GRID_DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLayoutGridDisplay() <em>Layout Grid Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean layoutGridDisplay = LAYOUT_GRID_DISPLAY_EDEFAULT;

	/**
	 * This is true if the Layout Grid Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutGridDisplayESet;

	/**
	 * The default value of the '{@link #getLayoutGridLines() <em>Layout Grid Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridLines()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAYOUT_GRID_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutGridLines() <em>Layout Grid Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridLines()
	 * @generated
	 * @ordered
	 */
	protected BigInteger layoutGridLines = LAYOUT_GRID_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutGridMode() <em>Layout Grid Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridMode()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutGridModeType LAYOUT_GRID_MODE_EDEFAULT = LayoutGridModeType.NONE;

	/**
	 * The cached value of the '{@link #getLayoutGridMode() <em>Layout Grid Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridMode()
	 * @generated
	 * @ordered
	 */
	protected LayoutGridModeType layoutGridMode = LAYOUT_GRID_MODE_EDEFAULT;

	/**
	 * This is true if the Layout Grid Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutGridModeESet;

	/**
	 * The default value of the '{@link #getLayoutGridPrint() <em>Layout Grid Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridPrint()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LAYOUT_GRID_PRINT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLayoutGridPrint() <em>Layout Grid Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridPrint()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean layoutGridPrint = LAYOUT_GRID_PRINT_EDEFAULT;

	/**
	 * This is true if the Layout Grid Print attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutGridPrintESet;

	/**
	 * The default value of the '{@link #getLayoutGridRubyBelow() <em>Layout Grid Ruby Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridRubyBelow()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LAYOUT_GRID_RUBY_BELOW_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLayoutGridRubyBelow() <em>Layout Grid Ruby Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridRubyBelow()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean layoutGridRubyBelow = LAYOUT_GRID_RUBY_BELOW_EDEFAULT;

	/**
	 * This is true if the Layout Grid Ruby Below attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutGridRubyBelowESet;

	/**
	 * The default value of the '{@link #getLayoutGridRubyHeight() <em>Layout Grid Ruby Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridRubyHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_GRID_RUBY_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutGridRubyHeight() <em>Layout Grid Ruby Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutGridRubyHeight()
	 * @generated
	 * @ordered
	 */
	protected String layoutGridRubyHeight = LAYOUT_GRID_RUBY_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderChar() <em>Leader Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderChar()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderChar() <em>Leader Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderChar()
	 * @generated
	 * @ordered
	 */
	protected String leaderChar = LEADER_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderColor() <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object LEADER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderColor() <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderColor()
	 * @generated
	 * @ordered
	 */
	protected Object leaderColor = LEADER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderStyle() <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LEADER_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getLeaderStyle() <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle leaderStyle = LEADER_STYLE_EDEFAULT;

	/**
	 * This is true if the Leader Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leaderStyleESet;

	/**
	 * The default value of the '{@link #getLeaderText() <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderText()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderText() <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderText()
	 * @generated
	 * @ordered
	 */
	protected String leaderText = LEADER_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderTextStyle() <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderTextStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_TEXT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderTextStyle() <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderTextStyle()
	 * @generated
	 * @ordered
	 */
	protected String leaderTextStyle = LEADER_TEXT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderType() <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType LEADER_TYPE_EDEFAULT = LineType.NONE;

	/**
	 * The cached value of the '{@link #getLeaderType() <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderType()
	 * @generated
	 * @ordered
	 */
	protected LineType leaderType = LEADER_TYPE_EDEFAULT;

	/**
	 * This is true if the Leader Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leaderTypeESet;

	/**
	 * The default value of the '{@link #getLeaderWidth() <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object LEADER_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderWidth() <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderWidth()
	 * @generated
	 * @ordered
	 */
	protected Object leaderWidth = LEADER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegendExpansion() <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansion()
	 * @generated
	 * @ordered
	 */
	protected static final LegendExpansionType LEGEND_EXPANSION_EDEFAULT = LegendExpansionType.WIDE;

	/**
	 * The cached value of the '{@link #getLegendExpansion() <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansion()
	 * @generated
	 * @ordered
	 */
	protected LegendExpansionType legendExpansion = LEGEND_EXPANSION_EDEFAULT;

	/**
	 * This is true if the Legend Expansion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendExpansionESet;

	/**
	 * The default value of the '{@link #getLegendExpansionAspectRatio() <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegendExpansionAspectRatio() <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected double legendExpansionAspectRatio = LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT;

	/**
	 * This is true if the Legend Expansion Aspect Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendExpansionAspectRatioESet;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Object LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Object length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLetterKerning() <em>Letter Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterKerning()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LETTER_KERNING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLetterKerning() <em>Letter Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterKerning()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean letterKerning = LETTER_KERNING_EDEFAULT;

	/**
	 * This is true if the Letter Kerning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean letterKerningESet;

	/**
	 * The default value of the '{@link #getLineBreak() <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBreak()
	 * @generated
	 * @ordered
	 */
	protected static final LineBreakType LINE_BREAK_EDEFAULT = LineBreakType.NORMAL;

	/**
	 * The cached value of the '{@link #getLineBreak() <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBreak()
	 * @generated
	 * @ordered
	 */
	protected LineBreakType lineBreak = LINE_BREAK_EDEFAULT;

	/**
	 * This is true if the Line Break attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineBreakESet;

	/**
	 * The default value of the '{@link #getLineHeightAtLeast() <em>Line Height At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeightAtLeast()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_HEIGHT_AT_LEAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineHeightAtLeast() <em>Line Height At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeightAtLeast()
	 * @generated
	 * @ordered
	 */
	protected String lineHeightAtLeast = LINE_HEIGHT_AT_LEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lines = LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSpacing() <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSpacing() <em>Line Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSpacing()
	 * @generated
	 * @ordered
	 */
	protected String lineSpacing = LINE_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * This is true if the Line Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineStyleESet;

	/**
	 * The default value of the '{@link #getListStyleName() <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListStyleName() <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleName()
	 * @generated
	 * @ordered
	 */
	protected String listStyleName = LIST_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected String masterPageName = MASTER_PAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMayBreakBetweenRows() <em>May Break Between Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayBreakBetweenRows()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MAY_BREAK_BETWEEN_ROWS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMayBreakBetweenRows() <em>May Break Between Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayBreakBetweenRows()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mayBreakBetweenRows = MAY_BREAK_BETWEEN_ROWS_EDEFAULT;

	/**
	 * This is true if the May Break Between Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mayBreakBetweenRowsESet;

	/**
	 * The default value of the '{@link #getMinRowHeight() <em>Min Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRowHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_ROW_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRowHeight() <em>Min Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRowHeight()
	 * @generated
	 * @ordered
	 */
	protected String minRowHeight = MIN_ROW_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMirror() <em>Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirror()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIRROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMirror() <em>Mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirror()
	 * @generated
	 * @ordered
	 */
	protected Object mirror = MIRROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String nextStyleName = NEXT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberWrappedParagraphs() <em>Number Wrapped Paragraphs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberWrappedParagraphs()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUMBER_WRAPPED_PARAGRAPHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberWrappedParagraphs() <em>Number Wrapped Paragraphs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberWrappedParagraphs()
	 * @generated
	 * @ordered
	 */
	protected Object numberWrappedParagraphs = NUMBER_WRAPPED_PARAGRAPHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUM_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected Object numFormat = NUM_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean NUM_LETTER_SYNC_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean numLetterSync = NUM_LETTER_SYNC_EDEFAULT;

	/**
	 * This is true if the Num Letter Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numLetterSyncESet;

	/**
	 * The default value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected String numPrefix = NUM_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected String numSuffix = NUM_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverflowBehavior() <em>Overflow Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflowBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final OverflowBehaviorType OVERFLOW_BEHAVIOR_EDEFAULT = OverflowBehaviorType.CLIP;

	/**
	 * The cached value of the '{@link #getOverflowBehavior() <em>Overflow Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflowBehavior()
	 * @generated
	 * @ordered
	 */
	protected OverflowBehaviorType overflowBehavior = OVERFLOW_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Overflow Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overflowBehaviorESet;

	/**
	 * The default value of the '{@link #getPageLayoutName() <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_LAYOUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageLayoutName() <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected String pageLayoutName = PAGE_LAYOUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Object PAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected Object pageNumber = PAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageUsage() <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageUsage()
	 * @generated
	 * @ordered
	 */
	protected static final PageUsageType PAGE_USAGE_EDEFAULT = PageUsageType.ALL;

	/**
	 * The cached value of the '{@link #getPageUsage() <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageUsage()
	 * @generated
	 * @ordered
	 */
	protected PageUsageType pageUsage = PAGE_USAGE_EDEFAULT;

	/**
	 * This is true if the Page Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageUsageESet;

	/**
	 * The default value of the '{@link #getPaperTrayName() <em>Paper Tray Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperTrayName()
	 * @generated
	 * @ordered
	 */
	protected static final Object PAPER_TRAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaperTrayName() <em>Paper Tray Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperTrayName()
	 * @generated
	 * @ordered
	 */
	protected Object paperTrayName = PAPER_TRAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentStyleName() <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentStyleName() <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStyleName()
	 * @generated
	 * @ordered
	 */
	protected String parentStyleName = PARENT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected static final List<PrintTypeItem> PRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected List<PrintTypeItem> print = PRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrintContent() <em>Print Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRINT_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrintContent() <em>Print Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean printContent = PRINT_CONTENT_EDEFAULT;

	/**
	 * This is true if the Print Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printContentESet;

	/**
	 * The default value of the '{@link #getPrintOrientation() <em>Print Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final PrintOrientationType PRINT_ORIENTATION_EDEFAULT = PrintOrientationType.PORTRAIT;

	/**
	 * The cached value of the '{@link #getPrintOrientation() <em>Print Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintOrientation()
	 * @generated
	 * @ordered
	 */
	protected PrintOrientationType printOrientation = PRINT_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Print Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printOrientationESet;

	/**
	 * The default value of the '{@link #getPrintPageOrder() <em>Print Page Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintPageOrder()
	 * @generated
	 * @ordered
	 */
	protected static final PrintPageOrderType PRINT_PAGE_ORDER_EDEFAULT = PrintPageOrderType.TTB;

	/**
	 * The cached value of the '{@link #getPrintPageOrder() <em>Print Page Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintPageOrder()
	 * @generated
	 * @ordered
	 */
	protected PrintPageOrderType printPageOrder = PRINT_PAGE_ORDER_EDEFAULT;

	/**
	 * This is true if the Print Page Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printPageOrderESet;

	/**
	 * The default value of the '{@link #getPunctuationWrap() <em>Punctuation Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuationWrap()
	 * @generated
	 * @ordered
	 */
	protected static final PunctuationWrapType PUNCTUATION_WRAP_EDEFAULT = PunctuationWrapType.SIMPLE;

	/**
	 * The cached value of the '{@link #getPunctuationWrap() <em>Punctuation Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunctuationWrap()
	 * @generated
	 * @ordered
	 */
	protected PunctuationWrapType punctuationWrap = PUNCTUATION_WRAP_EDEFAULT;

	/**
	 * This is true if the Punctuation Wrap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean punctuationWrapESet;

	/**
	 * The default value of the '{@link #getRegisterTrue() <em>Register True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterTrue()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean REGISTER_TRUE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRegisterTrue() <em>Register True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterTrue()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean registerTrue = REGISTER_TRUE_EDEFAULT;

	/**
	 * This is true if the Register True attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean registerTrueESet;

	/**
	 * The default value of the '{@link #getRegisterTruthRefStyleName() <em>Register Truth Ref Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterTruthRefStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_TRUTH_REF_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterTruthRefStyleName() <em>Register Truth Ref Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterTruthRefStyleName()
	 * @generated
	 * @ordered
	 */
	protected String registerTruthRefStyleName = REGISTER_TRUTH_REF_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelColumnWidth() <em>Rel Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_COLUMN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelColumnWidth() <em>Rel Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected String relColumnWidth = REL_COLUMN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelHeight() <em>Rel Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object REL_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelHeight() <em>Rel Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeight()
	 * @generated
	 * @ordered
	 */
	protected Object relHeight = REL_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final RepeatType REPEAT_EDEFAULT = RepeatType.NO_REPEAT;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected RepeatType repeat = REPEAT_EDEFAULT;

	/**
	 * This is true if the Repeat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatESet;

	/**
	 * The default value of the '{@link #getRepeatContent() <em>Repeat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean REPEAT_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRepeatContent() <em>Repeat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean repeatContent = REPEAT_CONTENT_EDEFAULT;

	/**
	 * This is true if the Repeat Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatContentESet;

	/**
	 * The default value of the '{@link #getRotationAlign() <em>Rotation Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationAlign()
	 * @generated
	 * @ordered
	 */
	protected static final RotationAlignType ROTATION_ALIGN_EDEFAULT = RotationAlignType.NONE;

	/**
	 * The cached value of the '{@link #getRotationAlign() <em>Rotation Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationAlign()
	 * @generated
	 * @ordered
	 */
	protected RotationAlignType rotationAlign = ROTATION_ALIGN_EDEFAULT;

	/**
	 * This is true if the Rotation Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationAlignESet;

	/**
	 * The default value of the '{@link #getRotationAngle() <em>Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROTATION_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationAngle() <em>Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rotationAngle = ROTATION_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowHeight() <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowHeight() <em>Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowHeight()
	 * @generated
	 * @ordered
	 */
	protected String rowHeight = ROW_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRubyAlign() <em>Ruby Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyAlign()
	 * @generated
	 * @ordered
	 */
	protected static final RubyAlignType RUBY_ALIGN_EDEFAULT = RubyAlignType.LEFT;

	/**
	 * The cached value of the '{@link #getRubyAlign() <em>Ruby Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyAlign()
	 * @generated
	 * @ordered
	 */
	protected RubyAlignType rubyAlign = RUBY_ALIGN_EDEFAULT;

	/**
	 * This is true if the Ruby Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rubyAlignESet;

	/**
	 * The default value of the '{@link #getRubyPosition() <em>Ruby Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyPosition()
	 * @generated
	 * @ordered
	 */
	protected static final RubyPositionType RUBY_POSITION_EDEFAULT = RubyPositionType.ABOVE;

	/**
	 * The cached value of the '{@link #getRubyPosition() <em>Ruby Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyPosition()
	 * @generated
	 * @ordered
	 */
	protected RubyPositionType rubyPosition = RUBY_POSITION_EDEFAULT;

	/**
	 * This is true if the Ruby Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rubyPositionESet;

	/**
	 * The default value of the '{@link #getRunThrough() <em>Run Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunThrough()
	 * @generated
	 * @ordered
	 */
	protected static final RunThroughType RUN_THROUGH_EDEFAULT = RunThroughType.FOREGROUND;

	/**
	 * The cached value of the '{@link #getRunThrough() <em>Run Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunThrough()
	 * @generated
	 * @ordered
	 */
	protected RunThroughType runThrough = RUN_THROUGH_EDEFAULT;

	/**
	 * This is true if the Run Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean runThroughESet;

	/**
	 * The default value of the '{@link #getScaleTo() <em>Scale To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleTo()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleTo() <em>Scale To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleTo()
	 * @generated
	 * @ordered
	 */
	protected String scaleTo = SCALE_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleToPages() <em>Scale To Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleToPages()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SCALE_TO_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleToPages() <em>Scale To Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleToPages()
	 * @generated
	 * @ordered
	 */
	protected BigInteger scaleToPages = SCALE_TO_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptTypeType SCRIPT_TYPE_EDEFAULT = ScriptTypeType.LATIN;

	/**
	 * The cached value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected ScriptTypeType scriptType = SCRIPT_TYPE_EDEFAULT;

	/**
	 * This is true if the Script Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scriptTypeESet;

	/**
	 * The default value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected static final Object SHADOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected Object shadow = SHADOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getShrinkToFit() <em>Shrink To Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShrinkToFit()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHRINK_TO_FIT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShrinkToFit() <em>Shrink To Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShrinkToFit()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean shrinkToFit = SHRINK_TO_FIT_EDEFAULT;

	/**
	 * This is true if the Shrink To Fit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shrinkToFitESet;

	/**
	 * The default value of the '{@link #getSnapToLayoutGrid() <em>Snap To Layout Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapToLayoutGrid()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SNAP_TO_LAYOUT_GRID_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSnapToLayoutGrid() <em>Snap To Layout Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapToLayoutGrid()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean snapToLayoutGrid = SNAP_TO_LAYOUT_GRID_EDEFAULT;

	/**
	 * This is true if the Snap To Layout Grid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean snapToLayoutGridESet;

	/**
	 * The default value of the '{@link #getStyle1() <em>Style1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle1()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE1_EDEFAULT = StyleType.NONE;

	/**
	 * The cached value of the '{@link #getStyle1() <em>Style1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle1()
	 * @generated
	 * @ordered
	 */
	protected StyleType style1 = STYLE1_EDEFAULT;

	/**
	 * This is true if the Style1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean style1ESet;

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
	 * The default value of the '{@link #getTableCentering() <em>Table Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCentering()
	 * @generated
	 * @ordered
	 */
	protected static final TableCenteringType TABLE_CENTERING_EDEFAULT = TableCenteringType.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getTableCentering() <em>Table Centering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCentering()
	 * @generated
	 * @ordered
	 */
	protected TableCenteringType tableCentering = TABLE_CENTERING_EDEFAULT;

	/**
	 * This is true if the Table Centering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableCenteringESet;

	/**
	 * The default value of the '{@link #getTabStopDistance() <em>Tab Stop Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStopDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_STOP_DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabStopDistance() <em>Tab Stop Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStopDistance()
	 * @generated
	 * @ordered
	 */
	protected String tabStopDistance = TAB_STOP_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlignSource() <em>Text Align Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignSource()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlignSourceType TEXT_ALIGN_SOURCE_EDEFAULT = TextAlignSourceType.FIX;

	/**
	 * The cached value of the '{@link #getTextAlignSource() <em>Text Align Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignSource()
	 * @generated
	 * @ordered
	 */
	protected TextAlignSourceType textAlignSource = TEXT_ALIGN_SOURCE_EDEFAULT;

	/**
	 * This is true if the Text Align Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textAlignSourceESet;

	/**
	 * The default value of the '{@link #getTextAutospace() <em>Text Autospace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAutospace()
	 * @generated
	 * @ordered
	 */
	protected static final TextAutospaceType TEXT_AUTOSPACE_EDEFAULT = TextAutospaceType.NONE;

	/**
	 * The cached value of the '{@link #getTextAutospace() <em>Text Autospace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAutospace()
	 * @generated
	 * @ordered
	 */
	protected TextAutospaceType textAutospace = TEXT_AUTOSPACE_EDEFAULT;

	/**
	 * This is true if the Text Autospace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textAutospaceESet;

	/**
	 * The default value of the '{@link #getTextBlinking() <em>Text Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBlinking()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_BLINKING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextBlinking() <em>Text Blinking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBlinking()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textBlinking = TEXT_BLINKING_EDEFAULT;

	/**
	 * This is true if the Text Blinking attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textBlinkingESet;

	/**
	 * The default value of the '{@link #getTextCombine() <em>Text Combine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombine()
	 * @generated
	 * @ordered
	 */
	protected static final TextCombineType TEXT_COMBINE_EDEFAULT = TextCombineType.NONE;

	/**
	 * The cached value of the '{@link #getTextCombine() <em>Text Combine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombine()
	 * @generated
	 * @ordered
	 */
	protected TextCombineType textCombine = TEXT_COMBINE_EDEFAULT;

	/**
	 * This is true if the Text Combine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textCombineESet;

	/**
	 * The default value of the '{@link #getTextCombineEndChar() <em>Text Combine End Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombineEndChar()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COMBINE_END_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextCombineEndChar() <em>Text Combine End Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombineEndChar()
	 * @generated
	 * @ordered
	 */
	protected String textCombineEndChar = TEXT_COMBINE_END_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextCombineStartChar() <em>Text Combine Start Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombineStartChar()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COMBINE_START_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextCombineStartChar() <em>Text Combine Start Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCombineStartChar()
	 * @generated
	 * @ordered
	 */
	protected String textCombineStartChar = TEXT_COMBINE_START_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextEmphasize() <em>Text Emphasize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEmphasize()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_EMPHASIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextEmphasize() <em>Text Emphasize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEmphasize()
	 * @generated
	 * @ordered
	 */
	protected Object textEmphasize = TEXT_EMPHASIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextLineThroughColor() <em>Text Line Through Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_LINE_THROUGH_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextLineThroughColor() <em>Text Line Through Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughColor()
	 * @generated
	 * @ordered
	 */
	protected Object textLineThroughColor = TEXT_LINE_THROUGH_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextLineThroughMode() <em>Text Line Through Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughMode()
	 * @generated
	 * @ordered
	 */
	protected static final LineMode TEXT_LINE_THROUGH_MODE_EDEFAULT = LineMode.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getTextLineThroughMode() <em>Text Line Through Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughMode()
	 * @generated
	 * @ordered
	 */
	protected LineMode textLineThroughMode = TEXT_LINE_THROUGH_MODE_EDEFAULT;

	/**
	 * This is true if the Text Line Through Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textLineThroughModeESet;

	/**
	 * The default value of the '{@link #getTextLineThroughStyle() <em>Text Line Through Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle TEXT_LINE_THROUGH_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getTextLineThroughStyle() <em>Text Line Through Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle textLineThroughStyle = TEXT_LINE_THROUGH_STYLE_EDEFAULT;

	/**
	 * This is true if the Text Line Through Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textLineThroughStyleESet;

	/**
	 * The default value of the '{@link #getTextLineThroughText() <em>Text Line Through Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_LINE_THROUGH_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextLineThroughText() <em>Text Line Through Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughText()
	 * @generated
	 * @ordered
	 */
	protected String textLineThroughText = TEXT_LINE_THROUGH_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextLineThroughTextStyle() <em>Text Line Through Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughTextStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_LINE_THROUGH_TEXT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextLineThroughTextStyle() <em>Text Line Through Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughTextStyle()
	 * @generated
	 * @ordered
	 */
	protected String textLineThroughTextStyle = TEXT_LINE_THROUGH_TEXT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextLineThroughType() <em>Text Line Through Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType TEXT_LINE_THROUGH_TYPE_EDEFAULT = LineType.NONE;

	/**
	 * The cached value of the '{@link #getTextLineThroughType() <em>Text Line Through Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughType()
	 * @generated
	 * @ordered
	 */
	protected LineType textLineThroughType = TEXT_LINE_THROUGH_TYPE_EDEFAULT;

	/**
	 * This is true if the Text Line Through Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textLineThroughTypeESet;

	/**
	 * The default value of the '{@link #getTextLineThroughWidth() <em>Text Line Through Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_LINE_THROUGH_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextLineThroughWidth() <em>Text Line Through Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLineThroughWidth()
	 * @generated
	 * @ordered
	 */
	protected Object textLineThroughWidth = TEXT_LINE_THROUGH_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOutline() <em>Text Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOutline()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_OUTLINE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextOutline() <em>Text Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOutline()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textOutline = TEXT_OUTLINE_EDEFAULT;

	/**
	 * This is true if the Text Outline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textOutlineESet;

	/**
	 * The default value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
	protected static final List TEXT_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
	protected List textPosition = TEXT_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextRotationAngle() <em>Text Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TEXT_ROTATION_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextRotationAngle() <em>Text Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger textRotationAngle = TEXT_ROTATION_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextRotationScale() <em>Text Rotation Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotationScale()
	 * @generated
	 * @ordered
	 */
	protected static final TextRotationScaleType TEXT_ROTATION_SCALE_EDEFAULT = TextRotationScaleType.FIXED;

	/**
	 * The cached value of the '{@link #getTextRotationScale() <em>Text Rotation Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotationScale()
	 * @generated
	 * @ordered
	 */
	protected TextRotationScaleType textRotationScale = TEXT_ROTATION_SCALE_EDEFAULT;

	/**
	 * This is true if the Text Rotation Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textRotationScaleESet;

	/**
	 * The default value of the '{@link #getTextScale() <em>Text Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextScale()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextScale() <em>Text Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextScale()
	 * @generated
	 * @ordered
	 */
	protected String textScale = TEXT_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextUnderlineColor() <em>Text Underline Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_UNDERLINE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextUnderlineColor() <em>Text Underline Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineColor()
	 * @generated
	 * @ordered
	 */
	protected Object textUnderlineColor = TEXT_UNDERLINE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextUnderlineMode() <em>Text Underline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineMode()
	 * @generated
	 * @ordered
	 */
	protected static final LineMode TEXT_UNDERLINE_MODE_EDEFAULT = LineMode.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getTextUnderlineMode() <em>Text Underline Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineMode()
	 * @generated
	 * @ordered
	 */
	protected LineMode textUnderlineMode = TEXT_UNDERLINE_MODE_EDEFAULT;

	/**
	 * This is true if the Text Underline Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textUnderlineModeESet;

	/**
	 * The default value of the '{@link #getTextUnderlineStyle() <em>Text Underline Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle TEXT_UNDERLINE_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getTextUnderlineStyle() <em>Text Underline Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle textUnderlineStyle = TEXT_UNDERLINE_STYLE_EDEFAULT;

	/**
	 * This is true if the Text Underline Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textUnderlineStyleESet;

	/**
	 * The default value of the '{@link #getTextUnderlineType() <em>Text Underline Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType TEXT_UNDERLINE_TYPE_EDEFAULT = LineType.NONE;

	/**
	 * The cached value of the '{@link #getTextUnderlineType() <em>Text Underline Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineType()
	 * @generated
	 * @ordered
	 */
	protected LineType textUnderlineType = TEXT_UNDERLINE_TYPE_EDEFAULT;

	/**
	 * This is true if the Text Underline Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textUnderlineTypeESet;

	/**
	 * The default value of the '{@link #getTextUnderlineWidth() <em>Text Underline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_UNDERLINE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextUnderlineWidth() <em>Text Underline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUnderlineWidth()
	 * @generated
	 * @ordered
	 */
	protected Object textUnderlineWidth = TEXT_UNDERLINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseOptimalColumnWidth() <em>Use Optimal Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOptimalColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_OPTIMAL_COLUMN_WIDTH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseOptimalColumnWidth() <em>Use Optimal Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOptimalColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useOptimalColumnWidth = USE_OPTIMAL_COLUMN_WIDTH_EDEFAULT;

	/**
	 * This is true if the Use Optimal Column Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOptimalColumnWidthESet;

	/**
	 * The default value of the '{@link #getUseOptimalRowHeight() <em>Use Optimal Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOptimalRowHeight()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_OPTIMAL_ROW_HEIGHT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseOptimalRowHeight() <em>Use Optimal Row Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOptimalRowHeight()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useOptimalRowHeight = USE_OPTIMAL_ROW_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Use Optimal Row Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOptimalRowHeightESet;

	/**
	 * The default value of the '{@link #getUseWindowFontColor() <em>Use Window Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseWindowFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_WINDOW_FONT_COLOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseWindowFontColor() <em>Use Window Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseWindowFontColor()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useWindowFontColor = USE_WINDOW_FONT_COLOR_EDEFAULT;

	/**
	 * This is true if the Use Window Font Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useWindowFontColorESet;

	/**
	 * The default value of the '{@link #getVerticalPos() <em>Vertical Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPos()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalPosType VERTICAL_POS_EDEFAULT = VerticalPosType.TOP;

	/**
	 * The cached value of the '{@link #getVerticalPos() <em>Vertical Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPos()
	 * @generated
	 * @ordered
	 */
	protected VerticalPosType verticalPos = VERTICAL_POS_EDEFAULT;

	/**
	 * This is true if the Vertical Pos attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalPosESet;

	/**
	 * The default value of the '{@link #getVerticalRel() <em>Vertical Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalRel()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalRelType VERTICAL_REL_EDEFAULT = VerticalRelType.PAGE;

	/**
	 * The cached value of the '{@link #getVerticalRel() <em>Vertical Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalRel()
	 * @generated
	 * @ordered
	 */
	protected VerticalRelType verticalRel = VERTICAL_REL_EDEFAULT;

	/**
	 * This is true if the Vertical Rel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalRelESet;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VOLATILE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * This is true if the Volatile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileESet;

	/**
	 * The default value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected static final WrapType WRAP_EDEFAULT = WrapType.NONE;

	/**
	 * The cached value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected WrapType wrap = WRAP_EDEFAULT;

	/**
	 * This is true if the Wrap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapESet;

	/**
	 * The default value of the '{@link #getWrapContour() <em>Wrap Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapContour()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean WRAP_CONTOUR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getWrapContour() <em>Wrap Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapContour()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean wrapContour = WRAP_CONTOUR_EDEFAULT;

	/**
	 * This is true if the Wrap Contour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapContourESet;

	/**
	 * The default value of the '{@link #getWrapContourMode() <em>Wrap Contour Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapContourMode()
	 * @generated
	 * @ordered
	 */
	protected static final WrapContourModeType WRAP_CONTOUR_MODE_EDEFAULT = WrapContourModeType.FULL;

	/**
	 * The cached value of the '{@link #getWrapContourMode() <em>Wrap Contour Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapContourMode()
	 * @generated
	 * @ordered
	 */
	protected WrapContourModeType wrapContourMode = WRAP_CONTOUR_MODE_EDEFAULT;

	/**
	 * This is true if the Wrap Contour Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapContourModeESet;

	/**
	 * The default value of the '{@link #getWrapDynamicThreshold() <em>Wrap Dynamic Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapDynamicThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final String WRAP_DYNAMIC_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrapDynamicThreshold() <em>Wrap Dynamic Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapDynamicThreshold()
	 * @generated
	 * @ordered
	 */
	protected String wrapDynamicThreshold = WRAP_DYNAMIC_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritingMode() <em>Writing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingMode()
	 * @generated
	 * @ordered
	 */
	protected static final WritingModeType WRITING_MODE_EDEFAULT = WritingModeType.LR_TB;

	/**
	 * The cached value of the '{@link #getWritingMode() <em>Writing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingMode()
	 * @generated
	 * @ordered
	 */
	protected WritingModeType writingMode = WRITING_MODE_EDEFAULT;

	/**
	 * This is true if the Writing Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writingModeESet;

	/**
	 * The default value of the '{@link #getWritingModeAutomatic() <em>Writing Mode Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingModeAutomatic()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean WRITING_MODE_AUTOMATIC_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getWritingModeAutomatic() <em>Writing Mode Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingModeAutomatic()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean writingModeAutomatic = WRITING_MODE_AUTOMATIC_EDEFAULT;

	/**
	 * This is true if the Writing Mode Automatic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writingModeAutomaticESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, StylePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundImageType getBackgroundImage() {
		return (BackgroundImageType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_BackgroundImage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundImage(BackgroundImageType newBackgroundImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_BackgroundImage(), newBackgroundImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundImage(BackgroundImageType newBackgroundImage) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_BackgroundImage(), newBackgroundImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleChartPropertiesContent getChartProperties() {
		return (StyleChartPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_ChartProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChartProperties(StyleChartPropertiesContent newChartProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_ChartProperties(), newChartProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartProperties(StyleChartPropertiesContent newChartProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_ChartProperties(), newChartProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType getColumn() {
		return (ColumnType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Column(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(ColumnType newColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Column(), newColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(ColumnType newColumn) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Column(), newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType getColumns() {
		return (ColumnsType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Columns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType newColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Columns(), newColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType newColumns) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Columns(), newColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSepType getColumnSep() {
		return (ColumnSepType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_ColumnSep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnSep(ColumnSepType newColumnSep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_ColumnSep(), newColumnSep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSep(ColumnSepType newColumnSep) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_ColumnSep(), newColumnSep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStyleContent getDefaultStyle() {
		return (StyleStyleContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_DefaultStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultStyle(StyleStyleContent newDefaultStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_DefaultStyle(), newDefaultStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStyle(StyleStyleContent newDefaultStyle) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_DefaultStyle(), newDefaultStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleDrawingPagePropertiesContent getDrawingPageProperties() {
		return (StyleDrawingPagePropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_DrawingPageProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrawingPageProperties(StyleDrawingPagePropertiesContent newDrawingPageProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_DrawingPageProperties(), newDrawingPageProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPageProperties(StyleDrawingPagePropertiesContent newDrawingPageProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_DrawingPageProperties(), newDrawingPageProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropCapType getDropCap() {
		return (DropCapType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_DropCap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDropCap(DropCapType newDropCap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_DropCap(), newDropCap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropCap(DropCapType newDropCap) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_DropCap(), newDropCap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceType getFontFace() {
		return (FontFaceType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_FontFace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFace(FontFaceType newFontFace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_FontFace(), newFontFace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFace(FontFaceType newFontFace) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_FontFace(), newFontFace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return (FooterType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Footer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Footer(), newFooter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Footer(), newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterLeftType getFooterLeft() {
		return (FooterLeftType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_FooterLeft(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooterLeft(FooterLeftType newFooterLeft, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_FooterLeft(), newFooterLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterLeft(FooterLeftType newFooterLeft) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_FooterLeft(), newFooterLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterStyleType getFooterStyle() {
		return (FooterStyleType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_FooterStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooterStyle(FooterStyleType newFooterStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_FooterStyle(), newFooterStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterStyle(FooterStyleType newFooterStyle) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_FooterStyle(), newFooterStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnoteSepType getFootnoteSep() {
		return (FootnoteSepType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_FootnoteSep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootnoteSep(FootnoteSepType newFootnoteSep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_FootnoteSep(), newFootnoteSep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootnoteSep(FootnoteSepType newFootnoteSep) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_FootnoteSep(), newFootnoteSep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleGraphicPropertiesContent getGraphicProperties() {
		return (StyleGraphicPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_GraphicProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicProperties(StyleGraphicPropertiesContent newGraphicProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_GraphicProperties(), newGraphicProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicProperties(StyleGraphicPropertiesContent newGraphicProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_GraphicProperties(), newGraphicProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandoutMasterType getHandoutMaster() {
		return (HandoutMasterType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_HandoutMaster(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandoutMaster(HandoutMasterType newHandoutMaster, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_HandoutMaster(), newHandoutMaster, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandoutMaster(HandoutMasterType newHandoutMaster) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_HandoutMaster(), newHandoutMaster);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return (HeaderType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Header(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Header(), newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Header(), newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleHeaderFooterPropertiesContent getHeaderFooterProperties() {
		return (StyleHeaderFooterPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_HeaderFooterProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderFooterProperties(StyleHeaderFooterPropertiesContent newHeaderFooterProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_HeaderFooterProperties(), newHeaderFooterProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderFooterProperties(StyleHeaderFooterPropertiesContent newHeaderFooterProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_HeaderFooterProperties(), newHeaderFooterProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderLeftType getHeaderLeft() {
		return (HeaderLeftType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_HeaderLeft(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderLeft(HeaderLeftType newHeaderLeft, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_HeaderLeft(), newHeaderLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderLeft(HeaderLeftType newHeaderLeft) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_HeaderLeft(), newHeaderLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderStyleType getHeaderStyle() {
		return (HeaderStyleType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_HeaderStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderStyle(HeaderStyleType newHeaderStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_HeaderStyle(), newHeaderStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderStyle(HeaderStyleType newHeaderStyle) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_HeaderStyle(), newHeaderStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListLevelPropertiesContent getListLevelProperties() {
		return (StyleListLevelPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_ListLevelProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListLevelProperties(StyleListLevelPropertiesContent newListLevelProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_ListLevelProperties(), newListLevelProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListLevelProperties(StyleListLevelPropertiesContent newListLevelProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_ListLevelProperties(), newListLevelProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getMap() {
		return (MapType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Map(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(MapType newMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Map(), newMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(MapType newMap) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Map(), newMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterPageType getMasterPage() {
		return (MasterPageType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_MasterPage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterPage(MasterPageType newMasterPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_MasterPage(), newMasterPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPage(MasterPageType newMasterPage) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_MasterPage(), newMasterPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLayoutType getPageLayout() {
		return (PageLayoutType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_PageLayout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageLayout(PageLayoutType newPageLayout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_PageLayout(), newPageLayout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageLayout(PageLayoutType newPageLayout) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_PageLayout(), newPageLayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageLayoutPropertiesContent getPageLayoutProperties() {
		return (StylePageLayoutPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_PageLayoutProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageLayoutProperties(StylePageLayoutPropertiesContent newPageLayoutProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_PageLayoutProperties(), newPageLayoutProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageLayoutProperties(StylePageLayoutPropertiesContent newPageLayoutProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_PageLayoutProperties(), newPageLayoutProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent getParagraphProperties() {
		return (StyleParagraphPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_ParagraphProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphProperties(StyleParagraphPropertiesContent newParagraphProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_ParagraphProperties(), newParagraphProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphProperties(StyleParagraphPropertiesContent newParagraphProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_ParagraphProperties(), newParagraphProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPageLayoutType getPresentationPageLayout() {
		return (PresentationPageLayoutType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_PresentationPageLayout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationPageLayout(PresentationPageLayoutType newPresentationPageLayout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_PresentationPageLayout(), newPresentationPageLayout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationPageLayout(PresentationPageLayoutType newPresentationPageLayout) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_PresentationPageLayout(), newPresentationPageLayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionCenter() {
		return (RegionContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_RegionCenter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionCenter(RegionContent newRegionCenter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_RegionCenter(), newRegionCenter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionCenter(RegionContent newRegionCenter) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_RegionCenter(), newRegionCenter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionLeft() {
		return (RegionContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_RegionLeft(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionLeft(RegionContent newRegionLeft, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_RegionLeft(), newRegionLeft, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionLeft(RegionContent newRegionLeft) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_RegionLeft(), newRegionLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionRight() {
		return (RegionContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_RegionRight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionRight(RegionContent newRegionRight, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_RegionRight(), newRegionRight, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionRight(RegionContent newRegionRight) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_RegionRight(), newRegionRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleRubyPropertiesContent getRubyProperties() {
		return (StyleRubyPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_RubyProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyProperties(StyleRubyPropertiesContent newRubyProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_RubyProperties(), newRubyProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyProperties(StyleRubyPropertiesContent newRubyProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_RubyProperties(), newRubyProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSectionPropertiesContent getSectionProperties() {
		return (StyleSectionPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_SectionProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionProperties(StyleSectionPropertiesContent newSectionProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_SectionProperties(), newSectionProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionProperties(StyleSectionPropertiesContent newSectionProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_SectionProperties(), newSectionProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType1 getStyle() {
		return (StyleType1)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_Style(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleType1 newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_Style(), newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType1 newStyle) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_Style(), newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableCellPropertiesContent getTableCellProperties() {
		return (StyleTableCellPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TableCellProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCellProperties(StyleTableCellPropertiesContent newTableCellProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TableCellProperties(), newTableCellProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCellProperties(StyleTableCellPropertiesContent newTableCellProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TableCellProperties(), newTableCellProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableColumnPropertiesContent getTableColumnProperties() {
		return (StyleTableColumnPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TableColumnProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableColumnProperties(StyleTableColumnPropertiesContent newTableColumnProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TableColumnProperties(), newTableColumnProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableColumnProperties(StyleTableColumnPropertiesContent newTableColumnProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TableColumnProperties(), newTableColumnProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTablePropertiesContent getTableProperties() {
		return (StyleTablePropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TableProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableProperties(StyleTablePropertiesContent newTableProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TableProperties(), newTableProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableProperties(StyleTablePropertiesContent newTableProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TableProperties(), newTableProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableRowPropertiesContent getTableRowProperties() {
		return (StyleTableRowPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TableRowProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRowProperties(StyleTableRowPropertiesContent newTableRowProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TableRowProperties(), newTableRowProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRowProperties(StyleTableRowPropertiesContent newTableRowProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TableRowProperties(), newTableRowProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStopType getTabStop() {
		return (TabStopType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TabStop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabStop(TabStopType newTabStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TabStop(), newTabStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabStop(TabStopType newTabStop) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TabStop(), newTabStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStopsType getTabStops() {
		return (TabStopsType)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TabStops(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabStops(TabStopsType newTabStops, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TabStops(), newTabStops, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabStops(TabStopsType newTabStops) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TabStops(), newTabStops);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties() {
		return (StyleTextPropertiesContent)getMixed().get(StylePackage.eINSTANCE.getDocumentRoot_TextProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties(StyleTextPropertiesContent newTextProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StylePackage.eINSTANCE.getDocumentRoot_TextProperties(), newTextProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties(StyleTextPropertiesContent newTextProperties) {
		((FeatureMap.Internal)getMixed()).set(StylePackage.eINSTANCE.getDocumentRoot_TextProperties(), newTextProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustment(AdjustmentType newAdjustment) {
		AdjustmentType oldAdjustment = adjustment;
		adjustment = newAdjustment == null ? ADJUSTMENT_EDEFAULT : newAdjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__ADJUSTMENT, oldAdjustment, adjustment, !oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdjustment() {
		AdjustmentType oldAdjustment = adjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustment = ADJUSTMENT_EDEFAULT;
		adjustmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__ADJUSTMENT, oldAdjustment, ADJUSTMENT_EDEFAULT, oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdjustment() {
		return adjustmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplyStyleName() {
		return applyStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyStyleName(String newApplyStyleName) {
		String oldApplyStyleName = applyStyleName;
		applyStyleName = newApplyStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__APPLY_STYLE_NAME, oldApplyStyleName, applyStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoTextIndent() {
		return autoTextIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoTextIndent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoTextIndent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoTextIndent = autoTextIndent;
		autoTextIndent = newAutoTextIndent == null ? AUTO_TEXT_INDENT_EDEFAULT : newAutoTextIndent;
		boolean oldAutoTextIndentESet = autoTextIndentESet;
		autoTextIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT, oldAutoTextIndent, autoTextIndent, !oldAutoTextIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoTextIndent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoTextIndent = autoTextIndent;
		boolean oldAutoTextIndentESet = autoTextIndentESet;
		autoTextIndent = AUTO_TEXT_INDENT_EDEFAULT;
		autoTextIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT, oldAutoTextIndent, AUTO_TEXT_INDENT_EDEFAULT, oldAutoTextIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoTextIndent() {
		return autoTextIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoUpdate() {
		return autoUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoUpdate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoUpdate = autoUpdate;
		autoUpdate = newAutoUpdate == null ? AUTO_UPDATE_EDEFAULT : newAutoUpdate;
		boolean oldAutoUpdateESet = autoUpdateESet;
		autoUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__AUTO_UPDATE, oldAutoUpdate, autoUpdate, !oldAutoUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoUpdate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoUpdate = autoUpdate;
		boolean oldAutoUpdateESet = autoUpdateESet;
		autoUpdate = AUTO_UPDATE_EDEFAULT;
		autoUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__AUTO_UPDATE, oldAutoUpdate, AUTO_UPDATE_EDEFAULT, oldAutoUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoUpdate() {
		return autoUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundTransparency() {
		return backgroundTransparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundTransparency(String newBackgroundTransparency) {
		String oldBackgroundTransparency = backgroundTransparency;
		backgroundTransparency = newBackgroundTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY, oldBackgroundTransparency, backgroundTransparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseCellAddress() {
		return baseCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCellAddress(String newBaseCellAddress) {
		String oldBaseCellAddress = baseCellAddress;
		baseCellAddress = newBaseCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS, oldBaseCellAddress, baseCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBorderLineWidth() {
		return borderLineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLineWidth(List<String> newBorderLineWidth) {
		List<String> oldBorderLineWidth = borderLineWidth;
		borderLineWidth = newBorderLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH, oldBorderLineWidth, borderLineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBorderLineWidthBottom() {
		return borderLineWidthBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLineWidthBottom(List<String> newBorderLineWidthBottom) {
		List<String> oldBorderLineWidthBottom = borderLineWidthBottom;
		borderLineWidthBottom = newBorderLineWidthBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM, oldBorderLineWidthBottom, borderLineWidthBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBorderLineWidthLeft() {
		return borderLineWidthLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLineWidthLeft(List<String> newBorderLineWidthLeft) {
		List<String> oldBorderLineWidthLeft = borderLineWidthLeft;
		borderLineWidthLeft = newBorderLineWidthLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT, oldBorderLineWidthLeft, borderLineWidthLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBorderLineWidthRight() {
		return borderLineWidthRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLineWidthRight(List<String> newBorderLineWidthRight) {
		List<String> oldBorderLineWidthRight = borderLineWidthRight;
		borderLineWidthRight = newBorderLineWidthRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT, oldBorderLineWidthRight, borderLineWidthRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBorderLineWidthTop() {
		return borderLineWidthTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLineWidthTop(List<String> newBorderLineWidthTop) {
		List<String> oldBorderLineWidthTop = borderLineWidthTop;
		borderLineWidthTop = newBorderLineWidthTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP, oldBorderLineWidthTop, borderLineWidthTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCellProtect() {
		return cellProtect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellProtect(Object newCellProtect) {
		Object oldCellProtect = cellProtect;
		cellProtect = newCellProtect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__CELL_PROTECT, oldCellProtect, cellProtect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnWidth() {
		return columnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnWidth(String newColumnWidth) {
		String oldColumnWidth = columnWidth;
		columnWidth = newColumnWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__COLUMN_WIDTH, oldColumnWidth, columnWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryAsian() {
		return countryAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryAsian(String newCountryAsian) {
		String oldCountryAsian = countryAsian;
		countryAsian = newCountryAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__COUNTRY_ASIAN, oldCountryAsian, countryAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryComplex() {
		return countryComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryComplex(String newCountryComplex) {
		String oldCountryComplex = countryComplex;
		countryComplex = newCountryComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__COUNTRY_COMPLEX, oldCountryComplex, countryComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataStyleName() {
		return dataStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStyleName(String newDataStyleName) {
		String oldDataStyleName = dataStyleName;
		dataStyleName = newDataStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DATA_STYLE_NAME, oldDataStyleName, dataStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDecimalPlaces() {
		return decimalPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPlaces(BigInteger newDecimalPlaces) {
		BigInteger oldDecimalPlaces = decimalPlaces;
		decimalPlaces = newDecimalPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDefaultOutlineLevel() {
		return defaultOutlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOutlineLevel(BigInteger newDefaultOutlineLevel) {
		BigInteger oldDefaultOutlineLevel = defaultOutlineLevel;
		defaultOutlineLevel = newDefaultOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL, oldDefaultOutlineLevel, defaultOutlineLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagonalBlTr() {
		return diagonalBlTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalBlTr(String newDiagonalBlTr) {
		String oldDiagonalBlTr = diagonalBlTr;
		diagonalBlTr = newDiagonalBlTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR, oldDiagonalBlTr, diagonalBlTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getDiagonalBlTrWidths() {
		return diagonalBlTrWidths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalBlTrWidths(List<String> newDiagonalBlTrWidths) {
		List<String> oldDiagonalBlTrWidths = diagonalBlTrWidths;
		diagonalBlTrWidths = newDiagonalBlTrWidths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS, oldDiagonalBlTrWidths, diagonalBlTrWidths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagonalTlBr() {
		return diagonalTlBr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalTlBr(String newDiagonalTlBr) {
		String oldDiagonalTlBr = diagonalTlBr;
		diagonalTlBr = newDiagonalTlBr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR, oldDiagonalTlBr, diagonalTlBr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getDiagonalTlBrWidths() {
		return diagonalTlBrWidths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalTlBrWidths(List<String> newDiagonalTlBrWidths) {
		List<String> oldDiagonalTlBrWidths = diagonalTlBrWidths;
		diagonalTlBrWidths = newDiagonalTlBrWidths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS, oldDiagonalTlBrWidths, diagonalTlBrWidths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		DirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
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
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceAfterSep() {
		return distanceAfterSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAfterSep(String newDistanceAfterSep) {
		String oldDistanceAfterSep = distanceAfterSep;
		distanceAfterSep = newDistanceAfterSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DISTANCE_AFTER_SEP, oldDistanceAfterSep, distanceAfterSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceBeforeSep() {
		return distanceBeforeSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceBeforeSep(String newDistanceBeforeSep) {
		String oldDistanceBeforeSep = distanceBeforeSep;
		distanceBeforeSep = newDistanceBeforeSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DISTANCE_BEFORE_SEP, oldDistanceBeforeSep, distanceBeforeSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDynamicSpacing() {
		return dynamicSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDynamicSpacing) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDynamicSpacing = dynamicSpacing;
		dynamicSpacing = newDynamicSpacing == null ? DYNAMIC_SPACING_EDEFAULT : newDynamicSpacing;
		boolean oldDynamicSpacingESet = dynamicSpacingESet;
		dynamicSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING, oldDynamicSpacing, dynamicSpacing, !oldDynamicSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicSpacing() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDynamicSpacing = dynamicSpacing;
		boolean oldDynamicSpacingESet = dynamicSpacingESet;
		dynamicSpacing = DYNAMIC_SPACING_EDEFAULT;
		dynamicSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING, oldDynamicSpacing, DYNAMIC_SPACING_EDEFAULT, oldDynamicSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicSpacing() {
		return dynamicSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEditable) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEditable = editable;
		editable = newEditable == null ? EDITABLE_EDEFAULT : newEditable;
		boolean oldEditableESet = editableESet;
		editableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__EDITABLE, oldEditable, editable, !oldEditableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditable() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEditable = editable;
		boolean oldEditableESet = editableESet;
		editable = EDITABLE_EDEFAULT;
		editableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__EDITABLE, oldEditable, EDITABLE_EDEFAULT, oldEditableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditable() {
		return editableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyType getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(FamilyType newFamily) {
		FamilyType oldFamily = family;
		family = newFamily == null ? FAMILY_EDEFAULT : newFamily;
		boolean oldFamilyESet = familyESet;
		familyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FAMILY, oldFamily, family, !oldFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFamily() {
		FamilyType oldFamily = family;
		boolean oldFamilyESet = familyESet;
		family = FAMILY_EDEFAULT;
		familyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FAMILY, oldFamily, FAMILY_EDEFAULT, oldFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFamily() {
		return familyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FILTER_NAME, oldFilterName, filterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFirstPageNumber() {
		return firstPageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPageNumber(Object newFirstPageNumber) {
		Object oldFirstPageNumber = firstPageNumber;
		firstPageNumber = newFirstPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FIRST_PAGE_NUMBER, oldFirstPageNumber, firstPageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFlowWithText() {
		return flowWithText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowWithText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFlowWithText) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFlowWithText = flowWithText;
		flowWithText = newFlowWithText == null ? FLOW_WITH_TEXT_EDEFAULT : newFlowWithText;
		boolean oldFlowWithTextESet = flowWithTextESet;
		flowWithTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT, oldFlowWithText, flowWithText, !oldFlowWithTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowWithText() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFlowWithText = flowWithText;
		boolean oldFlowWithTextESet = flowWithTextESet;
		flowWithText = FLOW_WITH_TEXT_EDEFAULT;
		flowWithTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT, oldFlowWithText, FLOW_WITH_TEXT_EDEFAULT, oldFlowWithTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowWithText() {
		return flowWithTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontAdornments() {
		return fontAdornments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontAdornments(String newFontAdornments) {
		String oldFontAdornments = fontAdornments;
		fontAdornments = newFontAdornments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_ADORNMENTS, oldFontAdornments, fontAdornments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontCharset() {
		return fontCharset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontCharset(String newFontCharset) {
		String oldFontCharset = fontCharset;
		fontCharset = newFontCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_CHARSET, oldFontCharset, fontCharset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontCharsetAsian() {
		return fontCharsetAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontCharsetAsian(String newFontCharsetAsian) {
		String oldFontCharsetAsian = fontCharsetAsian;
		fontCharsetAsian = newFontCharsetAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_CHARSET_ASIAN, oldFontCharsetAsian, fontCharsetAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontCharsetComplex() {
		return fontCharsetComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontCharsetComplex(String newFontCharsetComplex) {
		String oldFontCharsetComplex = fontCharsetComplex;
		fontCharsetComplex = newFontCharsetComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_CHARSET_COMPLEX, oldFontCharsetComplex, fontCharsetComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamilyAsian() {
		return fontFamilyAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyAsian(String newFontFamilyAsian) {
		String oldFontFamilyAsian = fontFamilyAsian;
		fontFamilyAsian = newFontFamilyAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_ASIAN, oldFontFamilyAsian, fontFamilyAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamilyComplex() {
		return fontFamilyComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyComplex(String newFontFamilyComplex) {
		String oldFontFamilyComplex = fontFamilyComplex;
		fontFamilyComplex = newFontFamilyComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_COMPLEX, oldFontFamilyComplex, fontFamilyComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric getFontFamilyGeneric() {
		return fontFamilyGeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyGeneric(FontFamilyGeneric newFontFamilyGeneric) {
		FontFamilyGeneric oldFontFamilyGeneric = fontFamilyGeneric;
		fontFamilyGeneric = newFontFamilyGeneric == null ? FONT_FAMILY_GENERIC_EDEFAULT : newFontFamilyGeneric;
		boolean oldFontFamilyGenericESet = fontFamilyGenericESet;
		fontFamilyGenericESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC, oldFontFamilyGeneric, fontFamilyGeneric, !oldFontFamilyGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamilyGeneric() {
		FontFamilyGeneric oldFontFamilyGeneric = fontFamilyGeneric;
		boolean oldFontFamilyGenericESet = fontFamilyGenericESet;
		fontFamilyGeneric = FONT_FAMILY_GENERIC_EDEFAULT;
		fontFamilyGenericESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC, oldFontFamilyGeneric, FONT_FAMILY_GENERIC_EDEFAULT, oldFontFamilyGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamilyGeneric() {
		return fontFamilyGenericESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric getFontFamilyGenericAsian() {
		return fontFamilyGenericAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyGenericAsian(FontFamilyGeneric newFontFamilyGenericAsian) {
		FontFamilyGeneric oldFontFamilyGenericAsian = fontFamilyGenericAsian;
		fontFamilyGenericAsian = newFontFamilyGenericAsian == null ? FONT_FAMILY_GENERIC_ASIAN_EDEFAULT : newFontFamilyGenericAsian;
		boolean oldFontFamilyGenericAsianESet = fontFamilyGenericAsianESet;
		fontFamilyGenericAsianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN, oldFontFamilyGenericAsian, fontFamilyGenericAsian, !oldFontFamilyGenericAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamilyGenericAsian() {
		FontFamilyGeneric oldFontFamilyGenericAsian = fontFamilyGenericAsian;
		boolean oldFontFamilyGenericAsianESet = fontFamilyGenericAsianESet;
		fontFamilyGenericAsian = FONT_FAMILY_GENERIC_ASIAN_EDEFAULT;
		fontFamilyGenericAsianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN, oldFontFamilyGenericAsian, FONT_FAMILY_GENERIC_ASIAN_EDEFAULT, oldFontFamilyGenericAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamilyGenericAsian() {
		return fontFamilyGenericAsianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric getFontFamilyGenericComplex() {
		return fontFamilyGenericComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyGenericComplex(FontFamilyGeneric newFontFamilyGenericComplex) {
		FontFamilyGeneric oldFontFamilyGenericComplex = fontFamilyGenericComplex;
		fontFamilyGenericComplex = newFontFamilyGenericComplex == null ? FONT_FAMILY_GENERIC_COMPLEX_EDEFAULT : newFontFamilyGenericComplex;
		boolean oldFontFamilyGenericComplexESet = fontFamilyGenericComplexESet;
		fontFamilyGenericComplexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX, oldFontFamilyGenericComplex, fontFamilyGenericComplex, !oldFontFamilyGenericComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamilyGenericComplex() {
		FontFamilyGeneric oldFontFamilyGenericComplex = fontFamilyGenericComplex;
		boolean oldFontFamilyGenericComplexESet = fontFamilyGenericComplexESet;
		fontFamilyGenericComplex = FONT_FAMILY_GENERIC_COMPLEX_EDEFAULT;
		fontFamilyGenericComplexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX, oldFontFamilyGenericComplex, FONT_FAMILY_GENERIC_COMPLEX_EDEFAULT, oldFontFamilyGenericComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamilyGenericComplex() {
		return fontFamilyGenericComplexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFontIndependentLineSpacing() {
		return fontIndependentLineSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontIndependentLineSpacing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFontIndependentLineSpacing) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFontIndependentLineSpacing = fontIndependentLineSpacing;
		fontIndependentLineSpacing = newFontIndependentLineSpacing == null ? FONT_INDEPENDENT_LINE_SPACING_EDEFAULT : newFontIndependentLineSpacing;
		boolean oldFontIndependentLineSpacingESet = fontIndependentLineSpacingESet;
		fontIndependentLineSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING, oldFontIndependentLineSpacing, fontIndependentLineSpacing, !oldFontIndependentLineSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontIndependentLineSpacing() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFontIndependentLineSpacing = fontIndependentLineSpacing;
		boolean oldFontIndependentLineSpacingESet = fontIndependentLineSpacingESet;
		fontIndependentLineSpacing = FONT_INDEPENDENT_LINE_SPACING_EDEFAULT;
		fontIndependentLineSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING, oldFontIndependentLineSpacing, FONT_INDEPENDENT_LINE_SPACING_EDEFAULT, oldFontIndependentLineSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontIndependentLineSpacing() {
		return fontIndependentLineSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontNameAsian() {
		return fontNameAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontNameAsian(String newFontNameAsian) {
		String oldFontNameAsian = fontNameAsian;
		fontNameAsian = newFontNameAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_NAME_ASIAN, oldFontNameAsian, fontNameAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontNameComplex() {
		return fontNameComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontNameComplex(String newFontNameComplex) {
		String oldFontNameComplex = fontNameComplex;
		fontNameComplex = newFontNameComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_NAME_COMPLEX, oldFontNameComplex, fontNameComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch getFontPitch() {
		return fontPitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontPitch(FontPitch newFontPitch) {
		FontPitch oldFontPitch = fontPitch;
		fontPitch = newFontPitch == null ? FONT_PITCH_EDEFAULT : newFontPitch;
		boolean oldFontPitchESet = fontPitchESet;
		fontPitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_PITCH, oldFontPitch, fontPitch, !oldFontPitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontPitch() {
		FontPitch oldFontPitch = fontPitch;
		boolean oldFontPitchESet = fontPitchESet;
		fontPitch = FONT_PITCH_EDEFAULT;
		fontPitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_PITCH, oldFontPitch, FONT_PITCH_EDEFAULT, oldFontPitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontPitch() {
		return fontPitchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch getFontPitchAsian() {
		return fontPitchAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontPitchAsian(FontPitch newFontPitchAsian) {
		FontPitch oldFontPitchAsian = fontPitchAsian;
		fontPitchAsian = newFontPitchAsian == null ? FONT_PITCH_ASIAN_EDEFAULT : newFontPitchAsian;
		boolean oldFontPitchAsianESet = fontPitchAsianESet;
		fontPitchAsianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN, oldFontPitchAsian, fontPitchAsian, !oldFontPitchAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontPitchAsian() {
		FontPitch oldFontPitchAsian = fontPitchAsian;
		boolean oldFontPitchAsianESet = fontPitchAsianESet;
		fontPitchAsian = FONT_PITCH_ASIAN_EDEFAULT;
		fontPitchAsianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN, oldFontPitchAsian, FONT_PITCH_ASIAN_EDEFAULT, oldFontPitchAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontPitchAsian() {
		return fontPitchAsianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch getFontPitchComplex() {
		return fontPitchComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontPitchComplex(FontPitch newFontPitchComplex) {
		FontPitch oldFontPitchComplex = fontPitchComplex;
		fontPitchComplex = newFontPitchComplex == null ? FONT_PITCH_COMPLEX_EDEFAULT : newFontPitchComplex;
		boolean oldFontPitchComplexESet = fontPitchComplexESet;
		fontPitchComplexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX, oldFontPitchComplex, fontPitchComplex, !oldFontPitchComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontPitchComplex() {
		FontPitch oldFontPitchComplex = fontPitchComplex;
		boolean oldFontPitchComplexESet = fontPitchComplexESet;
		fontPitchComplex = FONT_PITCH_COMPLEX_EDEFAULT;
		fontPitchComplexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX, oldFontPitchComplex, FONT_PITCH_COMPLEX_EDEFAULT, oldFontPitchComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontPitchComplex() {
		return fontPitchComplexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontReliefType getFontRelief() {
		return fontRelief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontRelief(FontReliefType newFontRelief) {
		FontReliefType oldFontRelief = fontRelief;
		fontRelief = newFontRelief == null ? FONT_RELIEF_EDEFAULT : newFontRelief;
		boolean oldFontReliefESet = fontReliefESet;
		fontReliefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_RELIEF, oldFontRelief, fontRelief, !oldFontReliefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontRelief() {
		FontReliefType oldFontRelief = fontRelief;
		boolean oldFontReliefESet = fontReliefESet;
		fontRelief = FONT_RELIEF_EDEFAULT;
		fontReliefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_RELIEF, oldFontRelief, FONT_RELIEF_EDEFAULT, oldFontReliefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontRelief() {
		return fontReliefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSizeAsian() {
		return fontSizeAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSizeAsian(String newFontSizeAsian) {
		String oldFontSizeAsian = fontSizeAsian;
		fontSizeAsian = newFontSizeAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_SIZE_ASIAN, oldFontSizeAsian, fontSizeAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSizeComplex() {
		return fontSizeComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSizeComplex(String newFontSizeComplex) {
		String oldFontSizeComplex = fontSizeComplex;
		fontSizeComplex = newFontSizeComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_SIZE_COMPLEX, oldFontSizeComplex, fontSizeComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSizeRel() {
		return fontSizeRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSizeRel(String newFontSizeRel) {
		String oldFontSizeRel = fontSizeRel;
		fontSizeRel = newFontSizeRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL, oldFontSizeRel, fontSizeRel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSizeRelAsian() {
		return fontSizeRelAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSizeRelAsian(String newFontSizeRelAsian) {
		String oldFontSizeRelAsian = fontSizeRelAsian;
		fontSizeRelAsian = newFontSizeRelAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN, oldFontSizeRelAsian, fontSizeRelAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSizeRelComplex() {
		return fontSizeRelComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSizeRelComplex(String newFontSizeRelComplex) {
		String oldFontSizeRelComplex = fontSizeRelComplex;
		fontSizeRelComplex = newFontSizeRelComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX, oldFontSizeRelComplex, fontSizeRelComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyleAsian() {
		return fontStyleAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyleAsian(FontStyle newFontStyleAsian) {
		FontStyle oldFontStyleAsian = fontStyleAsian;
		fontStyleAsian = newFontStyleAsian == null ? FONT_STYLE_ASIAN_EDEFAULT : newFontStyleAsian;
		boolean oldFontStyleAsianESet = fontStyleAsianESet;
		fontStyleAsianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN, oldFontStyleAsian, fontStyleAsian, !oldFontStyleAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyleAsian() {
		FontStyle oldFontStyleAsian = fontStyleAsian;
		boolean oldFontStyleAsianESet = fontStyleAsianESet;
		fontStyleAsian = FONT_STYLE_ASIAN_EDEFAULT;
		fontStyleAsianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN, oldFontStyleAsian, FONT_STYLE_ASIAN_EDEFAULT, oldFontStyleAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyleAsian() {
		return fontStyleAsianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyleComplex() {
		return fontStyleComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyleComplex(FontStyle newFontStyleComplex) {
		FontStyle oldFontStyleComplex = fontStyleComplex;
		fontStyleComplex = newFontStyleComplex == null ? FONT_STYLE_COMPLEX_EDEFAULT : newFontStyleComplex;
		boolean oldFontStyleComplexESet = fontStyleComplexESet;
		fontStyleComplexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX, oldFontStyleComplex, fontStyleComplex, !oldFontStyleComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyleComplex() {
		FontStyle oldFontStyleComplex = fontStyleComplex;
		boolean oldFontStyleComplexESet = fontStyleComplexESet;
		fontStyleComplex = FONT_STYLE_COMPLEX_EDEFAULT;
		fontStyleComplexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX, oldFontStyleComplex, FONT_STYLE_COMPLEX_EDEFAULT, oldFontStyleComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyleComplex() {
		return fontStyleComplexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyleName() {
		return fontStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyleName(String newFontStyleName) {
		String oldFontStyleName = fontStyleName;
		fontStyleName = newFontStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME, oldFontStyleName, fontStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyleNameAsian() {
		return fontStyleNameAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyleNameAsian(String newFontStyleNameAsian) {
		String oldFontStyleNameAsian = fontStyleNameAsian;
		fontStyleNameAsian = newFontStyleNameAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN, oldFontStyleNameAsian, fontStyleNameAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyleNameComplex() {
		return fontStyleNameComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyleNameComplex(String newFontStyleNameComplex) {
		String oldFontStyleNameComplex = fontStyleNameComplex;
		fontStyleNameComplex = newFontStyleNameComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX, oldFontStyleNameComplex, fontStyleNameComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight getFontWeightAsian() {
		return fontWeightAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeightAsian(FontWeight newFontWeightAsian) {
		FontWeight oldFontWeightAsian = fontWeightAsian;
		fontWeightAsian = newFontWeightAsian == null ? FONT_WEIGHT_ASIAN_EDEFAULT : newFontWeightAsian;
		boolean oldFontWeightAsianESet = fontWeightAsianESet;
		fontWeightAsianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN, oldFontWeightAsian, fontWeightAsian, !oldFontWeightAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeightAsian() {
		FontWeight oldFontWeightAsian = fontWeightAsian;
		boolean oldFontWeightAsianESet = fontWeightAsianESet;
		fontWeightAsian = FONT_WEIGHT_ASIAN_EDEFAULT;
		fontWeightAsianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN, oldFontWeightAsian, FONT_WEIGHT_ASIAN_EDEFAULT, oldFontWeightAsianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeightAsian() {
		return fontWeightAsianESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight getFontWeightComplex() {
		return fontWeightComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeightComplex(FontWeight newFontWeightComplex) {
		FontWeight oldFontWeightComplex = fontWeightComplex;
		fontWeightComplex = newFontWeightComplex == null ? FONT_WEIGHT_COMPLEX_EDEFAULT : newFontWeightComplex;
		boolean oldFontWeightComplexESet = fontWeightComplexESet;
		fontWeightComplexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX, oldFontWeightComplex, fontWeightComplex, !oldFontWeightComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeightComplex() {
		FontWeight oldFontWeightComplex = fontWeightComplex;
		boolean oldFontWeightComplexESet = fontWeightComplexESet;
		fontWeightComplex = FONT_WEIGHT_COMPLEX_EDEFAULT;
		fontWeightComplexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX, oldFontWeightComplex, FONT_WEIGHT_COMPLEX_EDEFAULT, oldFontWeightComplexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeightComplex() {
		return fontWeightComplexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFootnoteMaxHeight() {
		return footnoteMaxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootnoteMaxHeight(String newFootnoteMaxHeight) {
		String oldFootnoteMaxHeight = footnoteMaxHeight;
		footnoteMaxHeight = newFootnoteMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT, oldFootnoteMaxHeight, footnoteMaxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphOrientationVerticalType getGlyphOrientationVertical() {
		return glyphOrientationVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlyphOrientationVertical(GlyphOrientationVerticalType newGlyphOrientationVertical) {
		GlyphOrientationVerticalType oldGlyphOrientationVertical = glyphOrientationVertical;
		glyphOrientationVertical = newGlyphOrientationVertical == null ? GLYPH_ORIENTATION_VERTICAL_EDEFAULT : newGlyphOrientationVertical;
		boolean oldGlyphOrientationVerticalESet = glyphOrientationVerticalESet;
		glyphOrientationVerticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL, oldGlyphOrientationVertical, glyphOrientationVertical, !oldGlyphOrientationVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlyphOrientationVertical() {
		GlyphOrientationVerticalType oldGlyphOrientationVertical = glyphOrientationVertical;
		boolean oldGlyphOrientationVerticalESet = glyphOrientationVerticalESet;
		glyphOrientationVertical = GLYPH_ORIENTATION_VERTICAL_EDEFAULT;
		glyphOrientationVerticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL, oldGlyphOrientationVertical, GLYPH_ORIENTATION_VERTICAL_EDEFAULT, oldGlyphOrientationVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlyphOrientationVertical() {
		return glyphOrientationVerticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalPosType getHorizontalPos() {
		return horizontalPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalPos(HorizontalPosType newHorizontalPos) {
		HorizontalPosType oldHorizontalPos = horizontalPos;
		horizontalPos = newHorizontalPos == null ? HORIZONTAL_POS_EDEFAULT : newHorizontalPos;
		boolean oldHorizontalPosESet = horizontalPosESet;
		horizontalPosESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS, oldHorizontalPos, horizontalPos, !oldHorizontalPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalPos() {
		HorizontalPosType oldHorizontalPos = horizontalPos;
		boolean oldHorizontalPosESet = horizontalPosESet;
		horizontalPos = HORIZONTAL_POS_EDEFAULT;
		horizontalPosESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS, oldHorizontalPos, HORIZONTAL_POS_EDEFAULT, oldHorizontalPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalPos() {
		return horizontalPosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalRelType getHorizontalRel() {
		return horizontalRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalRel(HorizontalRelType newHorizontalRel) {
		HorizontalRelType oldHorizontalRel = horizontalRel;
		horizontalRel = newHorizontalRel == null ? HORIZONTAL_REL_EDEFAULT : newHorizontalRel;
		boolean oldHorizontalRelESet = horizontalRelESet;
		horizontalRelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL, oldHorizontalRel, horizontalRel, !oldHorizontalRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalRel() {
		HorizontalRelType oldHorizontalRel = horizontalRel;
		boolean oldHorizontalRelESet = horizontalRelESet;
		horizontalRel = HORIZONTAL_REL_EDEFAULT;
		horizontalRelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL, oldHorizontalRel, HORIZONTAL_REL_EDEFAULT, oldHorizontalRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalRel() {
		return horizontalRelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getJustifySingleWord() {
		return justifySingleWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifySingleWord(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newJustifySingleWord) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldJustifySingleWord = justifySingleWord;
		justifySingleWord = newJustifySingleWord == null ? JUSTIFY_SINGLE_WORD_EDEFAULT : newJustifySingleWord;
		boolean oldJustifySingleWordESet = justifySingleWordESet;
		justifySingleWordESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD, oldJustifySingleWord, justifySingleWord, !oldJustifySingleWordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJustifySingleWord() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldJustifySingleWord = justifySingleWord;
		boolean oldJustifySingleWordESet = justifySingleWordESet;
		justifySingleWord = JUSTIFY_SINGLE_WORD_EDEFAULT;
		justifySingleWordESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD, oldJustifySingleWord, JUSTIFY_SINGLE_WORD_EDEFAULT, oldJustifySingleWordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJustifySingleWord() {
		return justifySingleWordESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageAsian() {
		return languageAsian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageAsian(String newLanguageAsian) {
		String oldLanguageAsian = languageAsian;
		languageAsian = newLanguageAsian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LANGUAGE_ASIAN, oldLanguageAsian, languageAsian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageComplex() {
		return languageComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageComplex(String newLanguageComplex) {
		String oldLanguageComplex = languageComplex;
		languageComplex = newLanguageComplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LANGUAGE_COMPLEX, oldLanguageComplex, languageComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutGridBaseHeight() {
		return layoutGridBaseHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridBaseHeight(String newLayoutGridBaseHeight) {
		String oldLayoutGridBaseHeight = layoutGridBaseHeight;
		layoutGridBaseHeight = newLayoutGridBaseHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT, oldLayoutGridBaseHeight, layoutGridBaseHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutGridColor() {
		return layoutGridColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridColor(String newLayoutGridColor) {
		String oldLayoutGridColor = layoutGridColor;
		layoutGridColor = newLayoutGridColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_COLOR, oldLayoutGridColor, layoutGridColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridDisplay() {
		return layoutGridDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLayoutGridDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridDisplay = layoutGridDisplay;
		layoutGridDisplay = newLayoutGridDisplay == null ? LAYOUT_GRID_DISPLAY_EDEFAULT : newLayoutGridDisplay;
		boolean oldLayoutGridDisplayESet = layoutGridDisplayESet;
		layoutGridDisplayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY, oldLayoutGridDisplay, layoutGridDisplay, !oldLayoutGridDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutGridDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridDisplay = layoutGridDisplay;
		boolean oldLayoutGridDisplayESet = layoutGridDisplayESet;
		layoutGridDisplay = LAYOUT_GRID_DISPLAY_EDEFAULT;
		layoutGridDisplayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY, oldLayoutGridDisplay, LAYOUT_GRID_DISPLAY_EDEFAULT, oldLayoutGridDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutGridDisplay() {
		return layoutGridDisplayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLayoutGridLines() {
		return layoutGridLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridLines(BigInteger newLayoutGridLines) {
		BigInteger oldLayoutGridLines = layoutGridLines;
		layoutGridLines = newLayoutGridLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_LINES, oldLayoutGridLines, layoutGridLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutGridModeType getLayoutGridMode() {
		return layoutGridMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridMode(LayoutGridModeType newLayoutGridMode) {
		LayoutGridModeType oldLayoutGridMode = layoutGridMode;
		layoutGridMode = newLayoutGridMode == null ? LAYOUT_GRID_MODE_EDEFAULT : newLayoutGridMode;
		boolean oldLayoutGridModeESet = layoutGridModeESet;
		layoutGridModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE, oldLayoutGridMode, layoutGridMode, !oldLayoutGridModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutGridMode() {
		LayoutGridModeType oldLayoutGridMode = layoutGridMode;
		boolean oldLayoutGridModeESet = layoutGridModeESet;
		layoutGridMode = LAYOUT_GRID_MODE_EDEFAULT;
		layoutGridModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE, oldLayoutGridMode, LAYOUT_GRID_MODE_EDEFAULT, oldLayoutGridModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutGridMode() {
		return layoutGridModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridPrint() {
		return layoutGridPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLayoutGridPrint) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridPrint = layoutGridPrint;
		layoutGridPrint = newLayoutGridPrint == null ? LAYOUT_GRID_PRINT_EDEFAULT : newLayoutGridPrint;
		boolean oldLayoutGridPrintESet = layoutGridPrintESet;
		layoutGridPrintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT, oldLayoutGridPrint, layoutGridPrint, !oldLayoutGridPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutGridPrint() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridPrint = layoutGridPrint;
		boolean oldLayoutGridPrintESet = layoutGridPrintESet;
		layoutGridPrint = LAYOUT_GRID_PRINT_EDEFAULT;
		layoutGridPrintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT, oldLayoutGridPrint, LAYOUT_GRID_PRINT_EDEFAULT, oldLayoutGridPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutGridPrint() {
		return layoutGridPrintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLayoutGridRubyBelow() {
		return layoutGridRubyBelow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridRubyBelow(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLayoutGridRubyBelow) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridRubyBelow = layoutGridRubyBelow;
		layoutGridRubyBelow = newLayoutGridRubyBelow == null ? LAYOUT_GRID_RUBY_BELOW_EDEFAULT : newLayoutGridRubyBelow;
		boolean oldLayoutGridRubyBelowESet = layoutGridRubyBelowESet;
		layoutGridRubyBelowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW, oldLayoutGridRubyBelow, layoutGridRubyBelow, !oldLayoutGridRubyBelowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutGridRubyBelow() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLayoutGridRubyBelow = layoutGridRubyBelow;
		boolean oldLayoutGridRubyBelowESet = layoutGridRubyBelowESet;
		layoutGridRubyBelow = LAYOUT_GRID_RUBY_BELOW_EDEFAULT;
		layoutGridRubyBelowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW, oldLayoutGridRubyBelow, LAYOUT_GRID_RUBY_BELOW_EDEFAULT, oldLayoutGridRubyBelowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutGridRubyBelow() {
		return layoutGridRubyBelowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutGridRubyHeight() {
		return layoutGridRubyHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutGridRubyHeight(String newLayoutGridRubyHeight) {
		String oldLayoutGridRubyHeight = layoutGridRubyHeight;
		layoutGridRubyHeight = newLayoutGridRubyHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT, oldLayoutGridRubyHeight, layoutGridRubyHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderChar() {
		return leaderChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderChar(String newLeaderChar) {
		String oldLeaderChar = leaderChar;
		leaderChar = newLeaderChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_CHAR, oldLeaderChar, leaderChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLeaderColor() {
		return leaderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderColor(Object newLeaderColor) {
		Object oldLeaderColor = leaderColor;
		leaderColor = newLeaderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_COLOR, oldLeaderColor, leaderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLeaderStyle() {
		return leaderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderStyle(LineStyle newLeaderStyle) {
		LineStyle oldLeaderStyle = leaderStyle;
		leaderStyle = newLeaderStyle == null ? LEADER_STYLE_EDEFAULT : newLeaderStyle;
		boolean oldLeaderStyleESet = leaderStyleESet;
		leaderStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_STYLE, oldLeaderStyle, leaderStyle, !oldLeaderStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeaderStyle() {
		LineStyle oldLeaderStyle = leaderStyle;
		boolean oldLeaderStyleESet = leaderStyleESet;
		leaderStyle = LEADER_STYLE_EDEFAULT;
		leaderStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LEADER_STYLE, oldLeaderStyle, LEADER_STYLE_EDEFAULT, oldLeaderStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeaderStyle() {
		return leaderStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderText() {
		return leaderText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderText(String newLeaderText) {
		String oldLeaderText = leaderText;
		leaderText = newLeaderText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_TEXT, oldLeaderText, leaderText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderTextStyle() {
		return leaderTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderTextStyle(String newLeaderTextStyle) {
		String oldLeaderTextStyle = leaderTextStyle;
		leaderTextStyle = newLeaderTextStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_TEXT_STYLE, oldLeaderTextStyle, leaderTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLeaderType() {
		return leaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderType(LineType newLeaderType) {
		LineType oldLeaderType = leaderType;
		leaderType = newLeaderType == null ? LEADER_TYPE_EDEFAULT : newLeaderType;
		boolean oldLeaderTypeESet = leaderTypeESet;
		leaderTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_TYPE, oldLeaderType, leaderType, !oldLeaderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeaderType() {
		LineType oldLeaderType = leaderType;
		boolean oldLeaderTypeESet = leaderTypeESet;
		leaderType = LEADER_TYPE_EDEFAULT;
		leaderTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LEADER_TYPE, oldLeaderType, LEADER_TYPE_EDEFAULT, oldLeaderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeaderType() {
		return leaderTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLeaderWidth() {
		return leaderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderWidth(Object newLeaderWidth) {
		Object oldLeaderWidth = leaderWidth;
		leaderWidth = newLeaderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEADER_WIDTH, oldLeaderWidth, leaderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendExpansionType getLegendExpansion() {
		return legendExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendExpansion(LegendExpansionType newLegendExpansion) {
		LegendExpansionType oldLegendExpansion = legendExpansion;
		legendExpansion = newLegendExpansion == null ? LEGEND_EXPANSION_EDEFAULT : newLegendExpansion;
		boolean oldLegendExpansionESet = legendExpansionESet;
		legendExpansionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION, oldLegendExpansion, legendExpansion, !oldLegendExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendExpansion() {
		LegendExpansionType oldLegendExpansion = legendExpansion;
		boolean oldLegendExpansionESet = legendExpansionESet;
		legendExpansion = LEGEND_EXPANSION_EDEFAULT;
		legendExpansionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION, oldLegendExpansion, LEGEND_EXPANSION_EDEFAULT, oldLegendExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendExpansion() {
		return legendExpansionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLegendExpansionAspectRatio() {
		return legendExpansionAspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendExpansionAspectRatio(double newLegendExpansionAspectRatio) {
		double oldLegendExpansionAspectRatio = legendExpansionAspectRatio;
		legendExpansionAspectRatio = newLegendExpansionAspectRatio;
		boolean oldLegendExpansionAspectRatioESet = legendExpansionAspectRatioESet;
		legendExpansionAspectRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO, oldLegendExpansionAspectRatio, legendExpansionAspectRatio, !oldLegendExpansionAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendExpansionAspectRatio() {
		double oldLegendExpansionAspectRatio = legendExpansionAspectRatio;
		boolean oldLegendExpansionAspectRatioESet = legendExpansionAspectRatioESet;
		legendExpansionAspectRatio = LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT;
		legendExpansionAspectRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO, oldLegendExpansionAspectRatio, LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT, oldLegendExpansionAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendExpansionAspectRatio() {
		return legendExpansionAspectRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Object newLength) {
		Object oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLetterKerning() {
		return letterKerning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterKerning(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLetterKerning) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLetterKerning = letterKerning;
		letterKerning = newLetterKerning == null ? LETTER_KERNING_EDEFAULT : newLetterKerning;
		boolean oldLetterKerningESet = letterKerningESet;
		letterKerningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LETTER_KERNING, oldLetterKerning, letterKerning, !oldLetterKerningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLetterKerning() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLetterKerning = letterKerning;
		boolean oldLetterKerningESet = letterKerningESet;
		letterKerning = LETTER_KERNING_EDEFAULT;
		letterKerningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LETTER_KERNING, oldLetterKerning, LETTER_KERNING_EDEFAULT, oldLetterKerningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLetterKerning() {
		return letterKerningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType getLineBreak() {
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(LineBreakType newLineBreak) {
		LineBreakType oldLineBreak = lineBreak;
		lineBreak = newLineBreak == null ? LINE_BREAK_EDEFAULT : newLineBreak;
		boolean oldLineBreakESet = lineBreakESet;
		lineBreakESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LINE_BREAK, oldLineBreak, lineBreak, !oldLineBreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineBreak() {
		LineBreakType oldLineBreak = lineBreak;
		boolean oldLineBreakESet = lineBreakESet;
		lineBreak = LINE_BREAK_EDEFAULT;
		lineBreakESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LINE_BREAK, oldLineBreak, LINE_BREAK_EDEFAULT, oldLineBreakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineBreak() {
		return lineBreakESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineHeightAtLeast() {
		return lineHeightAtLeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeightAtLeast(String newLineHeightAtLeast) {
		String oldLineHeightAtLeast = lineHeightAtLeast;
		lineHeightAtLeast = newLineHeightAtLeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST, oldLineHeightAtLeast, lineHeightAtLeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLines() {
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLines(BigInteger newLines) {
		BigInteger oldLines = lines;
		lines = newLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LINES, oldLines, lines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineSpacing() {
		return lineSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSpacing(String newLineSpacing) {
		String oldLineSpacing = lineSpacing;
		lineSpacing = newLineSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LINE_SPACING, oldLineSpacing, lineSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyle newLineStyle) {
		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		boolean oldLineStyleESet = lineStyleESet;
		lineStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LINE_STYLE, oldLineStyle, lineStyle, !oldLineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineStyle() {
		LineStyle oldLineStyle = lineStyle;
		boolean oldLineStyleESet = lineStyleESet;
		lineStyle = LINE_STYLE_EDEFAULT;
		lineStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__LINE_STYLE, oldLineStyle, LINE_STYLE_EDEFAULT, oldLineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineStyle() {
		return lineStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListStyleName() {
		return listStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyleName(String newListStyleName) {
		String oldListStyleName = listStyleName;
		listStyleName = newListStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__LIST_STYLE_NAME, oldListStyleName, listStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterPageName() {
		return masterPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPageName(String newMasterPageName) {
		String oldMasterPageName = masterPageName;
		masterPageName = newMasterPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__MASTER_PAGE_NAME, oldMasterPageName, masterPageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMayBreakBetweenRows() {
		return mayBreakBetweenRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayBreakBetweenRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMayBreakBetweenRows) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMayBreakBetweenRows = mayBreakBetweenRows;
		mayBreakBetweenRows = newMayBreakBetweenRows == null ? MAY_BREAK_BETWEEN_ROWS_EDEFAULT : newMayBreakBetweenRows;
		boolean oldMayBreakBetweenRowsESet = mayBreakBetweenRowsESet;
		mayBreakBetweenRowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS, oldMayBreakBetweenRows, mayBreakBetweenRows, !oldMayBreakBetweenRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMayBreakBetweenRows() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMayBreakBetweenRows = mayBreakBetweenRows;
		boolean oldMayBreakBetweenRowsESet = mayBreakBetweenRowsESet;
		mayBreakBetweenRows = MAY_BREAK_BETWEEN_ROWS_EDEFAULT;
		mayBreakBetweenRowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS, oldMayBreakBetweenRows, MAY_BREAK_BETWEEN_ROWS_EDEFAULT, oldMayBreakBetweenRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMayBreakBetweenRows() {
		return mayBreakBetweenRowsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinRowHeight() {
		return minRowHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRowHeight(String newMinRowHeight) {
		String oldMinRowHeight = minRowHeight;
		minRowHeight = newMinRowHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__MIN_ROW_HEIGHT, oldMinRowHeight, minRowHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMirror() {
		return mirror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirror(Object newMirror) {
		Object oldMirror = mirror;
		mirror = newMirror;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__MIRROR, oldMirror, mirror));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextStyleName() {
		return nextStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStyleName(String newNextStyleName) {
		String oldNextStyleName = nextStyleName;
		nextStyleName = newNextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NEXT_STYLE_NAME, oldNextStyleName, nextStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumberWrappedParagraphs() {
		return numberWrappedParagraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberWrappedParagraphs(Object newNumberWrappedParagraphs) {
		Object oldNumberWrappedParagraphs = numberWrappedParagraphs;
		numberWrappedParagraphs = newNumberWrappedParagraphs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS, oldNumberWrappedParagraphs, numberWrappedParagraphs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumFormat() {
		return numFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFormat(Object newNumFormat) {
		Object oldNumFormat = numFormat;
		numFormat = newNumFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NUM_FORMAT, oldNumFormat, numFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync() {
		return numLetterSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newNumLetterSync) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		numLetterSync = newNumLetterSync == null ? NUM_LETTER_SYNC_EDEFAULT : newNumLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumLetterSync() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSync = NUM_LETTER_SYNC_EDEFAULT;
		numLetterSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumLetterSync() {
		return numLetterSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumPrefix() {
		return numPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPrefix(String newNumPrefix) {
		String oldNumPrefix = numPrefix;
		numPrefix = newNumPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NUM_PREFIX, oldNumPrefix, numPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumSuffix() {
		return numSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumSuffix(String newNumSuffix) {
		String oldNumSuffix = numSuffix;
		numSuffix = newNumSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__NUM_SUFFIX, oldNumSuffix, numSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowBehaviorType getOverflowBehavior() {
		return overflowBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflowBehavior(OverflowBehaviorType newOverflowBehavior) {
		OverflowBehaviorType oldOverflowBehavior = overflowBehavior;
		overflowBehavior = newOverflowBehavior == null ? OVERFLOW_BEHAVIOR_EDEFAULT : newOverflowBehavior;
		boolean oldOverflowBehaviorESet = overflowBehaviorESet;
		overflowBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR, oldOverflowBehavior, overflowBehavior, !oldOverflowBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverflowBehavior() {
		OverflowBehaviorType oldOverflowBehavior = overflowBehavior;
		boolean oldOverflowBehaviorESet = overflowBehaviorESet;
		overflowBehavior = OVERFLOW_BEHAVIOR_EDEFAULT;
		overflowBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR, oldOverflowBehavior, OVERFLOW_BEHAVIOR_EDEFAULT, oldOverflowBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverflowBehavior() {
		return overflowBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageLayoutName() {
		return pageLayoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageLayoutName(String newPageLayoutName) {
		String oldPageLayoutName = pageLayoutName;
		pageLayoutName = newPageLayoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_NAME, oldPageLayoutName, pageLayoutName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPageNumber() {
		return pageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNumber(Object newPageNumber) {
		Object oldPageNumber = pageNumber;
		pageNumber = newPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PAGE_NUMBER, oldPageNumber, pageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageUsageType getPageUsage() {
		return pageUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageUsage(PageUsageType newPageUsage) {
		PageUsageType oldPageUsage = pageUsage;
		pageUsage = newPageUsage == null ? PAGE_USAGE_EDEFAULT : newPageUsage;
		boolean oldPageUsageESet = pageUsageESet;
		pageUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PAGE_USAGE, oldPageUsage, pageUsage, !oldPageUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPageUsage() {
		PageUsageType oldPageUsage = pageUsage;
		boolean oldPageUsageESet = pageUsageESet;
		pageUsage = PAGE_USAGE_EDEFAULT;
		pageUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__PAGE_USAGE, oldPageUsage, PAGE_USAGE_EDEFAULT, oldPageUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPageUsage() {
		return pageUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPaperTrayName() {
		return paperTrayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaperTrayName(Object newPaperTrayName) {
		Object oldPaperTrayName = paperTrayName;
		paperTrayName = newPaperTrayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PAPER_TRAY_NAME, oldPaperTrayName, paperTrayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentStyleName() {
		return parentStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStyleName(String newParentStyleName) {
		String oldParentStyleName = parentStyleName;
		parentStyleName = newParentStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PARENT_STYLE_NAME, oldParentStyleName, parentStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PrintTypeItem> getPrint() {
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint(List<PrintTypeItem> newPrint) {
		List<PrintTypeItem> oldPrint = print;
		print = newPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PRINT, oldPrint, print));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintContent() {
		return printContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrintContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintContent = printContent;
		printContent = newPrintContent == null ? PRINT_CONTENT_EDEFAULT : newPrintContent;
		boolean oldPrintContentESet = printContentESet;
		printContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PRINT_CONTENT, oldPrintContent, printContent, !oldPrintContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintContent = printContent;
		boolean oldPrintContentESet = printContentESet;
		printContent = PRINT_CONTENT_EDEFAULT;
		printContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__PRINT_CONTENT, oldPrintContent, PRINT_CONTENT_EDEFAULT, oldPrintContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintContent() {
		return printContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintOrientationType getPrintOrientation() {
		return printOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintOrientation(PrintOrientationType newPrintOrientation) {
		PrintOrientationType oldPrintOrientation = printOrientation;
		printOrientation = newPrintOrientation == null ? PRINT_ORIENTATION_EDEFAULT : newPrintOrientation;
		boolean oldPrintOrientationESet = printOrientationESet;
		printOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION, oldPrintOrientation, printOrientation, !oldPrintOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintOrientation() {
		PrintOrientationType oldPrintOrientation = printOrientation;
		boolean oldPrintOrientationESet = printOrientationESet;
		printOrientation = PRINT_ORIENTATION_EDEFAULT;
		printOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION, oldPrintOrientation, PRINT_ORIENTATION_EDEFAULT, oldPrintOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintOrientation() {
		return printOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintPageOrderType getPrintPageOrder() {
		return printPageOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintPageOrder(PrintPageOrderType newPrintPageOrder) {
		PrintPageOrderType oldPrintPageOrder = printPageOrder;
		printPageOrder = newPrintPageOrder == null ? PRINT_PAGE_ORDER_EDEFAULT : newPrintPageOrder;
		boolean oldPrintPageOrderESet = printPageOrderESet;
		printPageOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER, oldPrintPageOrder, printPageOrder, !oldPrintPageOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintPageOrder() {
		PrintPageOrderType oldPrintPageOrder = printPageOrder;
		boolean oldPrintPageOrderESet = printPageOrderESet;
		printPageOrder = PRINT_PAGE_ORDER_EDEFAULT;
		printPageOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER, oldPrintPageOrder, PRINT_PAGE_ORDER_EDEFAULT, oldPrintPageOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintPageOrder() {
		return printPageOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationWrapType getPunctuationWrap() {
		return punctuationWrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPunctuationWrap(PunctuationWrapType newPunctuationWrap) {
		PunctuationWrapType oldPunctuationWrap = punctuationWrap;
		punctuationWrap = newPunctuationWrap == null ? PUNCTUATION_WRAP_EDEFAULT : newPunctuationWrap;
		boolean oldPunctuationWrapESet = punctuationWrapESet;
		punctuationWrapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP, oldPunctuationWrap, punctuationWrap, !oldPunctuationWrapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPunctuationWrap() {
		PunctuationWrapType oldPunctuationWrap = punctuationWrap;
		boolean oldPunctuationWrapESet = punctuationWrapESet;
		punctuationWrap = PUNCTUATION_WRAP_EDEFAULT;
		punctuationWrapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP, oldPunctuationWrap, PUNCTUATION_WRAP_EDEFAULT, oldPunctuationWrapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPunctuationWrap() {
		return punctuationWrapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRegisterTrue() {
		return registerTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterTrue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRegisterTrue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRegisterTrue = registerTrue;
		registerTrue = newRegisterTrue == null ? REGISTER_TRUE_EDEFAULT : newRegisterTrue;
		boolean oldRegisterTrueESet = registerTrueESet;
		registerTrueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REGISTER_TRUE, oldRegisterTrue, registerTrue, !oldRegisterTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegisterTrue() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRegisterTrue = registerTrue;
		boolean oldRegisterTrueESet = registerTrueESet;
		registerTrue = REGISTER_TRUE_EDEFAULT;
		registerTrueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__REGISTER_TRUE, oldRegisterTrue, REGISTER_TRUE_EDEFAULT, oldRegisterTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegisterTrue() {
		return registerTrueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisterTruthRefStyleName() {
		return registerTruthRefStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterTruthRefStyleName(String newRegisterTruthRefStyleName) {
		String oldRegisterTruthRefStyleName = registerTruthRefStyleName;
		registerTruthRefStyleName = newRegisterTruthRefStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME, oldRegisterTruthRefStyleName, registerTruthRefStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelColumnWidth() {
		return relColumnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelColumnWidth(String newRelColumnWidth) {
		String oldRelColumnWidth = relColumnWidth;
		relColumnWidth = newRelColumnWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REL_COLUMN_WIDTH, oldRelColumnWidth, relColumnWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRelHeight() {
		return relHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelHeight(Object newRelHeight) {
		Object oldRelHeight = relHeight;
		relHeight = newRelHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REL_HEIGHT, oldRelHeight, relHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(RepeatType newRepeat) {
		RepeatType oldRepeat = repeat;
		repeat = newRepeat == null ? REPEAT_EDEFAULT : newRepeat;
		boolean oldRepeatESet = repeatESet;
		repeatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REPEAT, oldRepeat, repeat, !oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeat() {
		RepeatType oldRepeat = repeat;
		boolean oldRepeatESet = repeatESet;
		repeat = REPEAT_EDEFAULT;
		repeatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__REPEAT, oldRepeat, REPEAT_EDEFAULT, oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeat() {
		return repeatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRepeatContent() {
		return repeatContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRepeatContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRepeatContent = repeatContent;
		repeatContent = newRepeatContent == null ? REPEAT_CONTENT_EDEFAULT : newRepeatContent;
		boolean oldRepeatContentESet = repeatContentESet;
		repeatContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT, oldRepeatContent, repeatContent, !oldRepeatContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeatContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRepeatContent = repeatContent;
		boolean oldRepeatContentESet = repeatContentESet;
		repeatContent = REPEAT_CONTENT_EDEFAULT;
		repeatContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT, oldRepeatContent, REPEAT_CONTENT_EDEFAULT, oldRepeatContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeatContent() {
		return repeatContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationAlignType getRotationAlign() {
		return rotationAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationAlign(RotationAlignType newRotationAlign) {
		RotationAlignType oldRotationAlign = rotationAlign;
		rotationAlign = newRotationAlign == null ? ROTATION_ALIGN_EDEFAULT : newRotationAlign;
		boolean oldRotationAlignESet = rotationAlignESet;
		rotationAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN, oldRotationAlign, rotationAlign, !oldRotationAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationAlign() {
		RotationAlignType oldRotationAlign = rotationAlign;
		boolean oldRotationAlignESet = rotationAlignESet;
		rotationAlign = ROTATION_ALIGN_EDEFAULT;
		rotationAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN, oldRotationAlign, ROTATION_ALIGN_EDEFAULT, oldRotationAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationAlign() {
		return rotationAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRotationAngle() {
		return rotationAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationAngle(BigInteger newRotationAngle) {
		BigInteger oldRotationAngle = rotationAngle;
		rotationAngle = newRotationAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__ROTATION_ANGLE, oldRotationAngle, rotationAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowHeight() {
		return rowHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowHeight(String newRowHeight) {
		String oldRowHeight = rowHeight;
		rowHeight = newRowHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__ROW_HEIGHT, oldRowHeight, rowHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyAlignType getRubyAlign() {
		return rubyAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyAlign(RubyAlignType newRubyAlign) {
		RubyAlignType oldRubyAlign = rubyAlign;
		rubyAlign = newRubyAlign == null ? RUBY_ALIGN_EDEFAULT : newRubyAlign;
		boolean oldRubyAlignESet = rubyAlignESet;
		rubyAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__RUBY_ALIGN, oldRubyAlign, rubyAlign, !oldRubyAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRubyAlign() {
		RubyAlignType oldRubyAlign = rubyAlign;
		boolean oldRubyAlignESet = rubyAlignESet;
		rubyAlign = RUBY_ALIGN_EDEFAULT;
		rubyAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__RUBY_ALIGN, oldRubyAlign, RUBY_ALIGN_EDEFAULT, oldRubyAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRubyAlign() {
		return rubyAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyPositionType getRubyPosition() {
		return rubyPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyPosition(RubyPositionType newRubyPosition) {
		RubyPositionType oldRubyPosition = rubyPosition;
		rubyPosition = newRubyPosition == null ? RUBY_POSITION_EDEFAULT : newRubyPosition;
		boolean oldRubyPositionESet = rubyPositionESet;
		rubyPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__RUBY_POSITION, oldRubyPosition, rubyPosition, !oldRubyPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRubyPosition() {
		RubyPositionType oldRubyPosition = rubyPosition;
		boolean oldRubyPositionESet = rubyPositionESet;
		rubyPosition = RUBY_POSITION_EDEFAULT;
		rubyPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__RUBY_POSITION, oldRubyPosition, RUBY_POSITION_EDEFAULT, oldRubyPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRubyPosition() {
		return rubyPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunThroughType getRunThrough() {
		return runThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunThrough(RunThroughType newRunThrough) {
		RunThroughType oldRunThrough = runThrough;
		runThrough = newRunThrough == null ? RUN_THROUGH_EDEFAULT : newRunThrough;
		boolean oldRunThroughESet = runThroughESet;
		runThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__RUN_THROUGH, oldRunThrough, runThrough, !oldRunThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRunThrough() {
		RunThroughType oldRunThrough = runThrough;
		boolean oldRunThroughESet = runThroughESet;
		runThrough = RUN_THROUGH_EDEFAULT;
		runThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__RUN_THROUGH, oldRunThrough, RUN_THROUGH_EDEFAULT, oldRunThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRunThrough() {
		return runThroughESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleTo() {
		return scaleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleTo(String newScaleTo) {
		String oldScaleTo = scaleTo;
		scaleTo = newScaleTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SCALE_TO, oldScaleTo, scaleTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getScaleToPages() {
		return scaleToPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleToPages(BigInteger newScaleToPages) {
		BigInteger oldScaleToPages = scaleToPages;
		scaleToPages = newScaleToPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SCALE_TO_PAGES, oldScaleToPages, scaleToPages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTypeType getScriptType() {
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptType(ScriptTypeType newScriptType) {
		ScriptTypeType oldScriptType = scriptType;
		scriptType = newScriptType == null ? SCRIPT_TYPE_EDEFAULT : newScriptType;
		boolean oldScriptTypeESet = scriptTypeESet;
		scriptTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE, oldScriptType, scriptType, !oldScriptTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScriptType() {
		ScriptTypeType oldScriptType = scriptType;
		boolean oldScriptTypeESet = scriptTypeESet;
		scriptType = SCRIPT_TYPE_EDEFAULT;
		scriptTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE, oldScriptType, SCRIPT_TYPE_EDEFAULT, oldScriptTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScriptType() {
		return scriptTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getShadow() {
		return shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadow(Object newShadow) {
		Object oldShadow = shadow;
		shadow = newShadow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SHADOW, oldShadow, shadow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShrinkToFit() {
		return shrinkToFit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShrinkToFit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShrinkToFit) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShrinkToFit = shrinkToFit;
		shrinkToFit = newShrinkToFit == null ? SHRINK_TO_FIT_EDEFAULT : newShrinkToFit;
		boolean oldShrinkToFitESet = shrinkToFitESet;
		shrinkToFitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT, oldShrinkToFit, shrinkToFit, !oldShrinkToFitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShrinkToFit() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShrinkToFit = shrinkToFit;
		boolean oldShrinkToFitESet = shrinkToFitESet;
		shrinkToFit = SHRINK_TO_FIT_EDEFAULT;
		shrinkToFitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT, oldShrinkToFit, SHRINK_TO_FIT_EDEFAULT, oldShrinkToFitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShrinkToFit() {
		return shrinkToFitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSnapToLayoutGrid() {
		return snapToLayoutGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapToLayoutGrid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSnapToLayoutGrid) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSnapToLayoutGrid = snapToLayoutGrid;
		snapToLayoutGrid = newSnapToLayoutGrid == null ? SNAP_TO_LAYOUT_GRID_EDEFAULT : newSnapToLayoutGrid;
		boolean oldSnapToLayoutGridESet = snapToLayoutGridESet;
		snapToLayoutGridESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID, oldSnapToLayoutGrid, snapToLayoutGrid, !oldSnapToLayoutGridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSnapToLayoutGrid() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSnapToLayoutGrid = snapToLayoutGrid;
		boolean oldSnapToLayoutGridESet = snapToLayoutGridESet;
		snapToLayoutGrid = SNAP_TO_LAYOUT_GRID_EDEFAULT;
		snapToLayoutGridESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID, oldSnapToLayoutGrid, SNAP_TO_LAYOUT_GRID_EDEFAULT, oldSnapToLayoutGridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSnapToLayoutGrid() {
		return snapToLayoutGridESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle1() {
		return style1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle1(StyleType newStyle1) {
		StyleType oldStyle1 = style1;
		style1 = newStyle1 == null ? STYLE1_EDEFAULT : newStyle1;
		boolean oldStyle1ESet = style1ESet;
		style1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__STYLE1, oldStyle1, style1, !oldStyle1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle1() {
		StyleType oldStyle1 = style1;
		boolean oldStyle1ESet = style1ESet;
		style1 = STYLE1_EDEFAULT;
		style1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__STYLE1, oldStyle1, STYLE1_EDEFAULT, oldStyle1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle1() {
		return style1ESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCenteringType getTableCentering() {
		return tableCentering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCentering(TableCenteringType newTableCentering) {
		TableCenteringType oldTableCentering = tableCentering;
		tableCentering = newTableCentering == null ? TABLE_CENTERING_EDEFAULT : newTableCentering;
		boolean oldTableCenteringESet = tableCenteringESet;
		tableCenteringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TABLE_CENTERING, oldTableCentering, tableCentering, !oldTableCenteringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTableCentering() {
		TableCenteringType oldTableCentering = tableCentering;
		boolean oldTableCenteringESet = tableCenteringESet;
		tableCentering = TABLE_CENTERING_EDEFAULT;
		tableCenteringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TABLE_CENTERING, oldTableCentering, TABLE_CENTERING_EDEFAULT, oldTableCenteringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTableCentering() {
		return tableCenteringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabStopDistance() {
		return tabStopDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabStopDistance(String newTabStopDistance) {
		String oldTabStopDistance = tabStopDistance;
		tabStopDistance = newTabStopDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TAB_STOP_DISTANCE, oldTabStopDistance, tabStopDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignSourceType getTextAlignSource() {
		return textAlignSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignSource(TextAlignSourceType newTextAlignSource) {
		TextAlignSourceType oldTextAlignSource = textAlignSource;
		textAlignSource = newTextAlignSource == null ? TEXT_ALIGN_SOURCE_EDEFAULT : newTextAlignSource;
		boolean oldTextAlignSourceESet = textAlignSourceESet;
		textAlignSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE, oldTextAlignSource, textAlignSource, !oldTextAlignSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAlignSource() {
		TextAlignSourceType oldTextAlignSource = textAlignSource;
		boolean oldTextAlignSourceESet = textAlignSourceESet;
		textAlignSource = TEXT_ALIGN_SOURCE_EDEFAULT;
		textAlignSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE, oldTextAlignSource, TEXT_ALIGN_SOURCE_EDEFAULT, oldTextAlignSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAlignSource() {
		return textAlignSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAutospaceType getTextAutospace() {
		return textAutospace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAutospace(TextAutospaceType newTextAutospace) {
		TextAutospaceType oldTextAutospace = textAutospace;
		textAutospace = newTextAutospace == null ? TEXT_AUTOSPACE_EDEFAULT : newTextAutospace;
		boolean oldTextAutospaceESet = textAutospaceESet;
		textAutospaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE, oldTextAutospace, textAutospace, !oldTextAutospaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAutospace() {
		TextAutospaceType oldTextAutospace = textAutospace;
		boolean oldTextAutospaceESet = textAutospaceESet;
		textAutospace = TEXT_AUTOSPACE_EDEFAULT;
		textAutospaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE, oldTextAutospace, TEXT_AUTOSPACE_EDEFAULT, oldTextAutospaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAutospace() {
		return textAutospaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextBlinking() {
		return textBlinking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextBlinking(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextBlinking) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextBlinking = textBlinking;
		textBlinking = newTextBlinking == null ? TEXT_BLINKING_EDEFAULT : newTextBlinking;
		boolean oldTextBlinkingESet = textBlinkingESet;
		textBlinkingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_BLINKING, oldTextBlinking, textBlinking, !oldTextBlinkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextBlinking() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextBlinking = textBlinking;
		boolean oldTextBlinkingESet = textBlinkingESet;
		textBlinking = TEXT_BLINKING_EDEFAULT;
		textBlinkingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_BLINKING, oldTextBlinking, TEXT_BLINKING_EDEFAULT, oldTextBlinkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextBlinking() {
		return textBlinkingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCombineType getTextCombine() {
		return textCombine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCombine(TextCombineType newTextCombine) {
		TextCombineType oldTextCombine = textCombine;
		textCombine = newTextCombine == null ? TEXT_COMBINE_EDEFAULT : newTextCombine;
		boolean oldTextCombineESet = textCombineESet;
		textCombineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_COMBINE, oldTextCombine, textCombine, !oldTextCombineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextCombine() {
		TextCombineType oldTextCombine = textCombine;
		boolean oldTextCombineESet = textCombineESet;
		textCombine = TEXT_COMBINE_EDEFAULT;
		textCombineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_COMBINE, oldTextCombine, TEXT_COMBINE_EDEFAULT, oldTextCombineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextCombine() {
		return textCombineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextCombineEndChar() {
		return textCombineEndChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCombineEndChar(String newTextCombineEndChar) {
		String oldTextCombineEndChar = textCombineEndChar;
		textCombineEndChar = newTextCombineEndChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR, oldTextCombineEndChar, textCombineEndChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextCombineStartChar() {
		return textCombineStartChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCombineStartChar(String newTextCombineStartChar) {
		String oldTextCombineStartChar = textCombineStartChar;
		textCombineStartChar = newTextCombineStartChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR, oldTextCombineStartChar, textCombineStartChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextEmphasize() {
		return textEmphasize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEmphasize(Object newTextEmphasize) {
		Object oldTextEmphasize = textEmphasize;
		textEmphasize = newTextEmphasize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_EMPHASIZE, oldTextEmphasize, textEmphasize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextLineThroughColor() {
		return textLineThroughColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughColor(Object newTextLineThroughColor) {
		Object oldTextLineThroughColor = textLineThroughColor;
		textLineThroughColor = newTextLineThroughColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR, oldTextLineThroughColor, textLineThroughColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineMode getTextLineThroughMode() {
		return textLineThroughMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughMode(LineMode newTextLineThroughMode) {
		LineMode oldTextLineThroughMode = textLineThroughMode;
		textLineThroughMode = newTextLineThroughMode == null ? TEXT_LINE_THROUGH_MODE_EDEFAULT : newTextLineThroughMode;
		boolean oldTextLineThroughModeESet = textLineThroughModeESet;
		textLineThroughModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE, oldTextLineThroughMode, textLineThroughMode, !oldTextLineThroughModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextLineThroughMode() {
		LineMode oldTextLineThroughMode = textLineThroughMode;
		boolean oldTextLineThroughModeESet = textLineThroughModeESet;
		textLineThroughMode = TEXT_LINE_THROUGH_MODE_EDEFAULT;
		textLineThroughModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE, oldTextLineThroughMode, TEXT_LINE_THROUGH_MODE_EDEFAULT, oldTextLineThroughModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextLineThroughMode() {
		return textLineThroughModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getTextLineThroughStyle() {
		return textLineThroughStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughStyle(LineStyle newTextLineThroughStyle) {
		LineStyle oldTextLineThroughStyle = textLineThroughStyle;
		textLineThroughStyle = newTextLineThroughStyle == null ? TEXT_LINE_THROUGH_STYLE_EDEFAULT : newTextLineThroughStyle;
		boolean oldTextLineThroughStyleESet = textLineThroughStyleESet;
		textLineThroughStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE, oldTextLineThroughStyle, textLineThroughStyle, !oldTextLineThroughStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextLineThroughStyle() {
		LineStyle oldTextLineThroughStyle = textLineThroughStyle;
		boolean oldTextLineThroughStyleESet = textLineThroughStyleESet;
		textLineThroughStyle = TEXT_LINE_THROUGH_STYLE_EDEFAULT;
		textLineThroughStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE, oldTextLineThroughStyle, TEXT_LINE_THROUGH_STYLE_EDEFAULT, oldTextLineThroughStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextLineThroughStyle() {
		return textLineThroughStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextLineThroughText() {
		return textLineThroughText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughText(String newTextLineThroughText) {
		String oldTextLineThroughText = textLineThroughText;
		textLineThroughText = newTextLineThroughText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT, oldTextLineThroughText, textLineThroughText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextLineThroughTextStyle() {
		return textLineThroughTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughTextStyle(String newTextLineThroughTextStyle) {
		String oldTextLineThroughTextStyle = textLineThroughTextStyle;
		textLineThroughTextStyle = newTextLineThroughTextStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE, oldTextLineThroughTextStyle, textLineThroughTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getTextLineThroughType() {
		return textLineThroughType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughType(LineType newTextLineThroughType) {
		LineType oldTextLineThroughType = textLineThroughType;
		textLineThroughType = newTextLineThroughType == null ? TEXT_LINE_THROUGH_TYPE_EDEFAULT : newTextLineThroughType;
		boolean oldTextLineThroughTypeESet = textLineThroughTypeESet;
		textLineThroughTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE, oldTextLineThroughType, textLineThroughType, !oldTextLineThroughTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextLineThroughType() {
		LineType oldTextLineThroughType = textLineThroughType;
		boolean oldTextLineThroughTypeESet = textLineThroughTypeESet;
		textLineThroughType = TEXT_LINE_THROUGH_TYPE_EDEFAULT;
		textLineThroughTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE, oldTextLineThroughType, TEXT_LINE_THROUGH_TYPE_EDEFAULT, oldTextLineThroughTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextLineThroughType() {
		return textLineThroughTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextLineThroughWidth() {
		return textLineThroughWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLineThroughWidth(Object newTextLineThroughWidth) {
		Object oldTextLineThroughWidth = textLineThroughWidth;
		textLineThroughWidth = newTextLineThroughWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH, oldTextLineThroughWidth, textLineThroughWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextOutline() {
		return textOutline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOutline(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextOutline) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextOutline = textOutline;
		textOutline = newTextOutline == null ? TEXT_OUTLINE_EDEFAULT : newTextOutline;
		boolean oldTextOutlineESet = textOutlineESet;
		textOutlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE, oldTextOutline, textOutline, !oldTextOutlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextOutline() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextOutline = textOutline;
		boolean oldTextOutlineESet = textOutlineESet;
		textOutline = TEXT_OUTLINE_EDEFAULT;
		textOutlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE, oldTextOutline, TEXT_OUTLINE_EDEFAULT, oldTextOutlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextOutline() {
		return textOutlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTextPosition() {
		return textPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPosition(List newTextPosition) {
		List oldTextPosition = textPosition;
		textPosition = newTextPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_POSITION, oldTextPosition, textPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTextRotationAngle() {
		return textRotationAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRotationAngle(BigInteger newTextRotationAngle) {
		BigInteger oldTextRotationAngle = textRotationAngle;
		textRotationAngle = newTextRotationAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_ANGLE, oldTextRotationAngle, textRotationAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRotationScaleType getTextRotationScale() {
		return textRotationScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRotationScale(TextRotationScaleType newTextRotationScale) {
		TextRotationScaleType oldTextRotationScale = textRotationScale;
		textRotationScale = newTextRotationScale == null ? TEXT_ROTATION_SCALE_EDEFAULT : newTextRotationScale;
		boolean oldTextRotationScaleESet = textRotationScaleESet;
		textRotationScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE, oldTextRotationScale, textRotationScale, !oldTextRotationScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextRotationScale() {
		TextRotationScaleType oldTextRotationScale = textRotationScale;
		boolean oldTextRotationScaleESet = textRotationScaleESet;
		textRotationScale = TEXT_ROTATION_SCALE_EDEFAULT;
		textRotationScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE, oldTextRotationScale, TEXT_ROTATION_SCALE_EDEFAULT, oldTextRotationScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextRotationScale() {
		return textRotationScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextScale() {
		return textScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextScale(String newTextScale) {
		String oldTextScale = textScale;
		textScale = newTextScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_SCALE, oldTextScale, textScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextUnderlineColor() {
		return textUnderlineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUnderlineColor(Object newTextUnderlineColor) {
		Object oldTextUnderlineColor = textUnderlineColor;
		textUnderlineColor = newTextUnderlineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR, oldTextUnderlineColor, textUnderlineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineMode getTextUnderlineMode() {
		return textUnderlineMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUnderlineMode(LineMode newTextUnderlineMode) {
		LineMode oldTextUnderlineMode = textUnderlineMode;
		textUnderlineMode = newTextUnderlineMode == null ? TEXT_UNDERLINE_MODE_EDEFAULT : newTextUnderlineMode;
		boolean oldTextUnderlineModeESet = textUnderlineModeESet;
		textUnderlineModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE, oldTextUnderlineMode, textUnderlineMode, !oldTextUnderlineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextUnderlineMode() {
		LineMode oldTextUnderlineMode = textUnderlineMode;
		boolean oldTextUnderlineModeESet = textUnderlineModeESet;
		textUnderlineMode = TEXT_UNDERLINE_MODE_EDEFAULT;
		textUnderlineModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE, oldTextUnderlineMode, TEXT_UNDERLINE_MODE_EDEFAULT, oldTextUnderlineModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextUnderlineMode() {
		return textUnderlineModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getTextUnderlineStyle() {
		return textUnderlineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUnderlineStyle(LineStyle newTextUnderlineStyle) {
		LineStyle oldTextUnderlineStyle = textUnderlineStyle;
		textUnderlineStyle = newTextUnderlineStyle == null ? TEXT_UNDERLINE_STYLE_EDEFAULT : newTextUnderlineStyle;
		boolean oldTextUnderlineStyleESet = textUnderlineStyleESet;
		textUnderlineStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE, oldTextUnderlineStyle, textUnderlineStyle, !oldTextUnderlineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextUnderlineStyle() {
		LineStyle oldTextUnderlineStyle = textUnderlineStyle;
		boolean oldTextUnderlineStyleESet = textUnderlineStyleESet;
		textUnderlineStyle = TEXT_UNDERLINE_STYLE_EDEFAULT;
		textUnderlineStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE, oldTextUnderlineStyle, TEXT_UNDERLINE_STYLE_EDEFAULT, oldTextUnderlineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextUnderlineStyle() {
		return textUnderlineStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getTextUnderlineType() {
		return textUnderlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUnderlineType(LineType newTextUnderlineType) {
		LineType oldTextUnderlineType = textUnderlineType;
		textUnderlineType = newTextUnderlineType == null ? TEXT_UNDERLINE_TYPE_EDEFAULT : newTextUnderlineType;
		boolean oldTextUnderlineTypeESet = textUnderlineTypeESet;
		textUnderlineTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE, oldTextUnderlineType, textUnderlineType, !oldTextUnderlineTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextUnderlineType() {
		LineType oldTextUnderlineType = textUnderlineType;
		boolean oldTextUnderlineTypeESet = textUnderlineTypeESet;
		textUnderlineType = TEXT_UNDERLINE_TYPE_EDEFAULT;
		textUnderlineTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE, oldTextUnderlineType, TEXT_UNDERLINE_TYPE_EDEFAULT, oldTextUnderlineTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextUnderlineType() {
		return textUnderlineTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextUnderlineWidth() {
		return textUnderlineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUnderlineWidth(Object newTextUnderlineWidth) {
		Object oldTextUnderlineWidth = textUnderlineWidth;
		textUnderlineWidth = newTextUnderlineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH, oldTextUnderlineWidth, textUnderlineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOptimalColumnWidth() {
		return useOptimalColumnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOptimalColumnWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseOptimalColumnWidth) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOptimalColumnWidth = useOptimalColumnWidth;
		useOptimalColumnWidth = newUseOptimalColumnWidth == null ? USE_OPTIMAL_COLUMN_WIDTH_EDEFAULT : newUseOptimalColumnWidth;
		boolean oldUseOptimalColumnWidthESet = useOptimalColumnWidthESet;
		useOptimalColumnWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH, oldUseOptimalColumnWidth, useOptimalColumnWidth, !oldUseOptimalColumnWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOptimalColumnWidth() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOptimalColumnWidth = useOptimalColumnWidth;
		boolean oldUseOptimalColumnWidthESet = useOptimalColumnWidthESet;
		useOptimalColumnWidth = USE_OPTIMAL_COLUMN_WIDTH_EDEFAULT;
		useOptimalColumnWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH, oldUseOptimalColumnWidth, USE_OPTIMAL_COLUMN_WIDTH_EDEFAULT, oldUseOptimalColumnWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOptimalColumnWidth() {
		return useOptimalColumnWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOptimalRowHeight() {
		return useOptimalRowHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOptimalRowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseOptimalRowHeight) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOptimalRowHeight = useOptimalRowHeight;
		useOptimalRowHeight = newUseOptimalRowHeight == null ? USE_OPTIMAL_ROW_HEIGHT_EDEFAULT : newUseOptimalRowHeight;
		boolean oldUseOptimalRowHeightESet = useOptimalRowHeightESet;
		useOptimalRowHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT, oldUseOptimalRowHeight, useOptimalRowHeight, !oldUseOptimalRowHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOptimalRowHeight() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOptimalRowHeight = useOptimalRowHeight;
		boolean oldUseOptimalRowHeightESet = useOptimalRowHeightESet;
		useOptimalRowHeight = USE_OPTIMAL_ROW_HEIGHT_EDEFAULT;
		useOptimalRowHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT, oldUseOptimalRowHeight, USE_OPTIMAL_ROW_HEIGHT_EDEFAULT, oldUseOptimalRowHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOptimalRowHeight() {
		return useOptimalRowHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseWindowFontColor() {
		return useWindowFontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseWindowFontColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseWindowFontColor) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseWindowFontColor = useWindowFontColor;
		useWindowFontColor = newUseWindowFontColor == null ? USE_WINDOW_FONT_COLOR_EDEFAULT : newUseWindowFontColor;
		boolean oldUseWindowFontColorESet = useWindowFontColorESet;
		useWindowFontColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR, oldUseWindowFontColor, useWindowFontColor, !oldUseWindowFontColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseWindowFontColor() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseWindowFontColor = useWindowFontColor;
		boolean oldUseWindowFontColorESet = useWindowFontColorESet;
		useWindowFontColor = USE_WINDOW_FONT_COLOR_EDEFAULT;
		useWindowFontColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR, oldUseWindowFontColor, USE_WINDOW_FONT_COLOR_EDEFAULT, oldUseWindowFontColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseWindowFontColor() {
		return useWindowFontColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalPosType getVerticalPos() {
		return verticalPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalPos(VerticalPosType newVerticalPos) {
		VerticalPosType oldVerticalPos = verticalPos;
		verticalPos = newVerticalPos == null ? VERTICAL_POS_EDEFAULT : newVerticalPos;
		boolean oldVerticalPosESet = verticalPosESet;
		verticalPosESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__VERTICAL_POS, oldVerticalPos, verticalPos, !oldVerticalPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalPos() {
		VerticalPosType oldVerticalPos = verticalPos;
		boolean oldVerticalPosESet = verticalPosESet;
		verticalPos = VERTICAL_POS_EDEFAULT;
		verticalPosESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__VERTICAL_POS, oldVerticalPos, VERTICAL_POS_EDEFAULT, oldVerticalPosESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalPos() {
		return verticalPosESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalRelType getVerticalRel() {
		return verticalRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalRel(VerticalRelType newVerticalRel) {
		VerticalRelType oldVerticalRel = verticalRel;
		verticalRel = newVerticalRel == null ? VERTICAL_REL_EDEFAULT : newVerticalRel;
		boolean oldVerticalRelESet = verticalRelESet;
		verticalRelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__VERTICAL_REL, oldVerticalRel, verticalRel, !oldVerticalRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalRel() {
		VerticalRelType oldVerticalRel = verticalRel;
		boolean oldVerticalRelESet = verticalRelESet;
		verticalRel = VERTICAL_REL_EDEFAULT;
		verticalRelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__VERTICAL_REL, oldVerticalRel, VERTICAL_REL_EDEFAULT, oldVerticalRelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalRel() {
		return verticalRelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newVolatile) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		volatile_ = newVolatile == null ? VOLATILE_EDEFAULT : newVolatile;
		boolean oldVolatileESet = volatileESet;
		volatileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatile() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		boolean oldVolatileESet = volatileESet;
		volatile_ = VOLATILE_EDEFAULT;
		volatileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatile() {
		return volatileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapType getWrap() {
		return wrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrap(WrapType newWrap) {
		WrapType oldWrap = wrap;
		wrap = newWrap == null ? WRAP_EDEFAULT : newWrap;
		boolean oldWrapESet = wrapESet;
		wrapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRAP, oldWrap, wrap, !oldWrapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrap() {
		WrapType oldWrap = wrap;
		boolean oldWrapESet = wrapESet;
		wrap = WRAP_EDEFAULT;
		wrapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__WRAP, oldWrap, WRAP_EDEFAULT, oldWrapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrap() {
		return wrapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getWrapContour() {
		return wrapContour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newWrapContour) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldWrapContour = wrapContour;
		wrapContour = newWrapContour == null ? WRAP_CONTOUR_EDEFAULT : newWrapContour;
		boolean oldWrapContourESet = wrapContourESet;
		wrapContourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR, oldWrapContour, wrapContour, !oldWrapContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapContour() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldWrapContour = wrapContour;
		boolean oldWrapContourESet = wrapContourESet;
		wrapContour = WRAP_CONTOUR_EDEFAULT;
		wrapContourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR, oldWrapContour, WRAP_CONTOUR_EDEFAULT, oldWrapContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapContour() {
		return wrapContourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapContourModeType getWrapContourMode() {
		return wrapContourMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapContourMode(WrapContourModeType newWrapContourMode) {
		WrapContourModeType oldWrapContourMode = wrapContourMode;
		wrapContourMode = newWrapContourMode == null ? WRAP_CONTOUR_MODE_EDEFAULT : newWrapContourMode;
		boolean oldWrapContourModeESet = wrapContourModeESet;
		wrapContourModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE, oldWrapContourMode, wrapContourMode, !oldWrapContourModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapContourMode() {
		WrapContourModeType oldWrapContourMode = wrapContourMode;
		boolean oldWrapContourModeESet = wrapContourModeESet;
		wrapContourMode = WRAP_CONTOUR_MODE_EDEFAULT;
		wrapContourModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE, oldWrapContourMode, WRAP_CONTOUR_MODE_EDEFAULT, oldWrapContourModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapContourMode() {
		return wrapContourModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrapDynamicThreshold() {
		return wrapDynamicThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapDynamicThreshold(String newWrapDynamicThreshold) {
		String oldWrapDynamicThreshold = wrapDynamicThreshold;
		wrapDynamicThreshold = newWrapDynamicThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD, oldWrapDynamicThreshold, wrapDynamicThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritingModeType getWritingMode() {
		return writingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritingMode(WritingModeType newWritingMode) {
		WritingModeType oldWritingMode = writingMode;
		writingMode = newWritingMode == null ? WRITING_MODE_EDEFAULT : newWritingMode;
		boolean oldWritingModeESet = writingModeESet;
		writingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRITING_MODE, oldWritingMode, writingMode, !oldWritingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWritingMode() {
		WritingModeType oldWritingMode = writingMode;
		boolean oldWritingModeESet = writingModeESet;
		writingMode = WRITING_MODE_EDEFAULT;
		writingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__WRITING_MODE, oldWritingMode, WRITING_MODE_EDEFAULT, oldWritingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWritingMode() {
		return writingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getWritingModeAutomatic() {
		return writingModeAutomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritingModeAutomatic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newWritingModeAutomatic) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldWritingModeAutomatic = writingModeAutomatic;
		writingModeAutomatic = newWritingModeAutomatic == null ? WRITING_MODE_AUTOMATIC_EDEFAULT : newWritingModeAutomatic;
		boolean oldWritingModeAutomaticESet = writingModeAutomaticESet;
		writingModeAutomaticESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC, oldWritingModeAutomatic, writingModeAutomatic, !oldWritingModeAutomaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWritingModeAutomatic() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldWritingModeAutomatic = writingModeAutomatic;
		boolean oldWritingModeAutomaticESet = writingModeAutomaticESet;
		writingModeAutomatic = WRITING_MODE_AUTOMATIC_EDEFAULT;
		writingModeAutomaticESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC, oldWritingModeAutomatic, WRITING_MODE_AUTOMATIC_EDEFAULT, oldWritingModeAutomaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWritingModeAutomatic() {
		return writingModeAutomaticESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_IMAGE:
				return basicSetBackgroundImage(null, msgs);
			case StylePackage.DOCUMENT_ROOT__CHART_PROPERTIES:
				return basicSetChartProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__COLUMN:
				return basicSetColumn(null, msgs);
			case StylePackage.DOCUMENT_ROOT__COLUMNS:
				return basicSetColumns(null, msgs);
			case StylePackage.DOCUMENT_ROOT__COLUMN_SEP:
				return basicSetColumnSep(null, msgs);
			case StylePackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return basicSetDefaultStyle(null, msgs);
			case StylePackage.DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES:
				return basicSetDrawingPageProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__DROP_CAP:
				return basicSetDropCap(null, msgs);
			case StylePackage.DOCUMENT_ROOT__FONT_FACE:
				return basicSetFontFace(null, msgs);
			case StylePackage.DOCUMENT_ROOT__FOOTER:
				return basicSetFooter(null, msgs);
			case StylePackage.DOCUMENT_ROOT__FOOTER_LEFT:
				return basicSetFooterLeft(null, msgs);
			case StylePackage.DOCUMENT_ROOT__FOOTER_STYLE:
				return basicSetFooterStyle(null, msgs);
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_SEP:
				return basicSetFootnoteSep(null, msgs);
			case StylePackage.DOCUMENT_ROOT__GRAPHIC_PROPERTIES:
				return basicSetGraphicProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__HANDOUT_MASTER:
				return basicSetHandoutMaster(null, msgs);
			case StylePackage.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case StylePackage.DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES:
				return basicSetHeaderFooterProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__HEADER_LEFT:
				return basicSetHeaderLeft(null, msgs);
			case StylePackage.DOCUMENT_ROOT__HEADER_STYLE:
				return basicSetHeaderStyle(null, msgs);
			case StylePackage.DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES:
				return basicSetListLevelProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__MAP:
				return basicSetMap(null, msgs);
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE:
				return basicSetMasterPage(null, msgs);
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT:
				return basicSetPageLayout(null, msgs);
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES:
				return basicSetPageLayoutProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__PARAGRAPH_PROPERTIES:
				return basicSetParagraphProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT:
				return basicSetPresentationPageLayout(null, msgs);
			case StylePackage.DOCUMENT_ROOT__REGION_CENTER:
				return basicSetRegionCenter(null, msgs);
			case StylePackage.DOCUMENT_ROOT__REGION_LEFT:
				return basicSetRegionLeft(null, msgs);
			case StylePackage.DOCUMENT_ROOT__REGION_RIGHT:
				return basicSetRegionRight(null, msgs);
			case StylePackage.DOCUMENT_ROOT__RUBY_PROPERTIES:
				return basicSetRubyProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__SECTION_PROPERTIES:
				return basicSetSectionProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TABLE_CELL_PROPERTIES:
				return basicSetTableCellProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES:
				return basicSetTableColumnProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TABLE_PROPERTIES:
				return basicSetTableProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TABLE_ROW_PROPERTIES:
				return basicSetTableRowProperties(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TAB_STOP:
				return basicSetTabStop(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TAB_STOPS:
				return basicSetTabStops(null, msgs);
			case StylePackage.DOCUMENT_ROOT__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
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
			case StylePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_IMAGE:
				return getBackgroundImage();
			case StylePackage.DOCUMENT_ROOT__CHART_PROPERTIES:
				return getChartProperties();
			case StylePackage.DOCUMENT_ROOT__COLUMN:
				return getColumn();
			case StylePackage.DOCUMENT_ROOT__COLUMNS:
				return getColumns();
			case StylePackage.DOCUMENT_ROOT__COLUMN_SEP:
				return getColumnSep();
			case StylePackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return getDefaultStyle();
			case StylePackage.DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES:
				return getDrawingPageProperties();
			case StylePackage.DOCUMENT_ROOT__DROP_CAP:
				return getDropCap();
			case StylePackage.DOCUMENT_ROOT__FONT_FACE:
				return getFontFace();
			case StylePackage.DOCUMENT_ROOT__FOOTER:
				return getFooter();
			case StylePackage.DOCUMENT_ROOT__FOOTER_LEFT:
				return getFooterLeft();
			case StylePackage.DOCUMENT_ROOT__FOOTER_STYLE:
				return getFooterStyle();
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_SEP:
				return getFootnoteSep();
			case StylePackage.DOCUMENT_ROOT__GRAPHIC_PROPERTIES:
				return getGraphicProperties();
			case StylePackage.DOCUMENT_ROOT__HANDOUT_MASTER:
				return getHandoutMaster();
			case StylePackage.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case StylePackage.DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES:
				return getHeaderFooterProperties();
			case StylePackage.DOCUMENT_ROOT__HEADER_LEFT:
				return getHeaderLeft();
			case StylePackage.DOCUMENT_ROOT__HEADER_STYLE:
				return getHeaderStyle();
			case StylePackage.DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES:
				return getListLevelProperties();
			case StylePackage.DOCUMENT_ROOT__MAP:
				return getMap();
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE:
				return getMasterPage();
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT:
				return getPageLayout();
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES:
				return getPageLayoutProperties();
			case StylePackage.DOCUMENT_ROOT__PARAGRAPH_PROPERTIES:
				return getParagraphProperties();
			case StylePackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT:
				return getPresentationPageLayout();
			case StylePackage.DOCUMENT_ROOT__REGION_CENTER:
				return getRegionCenter();
			case StylePackage.DOCUMENT_ROOT__REGION_LEFT:
				return getRegionLeft();
			case StylePackage.DOCUMENT_ROOT__REGION_RIGHT:
				return getRegionRight();
			case StylePackage.DOCUMENT_ROOT__RUBY_PROPERTIES:
				return getRubyProperties();
			case StylePackage.DOCUMENT_ROOT__SECTION_PROPERTIES:
				return getSectionProperties();
			case StylePackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case StylePackage.DOCUMENT_ROOT__TABLE_CELL_PROPERTIES:
				return getTableCellProperties();
			case StylePackage.DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES:
				return getTableColumnProperties();
			case StylePackage.DOCUMENT_ROOT__TABLE_PROPERTIES:
				return getTableProperties();
			case StylePackage.DOCUMENT_ROOT__TABLE_ROW_PROPERTIES:
				return getTableRowProperties();
			case StylePackage.DOCUMENT_ROOT__TAB_STOP:
				return getTabStop();
			case StylePackage.DOCUMENT_ROOT__TAB_STOPS:
				return getTabStops();
			case StylePackage.DOCUMENT_ROOT__TEXT_PROPERTIES:
				return getTextProperties();
			case StylePackage.DOCUMENT_ROOT__ADJUSTMENT:
				return getAdjustment();
			case StylePackage.DOCUMENT_ROOT__APPLY_STYLE_NAME:
				return getApplyStyleName();
			case StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT:
				return getAutoTextIndent();
			case StylePackage.DOCUMENT_ROOT__AUTO_UPDATE:
				return getAutoUpdate();
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY:
				return getBackgroundTransparency();
			case StylePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				return getBaseCellAddress();
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH:
				return getBorderLineWidth();
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM:
				return getBorderLineWidthBottom();
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT:
				return getBorderLineWidthLeft();
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT:
				return getBorderLineWidthRight();
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP:
				return getBorderLineWidthTop();
			case StylePackage.DOCUMENT_ROOT__CELL_PROTECT:
				return getCellProtect();
			case StylePackage.DOCUMENT_ROOT__CHAR:
				return getChar();
			case StylePackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case StylePackage.DOCUMENT_ROOT__COLOR:
				return getColor();
			case StylePackage.DOCUMENT_ROOT__COLUMN_WIDTH:
				return getColumnWidth();
			case StylePackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case StylePackage.DOCUMENT_ROOT__COUNTRY_ASIAN:
				return getCountryAsian();
			case StylePackage.DOCUMENT_ROOT__COUNTRY_COMPLEX:
				return getCountryComplex();
			case StylePackage.DOCUMENT_ROOT__DATA_STYLE_NAME:
				return getDataStyleName();
			case StylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return getDecimalPlaces();
			case StylePackage.DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL:
				return getDefaultOutlineLevel();
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR:
				return getDiagonalBlTr();
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS:
				return getDiagonalBlTrWidths();
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR:
				return getDiagonalTlBr();
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS:
				return getDiagonalTlBrWidths();
			case StylePackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case StylePackage.DOCUMENT_ROOT__DISPLAY:
				return getDisplay();
			case StylePackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case StylePackage.DOCUMENT_ROOT__DISTANCE:
				return getDistance();
			case StylePackage.DOCUMENT_ROOT__DISTANCE_AFTER_SEP:
				return getDistanceAfterSep();
			case StylePackage.DOCUMENT_ROOT__DISTANCE_BEFORE_SEP:
				return getDistanceBeforeSep();
			case StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING:
				return getDynamicSpacing();
			case StylePackage.DOCUMENT_ROOT__EDITABLE:
				return getEditable();
			case StylePackage.DOCUMENT_ROOT__FAMILY:
				return getFamily();
			case StylePackage.DOCUMENT_ROOT__FILTER_NAME:
				return getFilterName();
			case StylePackage.DOCUMENT_ROOT__FIRST_PAGE_NUMBER:
				return getFirstPageNumber();
			case StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT:
				return getFlowWithText();
			case StylePackage.DOCUMENT_ROOT__FONT_ADORNMENTS:
				return getFontAdornments();
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET:
				return getFontCharset();
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_ASIAN:
				return getFontCharsetAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_COMPLEX:
				return getFontCharsetComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_ASIAN:
				return getFontFamilyAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_COMPLEX:
				return getFontFamilyComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC:
				return getFontFamilyGeneric();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN:
				return getFontFamilyGenericAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX:
				return getFontFamilyGenericComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING:
				return getFontIndependentLineSpacing();
			case StylePackage.DOCUMENT_ROOT__FONT_NAME:
				return getFontName();
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_ASIAN:
				return getFontNameAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_COMPLEX:
				return getFontNameComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH:
				return getFontPitch();
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN:
				return getFontPitchAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX:
				return getFontPitchComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_RELIEF:
				return getFontRelief();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_ASIAN:
				return getFontSizeAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_COMPLEX:
				return getFontSizeComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL:
				return getFontSizeRel();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN:
				return getFontSizeRelAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX:
				return getFontSizeRelComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN:
				return getFontStyleAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX:
				return getFontStyleComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME:
				return getFontStyleName();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN:
				return getFontStyleNameAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX:
				return getFontStyleNameComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN:
				return getFontWeightAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX:
				return getFontWeightComplex();
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT:
				return getFootnoteMaxHeight();
			case StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL:
				return getGlyphOrientationVertical();
			case StylePackage.DOCUMENT_ROOT__HEIGHT:
				return getHeight();
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS:
				return getHorizontalPos();
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL:
				return getHorizontalRel();
			case StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD:
				return getJustifySingleWord();
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_ASIAN:
				return getLanguageAsian();
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_COMPLEX:
				return getLanguageComplex();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT:
				return getLayoutGridBaseHeight();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_COLOR:
				return getLayoutGridColor();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY:
				return getLayoutGridDisplay();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_LINES:
				return getLayoutGridLines();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE:
				return getLayoutGridMode();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT:
				return getLayoutGridPrint();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW:
				return getLayoutGridRubyBelow();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT:
				return getLayoutGridRubyHeight();
			case StylePackage.DOCUMENT_ROOT__LEADER_CHAR:
				return getLeaderChar();
			case StylePackage.DOCUMENT_ROOT__LEADER_COLOR:
				return getLeaderColor();
			case StylePackage.DOCUMENT_ROOT__LEADER_STYLE:
				return getLeaderStyle();
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT:
				return getLeaderText();
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT_STYLE:
				return getLeaderTextStyle();
			case StylePackage.DOCUMENT_ROOT__LEADER_TYPE:
				return getLeaderType();
			case StylePackage.DOCUMENT_ROOT__LEADER_WIDTH:
				return getLeaderWidth();
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION:
				return getLegendExpansion();
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO:
				return new Double(getLegendExpansionAspectRatio());
			case StylePackage.DOCUMENT_ROOT__LENGTH:
				return getLength();
			case StylePackage.DOCUMENT_ROOT__LETTER_KERNING:
				return getLetterKerning();
			case StylePackage.DOCUMENT_ROOT__LINE_BREAK:
				return getLineBreak();
			case StylePackage.DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST:
				return getLineHeightAtLeast();
			case StylePackage.DOCUMENT_ROOT__LINES:
				return getLines();
			case StylePackage.DOCUMENT_ROOT__LINE_SPACING:
				return getLineSpacing();
			case StylePackage.DOCUMENT_ROOT__LINE_STYLE:
				return getLineStyle();
			case StylePackage.DOCUMENT_ROOT__LIST_STYLE_NAME:
				return getListStyleName();
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				return getMasterPageName();
			case StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS:
				return getMayBreakBetweenRows();
			case StylePackage.DOCUMENT_ROOT__MIN_ROW_HEIGHT:
				return getMinRowHeight();
			case StylePackage.DOCUMENT_ROOT__MIRROR:
				return getMirror();
			case StylePackage.DOCUMENT_ROOT__NEXT_STYLE_NAME:
				return getNextStyleName();
			case StylePackage.DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS:
				return getNumberWrappedParagraphs();
			case StylePackage.DOCUMENT_ROOT__NUM_FORMAT:
				return getNumFormat();
			case StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case StylePackage.DOCUMENT_ROOT__NUM_PREFIX:
				return getNumPrefix();
			case StylePackage.DOCUMENT_ROOT__NUM_SUFFIX:
				return getNumSuffix();
			case StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR:
				return getOverflowBehavior();
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_NAME:
				return getPageLayoutName();
			case StylePackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return getPageNumber();
			case StylePackage.DOCUMENT_ROOT__PAGE_USAGE:
				return getPageUsage();
			case StylePackage.DOCUMENT_ROOT__PAPER_TRAY_NAME:
				return getPaperTrayName();
			case StylePackage.DOCUMENT_ROOT__PARENT_STYLE_NAME:
				return getParentStyleName();
			case StylePackage.DOCUMENT_ROOT__PRINT:
				return getPrint();
			case StylePackage.DOCUMENT_ROOT__PRINT_CONTENT:
				return getPrintContent();
			case StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION:
				return getPrintOrientation();
			case StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER:
				return getPrintPageOrder();
			case StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP:
				return getPunctuationWrap();
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUE:
				return getRegisterTrue();
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME:
				return getRegisterTruthRefStyleName();
			case StylePackage.DOCUMENT_ROOT__REL_COLUMN_WIDTH:
				return getRelColumnWidth();
			case StylePackage.DOCUMENT_ROOT__REL_HEIGHT:
				return getRelHeight();
			case StylePackage.DOCUMENT_ROOT__REPEAT:
				return getRepeat();
			case StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT:
				return getRepeatContent();
			case StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN:
				return getRotationAlign();
			case StylePackage.DOCUMENT_ROOT__ROTATION_ANGLE:
				return getRotationAngle();
			case StylePackage.DOCUMENT_ROOT__ROW_HEIGHT:
				return getRowHeight();
			case StylePackage.DOCUMENT_ROOT__RUBY_ALIGN:
				return getRubyAlign();
			case StylePackage.DOCUMENT_ROOT__RUBY_POSITION:
				return getRubyPosition();
			case StylePackage.DOCUMENT_ROOT__RUN_THROUGH:
				return getRunThrough();
			case StylePackage.DOCUMENT_ROOT__SCALE_TO:
				return getScaleTo();
			case StylePackage.DOCUMENT_ROOT__SCALE_TO_PAGES:
				return getScaleToPages();
			case StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE:
				return getScriptType();
			case StylePackage.DOCUMENT_ROOT__SHADOW:
				return getShadow();
			case StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT:
				return getShrinkToFit();
			case StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID:
				return getSnapToLayoutGrid();
			case StylePackage.DOCUMENT_ROOT__STYLE1:
				return getStyle1();
			case StylePackage.DOCUMENT_ROOT__STYLE_NAME:
				return getStyleName();
			case StylePackage.DOCUMENT_ROOT__TABLE_CENTERING:
				return getTableCentering();
			case StylePackage.DOCUMENT_ROOT__TAB_STOP_DISTANCE:
				return getTabStopDistance();
			case StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE:
				return getTextAlignSource();
			case StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE:
				return getTextAutospace();
			case StylePackage.DOCUMENT_ROOT__TEXT_BLINKING:
				return getTextBlinking();
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE:
				return getTextCombine();
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR:
				return getTextCombineEndChar();
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR:
				return getTextCombineStartChar();
			case StylePackage.DOCUMENT_ROOT__TEXT_EMPHASIZE:
				return getTextEmphasize();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR:
				return getTextLineThroughColor();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE:
				return getTextLineThroughMode();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE:
				return getTextLineThroughStyle();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT:
				return getTextLineThroughText();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE:
				return getTextLineThroughTextStyle();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE:
				return getTextLineThroughType();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH:
				return getTextLineThroughWidth();
			case StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE:
				return getTextOutline();
			case StylePackage.DOCUMENT_ROOT__TEXT_POSITION:
				return getTextPosition();
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_ANGLE:
				return getTextRotationAngle();
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE:
				return getTextRotationScale();
			case StylePackage.DOCUMENT_ROOT__TEXT_SCALE:
				return getTextScale();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR:
				return getTextUnderlineColor();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE:
				return getTextUnderlineMode();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE:
				return getTextUnderlineStyle();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE:
				return getTextUnderlineType();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH:
				return getTextUnderlineWidth();
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH:
				return getUseOptimalColumnWidth();
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT:
				return getUseOptimalRowHeight();
			case StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR:
				return getUseWindowFontColor();
			case StylePackage.DOCUMENT_ROOT__VERTICAL_POS:
				return getVerticalPos();
			case StylePackage.DOCUMENT_ROOT__VERTICAL_REL:
				return getVerticalRel();
			case StylePackage.DOCUMENT_ROOT__VOLATILE:
				return getVolatile();
			case StylePackage.DOCUMENT_ROOT__WRAP:
				return getWrap();
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR:
				return getWrapContour();
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE:
				return getWrapContourMode();
			case StylePackage.DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD:
				return getWrapDynamicThreshold();
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE:
				return getWritingMode();
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC:
				return getWritingModeAutomatic();
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
			case StylePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImageType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__CHART_PROPERTIES:
				setChartProperties((StyleChartPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMNS:
				setColumns((ColumnsType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN_SEP:
				setColumnSep((ColumnSepType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				setDefaultStyle((StyleStyleContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES:
				setDrawingPageProperties((StyleDrawingPagePropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DROP_CAP:
				setDropCap((DropCapType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FACE:
				setFontFace((FontFaceType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER_LEFT:
				setFooterLeft((FooterLeftType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER_STYLE:
				setFooterStyle((FooterStyleType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_SEP:
				setFootnoteSep((FootnoteSepType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__GRAPHIC_PROPERTIES:
				setGraphicProperties((StyleGraphicPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HANDOUT_MASTER:
				setHandoutMaster((HandoutMasterType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES:
				setHeaderFooterProperties((StyleHeaderFooterPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_LEFT:
				setHeaderLeft((HeaderLeftType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_STYLE:
				setHeaderStyle((HeaderStyleType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE:
				setMasterPage((MasterPageType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT:
				setPageLayout((PageLayoutType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES:
				setPageLayoutProperties((StylePageLayoutPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PARAGRAPH_PROPERTIES:
				setParagraphProperties((StyleParagraphPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT:
				setPresentationPageLayout((PresentationPageLayoutType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_CENTER:
				setRegionCenter((RegionContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_LEFT:
				setRegionLeft((RegionContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_RIGHT:
				setRegionRight((RegionContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_PROPERTIES:
				setRubyProperties((StyleRubyPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SECTION_PROPERTIES:
				setSectionProperties((StyleSectionPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType1)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_CELL_PROPERTIES:
				setTableCellProperties((StyleTableCellPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES:
				setTableColumnProperties((StyleTableColumnPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_PROPERTIES:
				setTableProperties((StyleTablePropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_ROW_PROPERTIES:
				setTableRowProperties((StyleTableRowPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOP:
				setTabStop((TabStopType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOPS:
				setTabStops((TabStopsType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__ADJUSTMENT:
				setAdjustment((AdjustmentType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__APPLY_STYLE_NAME:
				setApplyStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT:
				setAutoTextIndent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__AUTO_UPDATE:
				setAutoUpdate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY:
				setBackgroundTransparency((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				setBaseCellAddress((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH:
				setBorderLineWidth((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM:
				setBorderLineWidthBottom((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT:
				setBorderLineWidthLeft((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT:
				setBorderLineWidthRight((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP:
				setBorderLineWidthTop((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__CELL_PROTECT:
				setCellProtect(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__CHAR:
				setChar((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__CLASS:
				setClass((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COLOR:
				setColor((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN_WIDTH:
				setColumnWidth((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__CONDITION:
				setCondition((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COUNTRY_ASIAN:
				setCountryAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__COUNTRY_COMPLEX:
				setCountryComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DATA_STYLE_NAME:
				setDataStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL:
				setDefaultOutlineLevel((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR:
				setDiagonalBlTr((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS:
				setDiagonalBlTrWidths((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR:
				setDiagonalTlBr((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS:
				setDiagonalTlBrWidths((List<String>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE:
				setDistance((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE_AFTER_SEP:
				setDistanceAfterSep((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE_BEFORE_SEP:
				setDistanceBeforeSep((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING:
				setDynamicSpacing((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__EDITABLE:
				setEditable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FAMILY:
				setFamily((FamilyType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FIRST_PAGE_NUMBER:
				setFirstPageNumber(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT:
				setFlowWithText((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_ADORNMENTS:
				setFontAdornments((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET:
				setFontCharset((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_ASIAN:
				setFontCharsetAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_COMPLEX:
				setFontCharsetComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_ASIAN:
				setFontFamilyAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_COMPLEX:
				setFontFamilyComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC:
				setFontFamilyGeneric((FontFamilyGeneric)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN:
				setFontFamilyGenericAsian((FontFamilyGeneric)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX:
				setFontFamilyGenericComplex((FontFamilyGeneric)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING:
				setFontIndependentLineSpacing((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME:
				setFontName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_ASIAN:
				setFontNameAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_COMPLEX:
				setFontNameComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH:
				setFontPitch((FontPitch)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN:
				setFontPitchAsian((FontPitch)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX:
				setFontPitchComplex((FontPitch)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_RELIEF:
				setFontRelief((FontReliefType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_ASIAN:
				setFontSizeAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_COMPLEX:
				setFontSizeComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL:
				setFontSizeRel((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN:
				setFontSizeRelAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX:
				setFontSizeRelComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN:
				setFontStyleAsian((FontStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX:
				setFontStyleComplex((FontStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME:
				setFontStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN:
				setFontStyleNameAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX:
				setFontStyleNameComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN:
				setFontWeightAsian((FontWeight)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX:
				setFontWeightComplex((FontWeight)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT:
				setFootnoteMaxHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL:
				setGlyphOrientationVertical((GlyphOrientationVerticalType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HEIGHT:
				setHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS:
				setHorizontalPos((HorizontalPosType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL:
				setHorizontalRel((HorizontalRelType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD:
				setJustifySingleWord((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_ASIAN:
				setLanguageAsian((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_COMPLEX:
				setLanguageComplex((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT:
				setLayoutGridBaseHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_COLOR:
				setLayoutGridColor((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY:
				setLayoutGridDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_LINES:
				setLayoutGridLines((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE:
				setLayoutGridMode((LayoutGridModeType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT:
				setLayoutGridPrint((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW:
				setLayoutGridRubyBelow((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT:
				setLayoutGridRubyHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_CHAR:
				setLeaderChar((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_COLOR:
				setLeaderColor(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_STYLE:
				setLeaderStyle((LineStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT:
				setLeaderText((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT_STYLE:
				setLeaderTextStyle((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TYPE:
				setLeaderType((LineType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_WIDTH:
				setLeaderWidth(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION:
				setLegendExpansion((LegendExpansionType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO:
				setLegendExpansionAspectRatio(((Double)newValue).doubleValue());
				return;
			case StylePackage.DOCUMENT_ROOT__LENGTH:
				setLength(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LETTER_KERNING:
				setLetterKerning((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_BREAK:
				setLineBreak((LineBreakType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST:
				setLineHeightAtLeast((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LINES:
				setLines((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_SPACING:
				setLineSpacing((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__LIST_STYLE_NAME:
				setListStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				setMasterPageName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS:
				setMayBreakBetweenRows((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MIN_ROW_HEIGHT:
				setMinRowHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__MIRROR:
				setMirror(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NEXT_STYLE_NAME:
				setNextStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS:
				setNumberWrappedParagraphs(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_PREFIX:
				setNumPrefix((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_SUFFIX:
				setNumSuffix((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR:
				setOverflowBehavior((OverflowBehaviorType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_NAME:
				setPageLayoutName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_USAGE:
				setPageUsage((PageUsageType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PAPER_TRAY_NAME:
				setPaperTrayName(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PARENT_STYLE_NAME:
				setParentStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT:
				setPrint((List<PrintTypeItem>)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_CONTENT:
				setPrintContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION:
				setPrintOrientation((PrintOrientationType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER:
				setPrintPageOrder((PrintPageOrderType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP:
				setPunctuationWrap((PunctuationWrapType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUE:
				setRegisterTrue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME:
				setRegisterTruthRefStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REL_COLUMN_WIDTH:
				setRelColumnWidth((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REL_HEIGHT:
				setRelHeight(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REPEAT:
				setRepeat((RepeatType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT:
				setRepeatContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN:
				setRotationAlign((RotationAlignType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__ROTATION_ANGLE:
				setRotationAngle((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__ROW_HEIGHT:
				setRowHeight((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_ALIGN:
				setRubyAlign((RubyAlignType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_POSITION:
				setRubyPosition((RubyPositionType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__RUN_THROUGH:
				setRunThrough((RunThroughType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SCALE_TO:
				setScaleTo((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SCALE_TO_PAGES:
				setScaleToPages((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE:
				setScriptType((ScriptTypeType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SHADOW:
				setShadow(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT:
				setShrinkToFit((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID:
				setSnapToLayoutGrid((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE1:
				setStyle1((StyleType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_CENTERING:
				setTableCentering((TableCenteringType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOP_DISTANCE:
				setTabStopDistance((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE:
				setTextAlignSource((TextAlignSourceType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE:
				setTextAutospace((TextAutospaceType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_BLINKING:
				setTextBlinking((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE:
				setTextCombine((TextCombineType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR:
				setTextCombineEndChar((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR:
				setTextCombineStartChar((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_EMPHASIZE:
				setTextEmphasize(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR:
				setTextLineThroughColor(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE:
				setTextLineThroughMode((LineMode)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE:
				setTextLineThroughStyle((LineStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT:
				setTextLineThroughText((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE:
				setTextLineThroughTextStyle((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE:
				setTextLineThroughType((LineType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH:
				setTextLineThroughWidth(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE:
				setTextOutline((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_POSITION:
				setTextPosition((List)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_ANGLE:
				setTextRotationAngle((BigInteger)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE:
				setTextRotationScale((TextRotationScaleType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_SCALE:
				setTextScale((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR:
				setTextUnderlineColor(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE:
				setTextUnderlineMode((LineMode)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE:
				setTextUnderlineStyle((LineStyle)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE:
				setTextUnderlineType((LineType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH:
				setTextUnderlineWidth(newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH:
				setUseOptimalColumnWidth((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT:
				setUseOptimalRowHeight((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR:
				setUseWindowFontColor((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__VERTICAL_POS:
				setVerticalPos((VerticalPosType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__VERTICAL_REL:
				setVerticalRel((VerticalRelType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__VOLATILE:
				setVolatile((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP:
				setWrap((WrapType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR:
				setWrapContour((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE:
				setWrapContourMode((WrapContourModeType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD:
				setWrapDynamicThreshold((String)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE:
				setWritingMode((WritingModeType)newValue);
				return;
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC:
				setWritingModeAutomatic((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case StylePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImageType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__CHART_PROPERTIES:
				setChartProperties((StyleChartPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMNS:
				setColumns((ColumnsType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN_SEP:
				setColumnSep((ColumnSepType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				setDefaultStyle((StyleStyleContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES:
				setDrawingPageProperties((StyleDrawingPagePropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__DROP_CAP:
				setDropCap((DropCapType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FACE:
				setFontFace((FontFaceType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER_LEFT:
				setFooterLeft((FooterLeftType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTER_STYLE:
				setFooterStyle((FooterStyleType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_SEP:
				setFootnoteSep((FootnoteSepType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__GRAPHIC_PROPERTIES:
				setGraphicProperties((StyleGraphicPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__HANDOUT_MASTER:
				setHandoutMaster((HandoutMasterType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES:
				setHeaderFooterProperties((StyleHeaderFooterPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_LEFT:
				setHeaderLeft((HeaderLeftType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__HEADER_STYLE:
				setHeaderStyle((HeaderStyleType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES:
				setListLevelProperties((StyleListLevelPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__MAP:
				setMap((MapType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE:
				setMasterPage((MasterPageType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT:
				setPageLayout((PageLayoutType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES:
				setPageLayoutProperties((StylePageLayoutPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__PARAGRAPH_PROPERTIES:
				setParagraphProperties((StyleParagraphPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT:
				setPresentationPageLayout((PresentationPageLayoutType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_CENTER:
				setRegionCenter((RegionContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_LEFT:
				setRegionLeft((RegionContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__REGION_RIGHT:
				setRegionRight((RegionContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_PROPERTIES:
				setRubyProperties((StyleRubyPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__SECTION_PROPERTIES:
				setSectionProperties((StyleSectionPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType1)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_CELL_PROPERTIES:
				setTableCellProperties((StyleTableCellPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES:
				setTableColumnProperties((StyleTableColumnPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_PROPERTIES:
				setTableProperties((StyleTablePropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_ROW_PROPERTIES:
				setTableRowProperties((StyleTableRowPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOP:
				setTabStop((TabStopType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOPS:
				setTabStops((TabStopsType)null);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case StylePackage.DOCUMENT_ROOT__ADJUSTMENT:
				unsetAdjustment();
				return;
			case StylePackage.DOCUMENT_ROOT__APPLY_STYLE_NAME:
				setApplyStyleName(APPLY_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT:
				unsetAutoTextIndent();
				return;
			case StylePackage.DOCUMENT_ROOT__AUTO_UPDATE:
				unsetAutoUpdate();
				return;
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY:
				setBackgroundTransparency(BACKGROUND_TRANSPARENCY_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				setBaseCellAddress(BASE_CELL_ADDRESS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH:
				setBorderLineWidth(BORDER_LINE_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM:
				setBorderLineWidthBottom(BORDER_LINE_WIDTH_BOTTOM_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT:
				setBorderLineWidthLeft(BORDER_LINE_WIDTH_LEFT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT:
				setBorderLineWidthRight(BORDER_LINE_WIDTH_RIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP:
				setBorderLineWidthTop(BORDER_LINE_WIDTH_TOP_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__CELL_PROTECT:
				setCellProtect(CELL_PROTECT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__COLUMN_WIDTH:
				setColumnWidth(COLUMN_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__COUNTRY_ASIAN:
				setCountryAsian(COUNTRY_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__COUNTRY_COMPLEX:
				setCountryComplex(COUNTRY_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DATA_STYLE_NAME:
				setDataStyleName(DATA_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces(DECIMAL_PLACES_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL:
				setDefaultOutlineLevel(DEFAULT_OUTLINE_LEVEL_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR:
				setDiagonalBlTr(DIAGONAL_BL_TR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS:
				setDiagonalBlTrWidths(DIAGONAL_BL_TR_WIDTHS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR:
				setDiagonalTlBr(DIAGONAL_TL_BR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS:
				setDiagonalTlBrWidths(DIAGONAL_TL_BR_WIDTHS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DIRECTION:
				unsetDirection();
				return;
			case StylePackage.DOCUMENT_ROOT__DISPLAY:
				unsetDisplay();
				return;
			case StylePackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE_AFTER_SEP:
				setDistanceAfterSep(DISTANCE_AFTER_SEP_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DISTANCE_BEFORE_SEP:
				setDistanceBeforeSep(DISTANCE_BEFORE_SEP_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING:
				unsetDynamicSpacing();
				return;
			case StylePackage.DOCUMENT_ROOT__EDITABLE:
				unsetEditable();
				return;
			case StylePackage.DOCUMENT_ROOT__FAMILY:
				unsetFamily();
				return;
			case StylePackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FIRST_PAGE_NUMBER:
				setFirstPageNumber(FIRST_PAGE_NUMBER_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT:
				unsetFlowWithText();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_ADORNMENTS:
				setFontAdornments(FONT_ADORNMENTS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET:
				setFontCharset(FONT_CHARSET_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_ASIAN:
				setFontCharsetAsian(FONT_CHARSET_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_COMPLEX:
				setFontCharsetComplex(FONT_CHARSET_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_ASIAN:
				setFontFamilyAsian(FONT_FAMILY_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_COMPLEX:
				setFontFamilyComplex(FONT_FAMILY_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC:
				unsetFontFamilyGeneric();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN:
				unsetFontFamilyGenericAsian();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX:
				unsetFontFamilyGenericComplex();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING:
				unsetFontIndependentLineSpacing();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_ASIAN:
				setFontNameAsian(FONT_NAME_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_COMPLEX:
				setFontNameComplex(FONT_NAME_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH:
				unsetFontPitch();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN:
				unsetFontPitchAsian();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX:
				unsetFontPitchComplex();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_RELIEF:
				unsetFontRelief();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_ASIAN:
				setFontSizeAsian(FONT_SIZE_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_COMPLEX:
				setFontSizeComplex(FONT_SIZE_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL:
				setFontSizeRel(FONT_SIZE_REL_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN:
				setFontSizeRelAsian(FONT_SIZE_REL_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX:
				setFontSizeRelComplex(FONT_SIZE_REL_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN:
				unsetFontStyleAsian();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX:
				unsetFontStyleComplex();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME:
				setFontStyleName(FONT_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN:
				setFontStyleNameAsian(FONT_STYLE_NAME_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX:
				setFontStyleNameComplex(FONT_STYLE_NAME_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN:
				unsetFontWeightAsian();
				return;
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX:
				unsetFontWeightComplex();
				return;
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT:
				setFootnoteMaxHeight(FOOTNOTE_MAX_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL:
				unsetGlyphOrientationVertical();
				return;
			case StylePackage.DOCUMENT_ROOT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS:
				unsetHorizontalPos();
				return;
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL:
				unsetHorizontalRel();
				return;
			case StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD:
				unsetJustifySingleWord();
				return;
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_ASIAN:
				setLanguageAsian(LANGUAGE_ASIAN_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_COMPLEX:
				setLanguageComplex(LANGUAGE_COMPLEX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT:
				setLayoutGridBaseHeight(LAYOUT_GRID_BASE_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_COLOR:
				setLayoutGridColor(LAYOUT_GRID_COLOR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY:
				unsetLayoutGridDisplay();
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_LINES:
				setLayoutGridLines(LAYOUT_GRID_LINES_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE:
				unsetLayoutGridMode();
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT:
				unsetLayoutGridPrint();
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW:
				unsetLayoutGridRubyBelow();
				return;
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT:
				setLayoutGridRubyHeight(LAYOUT_GRID_RUBY_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_CHAR:
				setLeaderChar(LEADER_CHAR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_COLOR:
				setLeaderColor(LEADER_COLOR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_STYLE:
				unsetLeaderStyle();
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT:
				setLeaderText(LEADER_TEXT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT_STYLE:
				setLeaderTextStyle(LEADER_TEXT_STYLE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_TYPE:
				unsetLeaderType();
				return;
			case StylePackage.DOCUMENT_ROOT__LEADER_WIDTH:
				setLeaderWidth(LEADER_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION:
				unsetLegendExpansion();
				return;
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO:
				unsetLegendExpansionAspectRatio();
				return;
			case StylePackage.DOCUMENT_ROOT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LETTER_KERNING:
				unsetLetterKerning();
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_BREAK:
				unsetLineBreak();
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST:
				setLineHeightAtLeast(LINE_HEIGHT_AT_LEAST_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LINES:
				setLines(LINES_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_SPACING:
				setLineSpacing(LINE_SPACING_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__LINE_STYLE:
				unsetLineStyle();
				return;
			case StylePackage.DOCUMENT_ROOT__LIST_STYLE_NAME:
				setListStyleName(LIST_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				setMasterPageName(MASTER_PAGE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS:
				unsetMayBreakBetweenRows();
				return;
			case StylePackage.DOCUMENT_ROOT__MIN_ROW_HEIGHT:
				setMinRowHeight(MIN_ROW_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__MIRROR:
				setMirror(MIRROR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__NEXT_STYLE_NAME:
				setNextStyleName(NEXT_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS:
				setNumberWrappedParagraphs(NUMBER_WRAPPED_PARAGRAPHS_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_PREFIX:
				setNumPrefix(NUM_PREFIX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__NUM_SUFFIX:
				setNumSuffix(NUM_SUFFIX_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR:
				unsetOverflowBehavior();
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_NAME:
				setPageLayoutName(PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber(PAGE_NUMBER_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__PAGE_USAGE:
				unsetPageUsage();
				return;
			case StylePackage.DOCUMENT_ROOT__PAPER_TRAY_NAME:
				setPaperTrayName(PAPER_TRAY_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__PARENT_STYLE_NAME:
				setParentStyleName(PARENT_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT:
				setPrint(PRINT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_CONTENT:
				unsetPrintContent();
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION:
				unsetPrintOrientation();
				return;
			case StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER:
				unsetPrintPageOrder();
				return;
			case StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP:
				unsetPunctuationWrap();
				return;
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUE:
				unsetRegisterTrue();
				return;
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME:
				setRegisterTruthRefStyleName(REGISTER_TRUTH_REF_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__REL_COLUMN_WIDTH:
				setRelColumnWidth(REL_COLUMN_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__REL_HEIGHT:
				setRelHeight(REL_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__REPEAT:
				unsetRepeat();
				return;
			case StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT:
				unsetRepeatContent();
				return;
			case StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN:
				unsetRotationAlign();
				return;
			case StylePackage.DOCUMENT_ROOT__ROTATION_ANGLE:
				setRotationAngle(ROTATION_ANGLE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__ROW_HEIGHT:
				setRowHeight(ROW_HEIGHT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_ALIGN:
				unsetRubyAlign();
				return;
			case StylePackage.DOCUMENT_ROOT__RUBY_POSITION:
				unsetRubyPosition();
				return;
			case StylePackage.DOCUMENT_ROOT__RUN_THROUGH:
				unsetRunThrough();
				return;
			case StylePackage.DOCUMENT_ROOT__SCALE_TO:
				setScaleTo(SCALE_TO_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__SCALE_TO_PAGES:
				setScaleToPages(SCALE_TO_PAGES_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE:
				unsetScriptType();
				return;
			case StylePackage.DOCUMENT_ROOT__SHADOW:
				setShadow(SHADOW_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT:
				unsetShrinkToFit();
				return;
			case StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID:
				unsetSnapToLayoutGrid();
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE1:
				unsetStyle1();
				return;
			case StylePackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TABLE_CENTERING:
				unsetTableCentering();
				return;
			case StylePackage.DOCUMENT_ROOT__TAB_STOP_DISTANCE:
				setTabStopDistance(TAB_STOP_DISTANCE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE:
				unsetTextAlignSource();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE:
				unsetTextAutospace();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_BLINKING:
				unsetTextBlinking();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE:
				unsetTextCombine();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR:
				setTextCombineEndChar(TEXT_COMBINE_END_CHAR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR:
				setTextCombineStartChar(TEXT_COMBINE_START_CHAR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_EMPHASIZE:
				setTextEmphasize(TEXT_EMPHASIZE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR:
				setTextLineThroughColor(TEXT_LINE_THROUGH_COLOR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE:
				unsetTextLineThroughMode();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE:
				unsetTextLineThroughStyle();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT:
				setTextLineThroughText(TEXT_LINE_THROUGH_TEXT_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE:
				setTextLineThroughTextStyle(TEXT_LINE_THROUGH_TEXT_STYLE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE:
				unsetTextLineThroughType();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH:
				setTextLineThroughWidth(TEXT_LINE_THROUGH_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE:
				unsetTextOutline();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_POSITION:
				setTextPosition(TEXT_POSITION_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_ANGLE:
				setTextRotationAngle(TEXT_ROTATION_ANGLE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE:
				unsetTextRotationScale();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_SCALE:
				setTextScale(TEXT_SCALE_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR:
				setTextUnderlineColor(TEXT_UNDERLINE_COLOR_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE:
				unsetTextUnderlineMode();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE:
				unsetTextUnderlineStyle();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE:
				unsetTextUnderlineType();
				return;
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH:
				setTextUnderlineWidth(TEXT_UNDERLINE_WIDTH_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH:
				unsetUseOptimalColumnWidth();
				return;
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT:
				unsetUseOptimalRowHeight();
				return;
			case StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR:
				unsetUseWindowFontColor();
				return;
			case StylePackage.DOCUMENT_ROOT__VERTICAL_POS:
				unsetVerticalPos();
				return;
			case StylePackage.DOCUMENT_ROOT__VERTICAL_REL:
				unsetVerticalRel();
				return;
			case StylePackage.DOCUMENT_ROOT__VOLATILE:
				unsetVolatile();
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP:
				unsetWrap();
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR:
				unsetWrapContour();
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE:
				unsetWrapContourMode();
				return;
			case StylePackage.DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD:
				setWrapDynamicThreshold(WRAP_DYNAMIC_THRESHOLD_EDEFAULT);
				return;
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE:
				unsetWritingMode();
				return;
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC:
				unsetWritingModeAutomatic();
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
			case StylePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case StylePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case StylePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_IMAGE:
				return getBackgroundImage() != null;
			case StylePackage.DOCUMENT_ROOT__CHART_PROPERTIES:
				return getChartProperties() != null;
			case StylePackage.DOCUMENT_ROOT__COLUMN:
				return getColumn() != null;
			case StylePackage.DOCUMENT_ROOT__COLUMNS:
				return getColumns() != null;
			case StylePackage.DOCUMENT_ROOT__COLUMN_SEP:
				return getColumnSep() != null;
			case StylePackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return getDefaultStyle() != null;
			case StylePackage.DOCUMENT_ROOT__DRAWING_PAGE_PROPERTIES:
				return getDrawingPageProperties() != null;
			case StylePackage.DOCUMENT_ROOT__DROP_CAP:
				return getDropCap() != null;
			case StylePackage.DOCUMENT_ROOT__FONT_FACE:
				return getFontFace() != null;
			case StylePackage.DOCUMENT_ROOT__FOOTER:
				return getFooter() != null;
			case StylePackage.DOCUMENT_ROOT__FOOTER_LEFT:
				return getFooterLeft() != null;
			case StylePackage.DOCUMENT_ROOT__FOOTER_STYLE:
				return getFooterStyle() != null;
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_SEP:
				return getFootnoteSep() != null;
			case StylePackage.DOCUMENT_ROOT__GRAPHIC_PROPERTIES:
				return getGraphicProperties() != null;
			case StylePackage.DOCUMENT_ROOT__HANDOUT_MASTER:
				return getHandoutMaster() != null;
			case StylePackage.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case StylePackage.DOCUMENT_ROOT__HEADER_FOOTER_PROPERTIES:
				return getHeaderFooterProperties() != null;
			case StylePackage.DOCUMENT_ROOT__HEADER_LEFT:
				return getHeaderLeft() != null;
			case StylePackage.DOCUMENT_ROOT__HEADER_STYLE:
				return getHeaderStyle() != null;
			case StylePackage.DOCUMENT_ROOT__LIST_LEVEL_PROPERTIES:
				return getListLevelProperties() != null;
			case StylePackage.DOCUMENT_ROOT__MAP:
				return getMap() != null;
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE:
				return getMasterPage() != null;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT:
				return getPageLayout() != null;
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_PROPERTIES:
				return getPageLayoutProperties() != null;
			case StylePackage.DOCUMENT_ROOT__PARAGRAPH_PROPERTIES:
				return getParagraphProperties() != null;
			case StylePackage.DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT:
				return getPresentationPageLayout() != null;
			case StylePackage.DOCUMENT_ROOT__REGION_CENTER:
				return getRegionCenter() != null;
			case StylePackage.DOCUMENT_ROOT__REGION_LEFT:
				return getRegionLeft() != null;
			case StylePackage.DOCUMENT_ROOT__REGION_RIGHT:
				return getRegionRight() != null;
			case StylePackage.DOCUMENT_ROOT__RUBY_PROPERTIES:
				return getRubyProperties() != null;
			case StylePackage.DOCUMENT_ROOT__SECTION_PROPERTIES:
				return getSectionProperties() != null;
			case StylePackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case StylePackage.DOCUMENT_ROOT__TABLE_CELL_PROPERTIES:
				return getTableCellProperties() != null;
			case StylePackage.DOCUMENT_ROOT__TABLE_COLUMN_PROPERTIES:
				return getTableColumnProperties() != null;
			case StylePackage.DOCUMENT_ROOT__TABLE_PROPERTIES:
				return getTableProperties() != null;
			case StylePackage.DOCUMENT_ROOT__TABLE_ROW_PROPERTIES:
				return getTableRowProperties() != null;
			case StylePackage.DOCUMENT_ROOT__TAB_STOP:
				return getTabStop() != null;
			case StylePackage.DOCUMENT_ROOT__TAB_STOPS:
				return getTabStops() != null;
			case StylePackage.DOCUMENT_ROOT__TEXT_PROPERTIES:
				return getTextProperties() != null;
			case StylePackage.DOCUMENT_ROOT__ADJUSTMENT:
				return isSetAdjustment();
			case StylePackage.DOCUMENT_ROOT__APPLY_STYLE_NAME:
				return APPLY_STYLE_NAME_EDEFAULT == null ? applyStyleName != null : !APPLY_STYLE_NAME_EDEFAULT.equals(applyStyleName);
			case StylePackage.DOCUMENT_ROOT__AUTO_TEXT_INDENT:
				return isSetAutoTextIndent();
			case StylePackage.DOCUMENT_ROOT__AUTO_UPDATE:
				return isSetAutoUpdate();
			case StylePackage.DOCUMENT_ROOT__BACKGROUND_TRANSPARENCY:
				return BACKGROUND_TRANSPARENCY_EDEFAULT == null ? backgroundTransparency != null : !BACKGROUND_TRANSPARENCY_EDEFAULT.equals(backgroundTransparency);
			case StylePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				return BASE_CELL_ADDRESS_EDEFAULT == null ? baseCellAddress != null : !BASE_CELL_ADDRESS_EDEFAULT.equals(baseCellAddress);
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH:
				return BORDER_LINE_WIDTH_EDEFAULT == null ? borderLineWidth != null : !BORDER_LINE_WIDTH_EDEFAULT.equals(borderLineWidth);
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_BOTTOM:
				return BORDER_LINE_WIDTH_BOTTOM_EDEFAULT == null ? borderLineWidthBottom != null : !BORDER_LINE_WIDTH_BOTTOM_EDEFAULT.equals(borderLineWidthBottom);
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_LEFT:
				return BORDER_LINE_WIDTH_LEFT_EDEFAULT == null ? borderLineWidthLeft != null : !BORDER_LINE_WIDTH_LEFT_EDEFAULT.equals(borderLineWidthLeft);
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_RIGHT:
				return BORDER_LINE_WIDTH_RIGHT_EDEFAULT == null ? borderLineWidthRight != null : !BORDER_LINE_WIDTH_RIGHT_EDEFAULT.equals(borderLineWidthRight);
			case StylePackage.DOCUMENT_ROOT__BORDER_LINE_WIDTH_TOP:
				return BORDER_LINE_WIDTH_TOP_EDEFAULT == null ? borderLineWidthTop != null : !BORDER_LINE_WIDTH_TOP_EDEFAULT.equals(borderLineWidthTop);
			case StylePackage.DOCUMENT_ROOT__CELL_PROTECT:
				return CELL_PROTECT_EDEFAULT == null ? cellProtect != null : !CELL_PROTECT_EDEFAULT.equals(cellProtect);
			case StylePackage.DOCUMENT_ROOT__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case StylePackage.DOCUMENT_ROOT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case StylePackage.DOCUMENT_ROOT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case StylePackage.DOCUMENT_ROOT__COLUMN_WIDTH:
				return COLUMN_WIDTH_EDEFAULT == null ? columnWidth != null : !COLUMN_WIDTH_EDEFAULT.equals(columnWidth);
			case StylePackage.DOCUMENT_ROOT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case StylePackage.DOCUMENT_ROOT__COUNTRY_ASIAN:
				return COUNTRY_ASIAN_EDEFAULT == null ? countryAsian != null : !COUNTRY_ASIAN_EDEFAULT.equals(countryAsian);
			case StylePackage.DOCUMENT_ROOT__COUNTRY_COMPLEX:
				return COUNTRY_COMPLEX_EDEFAULT == null ? countryComplex != null : !COUNTRY_COMPLEX_EDEFAULT.equals(countryComplex);
			case StylePackage.DOCUMENT_ROOT__DATA_STYLE_NAME:
				return DATA_STYLE_NAME_EDEFAULT == null ? dataStyleName != null : !DATA_STYLE_NAME_EDEFAULT.equals(dataStyleName);
			case StylePackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return DECIMAL_PLACES_EDEFAULT == null ? decimalPlaces != null : !DECIMAL_PLACES_EDEFAULT.equals(decimalPlaces);
			case StylePackage.DOCUMENT_ROOT__DEFAULT_OUTLINE_LEVEL:
				return DEFAULT_OUTLINE_LEVEL_EDEFAULT == null ? defaultOutlineLevel != null : !DEFAULT_OUTLINE_LEVEL_EDEFAULT.equals(defaultOutlineLevel);
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR:
				return DIAGONAL_BL_TR_EDEFAULT == null ? diagonalBlTr != null : !DIAGONAL_BL_TR_EDEFAULT.equals(diagonalBlTr);
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_BL_TR_WIDTHS:
				return DIAGONAL_BL_TR_WIDTHS_EDEFAULT == null ? diagonalBlTrWidths != null : !DIAGONAL_BL_TR_WIDTHS_EDEFAULT.equals(diagonalBlTrWidths);
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR:
				return DIAGONAL_TL_BR_EDEFAULT == null ? diagonalTlBr != null : !DIAGONAL_TL_BR_EDEFAULT.equals(diagonalTlBr);
			case StylePackage.DOCUMENT_ROOT__DIAGONAL_TL_BR_WIDTHS:
				return DIAGONAL_TL_BR_WIDTHS_EDEFAULT == null ? diagonalTlBrWidths != null : !DIAGONAL_TL_BR_WIDTHS_EDEFAULT.equals(diagonalTlBrWidths);
			case StylePackage.DOCUMENT_ROOT__DIRECTION:
				return isSetDirection();
			case StylePackage.DOCUMENT_ROOT__DISPLAY:
				return isSetDisplay();
			case StylePackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case StylePackage.DOCUMENT_ROOT__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case StylePackage.DOCUMENT_ROOT__DISTANCE_AFTER_SEP:
				return DISTANCE_AFTER_SEP_EDEFAULT == null ? distanceAfterSep != null : !DISTANCE_AFTER_SEP_EDEFAULT.equals(distanceAfterSep);
			case StylePackage.DOCUMENT_ROOT__DISTANCE_BEFORE_SEP:
				return DISTANCE_BEFORE_SEP_EDEFAULT == null ? distanceBeforeSep != null : !DISTANCE_BEFORE_SEP_EDEFAULT.equals(distanceBeforeSep);
			case StylePackage.DOCUMENT_ROOT__DYNAMIC_SPACING:
				return isSetDynamicSpacing();
			case StylePackage.DOCUMENT_ROOT__EDITABLE:
				return isSetEditable();
			case StylePackage.DOCUMENT_ROOT__FAMILY:
				return isSetFamily();
			case StylePackage.DOCUMENT_ROOT__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case StylePackage.DOCUMENT_ROOT__FIRST_PAGE_NUMBER:
				return FIRST_PAGE_NUMBER_EDEFAULT == null ? firstPageNumber != null : !FIRST_PAGE_NUMBER_EDEFAULT.equals(firstPageNumber);
			case StylePackage.DOCUMENT_ROOT__FLOW_WITH_TEXT:
				return isSetFlowWithText();
			case StylePackage.DOCUMENT_ROOT__FONT_ADORNMENTS:
				return FONT_ADORNMENTS_EDEFAULT == null ? fontAdornments != null : !FONT_ADORNMENTS_EDEFAULT.equals(fontAdornments);
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET:
				return FONT_CHARSET_EDEFAULT == null ? fontCharset != null : !FONT_CHARSET_EDEFAULT.equals(fontCharset);
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_ASIAN:
				return FONT_CHARSET_ASIAN_EDEFAULT == null ? fontCharsetAsian != null : !FONT_CHARSET_ASIAN_EDEFAULT.equals(fontCharsetAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_CHARSET_COMPLEX:
				return FONT_CHARSET_COMPLEX_EDEFAULT == null ? fontCharsetComplex != null : !FONT_CHARSET_COMPLEX_EDEFAULT.equals(fontCharsetComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_ASIAN:
				return FONT_FAMILY_ASIAN_EDEFAULT == null ? fontFamilyAsian != null : !FONT_FAMILY_ASIAN_EDEFAULT.equals(fontFamilyAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_COMPLEX:
				return FONT_FAMILY_COMPLEX_EDEFAULT == null ? fontFamilyComplex != null : !FONT_FAMILY_COMPLEX_EDEFAULT.equals(fontFamilyComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC:
				return isSetFontFamilyGeneric();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_ASIAN:
				return isSetFontFamilyGenericAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_FAMILY_GENERIC_COMPLEX:
				return isSetFontFamilyGenericComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_INDEPENDENT_LINE_SPACING:
				return isSetFontIndependentLineSpacing();
			case StylePackage.DOCUMENT_ROOT__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_ASIAN:
				return FONT_NAME_ASIAN_EDEFAULT == null ? fontNameAsian != null : !FONT_NAME_ASIAN_EDEFAULT.equals(fontNameAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_NAME_COMPLEX:
				return FONT_NAME_COMPLEX_EDEFAULT == null ? fontNameComplex != null : !FONT_NAME_COMPLEX_EDEFAULT.equals(fontNameComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH:
				return isSetFontPitch();
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_ASIAN:
				return isSetFontPitchAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_PITCH_COMPLEX:
				return isSetFontPitchComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_RELIEF:
				return isSetFontRelief();
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_ASIAN:
				return FONT_SIZE_ASIAN_EDEFAULT == null ? fontSizeAsian != null : !FONT_SIZE_ASIAN_EDEFAULT.equals(fontSizeAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_COMPLEX:
				return FONT_SIZE_COMPLEX_EDEFAULT == null ? fontSizeComplex != null : !FONT_SIZE_COMPLEX_EDEFAULT.equals(fontSizeComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL:
				return FONT_SIZE_REL_EDEFAULT == null ? fontSizeRel != null : !FONT_SIZE_REL_EDEFAULT.equals(fontSizeRel);
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_ASIAN:
				return FONT_SIZE_REL_ASIAN_EDEFAULT == null ? fontSizeRelAsian != null : !FONT_SIZE_REL_ASIAN_EDEFAULT.equals(fontSizeRelAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_SIZE_REL_COMPLEX:
				return FONT_SIZE_REL_COMPLEX_EDEFAULT == null ? fontSizeRelComplex != null : !FONT_SIZE_REL_COMPLEX_EDEFAULT.equals(fontSizeRelComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_ASIAN:
				return isSetFontStyleAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_COMPLEX:
				return isSetFontStyleComplex();
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME:
				return FONT_STYLE_NAME_EDEFAULT == null ? fontStyleName != null : !FONT_STYLE_NAME_EDEFAULT.equals(fontStyleName);
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_ASIAN:
				return FONT_STYLE_NAME_ASIAN_EDEFAULT == null ? fontStyleNameAsian != null : !FONT_STYLE_NAME_ASIAN_EDEFAULT.equals(fontStyleNameAsian);
			case StylePackage.DOCUMENT_ROOT__FONT_STYLE_NAME_COMPLEX:
				return FONT_STYLE_NAME_COMPLEX_EDEFAULT == null ? fontStyleNameComplex != null : !FONT_STYLE_NAME_COMPLEX_EDEFAULT.equals(fontStyleNameComplex);
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_ASIAN:
				return isSetFontWeightAsian();
			case StylePackage.DOCUMENT_ROOT__FONT_WEIGHT_COMPLEX:
				return isSetFontWeightComplex();
			case StylePackage.DOCUMENT_ROOT__FOOTNOTE_MAX_HEIGHT:
				return FOOTNOTE_MAX_HEIGHT_EDEFAULT == null ? footnoteMaxHeight != null : !FOOTNOTE_MAX_HEIGHT_EDEFAULT.equals(footnoteMaxHeight);
			case StylePackage.DOCUMENT_ROOT__GLYPH_ORIENTATION_VERTICAL:
				return isSetGlyphOrientationVertical();
			case StylePackage.DOCUMENT_ROOT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_POS:
				return isSetHorizontalPos();
			case StylePackage.DOCUMENT_ROOT__HORIZONTAL_REL:
				return isSetHorizontalRel();
			case StylePackage.DOCUMENT_ROOT__JUSTIFY_SINGLE_WORD:
				return isSetJustifySingleWord();
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_ASIAN:
				return LANGUAGE_ASIAN_EDEFAULT == null ? languageAsian != null : !LANGUAGE_ASIAN_EDEFAULT.equals(languageAsian);
			case StylePackage.DOCUMENT_ROOT__LANGUAGE_COMPLEX:
				return LANGUAGE_COMPLEX_EDEFAULT == null ? languageComplex != null : !LANGUAGE_COMPLEX_EDEFAULT.equals(languageComplex);
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_BASE_HEIGHT:
				return LAYOUT_GRID_BASE_HEIGHT_EDEFAULT == null ? layoutGridBaseHeight != null : !LAYOUT_GRID_BASE_HEIGHT_EDEFAULT.equals(layoutGridBaseHeight);
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_COLOR:
				return LAYOUT_GRID_COLOR_EDEFAULT == null ? layoutGridColor != null : !LAYOUT_GRID_COLOR_EDEFAULT.equals(layoutGridColor);
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_DISPLAY:
				return isSetLayoutGridDisplay();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_LINES:
				return LAYOUT_GRID_LINES_EDEFAULT == null ? layoutGridLines != null : !LAYOUT_GRID_LINES_EDEFAULT.equals(layoutGridLines);
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_MODE:
				return isSetLayoutGridMode();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_PRINT:
				return isSetLayoutGridPrint();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_BELOW:
				return isSetLayoutGridRubyBelow();
			case StylePackage.DOCUMENT_ROOT__LAYOUT_GRID_RUBY_HEIGHT:
				return LAYOUT_GRID_RUBY_HEIGHT_EDEFAULT == null ? layoutGridRubyHeight != null : !LAYOUT_GRID_RUBY_HEIGHT_EDEFAULT.equals(layoutGridRubyHeight);
			case StylePackage.DOCUMENT_ROOT__LEADER_CHAR:
				return LEADER_CHAR_EDEFAULT == null ? leaderChar != null : !LEADER_CHAR_EDEFAULT.equals(leaderChar);
			case StylePackage.DOCUMENT_ROOT__LEADER_COLOR:
				return LEADER_COLOR_EDEFAULT == null ? leaderColor != null : !LEADER_COLOR_EDEFAULT.equals(leaderColor);
			case StylePackage.DOCUMENT_ROOT__LEADER_STYLE:
				return isSetLeaderStyle();
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT:
				return LEADER_TEXT_EDEFAULT == null ? leaderText != null : !LEADER_TEXT_EDEFAULT.equals(leaderText);
			case StylePackage.DOCUMENT_ROOT__LEADER_TEXT_STYLE:
				return LEADER_TEXT_STYLE_EDEFAULT == null ? leaderTextStyle != null : !LEADER_TEXT_STYLE_EDEFAULT.equals(leaderTextStyle);
			case StylePackage.DOCUMENT_ROOT__LEADER_TYPE:
				return isSetLeaderType();
			case StylePackage.DOCUMENT_ROOT__LEADER_WIDTH:
				return LEADER_WIDTH_EDEFAULT == null ? leaderWidth != null : !LEADER_WIDTH_EDEFAULT.equals(leaderWidth);
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION:
				return isSetLegendExpansion();
			case StylePackage.DOCUMENT_ROOT__LEGEND_EXPANSION_ASPECT_RATIO:
				return isSetLegendExpansionAspectRatio();
			case StylePackage.DOCUMENT_ROOT__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case StylePackage.DOCUMENT_ROOT__LETTER_KERNING:
				return isSetLetterKerning();
			case StylePackage.DOCUMENT_ROOT__LINE_BREAK:
				return isSetLineBreak();
			case StylePackage.DOCUMENT_ROOT__LINE_HEIGHT_AT_LEAST:
				return LINE_HEIGHT_AT_LEAST_EDEFAULT == null ? lineHeightAtLeast != null : !LINE_HEIGHT_AT_LEAST_EDEFAULT.equals(lineHeightAtLeast);
			case StylePackage.DOCUMENT_ROOT__LINES:
				return LINES_EDEFAULT == null ? lines != null : !LINES_EDEFAULT.equals(lines);
			case StylePackage.DOCUMENT_ROOT__LINE_SPACING:
				return LINE_SPACING_EDEFAULT == null ? lineSpacing != null : !LINE_SPACING_EDEFAULT.equals(lineSpacing);
			case StylePackage.DOCUMENT_ROOT__LINE_STYLE:
				return isSetLineStyle();
			case StylePackage.DOCUMENT_ROOT__LIST_STYLE_NAME:
				return LIST_STYLE_NAME_EDEFAULT == null ? listStyleName != null : !LIST_STYLE_NAME_EDEFAULT.equals(listStyleName);
			case StylePackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				return MASTER_PAGE_NAME_EDEFAULT == null ? masterPageName != null : !MASTER_PAGE_NAME_EDEFAULT.equals(masterPageName);
			case StylePackage.DOCUMENT_ROOT__MAY_BREAK_BETWEEN_ROWS:
				return isSetMayBreakBetweenRows();
			case StylePackage.DOCUMENT_ROOT__MIN_ROW_HEIGHT:
				return MIN_ROW_HEIGHT_EDEFAULT == null ? minRowHeight != null : !MIN_ROW_HEIGHT_EDEFAULT.equals(minRowHeight);
			case StylePackage.DOCUMENT_ROOT__MIRROR:
				return MIRROR_EDEFAULT == null ? mirror != null : !MIRROR_EDEFAULT.equals(mirror);
			case StylePackage.DOCUMENT_ROOT__NEXT_STYLE_NAME:
				return NEXT_STYLE_NAME_EDEFAULT == null ? nextStyleName != null : !NEXT_STYLE_NAME_EDEFAULT.equals(nextStyleName);
			case StylePackage.DOCUMENT_ROOT__NUMBER_WRAPPED_PARAGRAPHS:
				return NUMBER_WRAPPED_PARAGRAPHS_EDEFAULT == null ? numberWrappedParagraphs != null : !NUMBER_WRAPPED_PARAGRAPHS_EDEFAULT.equals(numberWrappedParagraphs);
			case StylePackage.DOCUMENT_ROOT__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case StylePackage.DOCUMENT_ROOT__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case StylePackage.DOCUMENT_ROOT__NUM_PREFIX:
				return NUM_PREFIX_EDEFAULT == null ? numPrefix != null : !NUM_PREFIX_EDEFAULT.equals(numPrefix);
			case StylePackage.DOCUMENT_ROOT__NUM_SUFFIX:
				return NUM_SUFFIX_EDEFAULT == null ? numSuffix != null : !NUM_SUFFIX_EDEFAULT.equals(numSuffix);
			case StylePackage.DOCUMENT_ROOT__OVERFLOW_BEHAVIOR:
				return isSetOverflowBehavior();
			case StylePackage.DOCUMENT_ROOT__PAGE_LAYOUT_NAME:
				return PAGE_LAYOUT_NAME_EDEFAULT == null ? pageLayoutName != null : !PAGE_LAYOUT_NAME_EDEFAULT.equals(pageLayoutName);
			case StylePackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return PAGE_NUMBER_EDEFAULT == null ? pageNumber != null : !PAGE_NUMBER_EDEFAULT.equals(pageNumber);
			case StylePackage.DOCUMENT_ROOT__PAGE_USAGE:
				return isSetPageUsage();
			case StylePackage.DOCUMENT_ROOT__PAPER_TRAY_NAME:
				return PAPER_TRAY_NAME_EDEFAULT == null ? paperTrayName != null : !PAPER_TRAY_NAME_EDEFAULT.equals(paperTrayName);
			case StylePackage.DOCUMENT_ROOT__PARENT_STYLE_NAME:
				return PARENT_STYLE_NAME_EDEFAULT == null ? parentStyleName != null : !PARENT_STYLE_NAME_EDEFAULT.equals(parentStyleName);
			case StylePackage.DOCUMENT_ROOT__PRINT:
				return PRINT_EDEFAULT == null ? print != null : !PRINT_EDEFAULT.equals(print);
			case StylePackage.DOCUMENT_ROOT__PRINT_CONTENT:
				return isSetPrintContent();
			case StylePackage.DOCUMENT_ROOT__PRINT_ORIENTATION:
				return isSetPrintOrientation();
			case StylePackage.DOCUMENT_ROOT__PRINT_PAGE_ORDER:
				return isSetPrintPageOrder();
			case StylePackage.DOCUMENT_ROOT__PUNCTUATION_WRAP:
				return isSetPunctuationWrap();
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUE:
				return isSetRegisterTrue();
			case StylePackage.DOCUMENT_ROOT__REGISTER_TRUTH_REF_STYLE_NAME:
				return REGISTER_TRUTH_REF_STYLE_NAME_EDEFAULT == null ? registerTruthRefStyleName != null : !REGISTER_TRUTH_REF_STYLE_NAME_EDEFAULT.equals(registerTruthRefStyleName);
			case StylePackage.DOCUMENT_ROOT__REL_COLUMN_WIDTH:
				return REL_COLUMN_WIDTH_EDEFAULT == null ? relColumnWidth != null : !REL_COLUMN_WIDTH_EDEFAULT.equals(relColumnWidth);
			case StylePackage.DOCUMENT_ROOT__REL_HEIGHT:
				return REL_HEIGHT_EDEFAULT == null ? relHeight != null : !REL_HEIGHT_EDEFAULT.equals(relHeight);
			case StylePackage.DOCUMENT_ROOT__REPEAT:
				return isSetRepeat();
			case StylePackage.DOCUMENT_ROOT__REPEAT_CONTENT:
				return isSetRepeatContent();
			case StylePackage.DOCUMENT_ROOT__ROTATION_ALIGN:
				return isSetRotationAlign();
			case StylePackage.DOCUMENT_ROOT__ROTATION_ANGLE:
				return ROTATION_ANGLE_EDEFAULT == null ? rotationAngle != null : !ROTATION_ANGLE_EDEFAULT.equals(rotationAngle);
			case StylePackage.DOCUMENT_ROOT__ROW_HEIGHT:
				return ROW_HEIGHT_EDEFAULT == null ? rowHeight != null : !ROW_HEIGHT_EDEFAULT.equals(rowHeight);
			case StylePackage.DOCUMENT_ROOT__RUBY_ALIGN:
				return isSetRubyAlign();
			case StylePackage.DOCUMENT_ROOT__RUBY_POSITION:
				return isSetRubyPosition();
			case StylePackage.DOCUMENT_ROOT__RUN_THROUGH:
				return isSetRunThrough();
			case StylePackage.DOCUMENT_ROOT__SCALE_TO:
				return SCALE_TO_EDEFAULT == null ? scaleTo != null : !SCALE_TO_EDEFAULT.equals(scaleTo);
			case StylePackage.DOCUMENT_ROOT__SCALE_TO_PAGES:
				return SCALE_TO_PAGES_EDEFAULT == null ? scaleToPages != null : !SCALE_TO_PAGES_EDEFAULT.equals(scaleToPages);
			case StylePackage.DOCUMENT_ROOT__SCRIPT_TYPE:
				return isSetScriptType();
			case StylePackage.DOCUMENT_ROOT__SHADOW:
				return SHADOW_EDEFAULT == null ? shadow != null : !SHADOW_EDEFAULT.equals(shadow);
			case StylePackage.DOCUMENT_ROOT__SHRINK_TO_FIT:
				return isSetShrinkToFit();
			case StylePackage.DOCUMENT_ROOT__SNAP_TO_LAYOUT_GRID:
				return isSetSnapToLayoutGrid();
			case StylePackage.DOCUMENT_ROOT__STYLE1:
				return isSetStyle1();
			case StylePackage.DOCUMENT_ROOT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case StylePackage.DOCUMENT_ROOT__TABLE_CENTERING:
				return isSetTableCentering();
			case StylePackage.DOCUMENT_ROOT__TAB_STOP_DISTANCE:
				return TAB_STOP_DISTANCE_EDEFAULT == null ? tabStopDistance != null : !TAB_STOP_DISTANCE_EDEFAULT.equals(tabStopDistance);
			case StylePackage.DOCUMENT_ROOT__TEXT_ALIGN_SOURCE:
				return isSetTextAlignSource();
			case StylePackage.DOCUMENT_ROOT__TEXT_AUTOSPACE:
				return isSetTextAutospace();
			case StylePackage.DOCUMENT_ROOT__TEXT_BLINKING:
				return isSetTextBlinking();
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE:
				return isSetTextCombine();
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_END_CHAR:
				return TEXT_COMBINE_END_CHAR_EDEFAULT == null ? textCombineEndChar != null : !TEXT_COMBINE_END_CHAR_EDEFAULT.equals(textCombineEndChar);
			case StylePackage.DOCUMENT_ROOT__TEXT_COMBINE_START_CHAR:
				return TEXT_COMBINE_START_CHAR_EDEFAULT == null ? textCombineStartChar != null : !TEXT_COMBINE_START_CHAR_EDEFAULT.equals(textCombineStartChar);
			case StylePackage.DOCUMENT_ROOT__TEXT_EMPHASIZE:
				return TEXT_EMPHASIZE_EDEFAULT == null ? textEmphasize != null : !TEXT_EMPHASIZE_EDEFAULT.equals(textEmphasize);
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_COLOR:
				return TEXT_LINE_THROUGH_COLOR_EDEFAULT == null ? textLineThroughColor != null : !TEXT_LINE_THROUGH_COLOR_EDEFAULT.equals(textLineThroughColor);
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_MODE:
				return isSetTextLineThroughMode();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_STYLE:
				return isSetTextLineThroughStyle();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT:
				return TEXT_LINE_THROUGH_TEXT_EDEFAULT == null ? textLineThroughText != null : !TEXT_LINE_THROUGH_TEXT_EDEFAULT.equals(textLineThroughText);
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TEXT_STYLE:
				return TEXT_LINE_THROUGH_TEXT_STYLE_EDEFAULT == null ? textLineThroughTextStyle != null : !TEXT_LINE_THROUGH_TEXT_STYLE_EDEFAULT.equals(textLineThroughTextStyle);
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_TYPE:
				return isSetTextLineThroughType();
			case StylePackage.DOCUMENT_ROOT__TEXT_LINE_THROUGH_WIDTH:
				return TEXT_LINE_THROUGH_WIDTH_EDEFAULT == null ? textLineThroughWidth != null : !TEXT_LINE_THROUGH_WIDTH_EDEFAULT.equals(textLineThroughWidth);
			case StylePackage.DOCUMENT_ROOT__TEXT_OUTLINE:
				return isSetTextOutline();
			case StylePackage.DOCUMENT_ROOT__TEXT_POSITION:
				return TEXT_POSITION_EDEFAULT == null ? textPosition != null : !TEXT_POSITION_EDEFAULT.equals(textPosition);
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_ANGLE:
				return TEXT_ROTATION_ANGLE_EDEFAULT == null ? textRotationAngle != null : !TEXT_ROTATION_ANGLE_EDEFAULT.equals(textRotationAngle);
			case StylePackage.DOCUMENT_ROOT__TEXT_ROTATION_SCALE:
				return isSetTextRotationScale();
			case StylePackage.DOCUMENT_ROOT__TEXT_SCALE:
				return TEXT_SCALE_EDEFAULT == null ? textScale != null : !TEXT_SCALE_EDEFAULT.equals(textScale);
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_COLOR:
				return TEXT_UNDERLINE_COLOR_EDEFAULT == null ? textUnderlineColor != null : !TEXT_UNDERLINE_COLOR_EDEFAULT.equals(textUnderlineColor);
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_MODE:
				return isSetTextUnderlineMode();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_STYLE:
				return isSetTextUnderlineStyle();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_TYPE:
				return isSetTextUnderlineType();
			case StylePackage.DOCUMENT_ROOT__TEXT_UNDERLINE_WIDTH:
				return TEXT_UNDERLINE_WIDTH_EDEFAULT == null ? textUnderlineWidth != null : !TEXT_UNDERLINE_WIDTH_EDEFAULT.equals(textUnderlineWidth);
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_COLUMN_WIDTH:
				return isSetUseOptimalColumnWidth();
			case StylePackage.DOCUMENT_ROOT__USE_OPTIMAL_ROW_HEIGHT:
				return isSetUseOptimalRowHeight();
			case StylePackage.DOCUMENT_ROOT__USE_WINDOW_FONT_COLOR:
				return isSetUseWindowFontColor();
			case StylePackage.DOCUMENT_ROOT__VERTICAL_POS:
				return isSetVerticalPos();
			case StylePackage.DOCUMENT_ROOT__VERTICAL_REL:
				return isSetVerticalRel();
			case StylePackage.DOCUMENT_ROOT__VOLATILE:
				return isSetVolatile();
			case StylePackage.DOCUMENT_ROOT__WRAP:
				return isSetWrap();
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR:
				return isSetWrapContour();
			case StylePackage.DOCUMENT_ROOT__WRAP_CONTOUR_MODE:
				return isSetWrapContourMode();
			case StylePackage.DOCUMENT_ROOT__WRAP_DYNAMIC_THRESHOLD:
				return WRAP_DYNAMIC_THRESHOLD_EDEFAULT == null ? wrapDynamicThreshold != null : !WRAP_DYNAMIC_THRESHOLD_EDEFAULT.equals(wrapDynamicThreshold);
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE:
				return isSetWritingMode();
			case StylePackage.DOCUMENT_ROOT__WRITING_MODE_AUTOMATIC:
				return isSetWritingModeAutomatic();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", adjustment: ");
		if (adjustmentESet) result.append(adjustment); else result.append("<unset>");
		result.append(", applyStyleName: ");
		result.append(applyStyleName);
		result.append(", autoTextIndent: ");
		if (autoTextIndentESet) result.append(autoTextIndent); else result.append("<unset>");
		result.append(", autoUpdate: ");
		if (autoUpdateESet) result.append(autoUpdate); else result.append("<unset>");
		result.append(", backgroundTransparency: ");
		result.append(backgroundTransparency);
		result.append(", baseCellAddress: ");
		result.append(baseCellAddress);
		result.append(", borderLineWidth: ");
		result.append(borderLineWidth);
		result.append(", borderLineWidthBottom: ");
		result.append(borderLineWidthBottom);
		result.append(", borderLineWidthLeft: ");
		result.append(borderLineWidthLeft);
		result.append(", borderLineWidthRight: ");
		result.append(borderLineWidthRight);
		result.append(", borderLineWidthTop: ");
		result.append(borderLineWidthTop);
		result.append(", cellProtect: ");
		result.append(cellProtect);
		result.append(", char: ");
		result.append(char_);
		result.append(", class: ");
		result.append(class_);
		result.append(", color: ");
		result.append(color);
		result.append(", columnWidth: ");
		result.append(columnWidth);
		result.append(", condition: ");
		result.append(condition);
		result.append(", countryAsian: ");
		result.append(countryAsian);
		result.append(", countryComplex: ");
		result.append(countryComplex);
		result.append(", dataStyleName: ");
		result.append(dataStyleName);
		result.append(", decimalPlaces: ");
		result.append(decimalPlaces);
		result.append(", defaultOutlineLevel: ");
		result.append(defaultOutlineLevel);
		result.append(", diagonalBlTr: ");
		result.append(diagonalBlTr);
		result.append(", diagonalBlTrWidths: ");
		result.append(diagonalBlTrWidths);
		result.append(", diagonalTlBr: ");
		result.append(diagonalTlBr);
		result.append(", diagonalTlBrWidths: ");
		result.append(diagonalTlBrWidths);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", distance: ");
		result.append(distance);
		result.append(", distanceAfterSep: ");
		result.append(distanceAfterSep);
		result.append(", distanceBeforeSep: ");
		result.append(distanceBeforeSep);
		result.append(", dynamicSpacing: ");
		if (dynamicSpacingESet) result.append(dynamicSpacing); else result.append("<unset>");
		result.append(", editable: ");
		if (editableESet) result.append(editable); else result.append("<unset>");
		result.append(", family: ");
		if (familyESet) result.append(family); else result.append("<unset>");
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", firstPageNumber: ");
		result.append(firstPageNumber);
		result.append(", flowWithText: ");
		if (flowWithTextESet) result.append(flowWithText); else result.append("<unset>");
		result.append(", fontAdornments: ");
		result.append(fontAdornments);
		result.append(", fontCharset: ");
		result.append(fontCharset);
		result.append(", fontCharsetAsian: ");
		result.append(fontCharsetAsian);
		result.append(", fontCharsetComplex: ");
		result.append(fontCharsetComplex);
		result.append(", fontFamilyAsian: ");
		result.append(fontFamilyAsian);
		result.append(", fontFamilyComplex: ");
		result.append(fontFamilyComplex);
		result.append(", fontFamilyGeneric: ");
		if (fontFamilyGenericESet) result.append(fontFamilyGeneric); else result.append("<unset>");
		result.append(", fontFamilyGenericAsian: ");
		if (fontFamilyGenericAsianESet) result.append(fontFamilyGenericAsian); else result.append("<unset>");
		result.append(", fontFamilyGenericComplex: ");
		if (fontFamilyGenericComplexESet) result.append(fontFamilyGenericComplex); else result.append("<unset>");
		result.append(", fontIndependentLineSpacing: ");
		if (fontIndependentLineSpacingESet) result.append(fontIndependentLineSpacing); else result.append("<unset>");
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", fontNameAsian: ");
		result.append(fontNameAsian);
		result.append(", fontNameComplex: ");
		result.append(fontNameComplex);
		result.append(", fontPitch: ");
		if (fontPitchESet) result.append(fontPitch); else result.append("<unset>");
		result.append(", fontPitchAsian: ");
		if (fontPitchAsianESet) result.append(fontPitchAsian); else result.append("<unset>");
		result.append(", fontPitchComplex: ");
		if (fontPitchComplexESet) result.append(fontPitchComplex); else result.append("<unset>");
		result.append(", fontRelief: ");
		if (fontReliefESet) result.append(fontRelief); else result.append("<unset>");
		result.append(", fontSizeAsian: ");
		result.append(fontSizeAsian);
		result.append(", fontSizeComplex: ");
		result.append(fontSizeComplex);
		result.append(", fontSizeRel: ");
		result.append(fontSizeRel);
		result.append(", fontSizeRelAsian: ");
		result.append(fontSizeRelAsian);
		result.append(", fontSizeRelComplex: ");
		result.append(fontSizeRelComplex);
		result.append(", fontStyleAsian: ");
		if (fontStyleAsianESet) result.append(fontStyleAsian); else result.append("<unset>");
		result.append(", fontStyleComplex: ");
		if (fontStyleComplexESet) result.append(fontStyleComplex); else result.append("<unset>");
		result.append(", fontStyleName: ");
		result.append(fontStyleName);
		result.append(", fontStyleNameAsian: ");
		result.append(fontStyleNameAsian);
		result.append(", fontStyleNameComplex: ");
		result.append(fontStyleNameComplex);
		result.append(", fontWeightAsian: ");
		if (fontWeightAsianESet) result.append(fontWeightAsian); else result.append("<unset>");
		result.append(", fontWeightComplex: ");
		if (fontWeightComplexESet) result.append(fontWeightComplex); else result.append("<unset>");
		result.append(", footnoteMaxHeight: ");
		result.append(footnoteMaxHeight);
		result.append(", glyphOrientationVertical: ");
		if (glyphOrientationVerticalESet) result.append(glyphOrientationVertical); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", horizontalPos: ");
		if (horizontalPosESet) result.append(horizontalPos); else result.append("<unset>");
		result.append(", horizontalRel: ");
		if (horizontalRelESet) result.append(horizontalRel); else result.append("<unset>");
		result.append(", justifySingleWord: ");
		if (justifySingleWordESet) result.append(justifySingleWord); else result.append("<unset>");
		result.append(", languageAsian: ");
		result.append(languageAsian);
		result.append(", languageComplex: ");
		result.append(languageComplex);
		result.append(", layoutGridBaseHeight: ");
		result.append(layoutGridBaseHeight);
		result.append(", layoutGridColor: ");
		result.append(layoutGridColor);
		result.append(", layoutGridDisplay: ");
		if (layoutGridDisplayESet) result.append(layoutGridDisplay); else result.append("<unset>");
		result.append(", layoutGridLines: ");
		result.append(layoutGridLines);
		result.append(", layoutGridMode: ");
		if (layoutGridModeESet) result.append(layoutGridMode); else result.append("<unset>");
		result.append(", layoutGridPrint: ");
		if (layoutGridPrintESet) result.append(layoutGridPrint); else result.append("<unset>");
		result.append(", layoutGridRubyBelow: ");
		if (layoutGridRubyBelowESet) result.append(layoutGridRubyBelow); else result.append("<unset>");
		result.append(", layoutGridRubyHeight: ");
		result.append(layoutGridRubyHeight);
		result.append(", leaderChar: ");
		result.append(leaderChar);
		result.append(", leaderColor: ");
		result.append(leaderColor);
		result.append(", leaderStyle: ");
		if (leaderStyleESet) result.append(leaderStyle); else result.append("<unset>");
		result.append(", leaderText: ");
		result.append(leaderText);
		result.append(", leaderTextStyle: ");
		result.append(leaderTextStyle);
		result.append(", leaderType: ");
		if (leaderTypeESet) result.append(leaderType); else result.append("<unset>");
		result.append(", leaderWidth: ");
		result.append(leaderWidth);
		result.append(", legendExpansion: ");
		if (legendExpansionESet) result.append(legendExpansion); else result.append("<unset>");
		result.append(", legendExpansionAspectRatio: ");
		if (legendExpansionAspectRatioESet) result.append(legendExpansionAspectRatio); else result.append("<unset>");
		result.append(", length: ");
		result.append(length);
		result.append(", letterKerning: ");
		if (letterKerningESet) result.append(letterKerning); else result.append("<unset>");
		result.append(", lineBreak: ");
		if (lineBreakESet) result.append(lineBreak); else result.append("<unset>");
		result.append(", lineHeightAtLeast: ");
		result.append(lineHeightAtLeast);
		result.append(", lines: ");
		result.append(lines);
		result.append(", lineSpacing: ");
		result.append(lineSpacing);
		result.append(", lineStyle: ");
		if (lineStyleESet) result.append(lineStyle); else result.append("<unset>");
		result.append(", listStyleName: ");
		result.append(listStyleName);
		result.append(", masterPageName: ");
		result.append(masterPageName);
		result.append(", mayBreakBetweenRows: ");
		if (mayBreakBetweenRowsESet) result.append(mayBreakBetweenRows); else result.append("<unset>");
		result.append(", minRowHeight: ");
		result.append(minRowHeight);
		result.append(", mirror: ");
		result.append(mirror);
		result.append(", nextStyleName: ");
		result.append(nextStyleName);
		result.append(", numberWrappedParagraphs: ");
		result.append(numberWrappedParagraphs);
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", numPrefix: ");
		result.append(numPrefix);
		result.append(", numSuffix: ");
		result.append(numSuffix);
		result.append(", overflowBehavior: ");
		if (overflowBehaviorESet) result.append(overflowBehavior); else result.append("<unset>");
		result.append(", pageLayoutName: ");
		result.append(pageLayoutName);
		result.append(", pageNumber: ");
		result.append(pageNumber);
		result.append(", pageUsage: ");
		if (pageUsageESet) result.append(pageUsage); else result.append("<unset>");
		result.append(", paperTrayName: ");
		result.append(paperTrayName);
		result.append(", parentStyleName: ");
		result.append(parentStyleName);
		result.append(", print: ");
		result.append(print);
		result.append(", printContent: ");
		if (printContentESet) result.append(printContent); else result.append("<unset>");
		result.append(", printOrientation: ");
		if (printOrientationESet) result.append(printOrientation); else result.append("<unset>");
		result.append(", printPageOrder: ");
		if (printPageOrderESet) result.append(printPageOrder); else result.append("<unset>");
		result.append(", punctuationWrap: ");
		if (punctuationWrapESet) result.append(punctuationWrap); else result.append("<unset>");
		result.append(", registerTrue: ");
		if (registerTrueESet) result.append(registerTrue); else result.append("<unset>");
		result.append(", registerTruthRefStyleName: ");
		result.append(registerTruthRefStyleName);
		result.append(", relColumnWidth: ");
		result.append(relColumnWidth);
		result.append(", relHeight: ");
		result.append(relHeight);
		result.append(", repeat: ");
		if (repeatESet) result.append(repeat); else result.append("<unset>");
		result.append(", repeatContent: ");
		if (repeatContentESet) result.append(repeatContent); else result.append("<unset>");
		result.append(", rotationAlign: ");
		if (rotationAlignESet) result.append(rotationAlign); else result.append("<unset>");
		result.append(", rotationAngle: ");
		result.append(rotationAngle);
		result.append(", rowHeight: ");
		result.append(rowHeight);
		result.append(", rubyAlign: ");
		if (rubyAlignESet) result.append(rubyAlign); else result.append("<unset>");
		result.append(", rubyPosition: ");
		if (rubyPositionESet) result.append(rubyPosition); else result.append("<unset>");
		result.append(", runThrough: ");
		if (runThroughESet) result.append(runThrough); else result.append("<unset>");
		result.append(", scaleTo: ");
		result.append(scaleTo);
		result.append(", scaleToPages: ");
		result.append(scaleToPages);
		result.append(", scriptType: ");
		if (scriptTypeESet) result.append(scriptType); else result.append("<unset>");
		result.append(", shadow: ");
		result.append(shadow);
		result.append(", shrinkToFit: ");
		if (shrinkToFitESet) result.append(shrinkToFit); else result.append("<unset>");
		result.append(", snapToLayoutGrid: ");
		if (snapToLayoutGridESet) result.append(snapToLayoutGrid); else result.append("<unset>");
		result.append(", style1: ");
		if (style1ESet) result.append(style1); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", tableCentering: ");
		if (tableCenteringESet) result.append(tableCentering); else result.append("<unset>");
		result.append(", tabStopDistance: ");
		result.append(tabStopDistance);
		result.append(", textAlignSource: ");
		if (textAlignSourceESet) result.append(textAlignSource); else result.append("<unset>");
		result.append(", textAutospace: ");
		if (textAutospaceESet) result.append(textAutospace); else result.append("<unset>");
		result.append(", textBlinking: ");
		if (textBlinkingESet) result.append(textBlinking); else result.append("<unset>");
		result.append(", textCombine: ");
		if (textCombineESet) result.append(textCombine); else result.append("<unset>");
		result.append(", textCombineEndChar: ");
		result.append(textCombineEndChar);
		result.append(", textCombineStartChar: ");
		result.append(textCombineStartChar);
		result.append(", textEmphasize: ");
		result.append(textEmphasize);
		result.append(", textLineThroughColor: ");
		result.append(textLineThroughColor);
		result.append(", textLineThroughMode: ");
		if (textLineThroughModeESet) result.append(textLineThroughMode); else result.append("<unset>");
		result.append(", textLineThroughStyle: ");
		if (textLineThroughStyleESet) result.append(textLineThroughStyle); else result.append("<unset>");
		result.append(", textLineThroughText: ");
		result.append(textLineThroughText);
		result.append(", textLineThroughTextStyle: ");
		result.append(textLineThroughTextStyle);
		result.append(", textLineThroughType: ");
		if (textLineThroughTypeESet) result.append(textLineThroughType); else result.append("<unset>");
		result.append(", textLineThroughWidth: ");
		result.append(textLineThroughWidth);
		result.append(", textOutline: ");
		if (textOutlineESet) result.append(textOutline); else result.append("<unset>");
		result.append(", textPosition: ");
		result.append(textPosition);
		result.append(", textRotationAngle: ");
		result.append(textRotationAngle);
		result.append(", textRotationScale: ");
		if (textRotationScaleESet) result.append(textRotationScale); else result.append("<unset>");
		result.append(", textScale: ");
		result.append(textScale);
		result.append(", textUnderlineColor: ");
		result.append(textUnderlineColor);
		result.append(", textUnderlineMode: ");
		if (textUnderlineModeESet) result.append(textUnderlineMode); else result.append("<unset>");
		result.append(", textUnderlineStyle: ");
		if (textUnderlineStyleESet) result.append(textUnderlineStyle); else result.append("<unset>");
		result.append(", textUnderlineType: ");
		if (textUnderlineTypeESet) result.append(textUnderlineType); else result.append("<unset>");
		result.append(", textUnderlineWidth: ");
		result.append(textUnderlineWidth);
		result.append(", useOptimalColumnWidth: ");
		if (useOptimalColumnWidthESet) result.append(useOptimalColumnWidth); else result.append("<unset>");
		result.append(", useOptimalRowHeight: ");
		if (useOptimalRowHeightESet) result.append(useOptimalRowHeight); else result.append("<unset>");
		result.append(", useWindowFontColor: ");
		if (useWindowFontColorESet) result.append(useWindowFontColor); else result.append("<unset>");
		result.append(", verticalPos: ");
		if (verticalPosESet) result.append(verticalPos); else result.append("<unset>");
		result.append(", verticalRel: ");
		if (verticalRelESet) result.append(verticalRel); else result.append("<unset>");
		result.append(", volatile: ");
		if (volatileESet) result.append(volatile_); else result.append("<unset>");
		result.append(", wrap: ");
		if (wrapESet) result.append(wrap); else result.append("<unset>");
		result.append(", wrapContour: ");
		if (wrapContourESet) result.append(wrapContour); else result.append("<unset>");
		result.append(", wrapContourMode: ");
		if (wrapContourModeESet) result.append(wrapContourMode); else result.append("<unset>");
		result.append(", wrapDynamicThreshold: ");
		result.append(wrapDynamicThreshold);
		result.append(", writingMode: ");
		if (writingModeESet) result.append(writingMode); else result.append("<unset>");
		result.append(", writingModeAutomatic: ");
		if (writingModeAutomaticESet) result.append(writingModeAutomatic); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
