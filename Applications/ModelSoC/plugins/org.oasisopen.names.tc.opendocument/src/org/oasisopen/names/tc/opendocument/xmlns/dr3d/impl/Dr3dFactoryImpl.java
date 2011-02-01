/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dFactory;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dr3dFactoryImpl extends EFactoryImpl implements Dr3dFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dr3dFactory init() {
		try {
			Dr3dFactory theDr3dFactory = (Dr3dFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"); 
			if (theDr3dFactory != null) {
				return theDr3dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dr3dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dr3dFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dr3dPackage.CUBE_TYPE: return createCubeType();
			case Dr3dPackage.EXTRUDE_TYPE: return createExtrudeType();
			case Dr3dPackage.LIGHT_TYPE: return createLightType();
			case Dr3dPackage.ROTATE_TYPE: return createRotateType();
			case Dr3dPackage.SCENE_TYPE: return createSceneType();
			case Dr3dPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case Dr3dPackage.SPHERE_TYPE: return createSphereType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Dr3dPackage.BACKFACE_CULLING_TYPE:
				return createBackfaceCullingTypeFromString(eDataType, initialValue);
			case Dr3dPackage.EDGE_ROUNDING_MODE_TYPE:
				return createEdgeRoundingModeTypeFromString(eDataType, initialValue);
			case Dr3dPackage.NORMALS_DIRECTION_TYPE:
				return createNormalsDirectionTypeFromString(eDataType, initialValue);
			case Dr3dPackage.NORMALS_KIND_TYPE:
				return createNormalsKindTypeFromString(eDataType, initialValue);
			case Dr3dPackage.PROJECTION_TYPE:
				return createProjectionTypeFromString(eDataType, initialValue);
			case Dr3dPackage.SHADE_MODE_TYPE:
				return createShadeModeTypeFromString(eDataType, initialValue);
			case Dr3dPackage.SHADOW_TYPE:
				return createShadowTypeFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_FILTER_TYPE:
				return createTextureFilterTypeFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_XTYPE:
				return createTextureGenerationModeXTypeFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_YTYPE:
				return createTextureGenerationModeYTypeFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_KIND_TYPE:
				return createTextureKindTypeFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_MODE_TYPE:
				return createTextureModeTypeFromString(eDataType, initialValue);
			case Dr3dPackage.BACKFACE_CULLING_TYPE_OBJECT:
				return createBackfaceCullingTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.EDGE_ROUNDING_MODE_TYPE_OBJECT:
				return createEdgeRoundingModeTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.NORMALS_DIRECTION_TYPE_OBJECT:
				return createNormalsDirectionTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.NORMALS_KIND_TYPE_OBJECT:
				return createNormalsKindTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.PROJECTION_TYPE_OBJECT:
				return createProjectionTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.SHADE_MODE_TYPE_OBJECT:
				return createShadeModeTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.SHADOW_TYPE_OBJECT:
				return createShadowTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_FILTER_TYPE_OBJECT:
				return createTextureFilterTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_XTYPE_OBJECT:
				return createTextureGenerationModeXTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_YTYPE_OBJECT:
				return createTextureGenerationModeYTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_KIND_TYPE_OBJECT:
				return createTextureKindTypeObjectFromString(eDataType, initialValue);
			case Dr3dPackage.TEXTURE_MODE_TYPE_OBJECT:
				return createTextureModeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Dr3dPackage.BACKFACE_CULLING_TYPE:
				return convertBackfaceCullingTypeToString(eDataType, instanceValue);
			case Dr3dPackage.EDGE_ROUNDING_MODE_TYPE:
				return convertEdgeRoundingModeTypeToString(eDataType, instanceValue);
			case Dr3dPackage.NORMALS_DIRECTION_TYPE:
				return convertNormalsDirectionTypeToString(eDataType, instanceValue);
			case Dr3dPackage.NORMALS_KIND_TYPE:
				return convertNormalsKindTypeToString(eDataType, instanceValue);
			case Dr3dPackage.PROJECTION_TYPE:
				return convertProjectionTypeToString(eDataType, instanceValue);
			case Dr3dPackage.SHADE_MODE_TYPE:
				return convertShadeModeTypeToString(eDataType, instanceValue);
			case Dr3dPackage.SHADOW_TYPE:
				return convertShadowTypeToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_FILTER_TYPE:
				return convertTextureFilterTypeToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_XTYPE:
				return convertTextureGenerationModeXTypeToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_YTYPE:
				return convertTextureGenerationModeYTypeToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_KIND_TYPE:
				return convertTextureKindTypeToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_MODE_TYPE:
				return convertTextureModeTypeToString(eDataType, instanceValue);
			case Dr3dPackage.BACKFACE_CULLING_TYPE_OBJECT:
				return convertBackfaceCullingTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.EDGE_ROUNDING_MODE_TYPE_OBJECT:
				return convertEdgeRoundingModeTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.NORMALS_DIRECTION_TYPE_OBJECT:
				return convertNormalsDirectionTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.NORMALS_KIND_TYPE_OBJECT:
				return convertNormalsKindTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.PROJECTION_TYPE_OBJECT:
				return convertProjectionTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.SHADE_MODE_TYPE_OBJECT:
				return convertShadeModeTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.SHADOW_TYPE_OBJECT:
				return convertShadowTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_FILTER_TYPE_OBJECT:
				return convertTextureFilterTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_XTYPE_OBJECT:
				return convertTextureGenerationModeXTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_GENERATION_MODE_YTYPE_OBJECT:
				return convertTextureGenerationModeYTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_KIND_TYPE_OBJECT:
				return convertTextureKindTypeObjectToString(eDataType, instanceValue);
			case Dr3dPackage.TEXTURE_MODE_TYPE_OBJECT:
				return convertTextureModeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeType createCubeType() {
		CubeTypeImpl cubeType = new CubeTypeImpl();
		return cubeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrudeType createExtrudeType() {
		ExtrudeTypeImpl extrudeType = new ExtrudeTypeImpl();
		return extrudeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightType createLightType() {
		LightTypeImpl lightType = new LightTypeImpl();
		return lightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateType createRotateType() {
		RotateTypeImpl rotateType = new RotateTypeImpl();
		return rotateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneType createSceneType() {
		SceneTypeImpl sceneType = new SceneTypeImpl();
		return sceneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphereType createSphereType() {
		SphereTypeImpl sphereType = new SphereTypeImpl();
		return sphereType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackfaceCullingType createBackfaceCullingTypeFromString(EDataType eDataType, String initialValue) {
		BackfaceCullingType result = BackfaceCullingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackfaceCullingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeRoundingModeType createEdgeRoundingModeTypeFromString(EDataType eDataType, String initialValue) {
		EdgeRoundingModeType result = EdgeRoundingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeRoundingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsDirectionType createNormalsDirectionTypeFromString(EDataType eDataType, String initialValue) {
		NormalsDirectionType result = NormalsDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalsDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsKindType createNormalsKindTypeFromString(EDataType eDataType, String initialValue) {
		NormalsKindType result = NormalsKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalsKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionType createProjectionTypeFromString(EDataType eDataType, String initialValue) {
		ProjectionType result = ProjectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadeModeType createShadeModeTypeFromString(EDataType eDataType, String initialValue) {
		ShadeModeType result = ShadeModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadeModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowType createShadowTypeFromString(EDataType eDataType, String initialValue) {
		ShadowType result = ShadowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureFilterType createTextureFilterTypeFromString(EDataType eDataType, String initialValue) {
		TextureFilterType result = TextureFilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeXType createTextureGenerationModeXTypeFromString(EDataType eDataType, String initialValue) {
		TextureGenerationModeXType result = TextureGenerationModeXType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureGenerationModeXTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeYType createTextureGenerationModeYTypeFromString(EDataType eDataType, String initialValue) {
		TextureGenerationModeYType result = TextureGenerationModeYType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureGenerationModeYTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureKindType createTextureKindTypeFromString(EDataType eDataType, String initialValue) {
		TextureKindType result = TextureKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModeType createTextureModeTypeFromString(EDataType eDataType, String initialValue) {
		TextureModeType result = TextureModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackfaceCullingType createBackfaceCullingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBackfaceCullingTypeFromString(Dr3dPackage.Literals.BACKFACE_CULLING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackfaceCullingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackfaceCullingTypeToString(Dr3dPackage.Literals.BACKFACE_CULLING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeRoundingModeType createEdgeRoundingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEdgeRoundingModeTypeFromString(Dr3dPackage.Literals.EDGE_ROUNDING_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeRoundingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeRoundingModeTypeToString(Dr3dPackage.Literals.EDGE_ROUNDING_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsDirectionType createNormalsDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNormalsDirectionTypeFromString(Dr3dPackage.Literals.NORMALS_DIRECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalsDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNormalsDirectionTypeToString(Dr3dPackage.Literals.NORMALS_DIRECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalsKindType createNormalsKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNormalsKindTypeFromString(Dr3dPackage.Literals.NORMALS_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalsKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNormalsKindTypeToString(Dr3dPackage.Literals.NORMALS_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionType createProjectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProjectionTypeFromString(Dr3dPackage.Literals.PROJECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProjectionTypeToString(Dr3dPackage.Literals.PROJECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadeModeType createShadeModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShadeModeTypeFromString(Dr3dPackage.Literals.SHADE_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadeModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShadeModeTypeToString(Dr3dPackage.Literals.SHADE_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowType createShadowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShadowTypeFromString(Dr3dPackage.Literals.SHADOW_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShadowTypeToString(Dr3dPackage.Literals.SHADOW_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureFilterType createTextureFilterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureFilterTypeFromString(Dr3dPackage.Literals.TEXTURE_FILTER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureFilterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureFilterTypeToString(Dr3dPackage.Literals.TEXTURE_FILTER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeXType createTextureGenerationModeXTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureGenerationModeXTypeFromString(Dr3dPackage.Literals.TEXTURE_GENERATION_MODE_XTYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureGenerationModeXTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureGenerationModeXTypeToString(Dr3dPackage.Literals.TEXTURE_GENERATION_MODE_XTYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureGenerationModeYType createTextureGenerationModeYTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureGenerationModeYTypeFromString(Dr3dPackage.Literals.TEXTURE_GENERATION_MODE_YTYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureGenerationModeYTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureGenerationModeYTypeToString(Dr3dPackage.Literals.TEXTURE_GENERATION_MODE_YTYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureKindType createTextureKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureKindTypeFromString(Dr3dPackage.Literals.TEXTURE_KIND_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureKindTypeToString(Dr3dPackage.Literals.TEXTURE_KIND_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModeType createTextureModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureModeTypeFromString(Dr3dPackage.Literals.TEXTURE_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureModeTypeToString(Dr3dPackage.Literals.TEXTURE_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dr3dPackage getDr3dPackage() {
		return (Dr3dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dr3dPackage getPackage() {
		return Dr3dPackage.eINSTANCE;
	}

} //Dr3dFactoryImpl
