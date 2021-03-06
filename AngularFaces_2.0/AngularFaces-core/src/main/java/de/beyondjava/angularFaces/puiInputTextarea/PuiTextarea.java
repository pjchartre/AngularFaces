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
package de.beyondjava.angularFaces.puiInputTextarea;

import java.util.logging.Logger;

import javax.faces.component.*;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

import de.beyondjava.angularFaces.common.ILabel;

/**
 * PuiInputTextare is an Angular-aware input textarea field reading the JSR 303 annotations and providing a label and an
 * error message.
 */
@FacesComponent("de.beyondjava.angularFaces.puiInput.PuiTextarea")
public class PuiTextarea extends UIInput implements ILabel {
    enum propertyKeys {
        value
    }

    private static final Logger LOGGER = Logger.getLogger("de.beyondjava.angularFaces.puiInput.PuiTextArea");

    static {
        LOGGER.info("AngularFaces component 'PuiTextArea' is available for use.");
    }

    /**
     *
     */
    public PuiTextarea() {
        LOGGER.info(getClass().getName() + " is initialized");
        setRendererType("de.beyondjava.angularFaces.puiInputTextArea.PuiTextArea");
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
