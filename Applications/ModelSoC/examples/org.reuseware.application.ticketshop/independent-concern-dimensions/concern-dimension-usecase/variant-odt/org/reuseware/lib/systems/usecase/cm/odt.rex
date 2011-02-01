componentmodel org.reuseware.lib.systems.usecase.cm.odt
implements org.reuseware.lib.systems.usecase.usecase
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot {

	fragment role UseCase {
		port type Name {
			odftext::PType.mixed is value hook if $mixed->size() = 1 and mixed->at(1).getValue() = 'NAME_SLOT'$ {
				mode = $'bind'$
				point = $'name'$
			}
		}
	}
}