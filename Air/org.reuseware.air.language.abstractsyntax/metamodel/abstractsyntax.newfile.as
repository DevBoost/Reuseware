ABSTRACTSYNTAX myGrammar
URI <http://my.namespace.uri>
PREFIX my.namespace.prefix

IMPORT  
	<http://my.import.namespace.uri> AS myImport
	
%Concrete Node Defintion
MyNode = %direct child node (composite EReference) 
		myComposite:Composite,
		%attribute (can also be of any ecore EDataType)
		myAttribute:String,
		%internal EReference (opposite is optional)
		myReference::MyOtherNode->myOpposite,
		%external EReference
		myExternalEClass::myImport.ImportedEClass;

%Interface Node Definition with list of super types		
MySubNode = MyNode | MyOtherSuperNode;