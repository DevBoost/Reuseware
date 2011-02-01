compositionlanguage org.reuseware.lib.systems.exchange.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location =  $outFolder$ {

	//Provision
	fragment role Value {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			ufi = $Sequence{'org','reuseware','lib','systems','exchange','lib','Value.'.concat(format)}$
			port Provider {
				$'value'$ = $type$
				$'name'$  = $type.concat('_').concat(ID)$
				$'ID'$    = $ID$
				$'inSet'$    = $inSet$
			}
		}
	}
	association Contribution {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			-->
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
		}
	}		
	association Provide {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			-->
			fragment = $'Participant:'.concat(asBefore.name).concat('_').concat(ufi.trimExtension().segment(-1))$
		}
	}

	//Consumption
	fragment role Value {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			ufi = $Sequence{'org','reuseware','lib','systems','exchange','lib','Value.'.concat(format)}$
			port Consumer {
				$'value'$ = $type$
				$'name'$  = $asAfter.name.concat(type)$
				$'ID'$    = $ID$
				$'inSet'$    = $inSet$
			}
		}
	}
	association Contribution {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			-->
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
		}
	}	
	association Consume {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
			-->
			fragment = $'Participant:'.concat(asAfter.name).concat('_').concat(ufi.trimExtension().segment(-1))$
		}
	}
} 