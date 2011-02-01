componentmodel org.reuseware.lib.systems.factory.cm.java
implements org.reuseware.lib.systems.factory.factory
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{ 
	fragment role Receiver {
		port type Slot {
			java::commons::NamedElement is slot if $name = 'SLOT'${}
		}
	}

	fragment role TwinReceiver {
		port type Slot1 {
			java::commons::NamedElement is slot if $name = 'SLOT1'${}
		}
		port type Slot2 {
			java::commons::NamedElement is slot if $name = 'SLOT2'${}
		}
	}

	fragment role Factory {
		port type Product {
			java::classifiers::Class is anchor if $eContainer().oclIsTypeOf(java::containers::CompilationUnit)$ {}
		}
	}

} 