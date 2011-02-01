componentmodel org.reuseware.lib.systems.associate.cm.java
implements org.reuseware.lib.systems.associate.associate
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit, java::containers::EmptyModel {

	fragment role Core {
		port type Rec {
			java::containers::EmptyModel is hook {}
		}
	}

	fragment role Associated {
		port type Self {
			java::classifiers::Class is anchor {}
			java::classifiers::Class.members is hook {}
		}
	}

	fragment role Association {
		port type Contrib {}
		homo port type Name {
			java::commons::NamedElement.name is value hook if $name.contains('NAME_HOOK')${
				point = $'name'$
				begin idx = $name.indexOf('NAME_HOOK')$
				end   idx = $name.indexOf('NAME_HOOK') + 'NAME_HOOK'.length() - 1$
			}	
		}
		homo port type NameLowerCase {	
			java::commons::NamedElement.name is value hook if $name.contains('NAME_LOWER_CASE_HOOK')${
				point = $'name'$
				begin idx = $name.indexOf('NAME_LOWER_CASE_HOOK')$
				end   idx = $name.indexOf('NAME_LOWER_CASE_HOOK') + 'NAME_LOWER_CASE_HOOK'.length() - 1$
			}
		}
		port type Source {
			java::classifiers::Class.members is prototype {}
		}
		port type Target {
			java::classifiers::Class is slot if $name.contains('CLASS_SLOT')$ {}
		}
	}
} 