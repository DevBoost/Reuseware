SYNTAXDEF cmsl
FOR <http://www.reuseware.org/air/language/cmsl> <cmsl.genmodel>
START GrammarExtension

OPTIONS {
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
}

TOKENS{ 
		DEFINE ESTRING  $'%' (~('\n'))* $;
		DEFINE ESTRING1 $('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*$;
		DEFINE ESTRING2 $('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*$;

}
 
RULES{
		
		GrammarExtension::=unit  ;
		ExtensionProgram::=extension base statements*  ;
		
		ExtensionDeclaration::= "COMPONENTMODEL" name[ESTRING1] 
								("PREFIX" nsprefix[ESTRING1])?
						   		("URI" nsuri['<','>'] )?
						   		("URL" targeturl['<','>'] )?;
		
		
		BaseDeclaration::= "EXTENDS" nsuri['<','>'] "as" name[ESTRING1]
						   ( "URL" sourceurl['<','>'] )? ;
		
		Slotify::= "slotify" construct  "."  ;
		Injection::=source  "<>" target  "."  ;
		Annotation::=source  "->"  "@" target  "."  ;
		
		Fragtypes::= "fragtypes"  "{" fragtype ( "," fragtype  )* "}"  ;
		
		DefinitionList::=refs ( "," refs  )* ;
		DefinitionPart::=rolename  ":" construct ( "[" annotation  "]"  )? ;
		DefinitionConstruct::=newConstruct ( "=" definition  )? "."  ;
		DefinitionChoice::=newConstruct  "=" choice ( "|" choice  )* "."  ;

		Construct::=name cardinality?  ;
		Reference::=base cardinality?  ;
		
		BaseLanguageReference::=language[ESTRING1]  "." base  ;
		UpperLevelReference::= "@" upper  ;
		
		Arbitrary::= "*"  ;
		MoreThanOne::= "+"  ;
		ZeroOne::= "?"  ;
		
		Role ::= value[ESTRING1];
		
		NonTerminalIdentifier::=value[ESTRING2] ;

}//CONCRETESYNTAX cmsl FOR cmsl
//
//GrammarExtension			::= unit;
//
//ExtensionProgram			::=	declaration statements*;
//
//BaseDeclaration				::= "extends" base "@" name "as" extension ".";
//
//Slotify						::= "slotify" construct ".";
//
//Injection					::=	source "<>" target ".";
//
//Annotation					::=	source "->" "@" target ".";
//
//DefinitionConstruct			::=	newConstruct ("=" definition )? ".";
//
//DefinitionChoice			::= newConstruct "=" choice ("|" choice)* ".";
//
//Fragtypes					::= "fragtypes" "{" fragtype ("," fragtype)* "}";
//
//DefinitionList				::= refs ("," refs)*;
//
//DefinitionPart				::= rolename ":" construct ("[" annotation "]")?; 
//
//Construct					::= name cardinality?;
//
//Reference					::=	base cardinality?;
//
//BaseLanguageReference		::=	language "." base;
//
//UpperLevelReference			::= "@" upper;
//
//Arbitrary 					::=	"*";
//MoreThanOne					::=	"+";
//ZeroOne						::=	"?";
//
//Comment						::= text['%' (~'\n')* ]; 
//Identifier					::= name[('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*];
//NonTerminalIdentifier		::= value[('A'..'Z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*];
//
//Role						::= value[('a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')*];
//
//LocalLocation			    ::= path['file:' ('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'.'|'-')+];

