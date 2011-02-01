grammar Cmsl;

options {
	superClass = AbstractEMFTextParser;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.reuseware.air.language.cmsl.resource.cmsl;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition       = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream)input).index());
	}
}
@header{
	package org.reuseware.air.language.cmsl.resource.cmsl;
	
	import org.eclipse.emf.ecore.EObject;
	import org.eclipse.emf.ecore.InternalEObject;
	import org.eclipse.emf.common.util.URI;
	import org.emftext.runtime.resource.impl.AbstractEMFTextParser;
	import org.emftext.runtime.IOptions;
	import org.emftext.runtime.resource.impl.UnexpectedContentTypeException;
	import org.eclipse.emf.ecore.EClass;
}

@members{
	private org.emftext.runtime.resource.ITokenResolverFactory tokenResolverFactory = new CmslTokenResolverFactory();
	private int lastPosition;
	private org.emftext.runtime.resource.impl.TokenResolveResult tokenResolveResult = new org.emftext.runtime.resource.impl.TokenResolveResult();
	private org.reuseware.air.language.cmsl.resource.cmsl.CmslReferenceResolverSwitch referenceResolverSwitch;
	
	protected EObject doParse() throws RecognitionException {
		lastPosition = 0;
		((CmslLexer)getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((CmslLexer)getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = null;
		Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(IOptions.RESOURCE_CONTENT_TYPE);
		}
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass)typeObject;
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.GrammarExtension.class) {
				return grammarextension();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.ExtensionProgram.class) {
				return extensionprogram();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.ExtensionDeclaration.class) {
				return extensiondeclaration();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.BaseDeclaration.class) {
				return basedeclaration();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Slotify.class) {
				return slotify();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Injection.class) {
				return injection();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Annotation.class) {
				return annotation();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Fragtypes.class) {
				return fragtypes();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.DefinitionList.class) {
				return definitionlist();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.DefinitionPart.class) {
				return definitionpart();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.DefinitionConstruct.class) {
				return definitionconstruct();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.DefinitionChoice.class) {
				return definitionchoice();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Construct.class) {
				return construct();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Reference.class) {
				return reference();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.BaseLanguageReference.class) {
				return baselanguagereference();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.UpperLevelReference.class) {
				return upperlevelreference();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Arbitrary.class) {
				return arbitrary();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.MoreThanOne.class) {
				return morethanone();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.ZeroOne.class) {
				return zeroone();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.Role.class) {
				return role();
			}
			if (type.getInstanceClass() == org.reuseware.air.language.cmsl.NonTerminalIdentifier.class) {
				return nonterminalidentifier();
			}
		}
		throw new org.emftext.runtime.resource.impl.UnexpectedContentTypeException(typeObject);
	}
	
	@SuppressWarnings("unchecked")
	private boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
	}
	
	private org.emftext.runtime.resource.impl.TokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	public void setReferenceResolverSwitch(org.reuseware.air.language.cmsl.resource.cmsl.CmslReferenceResolverSwitch referenceResolverSwitch) {
		this.referenceResolverSwitch = referenceResolverSwitch;
	}
}

start returns [ EObject element = null]
:
	(
		c0 = grammarextension{ element = c0; }
	)
	EOF	
;

grammarextension returns [org.reuseware.air.language.cmsl.GrammarExtension element = null]
@init{
}
:
	(
		a0_0 = grammarextensionunit		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createGrammarExtension();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.GRAMMAR_EXTENSION__UNIT), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
;

extensionprogram returns [org.reuseware.air.language.cmsl.ExtensionProgram element = null]
@init{
}
:
	(
		a0_0 = extensiondeclaration		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__EXTENSION), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	(
		a1_0 = basedeclaration		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
			}
			if (a1_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__BASE), a1_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a1_0, element); 		}
	)
	
	(
		(
			a2_0 = extensionstatement			{
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
				}
				if (a2_0 != null) {
					addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__STATEMENTS, a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		)
		
	)*	
;

extensiondeclaration returns [org.reuseware.air.language.cmsl.ExtensionDeclaration element = null]
@init{
}
:
	a0 = 'COMPONENTMODEL' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	(
		a1 = ESTRING1		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NAME), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NAME), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a1, element);
		}
	)
	
	(
		(
			a2 = 'PREFIX' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			
			(
				a3 = ESTRING1				
				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
					}
					org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING1");
					tokenResolver.setOptions(getOptions());
					org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSPREFIX), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						getResource().addError(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSPREFIX), resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken) a3, element);
				}
			)
			
		)
		
	)?	
	(
		(
			a4 = 'URI' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			(
				a5 = QUOTED_60_62				
				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
					}
					org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
					tokenResolver.setOptions(getOptions());
					org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSURI), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						getResource().addError(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__NSURI), resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken) a5, element);
				}
			)
			
		)
		
	)?	
	(
		(
			a6 = 'URL' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			
			(
				a7 = QUOTED_60_62				
				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
					}
					org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
					tokenResolver.setOptions(getOptions());
					org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__TARGETURL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						getResource().addError(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_DECLARATION__TARGETURL), resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken) a7, element);
				}
			)
			
		)
		
	)?	
