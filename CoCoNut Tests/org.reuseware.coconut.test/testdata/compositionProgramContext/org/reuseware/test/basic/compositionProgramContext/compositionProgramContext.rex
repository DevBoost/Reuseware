componentmodel org.reuseware.test.basic.compositionProgramContext.compositionProgramContext
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Contrib {
			EPackage.eClassifiers is prototype  {
				port = $'p'$
			}
		}
		port type Rec {
			EPackage.eClassifiers is hook {
				port = $'h'$
			}
		}
		port type Config {
			EClassifier is slot {
				port = $'s_'.concat(name)$
			}
		}
		port type Config {
			EClassifier is anchor {
				port = $'a_'.concat(name)$
			}
		}
	}

}