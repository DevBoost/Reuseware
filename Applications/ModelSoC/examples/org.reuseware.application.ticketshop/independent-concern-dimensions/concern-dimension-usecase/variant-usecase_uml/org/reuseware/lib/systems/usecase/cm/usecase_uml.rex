componentmodel org.reuseware.lib.systems.usecase.cm.usecase_uml
implements org.reuseware.lib.systems.usecase.usecase
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model {

	fragment role UseCase {
		port type Name {
			UseCase.name is value hook {
				point = $'name'$
			}
		}
	}
} 