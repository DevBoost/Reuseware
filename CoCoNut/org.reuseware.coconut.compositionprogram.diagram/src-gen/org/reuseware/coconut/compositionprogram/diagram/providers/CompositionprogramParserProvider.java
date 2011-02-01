package org.reuseware.coconut.compositionprogram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstancePortNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.parsers.MessageFormatParser;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;

/**
 * @generated
 */
public class CompositionprogramParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser fragmentInstanceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getFragmentInstanceName_5002Parser() {
		if (fragmentInstanceName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CompositionprogramPackage.eINSTANCE
					.getFragmentInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fragmentInstanceName_5002Parser = parser;
		}
		return fragmentInstanceName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser portInstanceFragmentRoleNamePortName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPortInstanceFragmentRoleNamePortName_5001Parser() {
		if (portInstanceFragmentRoleNamePortName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CompositionprogramPackage.eINSTANCE
							.getPortInstance_FragmentRoleName(),
					CompositionprogramPackage.eINSTANCE
							.getPortInstance_PortName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}.{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}.{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}.{1}"); //$NON-NLS-1$
			portInstanceFragmentRoleNamePortName_5001Parser = parser;
		}
		return portInstanceFragmentRoleNamePortName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FragmentInstanceNameEditPart.VISUAL_ID:
			return getFragmentInstanceName_5002Parser();
		case PortInstancePortNameEditPart.VISUAL_ID:
			return getPortInstanceFragmentRoleNamePortName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CompositionprogramVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CompositionprogramVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CompositionprogramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
