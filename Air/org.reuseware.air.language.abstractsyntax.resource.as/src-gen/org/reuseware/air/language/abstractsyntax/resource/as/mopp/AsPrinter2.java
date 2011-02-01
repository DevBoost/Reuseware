/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsPrinter2 implements org.reuseware.air.language.abstractsyntax.resource.as.IAsTextPrinter {
	
	private class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private java.util.List<PrintToken> tokenOutputStream;
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolverFactory tokenResolverFactory = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether token have already been printed for the some
	 * object. The flag is set to false whenever printing of an EObject tree is
	 * started. The status of the flag is used to avoid printing default token space
	 * in front of the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters the were printed before the current line. This
	 * number is used to calculate the relative indendation when printing contained
	 * objects.
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indendation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	private int newTabsBeforeCurrentObject;
	
	public AsPrinter2(java.io.OutputStream outputStream, org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		doPrint(element, new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement>());
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.reuseware.air.language.abstractsyntax.AbstractSyntax) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Import) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ASProgram) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Attribute) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.Containment) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.InternalReference) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.ExternalReference) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.PLUS) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.STAR) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.reuseware.air.language.abstractsyntax.QUESTIONMARK) {
			printInternal(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_11, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement ruleElement, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements) {
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator getDecoratorTree(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement syntaxElement) {
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator[] childDecorators = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decorator = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement syntaxElement = decorator.getDecoratedElement();
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal) {
				org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal terminal = (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice) {
				// for choices we do print only the choice which does print at least one feature
				org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator childToPrint = null;
				for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.STAR || cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE || cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap) {
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal) {
			org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal terminal = (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement printElement = decorator.getDecoratedElement();
		org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality = printElement.getCardinality();
		java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> cloned = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			java.lang.Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword) {
					printKeyword(eObject, (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder) {
					org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder = (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment) {
					org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment containment = (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsWhiteSpace) {
				foundFormattingElements.add((org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsWhiteSpace) printElement);
			}
			if (printElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak) {
				foundFormattingElements.add((org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak) printElement);
			}
			for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice) {
					break;
				}
			}
			if (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE || cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.STAR || cardinality == org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword keyword, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + org.reuseware.air.language.abstractsyntax.resource.as.util.AsStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder, int count, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder, int count, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		java.lang.String result;
		java.lang.Object attributeValue = getValue(eObject, attribute, count);
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		java.lang.String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			java.lang.String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		}
		// write result to the output stream
		tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
	}
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment containment, int count, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		java.lang.Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject + currentTabs;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations, org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation) {
		java.lang.String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			layoutInformations.remove(layoutInformation);
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
			return;
		}
		if (foundFormattingElements.size() > 0) {
			for (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsWhiteSpace) {
					int amount = ((org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(new PrintToken(" ", null));
					}
				}
				if (foundFormattingElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak) {
					currentTabs = ((org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak) foundFormattingElement).getTabs();
					tokenOutputStream.add(new PrintToken(NEW_LINE, null));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(new PrintToken("\t", null));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		java.lang.Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder, int count, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement> foundFormattingElements, java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations) {
		java.lang.Object referencedObject = getValue(eObject, reference, count);
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// NC-References must always be printed by deresolving the reference. We cannot
		// use the visible token information, because deresolving usually depends on
		// attribute values of the referenced object instead of the object itself.
		String tokenName = placeholder.getTokenName();
		org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		@SuppressWarnings("rawtypes")		
		org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
		referenceResolver.setOptions(getOptions());
		java.lang.String deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		java.lang.String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<java.lang.String, java.lang.Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			java.lang.Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource getResource() {
		return resource;
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
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter) {
				return (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter) adapter;
			}
		}
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter newAdapter = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation getLayoutInformation(java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation> layoutInformations, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement syntaxElement, java.lang.Object object, org.eclipse.emf.ecore.EObject container) {
		for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	private java.lang.String getHiddenTokenText(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private java.lang.String getVisibleTokenText(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			org.reuseware.air.language.abstractsyntax.resource.as.IAsTextScanner scanner = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken> tempTokens = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken>();
			org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
