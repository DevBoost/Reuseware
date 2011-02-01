grammar As;

options {
	superClass = AsANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.reuseware.air.language.abstractsyntax.resource.as.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.reuseware.air.language.abstractsyntax.resource.as.mopp;
}

@members{
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolverFactory tokenResolverFactory = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	@SuppressWarnings("unused")
	private int lastPosition;
	
	/**
	 * the index of the last token that was handled by retrieveLayoutInformation()
	 */
	private int lastPosition2;
	
	private org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolveResult tokenResolveResult = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolveResult();
	
	/**
	 * A flag that indicateds whether the parser should remember all expected
	 * elements. This flag is set to true when using the parse for code completion.
	 * Otherwise it is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal> expectedElements = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used only when the parser is used
	 * for code completion. Whenever the parser starts to read an object it is pushed
	 * on the stack. Once the element was parser completely it is popped for the stack.
	 */
	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	/**
	 * A collection that is filled with commands to be exectued after parsing. This
	 * collection is cleared before parsing starts and returned as part of the parse
	 * result object.
	 */
	private java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>> postParseCommands;
	
	/**
	 * A flag to indicate that the parser should stop parsing as soon as possible. The
	 * flag is set to false before parsing starts. It can be set to true by invoking
	 * the terminateParsing() method from another thread. This feature is used, when
	 * documents are parsed in the background (i.e., while editing them). In order to
	 * cancel running parsers, the parsing process can be terminated. This is done
	 * whenever a document changes, because the previous content of the document is
	 * not valid anymore and parsing the old content is not necessary any longer.
	 */
	private boolean terminateParsing;
	
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>() {
			public boolean execute(org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.reuseware.air.language.abstractsyntax.resource.as.IAsProblem() {
					public org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType getType() {
						return org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = org.reuseware.air.language.abstractsyntax.resource.as.util.AsMapUtil.castToEMap(value);
			if (mapKey != null && mapValue != null) {
				valueMap.put(mapKey, mapValue);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
	}
	
	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
		org.eclipse.emf.ecore.EObject currentTarget = target;
		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
			assert(object instanceof org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsDummyEObject);
			org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsDummyEObject dummy = (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>() {
			public boolean execute(org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>() {
			public boolean execute(org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>() {
			public boolean execute(org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new AsParser(new org.antlr.runtime3_2_0.CommonTokenStream(new AsLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new AsParser(new org.antlr.runtime3_2_0.CommonTokenStream(new AsLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public AsParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((AsLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((AsLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.AbstractSyntax.class) {
				return parse_org_reuseware_air_language_abstractsyntax_AbstractSyntax();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.Import.class) {
				return parse_org_reuseware_air_language_abstractsyntax_Import();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.ASProgram.class) {
				return parse_org_reuseware_air_language_abstractsyntax_ASProgram();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition.class) {
				return parse_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition.class) {
				return parse_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.Attribute.class) {
				return parse_org_reuseware_air_language_abstractsyntax_Attribute();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.Containment.class) {
				return parse_org_reuseware_air_language_abstractsyntax_Containment();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.InternalReference.class) {
				return parse_org_reuseware_air_language_abstractsyntax_InternalReference();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.ExternalReference.class) {
				return parse_org_reuseware_air_language_abstractsyntax_ExternalReference();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.PLUS.class) {
				return parse_org_reuseware_air_language_abstractsyntax_PLUS();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.STAR.class) {
				return parse_org_reuseware_air_language_abstractsyntax_STAR();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.abstractsyntax.QUESTIONMARK.class) {
				return parse_org_reuseware_air_language_abstractsyntax_QUESTIONMARK();
			}
		}
		throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsUnexpectedContentTypeException(typeObject);
	}
	
	private org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public java.lang.Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	protected java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation getMetaInformation() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.reuseware.air.language.abstractsyntax.resource.as.IAsOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>>();
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsParseResult parseResult = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
		org.reuseware.air.language.abstractsyntax.resource.as.IAsParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal>();
		java.util.List<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal> newFollowSet = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 59;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement newFollower = newFollowerPair.getLeft();
							org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal newFollowTerminal = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = java.lang.Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = java.lang.Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>() {
			public boolean execute(org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
				return true;
			}
		});
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		java.lang.String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			java.lang.String tokenName = "<unknown>";
			if (mte.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mte.expecting];
				tokenName = org.reuseware.air.language.abstractsyntax.resource.as.util.AsStringUtil.formatTokenName(tokenName);
			}
			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
			java.lang.String tokenName = "<unknown>";
			if (mtne.expecting == Token.EOF) {
				tokenName = "EOF";
			} else {
				tokenName = getTokenNames()[mtne.expecting];
			}
			message = "mismatched tree node: " + "xxx" + "; expecting " + tokenName;
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parse is used for code completion
		final java.lang.String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
		java.lang.String message = "";
		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public void terminate() {
		terminateParsing = true;
	}
	
	protected void completedElement(java.lang.Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.pop();
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	/**
	 * Creates a dynamic Java proxy that mimics the interface of the given class.
	 */
	@SuppressWarnings("unchecked")
	
	public <T> T createDynamicProxy(java.lang.Class<T> clazz) {
		java.lang.Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new java.lang.Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
			
			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
			
			public java.lang.Object invoke(java.lang.Object object, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
				// search in dummyObject for the requested method
				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
					boolean matches = true;
					if (methodInDummy.getName().equals(method.getName())) {
						java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
						java.lang.Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
						if (parameterTypes.length == parameterTypesInDummy.length) {
							for (int p = 0; p < parameterTypes.length; p++) {
								java.lang.Class<?> parameterType = parameterTypes[p];
								java.lang.Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
								if (!parameterType.equals(parameterTypeInDummy)) {
									matches = false;
								}
							}
						} else {
							matches = false;
						}
					} else {
						matches = false;
					}
					if (matches) {
						return methodInDummy.invoke(dummyObject, args);
					}
				}
				return null;
			}
					});
		return (T) proxy;
	}
	
	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement syntaxElement, java.lang.Object object) {
		if (!(syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder) && !(syntaxElement instanceof org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword)) {
			return;
		}
		int currentPos = getTokenStream().index();
		if (currentPos == 0) {
			return;
		}
		int endPos = currentPos - 1;
		for (; endPos >= this.lastPosition2; endPos--) {
			org.antlr.runtime3_2_0.Token token = getTokenStream().get(endPos);
			int _channel = token.getChannel();
			if (_channel != 99) {
				break;
			}
		}
		java.lang.StringBuilder hiddenTokenText = new java.lang.StringBuilder();
		java.lang.StringBuilder visibleTokenText = new java.lang.StringBuilder();
		org.antlr.runtime3_2_0.CommonToken firstToken = null;
		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
			org.antlr.runtime3_2_0.Token token = getTokenStream().get(pos);
			if (firstToken == null) {
				firstToken = (org.antlr.runtime3_2_0.CommonToken) token;
			}
			int _channel = token.getChannel();
			if (_channel == 99) {
				hiddenTokenText.append(token.getText());
			} else {
				visibleTokenText.append(token.getText());
			}
		}
		int offset = -1;
		if (firstToken != null) {
			offset = firstToken.getStartIndex();
		}
		org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		layoutInformationAdapter.addLayoutInformation(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_org_reuseware_air_language_abstractsyntax_AbstractSyntax{ element = c0; }
	)
	EOF	
;

parse_org_reuseware_air_language_abstractsyntax_AbstractSyntax returns [org.reuseware.air.language.abstractsyntax.AbstractSyntax element = null]
@init{
}
:
	a0 = 'ABSTRACTSYNTAX' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_1, 1));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			}
			if (a1 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_1, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_2, 2));
	}
	
	a2 = 'URI' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_3, 3));
	}
	
	(
		a3 = QUOTED_60_62		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			}
			if (a3 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_4, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_4, 4));
	}
	
	a4 = 'PREFIX' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_5, 5));
	}
	
	(
		a5 = QNAME		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			}
			if (a5 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_7, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_6, 6));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 6, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 6, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
	}
	
	(
		(
			a6 = 'IMPORT' {
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_9_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_9, 7, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_2));
			}
			
			(
				a7_0 = parse_org_reuseware_air_language_abstractsyntax_Import				{
					if (terminateParsing) {
						throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
					}
					if (element == null) {
						element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT, a7_0);
							completedElement(a7_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_9_0_0_1, a7_0);
						copyLocalizationInfos(a7_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_10, 8));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 8, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 8, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_9_0_0_2_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_9, 9, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_2));
					}
					
					(
						a9_0 = parse_org_reuseware_air_language_abstractsyntax_Import						{
							if (terminateParsing) {
								throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
							}
							if (element == null) {
								element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT, a9_0);
									completedElement(a9_0, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_9_0_0_2_0_0_1, a9_0);
								copyLocalizationInfos(a9_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_10, 10));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 10, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 10, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_10, 11));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 11, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 11, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 12, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 12, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
	}
	
	(
		a10_0 = parse_org_reuseware_air_language_abstractsyntax_ASUnit		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAbstractSyntax();
			}
			if (a10_0 != null) {
				if (a10_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT), a10_0);
					completedElement(a10_0, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_0_0_0_10, a10_0);
				copyLocalizationInfos(a10_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_Import returns [org.reuseware.air.language.abstractsyntax.Import element = null]
@init{
}
:
	(
		a0 = QUOTED_60_62		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createImport();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.eclipse.emf.ecore.EPackage proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.Import, org.eclipse.emf.ecore.EPackage>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportEPackageReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_1_0_0_0, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_11, 14));
	}
	
	a1 = 'AS' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_1_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_12, 15));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createImport();
			}
			if (a2 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_1_0_0_2, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_10, 16));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 16, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 16, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_1));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_ASProgram returns [org.reuseware.air.language.abstractsyntax.ASProgram element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_reuseware_air_language_abstractsyntax_ASStatement			{
				if (terminateParsing) {
					throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
				}
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createASProgram();
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.AS_PROGRAM__STATEMENT, a0_0);
						completedElement(a0_0, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_2_0_0_1, a0_0);
					copyLocalizationInfos(a0_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 17, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 17, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition returns [org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_13, 18));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_14, 18));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 18));
	}
	
	(
		(
			a1 = '==>' {
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_1_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_16, 19));
			}
			
			(
				a2 = QNAME				
				{
					if (terminateParsing) {
						throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
					}
					if (element == null) {
						element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
					}
					if (a2 != null) {
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
						tokenResolver.setOptions(getOptions());
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConcreteNodeDefinitionESuperClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS), proxy);
							completedElement(proxy, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_1_0_0_1, proxy);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_14, 20));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 20));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_14, 21));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 21));
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_2_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_17, 22, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_18, 22, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_19, 22, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_20, 22, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
			}
			
			(
				a4_0 = parse_org_reuseware_air_language_abstractsyntax_NodeFeature				{
					if (terminateParsing) {
						throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
					}
					if (element == null) {
						element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS, a4_0);
							completedElement(a4_0, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_2_0_0_1, a4_0);
						copyLocalizationInfos(a4_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 23));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 23));
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_2_0_0_2_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_17, 24, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_18, 24, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_19, 24, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_20, 24, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_3));
					}
					
					(
						a6_0 = parse_org_reuseware_air_language_abstractsyntax_NodeFeature						{
							if (terminateParsing) {
								throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
							}
							if (element == null) {
								element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS, a6_0);
									completedElement(a6_0, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_2_0_0_2_0_0_1, a6_0);
								copyLocalizationInfos(a6_0, element); 							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 25));
						addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 25));
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 26));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 26));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 27));
	}
	
	a7 = ';' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_3_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 28, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 28, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition returns [org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_22, 29));
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_23, 30));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
			}
			if (a2 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.reuseware.air.language.abstractsyntax.Definition proxy = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition, org.reuseware.air.language.abstractsyntax.Definition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInterfaceNodeDefinitionOptionsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), resolved, proxy);
				if (proxy != null) {
					addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS, proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_2, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_24, 31));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_25, 31));
	}
	
	(
		(
			a3 = '|' {
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_26, 32));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
					}
					if (element == null) {
						element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
					}
					if (a4 != null) {
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.reuseware.air.language.abstractsyntax.Definition proxy = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition, org.reuseware.air.language.abstractsyntax.Definition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInterfaceNodeDefinitionOptionsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), resolved, proxy);
						if (proxy != null) {
							addObjectToList(element, org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS, proxy);
							completedElement(proxy, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_3_0_0_1, proxy);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_24, 33));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_25, 33));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_24, 34));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_25, 34));
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInterfaceNodeDefinition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_4_0_0_4, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_7, 35, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_8, 35, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_0));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_Attribute returns [org.reuseware.air.language.abstractsyntax.Attribute element = null]
@init{
}
:
	a0 = '@' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_27, 36));
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAttribute();
			}
			if (a1 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5_0_0_1, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_28, 37));
	}
	
	a2 = ':' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5_0_0_2, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_29, 38));
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAttribute();
			}
			if (a3 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.eclipse.emf.ecore.EDataType proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.Attribute, org.eclipse.emf.ecore.EDataType>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5_0_0_3, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 39, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 39, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 39, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 39));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 39));
	}
	
	(
		(
			a4_0 = parse_org_reuseware_air_language_abstractsyntax_Cardinality			{
				if (terminateParsing) {
					throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
				}
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createAttribute();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__CARDINALITY), a4_0);
						completedElement(a4_0, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_5_0_0_4, a4_0);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 40));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 40));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_Containment returns [org.reuseware.air.language.abstractsyntax.Containment element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createContainment();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_6_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_33, 41));
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createContainment();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_6_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_34, 42));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createContainment();
			}
			if (a2 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.reuseware.air.language.abstractsyntax.Definition proxy = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.Containment, org.reuseware.air.language.abstractsyntax.Definition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getContainmentTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_6_0_0_2, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 43, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 43, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 43, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 43));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 43));
	}
	
	(
		(
			a3_0 = parse_org_reuseware_air_language_abstractsyntax_Cardinality			{
				if (terminateParsing) {
					throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
				}
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createContainment();
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__CARDINALITY), a3_0);
						completedElement(a3_0, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_6_0_0_3, a3_0);
					copyLocalizationInfos(a3_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 44));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 44));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_InternalReference returns [org.reuseware.air.language.abstractsyntax.InternalReference element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_35, 45));
	}
	
	a1 = '::' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_36, 46));
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
			}
			if (a2 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.reuseware.air.language.abstractsyntax.Definition proxy = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createConcreteNodeDefinition();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.InternalReference, org.reuseware.air.language.abstractsyntax.Definition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInternalReferenceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_2, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_37, 47));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 47, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 47, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 47, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 47));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 47));
	}
	
	(
		(
			a3 = '->' {
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_38, 48));
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
					}
					if (element == null) {
						element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
					}
					if (a4 != null) {
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.reuseware.air.language.abstractsyntax.InternalReference proxy = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.InternalReference, org.reuseware.air.language.abstractsyntax.InternalReference>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInternalReferenceOppositeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE), resolved, proxy);
						if (proxy != null) {
							element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE), proxy);
							completedElement(proxy, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_3_0_0_1, proxy);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 49, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 49, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 49, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 49));
				addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 49));
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 50, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 50, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 50, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 50));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 50));
	}
	
	(
		(
			a5_0 = parse_org_reuseware_air_language_abstractsyntax_Cardinality			{
				if (terminateParsing) {
					throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
				}
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createInternalReference();
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__CARDINALITY), a5_0);
						completedElement(a5_0, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_7_0_0_4, a5_0);
					copyLocalizationInfos(a5_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 51));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 51));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_ExternalReference returns [org.reuseware.air.language.abstractsyntax.ExternalReference element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createExternalReference();
			}
			if (a0 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME), resolved);
					completedElement(resolved, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_8_0_0_0, resolved);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_39, 52));
	}
	
	a1 = '::' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createExternalReference();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_8_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_40, 53));
	}
	
	(
		a2 = QNAME		
		{
			if (terminateParsing) {
				throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
			}
			if (element == null) {
				element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createExternalReference();
			}
			if (a2 != null) {
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
				tokenResolver.setOptions(getOptions());
				org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.eclipse.emf.ecore.EClass proxy = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragmentFactory<org.reuseware.air.language.abstractsyntax.ExternalReference, org.eclipse.emf.ecore.EClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getExternalReferenceTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE), resolved, proxy);
				if (proxy != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE), proxy);
					completedElement(proxy, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_8_0_0_2, proxy);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_30, 54, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_31, 54, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_32, 54, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.FEATURE_4));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 54));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 54));
	}
	
	(
		(
			a3_0 = parse_org_reuseware_air_language_abstractsyntax_Cardinality			{
				if (terminateParsing) {
					throw new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTerminateParsingException();
				}
				if (element == null) {
					element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createExternalReference();
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__CARDINALITY), a3_0);
						completedElement(a3_0, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_8_0_0_3, a3_0);
					copyLocalizationInfos(a3_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 55));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 55));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_PLUS returns [org.reuseware.air.language.abstractsyntax.PLUS element = null]
