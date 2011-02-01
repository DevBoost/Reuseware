componentmodel org.reuseware.lib.systems.flow.cm.java
implements org.reuseware.lib.systems.flow.flow
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{ 
	//1 = Give
	fragment role Participant1 {
		port type Self {
			java::statements::StatementListContainer.statements is prototype if $self.oclIsKindOf(java::commons::NamedElement) and 
				self.oclAsType(java::commons::NamedElement).name = 'PLACEHOLDER'$ {
			}
		}
		port type Next {
			java::statements::JumpLabel is hook if $name = 'NEXT'$ {
				remove = $true$
			}
		}
	}

	//2 = Take
	fragment role Participant2 {
		port type Self {}
		port type Next {
			java::statements::JumpLabel is hook if $name = 'NEXT'$ {
				remove = $true$
			}
		}
	}

} 