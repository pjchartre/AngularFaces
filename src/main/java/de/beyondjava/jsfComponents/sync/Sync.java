package de.beyondjava.jsfComponents.sync;

import javax.faces.component.FacesComponent;

/**
 * Add AngularJS behaviour to a standard Primefaces InputText.
 * 
 * @author Stephan Rauh http://www.beyondjava.net
 * 
 */

@FacesComponent("de.beyondjava.Sync")
public class Sync extends org.primefaces.component.inputtext.InputText {
   public static final String COMPONENT_FAMILY = "org.primefaces.component";

   @Override
   public String getFamily() {
      return COMPONENT_FAMILY;
   }
}
