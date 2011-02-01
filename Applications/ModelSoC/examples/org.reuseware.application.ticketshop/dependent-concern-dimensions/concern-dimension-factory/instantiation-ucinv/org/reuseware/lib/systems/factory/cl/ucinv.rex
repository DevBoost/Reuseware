compositionlanguage org.reuseware.lib.systems.factory.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.factory.factory
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location =  $outFolder$ {

	//Counter Actors
	reference fragment role Factory {
		CounterActor {
			fragment = $'Factory:'.concat(name)$
			//complex parameter - not from LIB
			ufi =  $ufi.replace('ucinv',format).trim(1).append(name.toLowerCase()).append(name.concat('Initialiser')).appendExtension(format)$
		}
	}
	association Produce {
		CounterActor {
			fragment = $'Factory:'.concat(name)$
			-->
			fragment = $'Participant:'.concat(name).concat('_').concat(ufi.trimExtension().segment(-1))$
		}		
	}

	//Produce & Consume Values
	reference fragment role Factory {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Factory:'.concat(type).concat('_').concat(ID).concat('Producer')$
			//complex parameter - not from LIB
			ufi =  $ufi.replace('ucinv',format).trim(1).append(eContainer().oclAsType(Actor).name.toLowerCase()).append('Produce'.concat(type)).appendExtension(format)$
		}
	}
	reference fragment role Factory {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Factory:'.concat(type).concat('_').concat(ID).concat('Consumer')$
			//complex parameter - not from LIB
			ufi =  $ufi.replace('ucinv',format).trim(1).append(eContainer().oclAsType(Actor).name.toLowerCase()).append('Consume'.concat(type)).appendExtension(format)$
		}
	}

	association Produce1 {
		Value if $not asBefore.oclIsUndefined()$ {
			fragment = $'Factory:'.concat(type).concat('_').concat(ID).concat('Producer')$
			-->
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
		}
	}
	association Produce2 {
		Value if $not asAfter.oclIsUndefined()$ {
			fragment = $'Factory:'.concat(type).concat('_').concat(ID).concat('Consumer')$
			-->
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
		}		
	}
} 