//*******************************************************************************
// Copyright (c) 2006-2010 
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
SYNTAXDEF fracol
FOR <http://reuseware.org/coconut/fracol> <fracol.genmodel>
START FragmentCollaboration

OPTIONS {
    licenceHeader = "platform:/resource/org.reuseware.coconut/licence.txt";
    
    resourceUIPluginID = "org.reuseware.comogen.fracol.ui";
    uiBasePackage      = "org.reuseware.comogen.fracol.ui";
    
    additionalDependencies= "org.reuseware.coconut.resource";
    
    disableEValidators = "false";
    	
	usePredefinedTokens = "false";
	
	overrideBuilder     = "false";
	overrideAntlrPlugin = "false";
	overrideUIPluginXML = "false";
	overridePluginActivator = "false";
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
}

RULES {
  //FraCol definition
  @SuppressWarnings(explicitSyntaxChoice)
  FragmentCollaboration::= 
                     "fracol" (fracolNamespace[] ".")* fracolName[]
                     "{" (fragmentRoles | compositionAssociations)* !0 "}";
  
  //a fragment role
  FragmentRole ::= !1 "fragment" "role" name[] #1 "{"
                     	(portTypes)*
                   !1 "}";
  
  //a static port
  StaticPortType  ::= !2 "static" "port" "type" name[] ";";
  
  //a dynamic port
  DynamicPortType ::= !2 "dynamic" "port" "type" name[] ";";
  
  //associations
  @SuppressWarnings(nonContainmentOpposite)
  Configuration   ::= !1 "configuring"  "association" name[] #1 "{" !2 end1Role[] "." end1[] #1 "-->" !2 end2Role[] "." end2[] !1 "}";
  @SuppressWarnings(nonContainmentOpposite)
  Contribution    ::= !1 "contributing" "association" name[] #1 "{" !2 end1Role[] "." end1[] #1 "-->" !2 end2Role[] "." end2[] !1 "}";
} 