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
 * <em><b>Faceted Response</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.sokan.FacetedResponse#getValueCountMap <em>Value Count Map</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedResponse#getContent <em>Content</em>}</li>
 *   <li>{@link org.reuseware.sokan.FacetedResponse#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.sokan.SokanPackage#getFacetedResponse()
 * @model
 * @generated
 */
public interface FacetedResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Count Map</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * All the valueCounts the <code>FacetedRequest</code> asked for. The map is
	 * structured like to following: <br>
	 * <br>
	 * String -> (String -> long) <br>
	 * facetName -> (valueName -> valueCount) <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Count Map</em>' attribute.
	 * @see #setValueCountMap(Map)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedResponse_ValueCountMap()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Map<String, Long>> getValueCountMap();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedResponse#getValueCountMap <em>Value Count Map</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value Count Map</em>' attribute.
	 * @see #getValueCountMap()
	 * @generated
	 */
	void setValueCountMap(Map<String, Map<String, Long>> value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list. The
	 * list contents are of type {@link org.reuseware.sokan.IndexRow}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The result set that
	 * fulfills the constraints of the faceted request taking the
	 * keywordSearchString into account. <br>
	 * See <code>FacetedRequest</code> for more information. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see org.reuseware.sokan.SokanPackage#getFacetedResponse_Content()
	 * @model
	 * @generated
	 */
	EList<IndexRow> getContent();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * <code>FacetedRequest</code> that was used to form this response. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(FacetedRequest)
	 * @see org.reuseware.sokan.SokanPackage#getFacetedResponse_Query()
	 * @model required="true"
	 * @generated
	 */
	FacetedRequest getQuery();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.FacetedResponse#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(FacetedRequest value);

} // FacetedResponse
