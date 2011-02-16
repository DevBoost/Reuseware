// Ein 'Component Model' definiert welche Elemente in Modellen 
// während der Komposition modifiziert werden.
componentmodel composition_system.import.uml_component_model
// Es bezieht sich auf die in einer Fracol definierten Komponentenarten.
implements composition_system.import
// Außerdem bezieht es sich auf das Ecore-Modell einer Sprache.
epackages <http://www.eclipse.org/uml2/3.0.0/UML> // Ecore-Model für UML
rootclass uml::Model { // Wurzelelement jedes UML Modells

  fragment role ImportingModel {
    port type ImportStatement {
      // In unserem Fall möchten wir Import-Statements durch 'UML States'
      // definieren deren Namen mit dem Schlüsselwort 'import' beginnen.
      // Die Regeln (blau) werden mit OCL formuliert.
      uml::State is hook if $name.startsWith('import ')$ {
        port  = $name$ 
      }
    }
  }
  
  fragment role ModelComponent {
    port type Contents { 
      // In unserem Fall sollen alle 'UML States' die Kinder-Zustände
      // enthalten (eine nicht leere Region haben) als wiederverwendbare
      // Komponenten zur Verfügung stehen.
      uml::State is prototype if $not region->isEmpty()$ {
        port = $'Contents'$
      }
    }
  }
}