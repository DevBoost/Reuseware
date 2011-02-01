/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.FileSpecification#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getCRC1 <em>CRC1</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getCRC2 <em>CRC2</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getCreateTimeStamp <em>Create Time Stamp</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getFileName <em>File Name</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getFileSize <em>File Size</em>}</li>
 *   <li>{@link es.tid.cim.FileSpecification#getMD5Checksum <em>MD5 Checksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getFileSpecification()
 * @model
 * @generated
 */
public interface FileSpecification extends Check {
	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(BigInteger)
	 * @see es.tid.cim.CimPackage#getFileSpecification_CheckSum()
	 * @model
	 * @generated
	 */
	BigInteger getCheckSum();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CRC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CRC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRC1</em>' attribute.
	 * @see #setCRC1(BigInteger)
	 * @see es.tid.cim.CimPackage#getFileSpecification_CRC1()
	 * @model
	 * @generated
	 */
	BigInteger getCRC1();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getCRC1 <em>CRC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC1</em>' attribute.
	 * @see #getCRC1()
	 * @generated
	 */
	void setCRC1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>CRC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CRC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRC2</em>' attribute.
	 * @see #setCRC2(BigInteger)
	 * @see es.tid.cim.CimPackage#getFileSpecification_CRC2()
	 * @model
	 * @generated
	 */
	BigInteger getCRC2();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getCRC2 <em>CRC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC2</em>' attribute.
	 * @see #getCRC2()
	 * @generated
	 */
	void setCRC2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Create Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Time Stamp</em>' attribute.
	 * @see #setCreateTimeStamp(Date)
	 * @see es.tid.cim.CimPackage#getFileSpecification_CreateTimeStamp()
	 * @model
	 * @generated
	 */
	Date getCreateTimeStamp();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getCreateTimeStamp <em>Create Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Time Stamp</em>' attribute.
	 * @see #getCreateTimeStamp()
	 * @generated
	 */
	void setCreateTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see es.tid.cim.CimPackage#getFileSpecification_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(BigDecimal)
	 * @see es.tid.cim.CimPackage#getFileSpecification_FileSize()
	 * @model
	 * @generated
	 */
	BigDecimal getFileSize();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>MD5 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MD5 Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD5 Checksum</em>' attribute.
	 * @see #setMD5Checksum(String)
	 * @see es.tid.cim.CimPackage#getFileSpecification_MD5Checksum()
	 * @model
	 * @generated
	 */
	String getMD5Checksum();

	/**
	 * Sets the value of the '{@link es.tid.cim.FileSpecification#getMD5Checksum <em>MD5 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD5 Checksum</em>' attribute.
	 * @see #getMD5Checksum()
	 * @generated
	 */
	void setMD5Checksum(String value);

} // FileSpecification
