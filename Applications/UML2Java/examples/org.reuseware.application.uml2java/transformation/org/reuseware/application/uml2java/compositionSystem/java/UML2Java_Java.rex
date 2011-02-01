componentmodel org.reuseware.application.uml2java.compositionSystem.java.UML2Java_Java
implements     org.reuseware.application.uml2java.compositionSystem.UML2Java
epackages <http://www.emftext.org/java> <http://www.emftext.org/reusejava>
rootclass java::containers::JavaRoot {

	fragment role Class {
		port type Name {
			java::classifiers::Class.name is value hook { point = $'name'$ }
			java::containers::CompilationUnit.namespaces is value hook { point = $'package'$ }
		}
		port type Hook {
			java::classifiers::Class.members is hook { }
		}
		port type Self {
			java::classifiers::Class is anchor {}
		}
	}
	
	fragment role Operation {
		port type Name {
			java::members::Method.name is value hook { point = $'name'$ }
		}
		port type Content {
			java::members::Method is prototype {}
		}
		port type Hook {
			reusejava::StatementVariationPoint is hook { 
				remove = $true$
			}
		}
		port type TypeSlot {
			java::classifiers::Class is slot if $name = 'TYPE_SLOT'$ { }
		}
	}
	
	fragment role StatementUnit {
		port type Content {
			reusejava::StatementUnit.statements is prototype { }
		}
	}
}