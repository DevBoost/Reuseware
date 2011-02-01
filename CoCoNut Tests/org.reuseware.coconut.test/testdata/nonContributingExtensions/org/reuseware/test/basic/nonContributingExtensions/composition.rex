componentmodel org.reuseware.test.basic.nonContributingExtensions.composition
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
			EClass is prototype {
				port = $'ConfigContrib'$
			}
		}
		port type Config {
			EPackage.eClassifiers is hook if $eClassifiers->isEmpty()$ {
				port = $'ConfigRec'$
			}
		}
		
		port type Config {
			EOperation is prototype {
				port = $'ConfigOpContrib'$
			}
		}
		port type Config {
			EClass.eOperations is hook {
				port = $'ConfigOpRec'$
			}
		}
	}

}