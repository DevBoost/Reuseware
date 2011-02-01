/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LogicalFile#getFilename <em>Filename</em>}</li>
 *   <li>{@link es.tid.cim.LogicalFile#getFileSize <em>File Size</em>}</li>
 *   <li>{@link es.tid.cim.LogicalFile#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLogicalFile()
 * @model
 * @generated
 */
public interface LogicalFile extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see es.tid.cim.CimPackage#getLogicalFile_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalFile#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(int)
	 * @see es.tid.cim.CimPackage#getLogicalFile_FileSize()
	 * @model
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalFile#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(int value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see es.tid.cim.CimPackage#getLogicalFile_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalFile#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

} // LogicalFile
