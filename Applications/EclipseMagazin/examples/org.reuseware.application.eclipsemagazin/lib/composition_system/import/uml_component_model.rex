// Ein 'Component Model' definiert welche Elemente in Modellen 
// w�hrend der Komposition modifiziert werden.
componentmodel composition_system.import.uml_component_model
// Es bezieht sich auf die in einer Fracol definierten Komponentenarten.
implements composition_system.import
// Au�erdem bezieht es sich auf das Ecore-Modell einer Sprache.
epackages <http://www.eclipse.org/uml2/3.0.0/UML> // Ecore-Model f�r UML
rootclass uml::Model { // Wurzelelement jedes UML Modells

  fragment role ImportingModel {
    port type ImportStatement {
      // In unserem Fall m�chten wir Import-Statements durch 'UML States'
      // definieren deren Namen mit dem Schl�sselwort 'import' beginnen.
      // Die Regeln (blau) werden mit OCL formuliert.
      uml::State is hook if $name.startsWith('import ')$ {
        port  = $name$ 
      }
    }
  }
  
  fragment role ModelComponent {
    port type Contents { 
      // In unserem Fall sollen alle 'UML States' die Kinder-Zust�nde
      // enthalten (eine nicht leere Region haben) als wiederverwendbare
      // Komponenten zur Verf�gung stehen.
      uml::State is prototype if $not region->isEmpty()$ {
        port = $'Contents'$
      }
    }
  }
}