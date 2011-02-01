compositionlanguage org.reuseware.lib.systems.usecase.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.usecase.usecase
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$ 
location = $outFolder$ { 

	fragment role UseCase {
		odfoffice::DocumentRoot { 
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
			ufi = $Sequence{'org','reuseware','lib','systems','usecase','lib','UseCase.'.concat(format)}$
			target ufi = $ufi.replace('fragments','integrated').replace('odt',format).trimExtension().appendExtension(format)$
			target location = $outFolder$
			port Name {
				$'name'$ = $ufi.trimExtension().segment(-1)$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('odt',format).trim(1)$
			}		
		}
	}
}