;

basedeclaration returns [org.reuseware.air.language.cmsl.BaseDeclaration element = null]
@init{
}
:
	a0 = 'EXTENDS' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	(
		a1 = QUOTED_60_62		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NSURI), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NSURI), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a1, element);
		}
	)
	
	a2 = 'as' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	(
		a3 = ESTRING1		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NAME), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__NAME), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a3, element);
		}
	)
	
	(
		(
			a4 = 'URL' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			
			(
				a5 = QUOTED_60_62				
				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
					}
					org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_60_62");
					tokenResolver.setOptions(getOptions());
					org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__SOURCEURL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						getResource().addError(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_DECLARATION__SOURCEURL), resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((CommonToken) a5, element);
				}
			)
			
		)
		
	)?	
;

slotify returns [org.reuseware.air.language.cmsl.Slotify element = null]
@init{
}
:
	a0 = 'slotify' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	(
		a1_0 = basereference		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
			}
			if (a1_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.SLOTIFY__CONSTRUCT), a1_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a1_0, element); 		}
	)
	
	a2 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
;

injection returns [org.reuseware.air.language.cmsl.Injection element = null]
@init{
}
:
	(
		a0_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__SOURCE), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	a1 = '<>' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	(
		a2_0 = basereference		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
			}
			if (a2_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__TARGET), a2_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a2_0, element); 		}
	)
	
	a3 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

annotation returns [org.reuseware.air.language.cmsl.Annotation element = null]
@init{
}
:
	(
		a0_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__SOURCE), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	a1 = '->' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	a2 = '@' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	
	(
		a3_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
			}
			if (a3_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__TARGET), a3_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a3_0, element); 		}
	)
	
	a4 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

fragtypes returns [org.reuseware.air.language.cmsl.Fragtypes element = null]
@init{
}
:
	a0 = 'fragtypes' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	(
		a2_0 = constructreference		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
			}
			if (a2_0 != null) {
				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE, a2_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a2_0, element); 		}
	)
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			(
				a4_0 = constructreference				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
					}
					if (a4_0 != null) {
						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE, a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			)
			
		)
		
	)*	
	a5 = '}' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

definitionlist returns [org.reuseware.air.language.cmsl.DefinitionList element = null]
@init{
}
:
	(
		a0_0 = definitionpart		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
			}
			if (a0_0 != null) {
				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS, a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			
			(
				a2_0 = definitionpart				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
					}
					if (a2_0 != null) {
						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS, a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			)
			
		)
		
	)*	
;

definitionpart returns [org.reuseware.air.language.cmsl.DefinitionPart element = null]
@init{
}
:
	(
		a0_0 = role		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ROLENAME), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	a1 = ':' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	(
		a2_0 = constructreference		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
			}
			if (a2_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__CONSTRUCT), a2_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a2_0, element); 		}
	)
	
	(
		(
			a3 = '[' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			(
				a4_0 = upperlevelreference				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
					}
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ANNOTATION), a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			)
			
			a5 = ']' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			
		)
		
	)?	
;

definitionconstruct returns [org.reuseware.air.language.cmsl.DefinitionConstruct element = null]
@init{
}
:
	(
		a0_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	(
		(
			a1 = '=' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			
			(
				a2_0 = definitionlist				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
					}
					if (a2_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__DEFINITION), a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			)
			
		)
		
	)?	
	a3 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

definitionchoice returns [org.reuseware.air.language.cmsl.DefinitionChoice element = null]
@init{
}
:
	(
		a0_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	a1 = '=' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	(
		a2_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
			}
			if (a2_0 != null) {
				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE, a2_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a2_0, element); 		}
	)
	
	(
		(
			a3 = '|' {
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			
			(
				a4_0 = nonterminal				{
					if (element == null) {
						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
					}
					if (a4_0 != null) {
						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE, a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			)
			
		)
		
	)*	
	a5 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

construct returns [org.reuseware.air.language.cmsl.Construct element = null]
@init{
}
:
	(
		a0_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createConstruct();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__NAME), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	(
		(
			a1_0 = cardinality			{
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createConstruct();
				}
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__CARDINALITY), a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		)
		
	)?	
;

reference returns [org.reuseware.air.language.cmsl.Reference element = null]
@init{
}
:
	(
		a0_0 = basereference		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createReference();
			}
			if (a0_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__BASE), a0_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a0_0, element); 		}
	)
	
	(
		(
			a1_0 = cardinality			{
				if (element == null) {
					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createReference();
				}
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__CARDINALITY), a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		)
		
	)?	
