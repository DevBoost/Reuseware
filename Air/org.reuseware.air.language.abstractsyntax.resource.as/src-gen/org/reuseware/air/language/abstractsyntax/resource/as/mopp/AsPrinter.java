/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsPrinter implements org.reuseware.air.language.abstractsyntax.resource.as.IAsTextPrinter {
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolverFactory tokenResolverFactory = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource;
	private java.util.Map<?, ?> options;
	
	public AsPrinter(java.io.OutputStream outputStream, org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
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
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.reuseware.air.language.abstractsyntax.AbstractSyntax) {
			print_org_reuseware_air_language_abstractsyntax_AbstractSyntax((org.reuseware.air.language.abstractsyntax.AbstractSyntax) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Import) {
			print_org_reuseware_air_language_abstractsyntax_Import((org.reuseware.air.language.abstractsyntax.Import) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ASProgram) {
			print_org_reuseware_air_language_abstractsyntax_ASProgram((org.reuseware.air.language.abstractsyntax.ASProgram) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) {
			print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition((org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) {
			print_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition((org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Attribute) {
			print_org_reuseware_air_language_abstractsyntax_Attribute((org.reuseware.air.language.abstractsyntax.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Containment) {
			print_org_reuseware_air_language_abstractsyntax_Containment((org.reuseware.air.language.abstractsyntax.Containment) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.InternalReference) {
			print_org_reuseware_air_language_abstractsyntax_InternalReference((org.reuseware.air.language.abstractsyntax.InternalReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ExternalReference) {
			print_org_reuseware_air_language_abstractsyntax_ExternalReference((org.reuseware.air.language.abstractsyntax.ExternalReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.PLUS) {
			print_org_reuseware_air_language_abstractsyntax_PLUS((org.reuseware.air.language.abstractsyntax.PLUS) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.STAR) {
			print_org_reuseware_air_language_abstractsyntax_STAR((org.reuseware.air.language.abstractsyntax.STAR) element, globaltab, out);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.QUESTIONMARK) {
			print_org_reuseware_air_language_abstractsyntax_QUESTIONMARK((org.reuseware.air.language.abstractsyntax.QUESTIONMARK) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsReferenceResolverSwitch) new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsProblem(errorMessage, org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_AbstractSyntax(org.reuseware.air.language.abstractsyntax.AbstractSyntax element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT));
		printCountingMap.put("unit", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI));
		printCountingMap.put("nsuri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX));
		printCountingMap.put("nsprefix", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT));
		printCountingMap.put("import", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ABSTRACTSYNTAX");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("URI");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("nsuri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI), element));
				out.print(" ");
			}
			printCountingMap.put("nsuri", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("PREFIX");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("nsprefix");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX), element));
				out.print(" ");
			}
			printCountingMap.put("nsprefix", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_abstractsyntax_AbstractSyntax_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("unit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("unit", count - 1);
		}
	}
	public void print_org_reuseware_air_language_abstractsyntax_AbstractSyntax_0(org.reuseware.air.language.abstractsyntax.AbstractSyntax element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("IMPORT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("import");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("import", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_abstractsyntax_AbstractSyntax_0_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	public void print_org_reuseware_air_language_abstractsyntax_AbstractSyntax_0_0(org.reuseware.air.language.abstractsyntax.AbstractSyntax element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("import");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("import", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_Import(org.reuseware.air.language.abstractsyntax.Import element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX));
		printCountingMap.put("prefix", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE));
		printCountingMap.put("ePackage", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("ePackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportEPackageReferenceResolver().deResolve((org.eclipse.emf.ecore.EPackage) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE), element));
				out.print(" ");
			}
			printCountingMap.put("ePackage", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("AS");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("prefix");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX), element));
				out.print(" ");
			}
			printCountingMap.put("prefix", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_ASProgram(org.reuseware.air.language.abstractsyntax.ASProgram element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.AS_PROGRAM__STATEMENT));
		printCountingMap.put("statement", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statement");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.AS_PROGRAM__STATEMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("statement", 0);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition(org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES));
		printCountingMap.put("interfaces", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS));
		printCountingMap.put("members", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS));
		printCountingMap.put("eSuperClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	public void print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_0(org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("==>");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eSuperClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConcreteNodeDefinitionESuperClassReferenceResolver().deResolve((org.eclipse.emf.ecore.EClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("eSuperClass", count - 1);
		}
	}
	public void print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_1(org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("members");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("members", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_1_0(element, localtab, out1, printCountingMap1);
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
	public void print_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition_1_0(org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("members");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("members", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition(org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES));
		printCountingMap.put("interfaces", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInterfaceNodeDefinitionOptionsReferenceResolver().deResolve((org.reuseware.air.language.abstractsyntax.Definition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), element));
				out.print(" ");
			}
			printCountingMap.put("options", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	public void print_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition_0(org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInterfaceNodeDefinitionOptionsReferenceResolver().deResolve((org.reuseware.air.language.abstractsyntax.Definition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), element));
				out.print(" ");
			}
			printCountingMap.put("options", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_Attribute(org.reuseware.air.language.abstractsyntax.Attribute element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("@");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeTypeReferenceResolver().deResolve((org.eclipse.emf.ecore.EDataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cardinality", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_Containment(org.reuseware.air.language.abstractsyntax.Containment element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getContainmentTypeReferenceResolver().deResolve((org.reuseware.air.language.abstractsyntax.Definition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cardinality", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_InternalReference(org.reuseware.air.language.abstractsyntax.InternalReference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE));
		printCountingMap.put("opposite", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInternalReferenceTypeReferenceResolver().deResolve((org.reuseware.air.language.abstractsyntax.Definition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_reuseware_air_language_abstractsyntax_InternalReference_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cardinality", count - 1);
		}
	}
	public void print_org_reuseware_air_language_abstractsyntax_InternalReference_0(org.reuseware.air.language.abstractsyntax.InternalReference element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("opposite");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInternalReferenceOppositeReferenceResolver().deResolve((org.reuseware.air.language.abstractsyntax.InternalReference) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE), element));
				out.print(" ");
			}
			printCountingMap.put("opposite", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_ExternalReference(org.reuseware.air.language.abstractsyntax.ExternalReference element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE));
			if (o != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QNAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExternalReferenceTypeReferenceResolver().deResolve((org.eclipse.emf.ecore.EClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE)), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("cardinality", count - 1);
		}
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_PLUS(org.reuseware.air.language.abstractsyntax.PLUS element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_STAR(org.reuseware.air.language.abstractsyntax.STAR element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
	}
	
	public void print_org_reuseware_air_language_abstractsyntax_QUESTIONMARK(org.reuseware.air.language.abstractsyntax.QUESTIONMARK element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("?");
		out.print(" ");
	}
	
}
