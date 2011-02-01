componentmodel org.reuseware.lib.systems.dataclass.cm.java
implements org.reuseware.lib.systems.dataclass.dataclass
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit, java::containers::EmptyModel {

	fragment role Core {
		port type Rec {
			java::containers::EmptyModel is hook {}
		}
	}

	fragment role Class {
		port type Contrib {
			java::containers::CompilationUnit is prototype {}
		}
		port type Self {
			java::classifiers::Class is anchor {}
			java::classifiers::Class.members is hook {}
		}
		port type Name {
			java::classifiers::Class.name is value hook if $eContainer().oclIsTypeOf(java::containers::CompilationUnit)$ {
				point = $'name'$
			}
			java::containers::CompilationUnit.namespaces is value hook {
				point = $'namespace'$
			}
		}
	}
} 