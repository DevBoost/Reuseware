componentmodel org.reuseware.lib.systems.trigger.cm.java
implements org.reuseware.lib.systems.trigger.trigger
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{ 
	fragment role Container {
		port type Rec {
			java::statements::JumpLabel is hook if $name = 'BODY'$ {
				remove = $'true'$
			}
		}
	}

	fragment role Trigger {
		port type Contrib {
			java::statements::StatementListContainer.statements is prototype if $self.oclIsKindOf(java::commons::NamedElement) and 
				self.oclAsType(java::commons::NamedElement).name = 'PLACEHOLDER'$ {
			}
		}
	}
} 