componentmodel org.reuseware.lib.systems.usecase.cm.valueflow
implements org.reuseware.lib.systems.usecase.usecase
epackages <http://www.emftext.org/language/valueflow>
rootclass Model { 

	fragment role UseCase {
		port type Name {
			Model.name is value hook {
				point = $'name'$
			}
		}
	}
} 