componentmodel org.reuseware.lib.systems.exchange.cm.java
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit { 

	fragment role Container {
		port type Rec {}
	}

	fragment role Value {
		port type Contrib {}	
		port type Provider {
			java::commons::NamedElement is slot if $name = 'GIVER'${}
			java::commons::NamedElement.name is value hook if $name = 'ID_SLOT'$ {
				point = $'ID'$
			}
		}
		port type Consumer {
			java::commons::NamedElement is slot if $name = 'TAKER'${}
		}
	}

	fragment role Provider {
		port type Self {
			java::commons::NamedElement is anchor if $name.contains('NAME_HOOK')${}
		}
	}

	fragment role Consumer {
		port type Self {
			java::commons::NamedElement is anchor if $name.contains('NAME_HOOK')${}
		}
	}

} 