/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.reuseware.sokan.Artifact;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.Filter;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;
import org.reuseware.sokan.SokanFactory;
import org.reuseware.sokan.SokanPackage;
import org.reuseware.sokan.Store;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SokanFactoryImpl extends EFactoryImpl implements SokanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SokanFactory init() {
		try {
			SokanFactory theSokanFactory = (SokanFactory)EPackage.Registry.INSTANCE.getEFactory("http://sokan.reuseware.org"); 
			if (theSokanFactory != null) {
				return theSokanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SokanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SokanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SokanPackage.ID: return createID();
			case SokanPackage.ARTIFACT: return createArtifact();
			case SokanPackage.INDEX_ROW: return createIndexRow();
			case SokanPackage.INDEX_META_DATA: return createIndexMetaData();
			case SokanPackage.STORE: return createStore();
			case SokanPackage.FILTER: return createFilter();
			case SokanPackage.INDEX_TRANSACTION: return createIndexTransaction();
			case SokanPackage.FACETED_RESPONSE: return createFacetedResponse();
			case SokanPackage.FACETED_REQUEST: return createFacetedRequest();
			case SokanPackage.CONSTRAINT: return createConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IndexRow createIndexRow() {
		IndexRowImpl indexRow = new IndexRowImpl();
		return indexRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexMetaData createIndexMetaData() {
		IndexMetaDataImpl indexMetaData = new IndexMetaDataImpl();
		return indexMetaData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTransaction createIndexTransaction() {
		IndexTransactionImpl indexTransaction = new IndexTransactionImpl();
		return indexTransaction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FacetedRequest createFacetedRequest() {
		FacetedRequestImpl facetedRequest = new FacetedRequestImpl();
		return facetedRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FacetedResponse createFacetedResponse() {
		FacetedResponseImpl facetedResponse = new FacetedResponseImpl();
		return facetedResponse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SokanPackage getSokanPackage() {
		return (SokanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SokanPackage getPackage() {
		return SokanPackage.eINSTANCE;
	}

} // SokanFactoryImpl
