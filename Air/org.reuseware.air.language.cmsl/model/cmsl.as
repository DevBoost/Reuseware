ABSTRACTSYNTAX cmsl
URI <http://www.reuseware.org/air/language/cmsl>
PREFIX org.reuseware.air.language


GrammarExtension		=	unit:GrammarExtensionUnit;

GrammarExtensionUnit	=	ExtensionProgram;

ExtensionProgram		=	base:BaseDeclaration,
							extension:ExtensionDeclaration,
							statements:ExtensionStatement*;
							
ExtensionStatement		= 	Slotify | Injection | Annotation | Fragtypes |
							Definition ;

ExtensionDeclaration	= 	@name:EString,
				  			%optional: can also be derived from base
							@nsuri:EString?,
							%optional: can also be derived from base
							@nsprefix:EString?, 
							%optional: can also be relatively derived from csml spec 
							@targeturl:EString?
							;

BaseDeclaration			=	@name:EString,
							@nsuri:EString,
							%optional: location might not be necessary if package is registered, or model is next to csml spec 
							@sourceurl:EString? 
							;

Slotify					=	construct:BaseReference; 

Injection				= 	source:NonTerminal,
							target:BaseReference;

Annotation				=	source:NonTerminal, 
							target:NonTerminal;

Fragtypes				=	fragtype:ConstructReference*;  

Definition				=	DefinitionConstruct | DefinitionChoice;

DefinitionConstruct		= 	newConstruct:NonTerminal, 
							definition:DefinitionList?;

% list of NonTerminal or BaseReference or ConstructReference? 
DefinitionChoice		=	newConstruct:NonTerminal, choice:NonTerminal*;

DefinitionList			=	refs:DefinitionPart+;

DefinitionPart			=	rolename:Role, 
							construct:ConstructReference, 
							annotation:UpperLevelReference?; 
							
ConstructReference		= 	Construct | Reference | UpperLevelReference;

Construct				=  	name:NonTerminal, cardinality:Cardinality?; 

Reference				=	base:BaseReference, cardinality:Cardinality?;

BaseReference			=	BaseLanguageReference;

BaseLanguageReference	=	@language:String, base:NonTerminal;

NonTerminal				=	NonTerminalIdentifier;

UpperLevelReference		= 	upper:NonTerminal;

Role					=	@value:String;

Cardinality				= 	Arbitrary | MoreThanOne | ZeroOne;
Arbitrary;
MoreThanOne;
ZeroOne;

NonTerminalIdentifier	=	@value:String;