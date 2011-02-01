componentmodel org.reuseware.test.basic.samePointNameGrouping.composition
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Contrib {
			EPackage is prototype {
				port = $'Contrib'$
				point = $'allInOne'$
			}
		}
		port type Rec {
			EPackage is hook {
				port = $'Rec'$
				point = $'allInOne'$
			}
		}
	}

}