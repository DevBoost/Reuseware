compositionlanguage org.reuseware.lib.systems.factory.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.factory.factory
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$
location = $outFolder$ {
	reference fragment role Factory {
		Actor {
			fragment = $'Factory:'.concat(ufi.trimExtension().segment(-1))$
			ufi =  $ufi.replace('usecase.uml',format).trim(2).append(name.toLowerCase()).append(name.concat('Initialiser')).appendExtension(format)$
		}
	}
	association Produce {
		Actor {
			fragment = $'Factory:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
		}
	}

	reference fragment role Factory {
		Comment if $_body.contains('before')$ {
			fragment = $'Factory:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2)).concat('Producer')$
			ufi =  $ufi.replace('usecase.uml',format).trim(2).append(ufi.trimExtension().segment(-1).toLowerCase()).append('Produce'.concat(_body.split(' ')->at(1))).appendExtension(format)$
		}
	}
	reference fragment role Factory {
		Comment if $_body.contains('after')$ {
			fragment = $'Factory:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2)).concat('Consumer')$
			ufi =  $ufi.replace('usecase.uml',format).trim(2).append(ufi.trimExtension().segment(-1).toLowerCase()).append('Consume'.concat(_body.split(' ')->at(1))).appendExtension(format)$
		}
	}

	association Produce1 {
		Comment if $_body.contains('before')$ {
			fragment = $'Factory:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2)).concat('Producer')$
			-->
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
		}
	}
	association Produce2 {
		Comment if $_body.contains('after')$ {
			fragment = $'Factory:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2)).concat('Consumer')$
			-->
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
		}
	}
} 