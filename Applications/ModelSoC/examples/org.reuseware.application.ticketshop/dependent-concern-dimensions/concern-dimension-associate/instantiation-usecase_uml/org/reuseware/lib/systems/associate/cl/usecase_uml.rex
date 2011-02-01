compositionlanguage org.reuseware.lib.systems.associate.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.associate.associate
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass uml::Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$
location = $outFolder$ {

	//Values that are given away
	fragment role Association {
		uml::Comment if $not _body.contains('inSet')$ {
			fragment = $'Association:'.concat(ufi.trimExtension().segment(-1)).concat('2').concat(_body.split(' ')->at(1))$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToOne.'.concat(format)}$
			port Name {
				$'name'$ = $_body.split(' ')->at(1)$
			}			
			port NameLowerCase {
				$'name'$ = $_body.split(' ')->at(1).toLowerCase()$
			}
		}
	}
	fragment role Association {
		uml::Comment if $_body.contains('inSet')$ {
			fragment = $'Association:'.concat(ufi.trimExtension().segment(-1)).concat('2').concat(_body.split(' ')->at(1))$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToMany.'.concat(format)}$
			port Name {
				$'name'$ = $_body.split(' ')->at(1)$
			}			
			port NameLowerCase {
				$'name'$ = $_body.split(' ')->at(1).toLowerCase()$
			}
		}
	}
	association Contribution {
		uml::Comment {
			fragment = $'Association:'.concat(ufi.trimExtension().segment(-1)).concat('2').concat(_body.split(' ')->at(1))$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
	
	association AssociationSource {
		uml::Comment {
			fragment = $'Association:'.concat(ufi.trimExtension().segment(-1)).concat('2').concat(_body.split(' ')->at(1))$
			-->
			fragment = $'Class:'.concat(ufi.trimExtension().segment(-1))$
		}
	}
	association AssociationTarget {
		uml::Comment {
			fragment = $'Association:'.concat(ufi.trimExtension().segment(-1)).concat('2').concat(_body.split(' ')->at(1))$
			-->
			fragment = $'Class:'.concat(_body.split(' ')->at(1))$
		}
	}
}