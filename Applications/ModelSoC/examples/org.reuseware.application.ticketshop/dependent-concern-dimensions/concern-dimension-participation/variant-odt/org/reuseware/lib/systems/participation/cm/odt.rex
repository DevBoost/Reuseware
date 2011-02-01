componentmodel org.reuseware.lib.systems.participation.cm.odt
implements org.reuseware.lib.systems.participation.participation
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot { 

	fragment role Participant {
		port type Name {
			odftext::SpanType.mixed is value hook if $styleName = 'Actor'$ {
				mode = $'bind'$
				point = $'name'$
			}
		}
		port type Contrib {
			odftext::SpanType is prototype {}
		}
	}

	fragment role Collaboration {
		port type Rec {
			odftext::SpanType is hook if $styleName = 'Actor' and mixed->at(1).getValue() = 'ACTOR_SLOT'$ {
				remove = $true$
			}
		}
	}
} 