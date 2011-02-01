compositionlanguage org.reuseware.lib.systems.app.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.app.app
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$
location = $outFolder$
{ 
	fragment role Main {
		odfoffice::DocumentRoot { 
			fragment = $'APP_CORE'$
			ufi = $Sequence{'org','reuseware','lib','systems','app','lib','Main.'.concat(format)}$
			target ufi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append(ufi.segment(-4).substring(1,1).toUpperCase().concat(ufi.segment(-4).substring(2,ufi.segment(-4).length()))).appendExtension(format)$
			port Name {
				$'name'$ = $ufi.segment(-4).substring(1,1).toUpperCase().concat(ufi.segment(-4).substring(2,ufi.segment(-4).length()))$
			}
		}
	}

	fragment role Execution {
		odfoffice::DocumentRoot {
			fragment = $'Execution:'.concat(ufi.trimExtension().segment(-1))$
			ufi = $Sequence{'org','reuseware','lib','systems','app','lib','Execution.'.concat(format)}$
		}
	}

	association Execute {
		odfoffice::DocumentRoot {
			fragment = $'Execution:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'APP_CORE'$
		}
	}

	association AddExecutable {
		odfoffice::DocumentRoot {
			fragment = $'Execution:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
		}
	}
}