;

baselanguagereference returns [org.reuseware.air.language.cmsl.BaseLanguageReference element = null]
@init{
}
:
	(
		a0 = ESTRING1		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseLanguageReference();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a0, element);
		}
	)
	
	a1 = '.' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseLanguageReference();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	(
		a2_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseLanguageReference();
			}
			if (a2_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__BASE), a2_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a2_0, element); 		}
	)
	
;

upperlevelreference returns [org.reuseware.air.language.cmsl.UpperLevelReference element = null]
@init{
}
:
	a0 = '@' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createUpperLevelReference();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	(
		a1_0 = nonterminal		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createUpperLevelReference();
			}
			if (a1_0 != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.UPPER_LEVEL_REFERENCE__UPPER), a1_0);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos(a1_0, element); 		}
	)
	
;

arbitrary returns [org.reuseware.air.language.cmsl.Arbitrary element = null]
@init{
}
:
	a0 = '*' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createArbitrary();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
;

morethanone returns [org.reuseware.air.language.cmsl.MoreThanOne element = null]
@init{
}
:
	a0 = '+' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createMoreThanOne();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
;

zeroone returns [org.reuseware.air.language.cmsl.ZeroOne element = null]
@init{
}
:
	a0 = '?' {
		if (element == null) {
			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createZeroOne();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
;

role returns [org.reuseware.air.language.cmsl.Role element = null]
@init{
}
:
	(
		a0 = ESTRING1		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createRole();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING1");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ROLE__VALUE), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ROLE__VALUE), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a0, element);
		}
	)
	
;

nonterminalidentifier returns [org.reuseware.air.language.cmsl.NonTerminalIdentifier element = null]
@init{
}
:
	(
		a0 = ESTRING2		
		{
			if (element == null) {
				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createNonTerminalIdentifier();
			}
			org.emftext.runtime.resource.ITokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ESTRING2");
			tokenResolver.setOptions(getOptions());
			org.emftext.runtime.resource.ITokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.NON_TERMINAL_IDENTIFIER__VALUE), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				getResource().addError(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String)resolvedObject;
			if (resolved != null) {
				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.NON_TERMINAL_IDENTIFIER__VALUE), resolved);
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((CommonToken) a0, element);
		}
	)
	
;

grammarextensionunit returns [org.reuseware.air.language.cmsl.GrammarExtensionUnit element = null]
:
	c0 = extensionprogram{ element = c0; }
	
;

extensionstatement returns [org.reuseware.air.language.cmsl.ExtensionStatement element = null]
:
	c0 = slotify{ element = c0; }
	|	c1 = injection{ element = c1; }
	|	c2 = annotation{ element = c2; }
	|	c3 = fragtypes{ element = c3; }
	|	c4 = definitionconstruct{ element = c4; }
	|	c5 = definitionchoice{ element = c5; }
	
;

basereference returns [org.reuseware.air.language.cmsl.BaseReference element = null]
:
	c0 = baselanguagereference{ element = c0; }
	
;

nonterminal returns [org.reuseware.air.language.cmsl.NonTerminal element = null]
:
	c0 = nonterminalidentifier{ element = c0; }
	
;

constructreference returns [org.reuseware.air.language.cmsl.ConstructReference element = null]
:
	c0 = construct{ element = c0; }
	|	c1 = reference{ element = c1; }
	|	c2 = upperlevelreference{ element = c2; }
	
;

cardinality returns [org.reuseware.air.language.cmsl.Cardinality element = null]
:
	c0 = arbitrary{ element = c0; }
	|	c1 = morethanone{ element = c1; }
	|	c2 = zeroone{ element = c2; }
	
;

ESTRING:
	'%' (~('\n'))* 	{ _channel = 99; }
;
ESTRING1:
	('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*;
ESTRING2:
	('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*;
TEXT:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+	{ _channel = 99; }
;
WHITESPACE:
	(' ' | '\t' | '\f')
	{ _channel = 99; }
;
LINEBREAK:
	('\r\n' | '\r' | '\n')
	{ _channel = 99; }
;
QUOTED_60_62:
	('<')(~('>')|('\\''>'))*('>')
;
