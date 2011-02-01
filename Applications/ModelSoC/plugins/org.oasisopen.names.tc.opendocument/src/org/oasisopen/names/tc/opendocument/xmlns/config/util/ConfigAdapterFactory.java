/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.config.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;
import org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage
 * @generated
 */
public class ConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigSwitch<Adapter> modelSwitch =
		new ConfigSwitch<Adapter>() {
			@Override
			public Adapter caseConfigItemMapEntryType(ConfigItemMapEntryType object) {
				return createConfigItemMapEntryTypeAdapter();
			}
			@Override
			public Adapter caseConfigItemMapIndexedType(ConfigItemMapIndexedType object) {
				return createConfigItemMapIndexedTypeAdapter();
			}
			@Override
			public Adapter caseConfigItemMapNamedType(ConfigItemMapNamedType object) {
				return createConfigItemMapNamedTypeAdapter();
			}
			@Override
			public Adapter caseConfigItemSetType(ConfigItemSetType object) {
				return createConfigItemSetTypeAdapter();
			}
			@Override
			public Adapter caseConfigItemType(ConfigItemType object) {
				return createConfigItemTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseConfigItems(ConfigItems object) {
				return createConfigItemsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType <em>Item Map Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType
	 * @generated
	 */
	public Adapter createConfigItemMapEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType <em>Item Map Indexed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType
	 * @generated
	 */
	public Adapter createConfigItemMapIndexedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType <em>Item Map Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType
	 * @generated
	 */
	public Adapter createConfigItemMapNamedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType <em>Item Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType
	 * @generated
	 */
	public Adapter createConfigItemSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType
	 * @generated
	 */
	public Adapter createConfigItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems <em>Config Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems
	 * @generated
	 */
	public Adapter createConfigItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConfigAdapterFactory
