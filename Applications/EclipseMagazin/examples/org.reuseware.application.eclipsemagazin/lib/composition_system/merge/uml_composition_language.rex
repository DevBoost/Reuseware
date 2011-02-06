compositionlanguage composition_system.merge.uml_composition_language
implements composition_system.merge
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass uml::Model if $ufi.segment(-1) <> 'Core.uml' and not (ufi.segment(-2) = 'composed')$
ucpi = $ufi.trim(1).append('Core.ucl')$ 
location = $'models-composed'$ {

	fragment role CoreModel {
		uml::Model {
			fragment = $'Core'$
			ufi = $ufi.trim(1).append('Core.uml')$
			target ufi = $ufi.trim(1).append('composed').append('Core.uml')$
			target location = $'models-composed'$
		}
	}

	fragment role ExtensionModel {
		uml::Model {
			fragment = $ufi$
			ufi = $ufi$
		}
	}
	
	association Merge {
		uml::Class {
			fragment = $ufi$
			port = $name$
			-->
			fragment = $'Core'$
			port = $name.concat('_hook')$
		}
	}

}