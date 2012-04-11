//*******************************************************************************
// Copyright (c) 2006-2011 
// Software Technology Group, Dresden University of Technology
// 
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0 
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
// 
// Contributors:
//   Software Technology Group - TU Dresden, Germany 
//      - initial API and implementation
// ******************************************************************************/
SYNTAXDEF rex
FOR <http://reuseware.org/coconut/reuseextension> <reuseextension.genmodel>
START ComponentModelSpecification, CompositionLanguageSyntaxSpecification, CompositionLanguageSpecification 

OPTIONS {
	licenceHeader ="../../org.dropsbox/licence.txt";
    
	resourceUIPluginID = "org.reuseware.comogen.reuseextension.ui";
	uiBasePackage      = "org.reuseware.comogen.reuseextension.ui";
    
	additionalDependencies= "org.reuseware.coconut.resource";
	additionalUIDependencies= "org.reuseware.coconut.resource";
	
	disableEValidators = "false";

	usePredefinedTokens = "false";
	overrideBuilder     = "false";
	overrideProposalPostProcessor = "false";
	overrideAntlrPlugin = "false";
	overrideUIPluginXML = "false";
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
}


TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $;
	DEFINE ML_COMMENT $'/*'.*'*/'$;
	DEFINE TEXT $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' | '::')+$;
}

TOKENSTYLES {
	"SL_COMMENT" COLOR #008000, ITALIC;
	"ML_COMMENT" COLOR #008000, ITALIC;
	"TEXT" COLOR #000000;
	"QUOTED_36_36" COLOR #2A00FF;
}


