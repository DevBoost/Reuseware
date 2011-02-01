ABSTRACTSYNTAX abstractsyntax
URI <http://www.reuseware.org/air/language/abstractsyntax>
PREFIX org.reuseware.air.language

IMPORT  
	<http://www.eclipse.org/emf/2002/Ecore> AS ecore
 
AbstractSyntax 	= import:Import*, 
				  unit:ASUnit, 
				  @name:EString, 
				  @nsprefix:EString, 
				  @nsuri:EString ;
       
Import = ePackage::ecore.EPackage, @prefix:EString;

ASUnit = ASProgram;  

ASProgram = statement:ASStatement+; 

ASStatement;
ASStatement = Definition; 

%a concrete definition and an interface definition will result in an interface Definition with attributes
Definition = @name:EString, interfaces::InterfaceNodeDefinition->options*;
Definition = ConcreteNodeDefinition | InterfaceNodeDefinition;

%A concrete node definition specifies members of a class. If there's an interface node definition with same 
%name the eclass result will be abstract and an interface. Otherwise an instanciateable class results.
%(called aggregation in the old as)
ConcreteNodeDefinition = eSuperClass::ecore.EClass?, members:NodeFeature* ;  

%An interface node definition specifies subclasses to conform to a specific interface such that they realize 
%the interface (called Choice in the old as).
InterfaceNodeDefinition = options::Definition->interfaces+; 

NodeFeature = @name:EString, cardinality:Cardinality?;
NodeFeature = Attribute | Containment | InternalReference | ExternalReference;

%Attributes can be typed by arbitrary ecore EDataTypes. 
Attribute = type::ecore.EDataType;

Containment = type::Definition;

%Internal references may have opposite InternalReferences such that bidirectional
%references can be realized. Opposites are valid if they match inversely or if 
%only one side is addressed the opposite reference will be derived automatically 
InternalReference = type::Definition, opposite:InternalReference;

%External References may refer to types defined in an imported model.
ExternalReference = type::ecore.EClass;

Cardinality    = PLUS | STAR | QUESTIONMARK;

PLUS;
STAR;  
QUESTIONMARK; 


%Old definition:
%AbstractSyntax 	= unit:GrammarUnit;

%GrammarUnit 	= GrammarProgram;

%GrammarProgram	= statement:GrammarStatement+;

%GrammarStatement	= GrammarRule | Comment;

%GrammarRule  = name:Identifier, definition:Definition?;

%Identifier     = StringIdentifier;

%StringIdentifier	= identifier:S;

%Comment			= text:S; 

%Definition     = Aggregation | Choice;

%Choice         = options:Identifier+;

%Aggregation    = reference:Reference+;

%Reference      = name:Identifier, rule:Identifier, cardinality:Cardinality?;

%Cardinality    = PLUS | STAR | QUESTIONMARK;

%PLUS;
%STAR;   
%QUESTIONMARK;