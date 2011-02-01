package org.reuseware.coconut.compositionprogram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionLinkEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;

/**
 * @generated
 */
public class CompositionprogramElementTypes {

	/**
	 * @generated
	 */
	private CompositionprogramElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CompositionProgram_1000 = getElementType("org.reuseware.coconut.compositionprogram.diagram.CompositionProgram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FragmentInstance_2001 = getElementType("org.reuseware.coconut.compositionprogram.diagram.FragmentInstance_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortInstance_3001 = getElementType("org.reuseware.coconut.compositionprogram.diagram.PortInstance_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositionLink_4001 = getElementType("org.reuseware.coconut.compositionprogram.diagram.CompositionLink_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CompositionprogramDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}

		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CompositionProgram_1000,
					CompositionprogramPackage.eINSTANCE.getCompositionProgram());

			elements.put(FragmentInstance_2001,
					CompositionprogramPackage.eINSTANCE.getFragmentInstance());

			elements.put(PortInstance_3001,
					CompositionprogramPackage.eINSTANCE.getPortInstance());

			elements.put(CompositionLink_4001,
					CompositionprogramPackage.eINSTANCE.getCompositionLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CompositionProgram_1000);
			KNOWN_ELEMENT_TYPES.add(FragmentInstance_2001);
			KNOWN_ELEMENT_TYPES.add(PortInstance_3001);
			KNOWN_ELEMENT_TYPES.add(CompositionLink_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CompositionProgramEditPart.VISUAL_ID:
			return CompositionProgram_1000;
		case FragmentInstanceEditPart.VISUAL_ID:
			return FragmentInstance_2001;
		case PortInstanceEditPart.VISUAL_ID:
			return PortInstance_3001;
		case CompositionLinkEditPart.VISUAL_ID:
			return CompositionLink_4001;
		}
		return null;
	}

}
