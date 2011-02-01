componentmodel org.reuseware.test.basic.fragmentReference.composition
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Contrib {
			EClass is prototype {
				port = $'Contrib'$
			}
		}
		port type Rec {
			EPackage.eClassifiers is hook if $eClassifiers->isEmpty()$ {
				port = $'Rec'$
			}
		}
		
		port type Config {
			EOperation.eType is slot {
				port = $'TypeSlot'$
			}
		}
		port type Config {
			EClass is anchor {
				port = $'Type'$
			}
		}
	}

}