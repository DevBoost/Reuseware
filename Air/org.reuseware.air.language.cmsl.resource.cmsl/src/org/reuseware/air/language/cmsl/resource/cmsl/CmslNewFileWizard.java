package org.reuseware.air.language.cmsl.resource.cmsl;

import java.io.OutputStream;

import org.emftext.runtime.resource.ITextPrinter;

public class CmslNewFileWizard extends org.emftext.runtime.ui.new_wizard.AbstractNewFileWizard {
	public String getFileExtension() {
		return "cmsl";
	}
	public String getExampleContent() {
		return "COMPONENTMODELsomeExtensionDeclarationNameEXTENDS<someBaseDeclarationNsuri>assomeBaseDeclarationName";
	}
	@Override
	public ITextPrinter getPrinter(OutputStream outputStream) {
		// TODO Auto-generated method stub
		return null;
	}
}
