// $ANTLR 3.1.1 C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g 2009-03-26 10:39:24

	package org.reuseware.air.language.cmsl.resource.cmsl;
	
	import org.eclipse.emf.ecore.EObject;
	import org.eclipse.emf.ecore.InternalEObject;
	import org.eclipse.emf.common.util.URI;
import org.emftext.runtime.resource.ITextParser;
	import org.emftext.runtime.resource.impl.AbstractEMFTextParser;
	import org.emftext.runtime.IOptions;
	import org.emftext.runtime.resource.impl.UnexpectedContentTypeException;
	import org.eclipse.emf.ecore.EClass;


import org.antlr.runtime.*;

import java.io.InputStream;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class CmslParser extends AbstractEMFTextParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ESTRING1", "QUOTED_60_62", "ESTRING2", "ESTRING", "TEXT", "WHITESPACE", "LINEBREAK", "'COMPONENTMODEL'", "'PREFIX'", "'URI'", "'URL'", "'EXTENDS'", "'as'", "'slotify'", "'.'", "'<>'", "'->'", "'@'", "'fragtypes'", "'{'", "','", "'}'", "':'", "'['", "']'", "'='", "'|'", "'*'", "'+'", "'?'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ESTRING2=6;
    public static final int WHITESPACE=9;
    public static final int ESTRING=7;
    public static final int TEXT=8;
    public static final int ESTRING1=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int QUOTED_60_62=5;
    public static final int LINEBREAK=10;

    // delegates
    // delegators


        public CmslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CmslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[49+1];
             
             
        }
        

    public String[] getTokenNames() { return CmslParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g"; }


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



    // $ANTLR start "start"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:137:1: start returns [ EObject element = null] : (c0= grammarextension ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;
        int start_StartIndex = input.index();
        org.reuseware.air.language.cmsl.GrammarExtension c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:138:1: ( (c0= grammarextension ) EOF )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:139:2: (c0= grammarextension ) EOF
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:139:2: (c0= grammarextension )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:140:3: c0= grammarextension
            {
            pushFollow(FOLLOW_grammarextension_in_start79);
            c0=grammarextension();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start86); if (state.failed) return element;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "grammarextension"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:145:1: grammarextension returns [org.reuseware.air.language.cmsl.GrammarExtension element = null] : (a0_0= grammarextensionunit ) ;
    public final org.reuseware.air.language.cmsl.GrammarExtension grammarextension() throws RecognitionException {
        org.reuseware.air.language.cmsl.GrammarExtension element =  null;
        int grammarextension_StartIndex = input.index();
        org.reuseware.air.language.cmsl.GrammarExtensionUnit a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:148:1: ( (a0_0= grammarextensionunit ) )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:149:2: (a0_0= grammarextensionunit )
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:149:2: (a0_0= grammarextensionunit )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:150:3: a0_0= grammarextensionunit
            {
            pushFollow(FOLLOW_grammarextensionunit_in_grammarextension113);
            a0_0=grammarextensionunit();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createGrammarExtension();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.GRAMMAR_EXTENSION__UNIT), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, grammarextension_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "grammarextension"


    // $ANTLR start "extensionprogram"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:163:1: extensionprogram returns [org.reuseware.air.language.cmsl.ExtensionProgram element = null] : (a0_0= extensiondeclaration ) (a1_0= basedeclaration ) ( (a2_0= extensionstatement ) )* ;
    public final org.reuseware.air.language.cmsl.ExtensionProgram extensionprogram() throws RecognitionException {
        org.reuseware.air.language.cmsl.ExtensionProgram element =  null;
        int extensionprogram_StartIndex = input.index();
        org.reuseware.air.language.cmsl.ExtensionDeclaration a0_0 = null;

        org.reuseware.air.language.cmsl.BaseDeclaration a1_0 = null;

        org.reuseware.air.language.cmsl.ExtensionStatement a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:166:1: ( (a0_0= extensiondeclaration ) (a1_0= basedeclaration ) ( (a2_0= extensionstatement ) )* )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:167:2: (a0_0= extensiondeclaration ) (a1_0= basedeclaration ) ( (a2_0= extensionstatement ) )*
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:167:2: (a0_0= extensiondeclaration )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:168:3: a0_0= extensiondeclaration
            {
            pushFollow(FOLLOW_extensiondeclaration_in_extensionprogram147);
            a0_0=extensiondeclaration();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__EXTENSION), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:179:2: (a1_0= basedeclaration )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:180:3: a1_0= basedeclaration
            {
            pushFollow(FOLLOW_basedeclaration_in_extensionprogram166);
            a1_0=basedeclaration();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
              			}
              			if (a1_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__BASE), a1_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a1_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:191:2: ( (a2_0= extensionstatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ESTRING2||LA1_0==17||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:192:3: (a2_0= extensionstatement )
            	    {
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:192:3: (a2_0= extensionstatement )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:193:4: a2_0= extensionstatement
            	    {
            	    pushFollow(FOLLOW_extensionstatement_in_extensionprogram190);
            	    a2_0=extensionstatement();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionProgram();
            	      				}
            	      				if (a2_0 != null) {
            	      					addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.EXTENSION_PROGRAM__STATEMENTS, a2_0);
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos(a2_0, element); 			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, extensionprogram_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "extensionprogram"


    // $ANTLR start "extensiondeclaration"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:207:1: extensiondeclaration returns [org.reuseware.air.language.cmsl.ExtensionDeclaration element = null] : a0= 'COMPONENTMODEL' (a1= ESTRING1 ) ( (a2= 'PREFIX' (a3= ESTRING1 ) ) )? ( (a4= 'URI' (a5= QUOTED_60_62 ) ) )? ( (a6= 'URL' (a7= QUOTED_60_62 ) ) )? ;
    public final org.reuseware.air.language.cmsl.ExtensionDeclaration extensiondeclaration() throws RecognitionException {
        org.reuseware.air.language.cmsl.ExtensionDeclaration element =  null;
        int extensiondeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:210:1: (a0= 'COMPONENTMODEL' (a1= ESTRING1 ) ( (a2= 'PREFIX' (a3= ESTRING1 ) ) )? ( (a4= 'URI' (a5= QUOTED_60_62 ) ) )? ( (a6= 'URL' (a7= QUOTED_60_62 ) ) )? )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:211:2: a0= 'COMPONENTMODEL' (a1= ESTRING1 ) ( (a2= 'PREFIX' (a3= ESTRING1 ) ) )? ( (a4= 'URI' (a5= QUOTED_60_62 ) ) )? ( (a6= 'URL' (a7= QUOTED_60_62 ) ) )?
            {
            a0=(Token)match(input,11,FOLLOW_11_in_extensiondeclaration228); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:219:2: (a1= ESTRING1 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:220:3: a1= ESTRING1
            {
            a1=(Token)match(input,ESTRING1,FOLLOW_ESTRING1_in_extensiondeclaration243); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:242:2: ( (a2= 'PREFIX' (a3= ESTRING1 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:243:3: (a2= 'PREFIX' (a3= ESTRING1 ) )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:243:3: (a2= 'PREFIX' (a3= ESTRING1 ) )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:244:4: a2= 'PREFIX' (a3= ESTRING1 )
                    {
                    a2=(Token)match(input,12,FOLLOW_12_in_extensiondeclaration270); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a2, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:252:4: (a3= ESTRING1 )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:253:5: a3= ESTRING1
                    {
                    a3=(Token)match(input,ESTRING1,FOLLOW_ESTRING1_in_extensiondeclaration291); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }


                    }
                    break;

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:278:2: ( (a4= 'URI' (a5= QUOTED_60_62 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:279:3: (a4= 'URI' (a5= QUOTED_60_62 ) )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:279:3: (a4= 'URI' (a5= QUOTED_60_62 ) )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:280:4: a4= 'URI' (a5= QUOTED_60_62 )
                    {
                    a4=(Token)match(input,13,FOLLOW_13_in_extensiondeclaration338); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:288:4: (a5= QUOTED_60_62 )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:289:5: a5= QUOTED_60_62
                    {
                    a5=(Token)match(input,QUOTED_60_62,FOLLOW_QUOTED_60_62_in_extensiondeclaration359); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }


                    }
                    break;

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:314:2: ( (a6= 'URL' (a7= QUOTED_60_62 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:315:3: (a6= 'URL' (a7= QUOTED_60_62 ) )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:315:3: (a6= 'URL' (a7= QUOTED_60_62 ) )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:316:4: a6= 'URL' (a7= QUOTED_60_62 )
                    {
                    a6=(Token)match(input,14,FOLLOW_14_in_extensiondeclaration406); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createExtensionDeclaration();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a6, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:324:4: (a7= QUOTED_60_62 )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:325:5: a7= QUOTED_60_62
                    {
                    a7=(Token)match(input,QUOTED_60_62,FOLLOW_QUOTED_60_62_in_extensiondeclaration427); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, extensiondeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "extensiondeclaration"


    // $ANTLR start "basedeclaration"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:352:1: basedeclaration returns [org.reuseware.air.language.cmsl.BaseDeclaration element = null] : a0= 'EXTENDS' (a1= QUOTED_60_62 ) a2= 'as' (a3= ESTRING1 ) ( (a4= 'URL' (a5= QUOTED_60_62 ) ) )? ;
    public final org.reuseware.air.language.cmsl.BaseDeclaration basedeclaration() throws RecognitionException {
        org.reuseware.air.language.cmsl.BaseDeclaration element =  null;
        int basedeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:355:1: (a0= 'EXTENDS' (a1= QUOTED_60_62 ) a2= 'as' (a3= ESTRING1 ) ( (a4= 'URL' (a5= QUOTED_60_62 ) ) )? )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:356:2: a0= 'EXTENDS' (a1= QUOTED_60_62 ) a2= 'as' (a3= ESTRING1 ) ( (a4= 'URL' (a5= QUOTED_60_62 ) ) )?
            {
            a0=(Token)match(input,15,FOLLOW_15_in_basedeclaration480); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:364:2: (a1= QUOTED_60_62 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:365:3: a1= QUOTED_60_62
            {
            a1=(Token)match(input,QUOTED_60_62,FOLLOW_QUOTED_60_62_in_basedeclaration495); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            a2=(Token)match(input,16,FOLLOW_16_in_basedeclaration513); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:395:2: (a3= ESTRING1 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:396:3: a3= ESTRING1
            {
            a3=(Token)match(input,ESTRING1,FOLLOW_ESTRING1_in_basedeclaration528); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:418:2: ( (a4= 'URL' (a5= QUOTED_60_62 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:419:3: (a4= 'URL' (a5= QUOTED_60_62 ) )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:419:3: (a4= 'URL' (a5= QUOTED_60_62 ) )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:420:4: a4= 'URL' (a5= QUOTED_60_62 )
                    {
                    a4=(Token)match(input,14,FOLLOW_14_in_basedeclaration555); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseDeclaration();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a4, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:428:4: (a5= QUOTED_60_62 )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:429:5: a5= QUOTED_60_62
                    {
                    a5=(Token)match(input,QUOTED_60_62,FOLLOW_QUOTED_60_62_in_basedeclaration576); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, basedeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "basedeclaration"


    // $ANTLR start "slotify"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:456:1: slotify returns [org.reuseware.air.language.cmsl.Slotify element = null] : a0= 'slotify' (a1_0= basereference ) a2= '.' ;
    public final org.reuseware.air.language.cmsl.Slotify slotify() throws RecognitionException {
        org.reuseware.air.language.cmsl.Slotify element =  null;
        int slotify_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        org.reuseware.air.language.cmsl.BaseReference a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:459:1: (a0= 'slotify' (a1_0= basereference ) a2= '.' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:460:2: a0= 'slotify' (a1_0= basereference ) a2= '.'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_slotify629); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:468:2: (a1_0= basereference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:469:3: a1_0= basereference
            {
            pushFollow(FOLLOW_basereference_in_slotify644);
            a1_0=basereference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
              			}
              			if (a1_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.SLOTIFY__CONSTRUCT), a1_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a1_0, element); 		
            }

            }

            a2=(Token)match(input,18,FOLLOW_18_in_slotify659); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createSlotify();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, slotify_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "slotify"


    // $ANTLR start "injection"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:490:1: injection returns [org.reuseware.air.language.cmsl.Injection element = null] : (a0_0= nonterminal ) a1= '<>' (a2_0= basereference ) a3= '.' ;
    public final org.reuseware.air.language.cmsl.Injection injection() throws RecognitionException {
        org.reuseware.air.language.cmsl.Injection element =  null;
        int injection_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        org.reuseware.air.language.cmsl.NonTerminal a0_0 = null;

        org.reuseware.air.language.cmsl.BaseReference a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:493:1: ( (a0_0= nonterminal ) a1= '<>' (a2_0= basereference ) a3= '.' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:494:2: (a0_0= nonterminal ) a1= '<>' (a2_0= basereference ) a3= '.'
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:494:2: (a0_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:495:3: a0_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_injection689);
            a0_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__SOURCE), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            a1=(Token)match(input,19,FOLLOW_19_in_injection704); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:514:2: (a2_0= basereference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:515:3: a2_0= basereference
            {
            pushFollow(FOLLOW_basereference_in_injection719);
            a2_0=basereference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
              			}
              			if (a2_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.INJECTION__TARGET), a2_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a2_0, element); 		
            }

            }

            a3=(Token)match(input,18,FOLLOW_18_in_injection734); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createInjection();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, injection_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "injection"


    // $ANTLR start "annotation"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:536:1: annotation returns [org.reuseware.air.language.cmsl.Annotation element = null] : (a0_0= nonterminal ) a1= '->' a2= '@' (a3_0= nonterminal ) a4= '.' ;
    public final org.reuseware.air.language.cmsl.Annotation annotation() throws RecognitionException {
        org.reuseware.air.language.cmsl.Annotation element =  null;
        int annotation_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.reuseware.air.language.cmsl.NonTerminal a0_0 = null;

        org.reuseware.air.language.cmsl.NonTerminal a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:539:1: ( (a0_0= nonterminal ) a1= '->' a2= '@' (a3_0= nonterminal ) a4= '.' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:540:2: (a0_0= nonterminal ) a1= '->' a2= '@' (a3_0= nonterminal ) a4= '.'
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:540:2: (a0_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:541:3: a0_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_annotation764);
            a0_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__SOURCE), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            a1=(Token)match(input,20,FOLLOW_20_in_annotation779); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            a2=(Token)match(input,21,FOLLOW_21_in_annotation790); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a2, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:568:2: (a3_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:569:3: a3_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_annotation805);
            a3_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
              			}
              			if (a3_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.ANNOTATION__TARGET), a3_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a3_0, element); 		
            }

            }

            a4=(Token)match(input,18,FOLLOW_18_in_annotation820); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createAnnotation();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, annotation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "fragtypes"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:590:1: fragtypes returns [org.reuseware.air.language.cmsl.Fragtypes element = null] : a0= 'fragtypes' a1= '{' (a2_0= constructreference ) ( (a3= ',' (a4_0= constructreference ) ) )* a5= '}' ;
    public final org.reuseware.air.language.cmsl.Fragtypes fragtypes() throws RecognitionException {
        org.reuseware.air.language.cmsl.Fragtypes element =  null;
        int fragtypes_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.reuseware.air.language.cmsl.ConstructReference a2_0 = null;

        org.reuseware.air.language.cmsl.ConstructReference a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:593:1: (a0= 'fragtypes' a1= '{' (a2_0= constructreference ) ( (a3= ',' (a4_0= constructreference ) ) )* a5= '}' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:594:2: a0= 'fragtypes' a1= '{' (a2_0= constructreference ) ( (a3= ',' (a4_0= constructreference ) ) )* a5= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_fragtypes846); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_fragtypes857); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:610:2: (a2_0= constructreference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:611:3: a2_0= constructreference
            {
            pushFollow(FOLLOW_constructreference_in_fragtypes872);
            a2_0=constructreference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
              			}
              			if (a2_0 != null) {
              				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE, a2_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a2_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:622:2: ( (a3= ',' (a4_0= constructreference ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:623:3: (a3= ',' (a4_0= constructreference ) )
            	    {
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:623:3: (a3= ',' (a4_0= constructreference ) )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:624:4: a3= ',' (a4_0= constructreference )
            	    {
            	    a3=(Token)match(input,24,FOLLOW_24_in_fragtypes896); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a3, element);
            	      			
            	    }
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:632:4: (a4_0= constructreference )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:633:5: a4_0= constructreference
            	    {
            	    pushFollow(FOLLOW_constructreference_in_fragtypes917);
            	    a4_0=constructreference();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (element == null) {
            	      						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
            	      					}
            	      					if (a4_0 != null) {
            	      						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.FRAGTYPES__FRAGTYPE, a4_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a4_0, element); 				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            a5=(Token)match(input,25,FOLLOW_25_in_fragtypes950); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createFragtypes();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, fragtypes_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "fragtypes"


    // $ANTLR start "definitionlist"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:657:1: definitionlist returns [org.reuseware.air.language.cmsl.DefinitionList element = null] : (a0_0= definitionpart ) ( (a1= ',' (a2_0= definitionpart ) ) )* ;
    public final org.reuseware.air.language.cmsl.DefinitionList definitionlist() throws RecognitionException {
        org.reuseware.air.language.cmsl.DefinitionList element =  null;
        int definitionlist_StartIndex = input.index();
        Token a1=null;
        org.reuseware.air.language.cmsl.DefinitionPart a0_0 = null;

        org.reuseware.air.language.cmsl.DefinitionPart a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:660:1: ( (a0_0= definitionpart ) ( (a1= ',' (a2_0= definitionpart ) ) )* )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:661:2: (a0_0= definitionpart ) ( (a1= ',' (a2_0= definitionpart ) ) )*
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:661:2: (a0_0= definitionpart )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:662:3: a0_0= definitionpart
            {
            pushFollow(FOLLOW_definitionpart_in_definitionlist980);
            a0_0=definitionpart();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
              			}
              			if (a0_0 != null) {
              				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS, a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:673:2: ( (a1= ',' (a2_0= definitionpart ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:674:3: (a1= ',' (a2_0= definitionpart ) )
            	    {
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:674:3: (a1= ',' (a2_0= definitionpart ) )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:675:4: a1= ',' (a2_0= definitionpart )
            	    {
            	    a1=(Token)match(input,24,FOLLOW_24_in_definitionlist1004); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a1, element);
            	      			
            	    }
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:683:4: (a2_0= definitionpart )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:684:5: a2_0= definitionpart
            	    {
            	    pushFollow(FOLLOW_definitionpart_in_definitionlist1025);
            	    a2_0=definitionpart();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (element == null) {
            	      						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionList();
            	      					}
            	      					if (a2_0 != null) {
            	      						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_LIST__REFS, a2_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a2_0, element); 				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, definitionlist_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "definitionlist"


    // $ANTLR start "definitionpart"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:700:1: definitionpart returns [org.reuseware.air.language.cmsl.DefinitionPart element = null] : (a0_0= role ) a1= ':' (a2_0= constructreference ) ( (a3= '[' (a4_0= upperlevelreference ) a5= ']' ) )? ;
    public final org.reuseware.air.language.cmsl.DefinitionPart definitionpart() throws RecognitionException {
        org.reuseware.air.language.cmsl.DefinitionPart element =  null;
        int definitionpart_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.reuseware.air.language.cmsl.Role a0_0 = null;

        org.reuseware.air.language.cmsl.ConstructReference a2_0 = null;

        org.reuseware.air.language.cmsl.UpperLevelReference a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:703:1: ( (a0_0= role ) a1= ':' (a2_0= constructreference ) ( (a3= '[' (a4_0= upperlevelreference ) a5= ']' ) )? )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:704:2: (a0_0= role ) a1= ':' (a2_0= constructreference ) ( (a3= '[' (a4_0= upperlevelreference ) a5= ']' ) )?
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:704:2: (a0_0= role )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:705:3: a0_0= role
            {
            pushFollow(FOLLOW_role_in_definitionpart1077);
            a0_0=role();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ROLENAME), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            a1=(Token)match(input,26,FOLLOW_26_in_definitionpart1092); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:724:2: (a2_0= constructreference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:725:3: a2_0= constructreference
            {
            pushFollow(FOLLOW_constructreference_in_definitionpart1107);
            a2_0=constructreference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
              			}
              			if (a2_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__CONSTRUCT), a2_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a2_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:736:2: ( (a3= '[' (a4_0= upperlevelreference ) a5= ']' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:737:3: (a3= '[' (a4_0= upperlevelreference ) a5= ']' )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:737:3: (a3= '[' (a4_0= upperlevelreference ) a5= ']' )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:738:4: a3= '[' (a4_0= upperlevelreference ) a5= ']'
                    {
                    a3=(Token)match(input,27,FOLLOW_27_in_definitionpart1131); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a3, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:746:4: (a4_0= upperlevelreference )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:747:5: a4_0= upperlevelreference
                    {
                    pushFollow(FOLLOW_upperlevelreference_in_definitionpart1152);
                    a4_0=upperlevelreference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (element == null) {
                      						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
                      					}
                      					if (a4_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_PART__ANNOTATION), a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				
                    }

                    }

                    a5=(Token)match(input,28,FOLLOW_28_in_definitionpart1175); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionPart();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a5, element);
                      			
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, definitionpart_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "definitionpart"


    // $ANTLR start "definitionconstruct"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:771:1: definitionconstruct returns [org.reuseware.air.language.cmsl.DefinitionConstruct element = null] : (a0_0= nonterminal ) ( (a1= '=' (a2_0= definitionlist ) ) )? a3= '.' ;
    public final org.reuseware.air.language.cmsl.DefinitionConstruct definitionconstruct() throws RecognitionException {
        org.reuseware.air.language.cmsl.DefinitionConstruct element =  null;
        int definitionconstruct_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        org.reuseware.air.language.cmsl.NonTerminal a0_0 = null;

        org.reuseware.air.language.cmsl.DefinitionList a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:774:1: ( (a0_0= nonterminal ) ( (a1= '=' (a2_0= definitionlist ) ) )? a3= '.' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:775:2: (a0_0= nonterminal ) ( (a1= '=' (a2_0= definitionlist ) ) )? a3= '.'
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:775:2: (a0_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:776:3: a0_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_definitionconstruct1219);
            a0_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:787:2: ( (a1= '=' (a2_0= definitionlist ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:788:3: (a1= '=' (a2_0= definitionlist ) )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:788:3: (a1= '=' (a2_0= definitionlist ) )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:789:4: a1= '=' (a2_0= definitionlist )
                    {
                    a1=(Token)match(input,29,FOLLOW_29_in_definitionconstruct1243); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos((CommonToken)a1, element);
                      			
                    }
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:797:4: (a2_0= definitionlist )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:798:5: a2_0= definitionlist
                    {
                    pushFollow(FOLLOW_definitionlist_in_definitionconstruct1264);
                    a2_0=definitionlist();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (element == null) {
                      						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
                      					}
                      					if (a2_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CONSTRUCT__DEFINITION), a2_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a2_0, element); 				
                    }

                    }


                    }


                    }
                    break;

            }

            a3=(Token)match(input,18,FOLLOW_18_in_definitionconstruct1297); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionConstruct();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, definitionconstruct_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "definitionconstruct"


    // $ANTLR start "definitionchoice"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:822:1: definitionchoice returns [org.reuseware.air.language.cmsl.DefinitionChoice element = null] : (a0_0= nonterminal ) a1= '=' (a2_0= nonterminal ) ( (a3= '|' (a4_0= nonterminal ) ) )* a5= '.' ;
    public final org.reuseware.air.language.cmsl.DefinitionChoice definitionchoice() throws RecognitionException {
        org.reuseware.air.language.cmsl.DefinitionChoice element =  null;
        int definitionchoice_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.reuseware.air.language.cmsl.NonTerminal a0_0 = null;

        org.reuseware.air.language.cmsl.NonTerminal a2_0 = null;

        org.reuseware.air.language.cmsl.NonTerminal a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:825:1: ( (a0_0= nonterminal ) a1= '=' (a2_0= nonterminal ) ( (a3= '|' (a4_0= nonterminal ) ) )* a5= '.' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:826:2: (a0_0= nonterminal ) a1= '=' (a2_0= nonterminal ) ( (a3= '|' (a4_0= nonterminal ) ) )* a5= '.'
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:826:2: (a0_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:827:3: a0_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_definitionchoice1327);
            a0_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            a1=(Token)match(input,29,FOLLOW_29_in_definitionchoice1342); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:846:2: (a2_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:847:3: a2_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_definitionchoice1357);
            a2_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
              			}
              			if (a2_0 != null) {
              				addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE, a2_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a2_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:858:2: ( (a3= '|' (a4_0= nonterminal ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:859:3: (a3= '|' (a4_0= nonterminal ) )
            	    {
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:859:3: (a3= '|' (a4_0= nonterminal ) )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:860:4: a3= '|' (a4_0= nonterminal )
            	    {
            	    a3=(Token)match(input,30,FOLLOW_30_in_definitionchoice1381); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
            	      				}
            	      				collectHiddenTokens(element);
            	      				copyLocalizationInfos((CommonToken)a3, element);
            	      			
            	    }
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:868:4: (a4_0= nonterminal )
            	    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:869:5: a4_0= nonterminal
            	    {
            	    pushFollow(FOLLOW_nonterminal_in_definitionchoice1402);
            	    a4_0=nonterminal();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (element == null) {
            	      						element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
            	      					}
            	      					if (a4_0 != null) {
            	      						addObjectToList(element, org.reuseware.air.language.cmsl.CmslPackage.DEFINITION_CHOICE__CHOICE, a4_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a4_0, element); 				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            a5=(Token)match(input,18,FOLLOW_18_in_definitionchoice1435); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createDefinitionChoice();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, definitionchoice_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "definitionchoice"


    // $ANTLR start "construct"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:893:1: construct returns [org.reuseware.air.language.cmsl.Construct element = null] : (a0_0= nonterminal ) ( (a1_0= cardinality ) )? ;
    public final org.reuseware.air.language.cmsl.Construct construct() throws RecognitionException {
        org.reuseware.air.language.cmsl.Construct element =  null;
        int construct_StartIndex = input.index();
        org.reuseware.air.language.cmsl.NonTerminal a0_0 = null;

        org.reuseware.air.language.cmsl.Cardinality a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:896:1: ( (a0_0= nonterminal ) ( (a1_0= cardinality ) )? )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:897:2: (a0_0= nonterminal ) ( (a1_0= cardinality ) )?
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:897:2: (a0_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:898:3: a0_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_construct1465);
            a0_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createConstruct();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__NAME), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:909:2: ( (a1_0= cardinality ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=31 && LA11_0<=33)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:910:3: (a1_0= cardinality )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:910:3: (a1_0= cardinality )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:911:4: a1_0= cardinality
                    {
                    pushFollow(FOLLOW_cardinality_in_construct1489);
                    a1_0=cardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createConstruct();
                      				}
                      				if (a1_0 != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.CONSTRUCT__CARDINALITY), a1_0);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos(a1_0, element); 			
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, construct_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "construct"


    // $ANTLR start "reference"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:925:1: reference returns [org.reuseware.air.language.cmsl.Reference element = null] : (a0_0= basereference ) ( (a1_0= cardinality ) )? ;
    public final org.reuseware.air.language.cmsl.Reference reference() throws RecognitionException {
        org.reuseware.air.language.cmsl.Reference element =  null;
        int reference_StartIndex = input.index();
        org.reuseware.air.language.cmsl.BaseReference a0_0 = null;

        org.reuseware.air.language.cmsl.Cardinality a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:928:1: ( (a0_0= basereference ) ( (a1_0= cardinality ) )? )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:929:2: (a0_0= basereference ) ( (a1_0= cardinality ) )?
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:929:2: (a0_0= basereference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:930:3: a0_0= basereference
            {
            pushFollow(FOLLOW_basereference_in_reference1531);
            a0_0=basereference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createReference();
              			}
              			if (a0_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__BASE), a0_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a0_0, element); 		
            }

            }

            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:941:2: ( (a1_0= cardinality ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:942:3: (a1_0= cardinality )
                    {
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:942:3: (a1_0= cardinality )
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:943:4: a1_0= cardinality
                    {
                    pushFollow(FOLLOW_cardinality_in_reference1555);
                    a1_0=cardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createReference();
                      				}
                      				if (a1_0 != null) {
                      					element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.REFERENCE__CARDINALITY), a1_0);
                      				}
                      				collectHiddenTokens(element);
                      				copyLocalizationInfos(a1_0, element); 			
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, reference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "reference"


    // $ANTLR start "baselanguagereference"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:957:1: baselanguagereference returns [org.reuseware.air.language.cmsl.BaseLanguageReference element = null] : (a0= ESTRING1 ) a1= '.' (a2_0= nonterminal ) ;
    public final org.reuseware.air.language.cmsl.BaseLanguageReference baselanguagereference() throws RecognitionException {
        org.reuseware.air.language.cmsl.BaseLanguageReference element =  null;
        int baselanguagereference_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        org.reuseware.air.language.cmsl.NonTerminal a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:960:1: ( (a0= ESTRING1 ) a1= '.' (a2_0= nonterminal ) )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:961:2: (a0= ESTRING1 ) a1= '.' (a2_0= nonterminal )
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:961:2: (a0= ESTRING1 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:962:3: a0= ESTRING1
            {
            a0=(Token)match(input,ESTRING1,FOLLOW_ESTRING1_in_baselanguagereference1597); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            a1=(Token)match(input,18,FOLLOW_18_in_baselanguagereference1615); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseLanguageReference();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:992:2: (a2_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:993:3: a2_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_baselanguagereference1630);
            a2_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createBaseLanguageReference();
              			}
              			if (a2_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.BASE_LANGUAGE_REFERENCE__BASE), a2_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a2_0, element); 		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, baselanguagereference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "baselanguagereference"


    // $ANTLR start "upperlevelreference"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1006:1: upperlevelreference returns [org.reuseware.air.language.cmsl.UpperLevelReference element = null] : a0= '@' (a1_0= nonterminal ) ;
    public final org.reuseware.air.language.cmsl.UpperLevelReference upperlevelreference() throws RecognitionException {
        org.reuseware.air.language.cmsl.UpperLevelReference element =  null;
        int upperlevelreference_StartIndex = input.index();
        Token a0=null;
        org.reuseware.air.language.cmsl.NonTerminal a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1009:1: (a0= '@' (a1_0= nonterminal ) )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1010:2: a0= '@' (a1_0= nonterminal )
            {
            a0=(Token)match(input,21,FOLLOW_21_in_upperlevelreference1660); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createUpperLevelReference();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1018:2: (a1_0= nonterminal )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1019:3: a1_0= nonterminal
            {
            pushFollow(FOLLOW_nonterminal_in_upperlevelreference1675);
            a1_0=nonterminal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createUpperLevelReference();
              			}
              			if (a1_0 != null) {
              				element.eSet(element.eClass().getEStructuralFeature(org.reuseware.air.language.cmsl.CmslPackage.UPPER_LEVEL_REFERENCE__UPPER), a1_0);
              			}
              			collectHiddenTokens(element);
              			copyLocalizationInfos(a1_0, element); 		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, upperlevelreference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "upperlevelreference"


    // $ANTLR start "arbitrary"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1032:1: arbitrary returns [org.reuseware.air.language.cmsl.Arbitrary element = null] : a0= '*' ;
    public final org.reuseware.air.language.cmsl.Arbitrary arbitrary() throws RecognitionException {
        org.reuseware.air.language.cmsl.Arbitrary element =  null;
        int arbitrary_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1035:1: (a0= '*' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1036:2: a0= '*'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_arbitrary1705); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createArbitrary();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, arbitrary_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "arbitrary"


    // $ANTLR start "morethanone"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1046:1: morethanone returns [org.reuseware.air.language.cmsl.MoreThanOne element = null] : a0= '+' ;
    public final org.reuseware.air.language.cmsl.MoreThanOne morethanone() throws RecognitionException {
        org.reuseware.air.language.cmsl.MoreThanOne element =  null;
        int morethanone_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1049:1: (a0= '+' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1050:2: a0= '+'
            {
            a0=(Token)match(input,32,FOLLOW_32_in_morethanone1731); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createMoreThanOne();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, morethanone_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "morethanone"


    // $ANTLR start "zeroone"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1060:1: zeroone returns [org.reuseware.air.language.cmsl.ZeroOne element = null] : a0= '?' ;
    public final org.reuseware.air.language.cmsl.ZeroOne zeroone() throws RecognitionException {
        org.reuseware.air.language.cmsl.ZeroOne element =  null;
        int zeroone_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1063:1: (a0= '?' )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1064:2: a0= '?'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_zeroone1757); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = org.reuseware.air.language.cmsl.CmslFactory.eINSTANCE.createZeroOne();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, zeroone_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "zeroone"


    // $ANTLR start "role"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1074:1: role returns [org.reuseware.air.language.cmsl.Role element = null] : (a0= ESTRING1 ) ;
    public final org.reuseware.air.language.cmsl.Role role() throws RecognitionException {
        org.reuseware.air.language.cmsl.Role element =  null;
        int role_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1077:1: ( (a0= ESTRING1 ) )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1078:2: (a0= ESTRING1 )
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1078:2: (a0= ESTRING1 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1079:3: a0= ESTRING1
            {
            a0=(Token)match(input,ESTRING1,FOLLOW_ESTRING1_in_role1787); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, role_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "role"


    // $ANTLR start "nonterminalidentifier"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1103:1: nonterminalidentifier returns [org.reuseware.air.language.cmsl.NonTerminalIdentifier element = null] : (a0= ESTRING2 ) ;
    public final org.reuseware.air.language.cmsl.NonTerminalIdentifier nonterminalidentifier() throws RecognitionException {
        org.reuseware.air.language.cmsl.NonTerminalIdentifier element =  null;
        int nonterminalidentifier_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1106:1: ( (a0= ESTRING2 ) )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1107:2: (a0= ESTRING2 )
            {
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1107:2: (a0= ESTRING2 )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1108:3: a0= ESTRING2
            {
            a0=(Token)match(input,ESTRING2,FOLLOW_ESTRING2_in_nonterminalidentifier1824); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, nonterminalidentifier_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "nonterminalidentifier"


    // $ANTLR start "grammarextensionunit"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1132:1: grammarextensionunit returns [org.reuseware.air.language.cmsl.GrammarExtensionUnit element = null] : c0= extensionprogram ;
    public final org.reuseware.air.language.cmsl.GrammarExtensionUnit grammarextensionunit() throws RecognitionException {
        org.reuseware.air.language.cmsl.GrammarExtensionUnit element =  null;
        int grammarextensionunit_StartIndex = input.index();
        org.reuseware.air.language.cmsl.ExtensionProgram c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1133:1: (c0= extensionprogram )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1134:2: c0= extensionprogram
            {
            pushFollow(FOLLOW_extensionprogram_in_grammarextensionunit1853);
            c0=extensionprogram();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, grammarextensionunit_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "grammarextensionunit"


    // $ANTLR start "extensionstatement"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1138:1: extensionstatement returns [org.reuseware.air.language.cmsl.ExtensionStatement element = null] : (c0= slotify | c1= injection | c2= annotation | c3= fragtypes | c4= definitionconstruct | c5= definitionchoice );
    public final org.reuseware.air.language.cmsl.ExtensionStatement extensionstatement() throws RecognitionException {
        org.reuseware.air.language.cmsl.ExtensionStatement element =  null;
        int extensionstatement_StartIndex = input.index();
        org.reuseware.air.language.cmsl.Slotify c0 = null;

        org.reuseware.air.language.cmsl.Injection c1 = null;

        org.reuseware.air.language.cmsl.Annotation c2 = null;

        org.reuseware.air.language.cmsl.Fragtypes c3 = null;

        org.reuseware.air.language.cmsl.DefinitionConstruct c4 = null;

        org.reuseware.air.language.cmsl.DefinitionChoice c5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1139:1: (c0= slotify | c1= injection | c2= annotation | c3= fragtypes | c4= definitionconstruct | c5= definitionchoice )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case ESTRING2:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt13=3;
                    }
                    break;
                case 19:
                    {
                    alt13=2;
                    }
                    break;
                case 29:
                    {
                    int LA13_6 = input.LA(3);

                    if ( (LA13_6==ESTRING2) ) {
                        alt13=6;
                    }
                    else if ( (LA13_6==ESTRING1) ) {
                        alt13=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    alt13=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1140:2: c0= slotify
                    {
                    pushFollow(FOLLOW_slotify_in_extensionstatement1874);
                    c0=slotify();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1141:4: c1= injection
                    {
                    pushFollow(FOLLOW_injection_in_extensionstatement1884);
                    c1=injection();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1142:4: c2= annotation
                    {
                    pushFollow(FOLLOW_annotation_in_extensionstatement1894);
                    c2=annotation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1143:4: c3= fragtypes
                    {
                    pushFollow(FOLLOW_fragtypes_in_extensionstatement1904);
                    c3=fragtypes();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; 
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1144:4: c4= definitionconstruct
                    {
                    pushFollow(FOLLOW_definitionconstruct_in_extensionstatement1914);
                    c4=definitionconstruct();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; 
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1145:4: c5= definitionchoice
                    {
                    pushFollow(FOLLOW_definitionchoice_in_extensionstatement1924);
                    c5=definitionchoice();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, extensionstatement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "extensionstatement"


    // $ANTLR start "basereference"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1149:1: basereference returns [org.reuseware.air.language.cmsl.BaseReference element = null] : c0= baselanguagereference ;
    public final org.reuseware.air.language.cmsl.BaseReference basereference() throws RecognitionException {
        org.reuseware.air.language.cmsl.BaseReference element =  null;
        int basereference_StartIndex = input.index();
        org.reuseware.air.language.cmsl.BaseLanguageReference c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1150:1: (c0= baselanguagereference )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1151:2: c0= baselanguagereference
            {
            pushFollow(FOLLOW_baselanguagereference_in_basereference1945);
            c0=baselanguagereference();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, basereference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "basereference"


    // $ANTLR start "nonterminal"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1155:1: nonterminal returns [org.reuseware.air.language.cmsl.NonTerminal element = null] : c0= nonterminalidentifier ;
    public final org.reuseware.air.language.cmsl.NonTerminal nonterminal() throws RecognitionException {
        org.reuseware.air.language.cmsl.NonTerminal element =  null;
        int nonterminal_StartIndex = input.index();
        org.reuseware.air.language.cmsl.NonTerminalIdentifier c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1156:1: (c0= nonterminalidentifier )
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1157:2: c0= nonterminalidentifier
            {
            pushFollow(FOLLOW_nonterminalidentifier_in_nonterminal1966);
            c0=nonterminalidentifier();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, nonterminal_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "nonterminal"


    // $ANTLR start "constructreference"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1161:1: constructreference returns [org.reuseware.air.language.cmsl.ConstructReference element = null] : (c0= construct | c1= reference | c2= upperlevelreference );
    public final org.reuseware.air.language.cmsl.ConstructReference constructreference() throws RecognitionException {
        org.reuseware.air.language.cmsl.ConstructReference element =  null;
        int constructreference_StartIndex = input.index();
        org.reuseware.air.language.cmsl.Construct c0 = null;

        org.reuseware.air.language.cmsl.Reference c1 = null;

        org.reuseware.air.language.cmsl.UpperLevelReference c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1162:1: (c0= construct | c1= reference | c2= upperlevelreference )
            int alt14=3;
            switch ( input.LA(1) ) {
            case ESTRING2:
                {
                alt14=1;
                }
                break;
            case ESTRING1:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1163:2: c0= construct
                    {
                    pushFollow(FOLLOW_construct_in_constructreference1987);
                    c0=construct();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1164:4: c1= reference
                    {
                    pushFollow(FOLLOW_reference_in_constructreference1997);
                    c1=reference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1165:4: c2= upperlevelreference
                    {
                    pushFollow(FOLLOW_upperlevelreference_in_constructreference2007);
                    c2=upperlevelreference();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, constructreference_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "constructreference"


    // $ANTLR start "cardinality"
    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1169:1: cardinality returns [org.reuseware.air.language.cmsl.Cardinality element = null] : (c0= arbitrary | c1= morethanone | c2= zeroone );
    public final org.reuseware.air.language.cmsl.Cardinality cardinality() throws RecognitionException {
        org.reuseware.air.language.cmsl.Cardinality element =  null;
        int cardinality_StartIndex = input.index();
        org.reuseware.air.language.cmsl.Arbitrary c0 = null;

        org.reuseware.air.language.cmsl.MoreThanOne c1 = null;

        org.reuseware.air.language.cmsl.ZeroOne c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1170:1: (c0= arbitrary | c1= morethanone | c2= zeroone )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1171:2: c0= arbitrary
                    {
                    pushFollow(FOLLOW_arbitrary_in_cardinality2028);
                    c0=arbitrary();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1172:4: c1= morethanone
                    {
                    pushFollow(FOLLOW_morethanone_in_cardinality2038);
                    c1=morethanone();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\svenhart\\workspaces\\reuseware2\\org.reuseware.air.language.cmsl.resource.cmsl\\src\\org\\reuseware\\air\\language\\cmsl\\resource\\cmsl\\Cmsl.g:1173:4: c2= zeroone
                    {
                    pushFollow(FOLLOW_zeroone_in_cardinality2048);
                    c2=zeroone();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, cardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "cardinality"

    // Delegated rules


 

    public static final BitSet FOLLOW_grammarextension_in_start79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grammarextensionunit_in_grammarextension113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensiondeclaration_in_extensionprogram147 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_basedeclaration_in_extensionprogram166 = new BitSet(new long[]{0x0000000000420042L});
    public static final BitSet FOLLOW_extensionstatement_in_extensionprogram190 = new BitSet(new long[]{0x0000000000420042L});
    public static final BitSet FOLLOW_11_in_extensiondeclaration228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ESTRING1_in_extensiondeclaration243 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_12_in_extensiondeclaration270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ESTRING1_in_extensiondeclaration291 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_extensiondeclaration338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_60_62_in_extensiondeclaration359 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_extensiondeclaration406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_60_62_in_extensiondeclaration427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_basedeclaration480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_60_62_in_basedeclaration495 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_basedeclaration513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ESTRING1_in_basedeclaration528 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_basedeclaration555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_60_62_in_basedeclaration576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_slotify629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_basereference_in_slotify644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_slotify659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminal_in_injection689 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_injection704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_basereference_in_injection719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_injection734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminal_in_annotation764 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_annotation779 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_annotation790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_nonterminal_in_annotation805 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_annotation820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_fragtypes846 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fragtypes857 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_constructreference_in_fragtypes872 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_fragtypes896 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_constructreference_in_fragtypes917 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_fragtypes950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definitionpart_in_definitionlist980 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_definitionlist1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_definitionpart_in_definitionlist1025 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_role_in_definitionpart1077 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_definitionpart1092 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_constructreference_in_definitionpart1107 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_definitionpart1131 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_upperlevelreference_in_definitionpart1152 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definitionpart1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminal_in_definitionconstruct1219 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_definitionconstruct1243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_definitionlist_in_definitionconstruct1264 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_definitionconstruct1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminal_in_definitionchoice1327 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definitionchoice1342 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_nonterminal_in_definitionchoice1357 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_definitionchoice1381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_nonterminal_in_definitionchoice1402 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_18_in_definitionchoice1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminal_in_construct1465 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_cardinality_in_construct1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basereference_in_reference1531 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_cardinality_in_reference1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESTRING1_in_baselanguagereference1597 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_baselanguagereference1615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_nonterminal_in_baselanguagereference1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_upperlevelreference1660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_nonterminal_in_upperlevelreference1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_arbitrary1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_morethanone1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zeroone1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESTRING1_in_role1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESTRING2_in_nonterminalidentifier1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionprogram_in_grammarextensionunit1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotify_in_extensionstatement1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injection_in_extensionstatement1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_extensionstatement1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fragtypes_in_extensionstatement1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definitionconstruct_in_extensionstatement1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definitionchoice_in_extensionstatement1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baselanguagereference_in_basereference1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonterminalidentifier_in_nonterminal1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_construct_in_constructreference1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_constructreference1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upperlevelreference_in_constructreference2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arbitrary_in_cardinality2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_morethanone_in_cardinality2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zeroone_in_cardinality2048 = new BitSet(new long[]{0x0000000000000002L});

	public ITextParser createInstance(InputStream inputStream, String encoding) {
		// TODO Auto-generated method stub
		return null;
	}

}