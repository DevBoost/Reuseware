componentmodel org.reuseware.lib.systems.usecase.cm.ucinv 
implements org.reuseware.lib.systems.usecase.usecase
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel {

	fragment role UseCase {
		port type Name {
			UseCaseModel.name is value hook {
				point = $'name'$
			}
		}
	}
} 