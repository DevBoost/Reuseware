componentmodel org.reuseware.test.basic.valueHookWithIndex.valueHookWithIndex
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Config {
			EClass.name is value hook if $name.contains('HOOK')$ {
				port = $'hook'$
				begin idx = $name.indexOf('HOOK')$
				end idx   = $name.indexOf('K')$
			}
		}
	}

}