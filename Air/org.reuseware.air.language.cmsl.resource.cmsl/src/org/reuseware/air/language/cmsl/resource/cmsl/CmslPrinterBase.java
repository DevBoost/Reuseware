package org.reuseware.air.language.cmsl.resource.cmsl;

public abstract class CmslPrinterBase extends org.emftext.runtime.resource.impl.AbstractEMFTextPrinter {
	
	protected org.emftext.runtime.resource.ITokenResolverFactory tokenResolverFactory = new CmslTokenResolverFactory();
	protected CmslReferenceResolverSwitch referenceResolverSwitch;
	
	public CmslPrinterBase(java.io.OutputStream o, org.emftext.runtime.resource.ITextResource resource) {
		super(o, resource);
	}
	
	protected static int matchCount(java.util.Map<java.lang.String, java.lang.Integer> featureCounter, java.util.Collection<java.lang.String> needed){
		int pos = 0;
		int neg = 0;
		
		for(java.lang.String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, java.lang.String globaltab) {
		if (element == null || out == null) throw new java.lang.NullPointerException("Nothing to write or to write on.");
		
		if (element instanceof org.reuseware.air.language.cmsl.GrammarExtension) {
			print_org_reuseware_air_language_cmsl_GrammarExtension((org.reuseware.air.language.cmsl.GrammarExtension) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.ExtensionProgram) {
			print_org_reuseware_air_language_cmsl_ExtensionProgram((org.reuseware.air.language.cmsl.ExtensionProgram) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.ExtensionDeclaration) {
			print_org_reuseware_air_language_cmsl_ExtensionDeclaration((org.reuseware.air.language.cmsl.ExtensionDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.BaseDeclaration) {
			print_org_reuseware_air_language_cmsl_BaseDeclaration((org.reuseware.air.language.cmsl.BaseDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Slotify) {
			print_org_reuseware_air_language_cmsl_Slotify((org.reuseware.air.language.cmsl.Slotify) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Injection) {
			print_org_reuseware_air_language_cmsl_Injection((org.reuseware.air.language.cmsl.Injection) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Annotation) {
			print_org_reuseware_air_language_cmsl_Annotation((org.reuseware.air.language.cmsl.Annotation) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Fragtypes) {
			print_org_reuseware_air_language_cmsl_Fragtypes((org.reuseware.air.language.cmsl.Fragtypes) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.DefinitionList) {
			print_org_reuseware_air_language_cmsl_DefinitionList((org.reuseware.air.language.cmsl.DefinitionList) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.DefinitionPart) {
			print_org_reuseware_air_language_cmsl_DefinitionPart((org.reuseware.air.language.cmsl.DefinitionPart) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.DefinitionConstruct) {
			print_org_reuseware_air_language_cmsl_DefinitionConstruct((org.reuseware.air.language.cmsl.DefinitionConstruct) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.DefinitionChoice) {
			print_org_reuseware_air_language_cmsl_DefinitionChoice((org.reuseware.air.language.cmsl.DefinitionChoice) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Construct) {
			print_org_reuseware_air_language_cmsl_Construct((org.reuseware.air.language.cmsl.Construct) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Reference) {
			print_org_reuseware_air_language_cmsl_Reference((org.reuseware.air.language.cmsl.Reference) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.BaseLanguageReference) {
			print_org_reuseware_air_language_cmsl_BaseLanguageReference((org.reuseware.air.language.cmsl.BaseLanguageReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.UpperLevelReference) {
			print_org_reuseware_air_language_cmsl_UpperLevelReference((org.reuseware.air.language.cmsl.UpperLevelReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Arbitrary) {
			print_org_reuseware_air_language_cmsl_Arbitrary((org.reuseware.air.language.cmsl.Arbitrary) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.MoreThanOne) {
			print_org_reuseware_air_language_cmsl_MoreThanOne((org.reuseware.air.language.cmsl.MoreThanOne) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.ZeroOne) {
			print_org_reuseware_air_language_cmsl_ZeroOne((org.reuseware.air.language.cmsl.ZeroOne) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.Role) {
			print_org_reuseware_air_language_cmsl_Role((org.reuseware.air.language.cmsl.Role) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.cmsl.NonTerminalIdentifier) {
			print_org_reuseware_air_language_cmsl_NonTerminalIdentifier((org.reuseware.air.language.cmsl.NonTerminalIdentifier) element, globaltab, out);
			return;
		}
		
		resource.addWarning("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void setReferenceResolverSwitch(CmslReferenceResolverSwitch referenceResolverSwitch) {
		this.referenceResolverSwitch = referenceResolverSwitch;
	}
	
	public void print_org_reuseware_air_language_cmsl_GrammarExtension(org.reuseware.air.language.cmsl.GrammarExtension element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.GRAMMAR_EXTENSION__UNIT));
		printCountingMap.put("unit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("unit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.GRAMMAR_EXTENSION__UNIT));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("unit",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_ExtensionProgram(org.reuseware.air.language.cmsl.ExtensionProgram element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__BASE));
		printCountingMap.put("base", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__EXTENSION));
		printCountingMap.put("extension", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("extension");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__EXTENSION));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("extension",count-1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("base");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__BASE));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("base",count-1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("statements");
		if (count > 0) {
			java.util.ListIterator<?> it  = ((java.util.List<?>) element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__STATEMENTS))).listIterator(((java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__STATEMENTS))).size()-count);
			while(it.hasNext()){
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statements",0);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_ExtensionDeclaration(org.reuseware.air.language.cmsl.ExtensionDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSURI));
		printCountingMap.put("nsuri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSPREFIX));
		printCountingMap.put("nsprefix", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__TARGETURL));
		printCountingMap.put("targeturl", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("COMPONENTMODEL");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NAME));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NAME), element));
			printCountingMap.put("name",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_ExtensionDeclaration_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_ExtensionDeclaration_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_ExtensionDeclaration_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_reuseware_air_language_cmsl_ExtensionDeclaration_2(org.reuseware.air.language.cmsl.ExtensionDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("URL");
		//////////////DEFINITION PART BEGINS (PlaceholderInQuotes):
		count = printCountingMap.get("targeturl");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__TARGETURL));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__TARGETURL), element));
			printCountingMap.put("targeturl",count-1);
		}
	}
	public void print_org_reuseware_air_language_cmsl_ExtensionDeclaration_1(org.reuseware.air.language.cmsl.ExtensionDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("URI");
		//////////////DEFINITION PART BEGINS (PlaceholderInQuotes):
		count = printCountingMap.get("nsuri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSURI));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSURI), element));
			printCountingMap.put("nsuri",count-1);
		}
	}
	public void print_org_reuseware_air_language_cmsl_ExtensionDeclaration_0(org.reuseware.air.language.cmsl.ExtensionDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("PREFIX");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("nsprefix");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSPREFIX));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSPREFIX), element));
			printCountingMap.put("nsprefix",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_BaseDeclaration(org.reuseware.air.language.cmsl.BaseDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NSURI));
		printCountingMap.put("nsuri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__SOURCEURL));
		printCountingMap.put("sourceurl", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EXTENDS");
		//////////////DEFINITION PART BEGINS (PlaceholderInQuotes):
		count = printCountingMap.get("nsuri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NSURI));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NSURI), element));
			printCountingMap.put("nsuri",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("as");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NAME));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NAME), element));
			printCountingMap.put("name",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_BaseDeclaration_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_reuseware_air_language_cmsl_BaseDeclaration_0(org.reuseware.air.language.cmsl.BaseDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("URL");
		//////////////DEFINITION PART BEGINS (PlaceholderInQuotes):
		count = printCountingMap.get("sourceurl");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__SOURCEURL));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__SOURCEURL), element));
			printCountingMap.put("sourceurl",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_Slotify(org.reuseware.air.language.cmsl.Slotify element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.SLOTIFY__CONSTRUCT));
		printCountingMap.put("construct", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("slotify");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("construct");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.SLOTIFY__CONSTRUCT));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("construct",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
	}
	
	public void print_org_reuseware_air_language_cmsl_Injection(org.reuseware.air.language.cmsl.Injection element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__SOURCE));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("source",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("<>");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__TARGET));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("target",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
	}
	
	public void print_org_reuseware_air_language_cmsl_Annotation(org.reuseware.air.language.cmsl.Annotation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__SOURCE));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("source",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("->");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("@");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__TARGET));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("target",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
	}
	
	public void print_org_reuseware_air_language_cmsl_Fragtypes(org.reuseware.air.language.cmsl.Fragtypes element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE));
		printCountingMap.put("fragtype", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("fragtypes");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("fragtype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("fragtype",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_cmsl_Fragtypes_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_reuseware_air_language_cmsl_Fragtypes_0(org.reuseware.air.language.cmsl.Fragtypes element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("fragtype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("fragtype",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_DefinitionList(org.reuseware.air.language.cmsl.DefinitionList element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS));
		printCountingMap.put("refs", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("refs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("refs",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_cmsl_DefinitionList_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_reuseware_air_language_cmsl_DefinitionList_0(org.reuseware.air.language.cmsl.DefinitionList element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("refs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("refs",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_DefinitionPart(org.reuseware.air.language.cmsl.DefinitionPart element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ROLENAME));
		printCountingMap.put("rolename", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__CONSTRUCT));
		printCountingMap.put("construct", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ANNOTATION));
		printCountingMap.put("annotation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rolename");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ROLENAME));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("rolename",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("construct");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__CONSTRUCT));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("construct",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_DefinitionPart_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_reuseware_air_language_cmsl_DefinitionPart_0(org.reuseware.air.language.cmsl.DefinitionPart element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ANNOTATION));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("annotation",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
	}
	
	public void print_org_reuseware_air_language_cmsl_DefinitionConstruct(org.reuseware.air.language.cmsl.DefinitionConstruct element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT));
		printCountingMap.put("newConstruct", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("newConstruct");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("newConstruct",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_cmsl_DefinitionConstruct_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
	}
	public void print_org_reuseware_air_language_cmsl_DefinitionConstruct_0(org.reuseware.air.language.cmsl.DefinitionConstruct element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("definition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__DEFINITION));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("definition",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_DefinitionChoice(org.reuseware.air.language.cmsl.DefinitionChoice element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT));
		printCountingMap.put("newConstruct", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE));
		printCountingMap.put("choice", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("newConstruct");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("newConstruct",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("choice");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("choice",count-1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_cmsl_DefinitionChoice_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
	}
	public void print_org_reuseware_air_language_cmsl_DefinitionChoice_0(org.reuseware.air.language.cmsl.DefinitionChoice element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("|");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("choice");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE));
			o = ((java.util.List<?>)o).get(((java.util.List<?>)o).size() - count);
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("choice",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_Construct(org.reuseware.air.language.cmsl.Construct element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__NAME));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("name",count-1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__CARDINALITY));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("cardinality",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_Reference(org.reuseware.air.language.cmsl.Reference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__BASE));
		printCountingMap.put("base", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("base");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__BASE));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("base",count-1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__CARDINALITY));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("cardinality",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_BaseLanguageReference(org.reuseware.air.language.cmsl.BaseLanguageReference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE));
		printCountingMap.put("language", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__BASE));
		printCountingMap.put("base", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("language");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE), element));
			printCountingMap.put("language",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(".");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("base");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__BASE));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("base",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_UpperLevelReference(org.reuseware.air.language.cmsl.UpperLevelReference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.UPPER_LEVEL_REFERENCE__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("@");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("upper");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.UPPER_LEVEL_REFERENCE__UPPER));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("upper",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_Arbitrary(org.reuseware.air.language.cmsl.Arbitrary element, java.lang.String outertab, java.io.PrintWriter out) {
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("*");
	}
	
	public void print_org_reuseware_air_language_cmsl_MoreThanOne(org.reuseware.air.language.cmsl.MoreThanOne element, java.lang.String outertab, java.io.PrintWriter out) {
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("+");
	}
	
	public void print_org_reuseware_air_language_cmsl_ZeroOne(org.reuseware.air.language.cmsl.ZeroOne element, java.lang.String outertab, java.io.PrintWriter out) {
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("?");
	}
	
	public void print_org_reuseware_air_language_cmsl_Role(org.reuseware.air.language.cmsl.Role element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ROLE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ROLE__VALUE));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ROLE__VALUE), element));
			printCountingMap.put("value",count-1);
		}
	}
	
	public void print_org_reuseware_air_language_cmsl_NonTerminalIdentifier(org.reuseware.air.language.cmsl.NonTerminalIdentifier element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.NON_TERMINAL_IDENTIFIER__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.NON_TERMINAL_IDENTIFIER__VALUE));
			org.emftext.runtime.resource.ITokenResolver resolver = tokenResolverFactory.createTokenResolver("ESTRING2");
			resolver.setOptions(getOptions());
			out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.NON_TERMINAL_IDENTIFIER__VALUE), element));
			printCountingMap.put("value",count-1);
		}
	}
	
}
