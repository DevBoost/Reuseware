compositionlanguage org.reuseware.lib.systems.exchange.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$
location =  $outFolder$ {

	//Provision
	fragment role Value {
		Comment if $_body.contains('before')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			ufi = $Sequence{'org','reuseware','lib','systems','exchange','lib','Value.'.concat(format)}$
			port Provider {
				$'value'$ = $_body.split(' ')->at(1)$
				$'name'$  = $_body.split(' ')->at(1).concat('_').concat(_body.split(' ')->at(2))$
				$'ID'$    = $_body.split(' ')->at(2)$
				$'inSet'$    = $_body.contains('inSet')$
			}
		}
	}
	association Contribution {
		Comment if $_body.contains('before')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			-->
			fragment = $'UseCase:'.concat(ufi.segment(-2))$
		}
	}		
	association Provide {
		Comment if $_body.contains('before')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			-->
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
		}
	}

	//Consumption
	fragment role Value {
		Comment if $_body.contains('after')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			ufi = $Sequence{'org','reuseware','lib','systems','exchange','lib','Value.'.concat(format)}$
			port Consumer {
				$'value'$ = $_body.split(' ')->at(1)$
				$'name'$  = $_body.split(' ')->at(1).concat('_').concat(_body.split(' ')->at(2))$
				$'ID'$    = $_body.split(' ')->at(2)$
				$'inSet'$    = $_body.contains('inSet')$
			}
		}
	}
	association Contribution {
		Comment if $_body.contains('after')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			-->
			fragment = $'UseCase:'.concat(ufi.segment(-2))$
		}
	}	
	association Consume {
		Comment if $_body.contains('after')$ {
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
			-->
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
		}
	}
} 