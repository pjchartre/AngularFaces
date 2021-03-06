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
package de.beyondjava.angularFaces.core;

import java.io.IOException;

import javax.faces.context.ResponseWriter;

public interface RendererUtils {
    /**
     * Checks whether an attibute is empty, and adds it to the HTML code if it's not.
     * 
     * @param writer
     * @param attributeValue
     * @param input
     * @param attibuteName
     *
     * @throws IOException
     */
    default public void renderNonEmptyAttribute(ResponseWriter writer, final String attributeName,
            final Object attributeValue) throws IOException {
        if (attributeValue != null) {
            writer.writeAttribute(attributeName, String.valueOf(attributeValue), attributeName);
        }
    }

}
