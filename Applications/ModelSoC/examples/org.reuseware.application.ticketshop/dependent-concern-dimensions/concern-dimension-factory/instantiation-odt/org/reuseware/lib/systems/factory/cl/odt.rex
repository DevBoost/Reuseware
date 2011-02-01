compositionlanguage org.reuseware.lib.systems.factory.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.factory.factory
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$
location =  $outFolder$ {
	//Init Agents
	reference fragment role Factory {
		odftext::SpanType if $styleName = 'Actor'$ {
			fragment = $'Factory:'.concat(mixed->at(1).getValue().oclAsType(String))$
			//complex parameter - not from LIB
			ufi =  $ufi.replace('odt',format).trim(1).append(mixed->at(1).getValue().oclAsType(String).toLowerCase()).append(mixed->at(1).getValue().oclAsType(String).concat('Initialiser')).appendExtension(format)$
		}
	}
	association Produce {
		odftext::SpanType if $styleName = 'Actor'$ {
			fragment = $'Factory:'.concat(mixed->at(1).getValue().oclAsType(String))$
			-->
			fragment = $'Participant:'.concat(mixed->at(1).getValue().oclAsType(String)).concat('_').concat(ufi.trimExtension().segment(-1))$
		}
	}
} 