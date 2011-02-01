componentmodel org.reuseware.lib.systems.usecase.cm.java
implements org.reuseware.lib.systems.usecase.usecase
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit {

	fragment role UseCase {
		homo port type Name {
			java::classifiers::Class.name is value hook if $name.contains('NAME_HOOK')${
				point = $'name'$
				begin idx = $name.indexOf('NAME_HOOK')$
				end   idx = $name.indexOf('NAME_HOOK') + 'NAME_HOOK'.length() - 1$
			}
			java::containers::CompilationUnit.namespaces is value hook {
				point = $'namespace'$
			}
		}
	}
} 