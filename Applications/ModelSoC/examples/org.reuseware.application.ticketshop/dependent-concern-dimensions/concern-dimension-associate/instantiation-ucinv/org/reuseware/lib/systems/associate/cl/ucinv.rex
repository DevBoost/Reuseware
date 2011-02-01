compositionlanguage org.reuseware.lib.systems.associate.cl.ucinv
implements org.reuseware.lib.systems.associate.associate
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$ {

	//Values that are given away
	fragment role Association {
		Value if $not asBefore.oclIsUndefined() and inSet = false$ {
			fragment = $'Association:'.concat(asBefore.name).concat('2').concat(type)$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToOne.'.concat(format)}$
			port Name {
				$'name'$ = $type$
			}			
			port NameLowerCase {
				$'name'$ = $type.toLowerCase()$
			}
		}
	}
	fragment role Association {
		Value if $not asBefore.oclIsUndefined() and inSet = true$ {
			fragment = $'Association:'.concat(asBefore.name).concat('2').concat(type)$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToMany.'.concat(format)}$
			port Name {
				$'name'$ = $type$
			}			
			port NameLowerCase {
				$'name'$ = $type.toLowerCase()$
			}
		}
	}

	association Contribution {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asBefore.name).concat('2').concat(type)$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
	association AssociationSource {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asBefore.name).concat('2').concat(type)$
			-->
			fragment = $'Class:'.concat(asBefore.name)$
		}
	}
	association AssociationTarget {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asBefore.name).concat('2').concat(type)$
			-->
			fragment = $'Class:'.concat(type)$
		}
	}

	//Values that are received
	fragment role Association {
		Value if $not asAfter.oclIsUndefined() and inSet = false$ {
			fragment = $'Association:'.concat(asAfter.name).concat('2').concat(type)$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToOne.'.concat(format)}$
			port Name {
				$'name'$ = $type$
			}
			port NameLowerCase {
				$'name'$ = $type.toLowerCase()$
			}
		}
	}
	fragment role Association {
		Value if $not asAfter.oclIsUndefined() and inSet = true$ {
			fragment = $'Association:'.concat(asAfter.name).concat('2').concat(type)$
			ufi = $Sequence{'org','reuseware','lib','systems','associate','lib','AssociationToMany.'.concat(format)}$
			port Name {
				$'name'$ = $type$
			}
			port NameLowerCase {
				$'name'$ = $type.toLowerCase()$
			}
		}
	}	

	association Contribution {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asAfter.name).concat('2').concat(type)$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
	association AssociationSource {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asAfter.name).concat('2').concat(type)$
			-->
			fragment = $'Class:'.concat(asAfter.name)$
		}
	}
	association AssociationTarget {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Association:'.concat(asAfter.name).concat('2').concat(type)$
			-->
			fragment = $'Class:'.concat(type)$
		}
	}
}  
