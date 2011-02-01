compositionlanguage org.reuseware.lib.systems.participation.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.participation.participation
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$
location = $outFolder$ {

	fragment role Participant {
		odftext::SpanType if $styleName = 'Actor'$ {
			fragment = $'Participant:'.concat(mixed->at(1).getValue().oclAsType(String)).concat('_').concat(ufi.trimExtension().segment(-1))$
			ufi = $Sequence{'org','reuseware','lib','systems','participation','lib','Participant.'.concat(format)}$
			port Name {
				$'name'$ = $mixed->at(1).getValue()$
			}
		}
	}	 
	association Participation {
		odftext::SpanType if $styleName = 'Actor'$ {
			fragment = $'Participant:'.concat(mixed->at(1).getValue().oclAsType(String)).concat('_').concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
		}
	}
}