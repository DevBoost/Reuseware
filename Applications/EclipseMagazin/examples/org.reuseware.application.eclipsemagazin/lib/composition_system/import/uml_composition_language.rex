// Eine 'Composition Language' definiert welche Komponenten an welchen
// Stellen (Ports) komponiert werden sollen.
compositionlanguage composition_system.import.uml_composition_language
implements composition_system.import
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass uml::Model if $not (ufi.segment(-2) = 'composed')$
ucpi = $ufi.trimExtension().appendExtension('ucl')$ 
location = $'models-composed'$ {

  fragment role ImportingModel {
    uml::Model {
      fragment = $ufi$
      // Die ID (ufi) eines importierenden Modells.
      ufi = $ufi$
      // Wie ist die ID (ufi) des zugehörigen komponierten Modells?
      target ufi = $ufi.trim(1).append('composed').append(ufi.segment(-1))$
      // In welchem Ordner sollen komponierte Modelle abgelegt werden?
      target location = $'models-composed'$
    }
  }

  fragment role ModelComponent {
    uml::State if $name.startsWith('import ')$ {
      fragment = $name$
      // die ID der zu importierenden Komponente extrahieren wir aus 
      // dem Namen des Zustandes.
      ufi = $name.substring(
      'import '.length()+1, name.length()).split('/')$
    }
  }
  
  association Import {
    uml::State if $name.startsWith('import ')$ {
      fragment = $name$
      port = $'Contents'$
      -->
      fragment = $ufi$
      port = $name$
    }
  }
}