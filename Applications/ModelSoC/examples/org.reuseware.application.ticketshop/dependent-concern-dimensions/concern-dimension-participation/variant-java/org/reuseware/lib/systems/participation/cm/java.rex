componentmodel org.reuseware.lib.systems.participation.cm.java
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit {

	fragment role Participant {
		homo port type Name {
			java::commons::NamedElement.name is value hook if $name.contains('NAME_HOOK')${
				point = $'name'$
				begin idx = $name.indexOf('NAME_HOOK')$
				end   idx = $name.indexOf('NAME_HOOK') + 'NAME_HOOK'.length() - 1$
			}	
		}
		port type Contrib {
			java::statements::StatementListContainer.statements is prototype if $self.oclIsKindOf(java::commons::NamedElement) and 
				self.oclAsType(java::commons::NamedElement).name = 'PLACEHOLDER'$ {
				point = $'INIT'$
			}
		}
	}

	fragment role Collaboration {
		port type Rec {
			java::statements::JumpLabel is hook if $name.toUpperCase() = name$ {
				point = $name$
				remove = $true$
			}
		}
	}
} 