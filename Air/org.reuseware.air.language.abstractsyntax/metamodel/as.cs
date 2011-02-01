SYNTAXDEF as
FOR <http://www.reuseware.org/air/language/abstractsyntax> <abstractsyntax.genmodel>
START AbstractSyntax

OPTIONS{
	usePredefinedTokens="false";
}
 
TOKENS{ 
		DEFINE COMMENT $'%'(~('\n'|'\r'))*$;
		DEFINE TEXT $('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'0'..'9')*$;
		DEFINE QNAME $('A'..'Z'|'a'..'z'|'_')+('.'('A'..'Z'|'a'..'z'|'_'|'-'|'0'..'9')+)+$;
		DEFINE WHITESPACE $(' '|'\t'|'\f')$;
		DEFINE LINEBREAK $('\r\n'|'\r'|'\n')$;
}

RULES{ 
		 
		AbstractSyntax ::=  "ABSTRACTSYNTAX" name[] !0 
							"URI"  nsuri['<','>'] !0 
							"PREFIX"  nsprefix[QNAME] !0
			 				( "IMPORT"  import ( "," import )* !0 )? 
			 				unit;
		 
		Import::= ePackage['<','>'] "AS" prefix[];
		
		ASProgram ::= !2 statement+   ;
		
		//SuperClassAddition::=  super[QNAME] "<==" node[]  ";" ;
		
		ConcreteNodeDefinition::= name[] ( "==>" eSuperClass[QNAME] )? ( "=" members ("," members)*)? ";"    ;
		
		InterfaceNodeDefinition::= name[] "=" options[] ("|" options[])* ";"  ;
		
		Attribute::=  "@" name[] ":" type[] cardinality?;
		
		Containment::=  name[] ":"  type[] cardinality?;
				
		InternalReference::= name[] "::" type[] ( "->" opposite[] )? cardinality?  ;
		
		ExternalReference::=  name[] "::" type[QNAME] cardinality?  ;
		
		
		PLUS::= "+"  ;
		
		STAR::= "*"  ;
		 
		QUESTIONMARK::= "?"  ;	
}