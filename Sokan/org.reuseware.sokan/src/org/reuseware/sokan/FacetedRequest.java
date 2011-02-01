/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Faceted Request</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.FacetedRequest#getFacetFields <em>Facet Fields</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedRequest#getRows <em>Rows</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedRequest#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedRequest#getKeywordSearchString <em>Keyword Search String</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedRequest#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest()
 * @model
 * @generated
 */
public interface FacetedRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> Constraints is build of
	 * restricting facet-value-pairs, while the map works like:<br>
	 * 
	 * EString -> EList<String><br>
	 * facetName -> ListOfValueNames <br>
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Map)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest_Constraints()
	 * @model transient="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Facet Fields</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A list of facet names for
	 * which valueCounts are needed. <br>
	 * See <code>FacetedResponse.getValueCounts()</code> for more information
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Facet Fields</em>' attribute.
	 * @see #setFacetFields(EList)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest_FacetFields()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getFacetFields();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedRequest#getFacetFields <em>Facet Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Facet Fields</em>' attribute.
	 * @see #getFacetFields()
	 * @generated
	 */
	void setFacetFields(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Keyword Search String</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Search String</em>' attribute.
	 * @see #setKeywordSearchString(String)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest_KeywordSearchString()
	 * @model
	 * @generated
	 */
	String getKeywordSearchString();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedRequest#getKeywordSearchString <em>Keyword Search String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Keyword Search String</em>' attribute.
	 * @see #getKeywordSearchString()
	 * @generated
	 */
	void setKeywordSearchString(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limits the number of rows that are contained in the
	 * response content. This can be used to split-up query-result 
	 * contents to handy parts which get shown in seperate pages.
	 *  You can consider this <code>int</code> value as the 
	 * maximum number of results to appear in the page.<br>
	 * <br>
	 * Set to <0, if the result's content should not be limited.<br>
	 * Example: 50 values should be shown on the third
	 * page, then rows=50 and offset=101. <br>
	 * See <code>FacetedRequest.getOffset()</code> for more
	 * information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest_Rows()
	 * @model default="-1"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedRequest#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the result of this faceted request should be 
	 * presented in pages, the Offset can be used to 
	 * specify the first value of the result set. The first record
	 * to appear in the result set is given by this value.<br>
	 * <br>
	 * Set to <0, if an offset is not needed. <br>
	 * Example: 50 values should be shown on the third
	 * page, then rows=50 and offset=101. <br>
	 * See <code>FacetedRequest.getOffset()</code> for 
	 * more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedRequest_Offset()
	 * @model default="0"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedRequest#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

} // FacetedRequest
