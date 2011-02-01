componentmodel org.reuseware.test.basic.cyclicDependency.cyclicDependency
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
	}

}