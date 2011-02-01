SYNTAXDEF rex_activator
FOR <http://reuseware.org/coconut/reuseextensionactivator> <reuseextensionactivator.genmodel>
START ReuseExtensionActivatorList

OPTIONS {
	licenceHeader ="platform:/resource/org.reuseware.coconut/licence.txt";
    
	resourcePluginID = "org.reuseware.coconut.reuseextensionactivator.resource.rexactivator";
	basePackage = "org.reuseware.coconut.reuseextensionactivator.resource.rexactivator";
    
	resourceUIPluginID = "org.reuseware.coconut.reuseextensionactivator.ui";
	uiBasePackage      = "org.reuseware.coconut.reuseextensionactivator.ui";
    
	additionalDependencies= "org.reuseware.coconut.resource";
	additionalUIDependencies= "org.reuseware.coconut.resource";
	
	disableEValidators = "false";
  
	usePredefinedTokens = "false";
	disableBuilder      = "true";
	overrideProposalPostProcessor ="false";
	overrideAntlrPlugin = "false";
	overrideUIPluginXML = "false";
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
	"QUOTED_39_39" COLOR #2A00FF;
}

RULES{	
	ReuseExtensionActivatorList::= activators*;
	
	ComponentModelSpecificationActivator ::= 
		"componentmodel" (rexNamespace[] ".")* reuseExtension[] 
		("(" arguments ("," #1 arguments)* ")")?
		!0;
	CompositionLanguageSpecificationActivator ::= 
		"compositionlanguage" (rexNamespace[] ".")* reuseExtension[] 
		("(" arguments ("," #1 arguments)* ")")?
		!0;
	CompositionLanguageSyntaxSpecificationActivator ::=
		"compositionlanguagesyntax" (rexNamespace[] ".")* reuseExtension[] 
		("(" arguments ("," #1 arguments)* ")")?
		!0;
	Argument ::= parameter[] "=" value['\'','\''];
}