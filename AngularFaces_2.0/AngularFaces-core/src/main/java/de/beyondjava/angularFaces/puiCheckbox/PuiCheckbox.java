/**
 *  (C) 2013-2014 Stephan Rauh http://www.beyondjava.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.beyondjava.angularFaces.puiCheckbox;

import java.util.logging.Logger;

import javax.faces.component.*;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

import de.beyondjava.angularFaces.common.ILabel;

/**
 * PuiCheckbox is an Angular-aware input text field reading the JSR 303 annotations and providing a label and an error
 * message. Depending on the type of the bean attribute the field is displayed as type="number" or type="date".
 */
@FacesComponent("de.beyondjava.angularFaces.puiCheckbox.PuiCheckbox")
public class PuiCheckbox extends UIInput implements ILabel {
    private static final Logger LOGGER = Logger.getLogger("de.beyondjava.angularFaces.puiCheckbox.PuiCheckbox");

    static {
        LOGGER.info("AngularFaces component 'PuiCheckbox' is available for use.");
    }

    public PuiCheckbox() {
        LOGGER.info(getClass().getName() + " is initialized");
        LOGGER.info(getFamily());
        Renderer renderer = getRenderer(FacesContext.getCurrentInstance());
        LOGGER.info(renderer.getClass().getName());
    }

    /**
     * This method is not as superfluous as it seems. We need it to be able to call getStateHelper() in defender
     * methods.
     */
    @Override
    public StateHelper getStateHelper() {
        return super.getStateHelper();
    }
}