@init{
}
:
	a0 = '+' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createPLUS();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_9_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 56));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 56));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_STAR returns [org.reuseware.air.language.abstractsyntax.STAR element = null]
@init{
}
:
	a0 = '*' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createSTAR();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_10_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 57));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 57));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_QUESTIONMARK returns [org.reuseware.air.language.abstractsyntax.QUESTIONMARK element = null]
@init{
}
:
	a0 = '?' {
		if (element == null) {
			element = org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory.eINSTANCE.createQUESTIONMARK();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsGrammarInformationProvider.AS_11_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_21, 58));
		addExpectedElement(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsExpectedTerminal(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFollowSetProvider.TERMINAL_15, 58));
	}
	
;

parse_org_reuseware_air_language_abstractsyntax_ASUnit returns [org.reuseware.air.language.abstractsyntax.ASUnit element = null]
:
	c0 = parse_org_reuseware_air_language_abstractsyntax_ASProgram{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_reuseware_air_language_abstractsyntax_ASStatement returns [org.reuseware.air.language.abstractsyntax.ASStatement element = null]
:
	c0 = parse_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_reuseware_air_language_abstractsyntax_NodeFeature returns [org.reuseware.air.language.abstractsyntax.NodeFeature element = null]
:
	c0 = parse_org_reuseware_air_language_abstractsyntax_Attribute{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_reuseware_air_language_abstractsyntax_Containment{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_reuseware_air_language_abstractsyntax_InternalReference{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_reuseware_air_language_abstractsyntax_ExternalReference{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_reuseware_air_language_abstractsyntax_Cardinality returns [org.reuseware.air.language.abstractsyntax.Cardinality element = null]
:
	c0 = parse_org_reuseware_air_language_abstractsyntax_PLUS{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_reuseware_air_language_abstractsyntax_STAR{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_reuseware_air_language_abstractsyntax_QUESTIONMARK{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	'%'(~('\n'|'\r'))*	{ _channel = 99; }
;
TEXT:
	('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'0'..'9')*;
QNAME:
	('A'..'Z'|'a'..'z'|'_')+('.'('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')+)+;
WHITESPACE:
	(' '|'\t'|'\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n'|'\r'|'\n')
	{ _channel = 99; }
;
QUOTED_60_62:
	('<')(~('>'))*('>')
;