RULES {
  //a concrete binding of a fracol to a language used for defining components
  @SuppressWarnings
  ComponentModelSpecification ::= 
                     "componentmodel" (rexNamespace[] ".")* rexName[] ("(" parameters[] ("," #1 parameters[])* ")")? !0
                     "implements" (fracolNamespace[] ".")* fracol[] !0
                     "epackages" ePackages['<','>']+ !0
                     "rootclass" rootElementContexts ("," rootElementContexts)* #1 "{"
                     fragmentRoleBindings* !0 "}";

  //a concrete binding of a fracol to customise the syntax of the generic composition language
  @SuppressWarnings
  CompositionLanguageSyntaxSpecification ::= 
                     "compositionlanguagesyntax" (rexNamespace[] ".")* rexName[] ("(" parameters[] ("," #1 parameters[])* ")")? !0
                     "implements" (fracolNamespace[]".")* fracol[] !0 "{"        
                     fragmentRoleBindings* !0 "}";
                                    
  //a concrete binding of a fracol to a language used for defining composition programs
  @SuppressWarnings
  CompositionLanguageSpecification ::= 
                     "compositionlanguage" (rexNamespace[] ".")* rexName[] ("(" parameters[] ("," #1 parameters[])* ")")? !0
                     "implements" (fracolNamespace[]".")* fracol[] !0
                     "epackages" ePackages['<','>']+ !0
                     "rootclass" rootElementContexts ("," rootElementContexts)* !0
                     "ucpi" #1 "=" #1 ucpiExpression['$','$'] 
                     ("location" #1 "=" #1 compositionProgramPhysicalLocationExpression['$','$'])?"{"        
                     (fragmentRoleBindings | compositionAssociationBindings)* !0 "}";
  
  @SuppressWarnings                  
  RootElementContext ::= eBoundClass[] ("if" #1 isExpression['$','$'] )?;
    
  //a fragment role binding for a component model
  FragmentRole2FragmentBinding ::= 
                     !1 "fragment" "role" fragmentRole[] ("if" #1 isExpression['$','$'])? #1 "{"
                     	portTypeBindings*
                     !1"}";
  
  //a (static or dynamic) port binding ("homo" modifier allowed)
  PortType2HeterogeneousPortBinding ::= 
                     !2 "port" "type" portType[] #1 "{" derivationRules* !1
                      "}"; 

  PortType2HomogenousPortBinding ::= 
                     !2 "homo" "port" "type" portType[] #1 "{" derivationRules* !1 "}"; 
                     
  
  //associations (contibuting or configuring)
  @SuppressWarnings(featureWithoutSyntax)
  CompositionAssociation2CompositionLinkBinding   ::= !1 "association" compositionAssociation[] #1 "{"
                     !2 eBoundClass[]
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!3 "foreach" forEach1Expression['$','$'])?
                     !3 "fragment" #1 "=" #1 fragmentInstance1NameExpression['$','$']                
                     //not optional if port is dynamic
                     (!3 "port" #1 "=" #1     portInstance1NameExpression['$','$'])?
                     #1 "-->"
                     (!3 "foreach" forEach2Expression['$','$'])?
                     !3 "fragment" #1 "=" #1 fragmentInstance2NameExpression['$','$']                     
                     //not optional if port is dynamic
                     (!3 "port" #1 "=" #1     portInstance2NameExpression['$','$'])?
                     !2 "}" !1 "}";
  
  //a fragment role binding for a composition language
  @SuppressWarnings(featureWithoutSyntax)
  FragmentRole2FragmentInstanceBinding ::= !1 "fragment" "role" fragmentRole[] #1 "{"
                     !2 eBoundClass[]
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     !3 "fragment"    #1 "=" #1 nameExpression['$','$']
                     !3 "ufi"     #1 "=" #1 ufiExpression['$','$']
                     (!3 "target" "ufi" #1 "=" #1 targetUfiExpression['$','$'])?
                     (!3 "target" "location" #1 "=" #1 targetPhysicalLocationExpression['$','$'])?
                     
                     (portTypeBindings)*
                     
                     !2 "}" !1 "}";
  
  @SuppressWarnings(featureWithoutSyntax)
  FragmentRole2FragmentReferenceBinding ::= "reference" "fragment" "role" fragmentRole[] #1 "{"
                     !2 eBoundClass[]
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     !3 "fragment"    #1 "=" #1 nameExpression['$','$']
                     !3 "ufi"     #1 "=" #1 ufiExpression['$','$']
                     (!3 "target" "ufi" #1 "=" #1 targetUfiExpression['$','$'])?
                     (!3 "target" "location" #1 "=" #1 targetPhysicalLocationExpression['$','$'])?
                     
                     portTypeBindings*
                     
                     !2 "}" !1 "}";
                     
   PortType2SettingBinding ::= !2 "port" portType[] #1 "{" derivationRules* !1 "}";
   
   SettingDerivationRule ::= !1 propertyExpression['$','$'] #1 "=" #1 valueExpression['$','$'] ;
   
   FragmentRole2SyntaxBinding ::= !1 "fragment" "role" fragmentRole[] #1 "{"
                     (!2 "fragment"     #1 "=" #1 nameExpression['$','$'])?
                     (!2 "ufi"          #1 "=" #1 ufiExpression['$','$'])?
                     (!2 "target" "ufi" #1 "=" #1 targetUfiExpression['$','$'])?
                     (!3 "target" "location" #1 "=" #1 targetPhysicalLocationExpression['$','$'])?
                     (!2 "visible"      #1 "=" #1 visibleExpression['$','$'])?  
                     (!2 "icon"         #1 "=" #1 iconExpression['$','$'])?
                     (!2 "width"        #1 "=" #1 widthExpression['$','$'])?
                     (!2 "height"       #1 "=" #1 heightExpression['$','$'])?
                     
                     portTypeBindings*
                                                    
                     !1 "}";
   
   PortType2SyntaxBinding ::= !2 "port" "type" portType[] #1 "{"
                     (!3 "visible"      #1 "=" #1 visibleExpression['$','$'])?  
                     (!3 "icon"         #1 "=" #1 iconExpression['$','$'])?
                     (!3 "width"        #1 "=" #1 widthExpression['$','$'])?
                     (!3 "height"       #1 "=" #1 heightExpression['$','$'])?
                     (!3 "label"        #1 "=" #1 labelExpression['$','$'])?                                                    
                     !2 "}";
   
  //different kinds of concrete addressable point derivation for reuseextensions 
   SlotDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "slot"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "mode" #1 "=" #1 modeExpression['$','$'])? 
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     (!1 "remove" #1 "=" #1 removeExpression['$','$'])? 
                     !0 "}";
                     
   HookDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "hook"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "mode" #1 "=" #1 modeExpression['$','$'])? 
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     (!1 "remove" #1 "=" #1 removeExpression['$','$'])? 
                     !0 "}";

   AnchorDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "anchor"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     !0 "}";

   PrototypeDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "prototype"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     !0 "}";
 
   ValueHookDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "value" "hook"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "mode" #1 "=" #1 modeExpression['$','$'])? 
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     
                     (!1 "begin" "idx" #1 "=" #1 beginIndexExpression['$','$'])?
                     (!1 "end"   "idx" #1 "=" #1 endIndexExpression['$','$'])?
                     (!1 "list"  "idx" #1 "=" #1 listIndexExpression['$','$'])?

                     ("remove" #1 "=" #1 removeExpression['$','$'])? 
                     !0 "}"; 
                                         
   ValuePrototypeDerivationRule ::= 
                     !2 eBoundClass[] ("." eBoundFeature[])? "is" "value" "prototype"
                     ("if" #1 isExpression['$','$'])? #1
                     "{"
                     (!1 "foreach" forEachExpression['$','$'])?
                     (!1 "homo" "port" #1 "=" #1 homoPortNameExpression['$','$'])?                     
                     (!1 "port" #1 "=" #1  portNameExpression['$','$'])?
                     (!1 "point" #1 "=" #1  pointNameExpression['$','$'])?
                     
                     !1 "value" #1 "=" #1 valueExpression['$','$']
                     !0 "}"; 
                                                  
} 