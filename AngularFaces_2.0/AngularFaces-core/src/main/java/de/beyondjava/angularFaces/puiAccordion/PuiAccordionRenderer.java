package de.beyondjava.angularFaces.puiAccordion;

import java.io.IOException;
import java.util.logging.Logger;

import javax.faces.component.UIComponent;
import javax.faces.context.*;
import javax.faces.render.*;

import de.beyondjava.angularFaces.core.RendererUtils;

/**
 * The pui-accordion component is a panel group that can be shrinked to a single line. Typically, there are multiple
 * accordions on a dialog, and expanding one of them hides the other ones.
 */
@FacesRenderer(componentFamily = "javax.faces.Output", rendererType = "de.beyondjava.angularFaces.puiAccordion.PuiAccordion")
public class PuiAccordionRenderer extends Renderer implements RendererUtils {
    private static final Logger LOGGER = Logger.getLogger("de.beyondjava.angularFaces.puiAccordion.PuiAccordion");

    static {
        LOGGER.info("AngularFaces renderer of 'PuiAccordion' is available for use.");
    }

    public PuiAccordionRenderer() {
        LOGGER.info(getClass().getName() + " is being initialized");
    }

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        super.encodeBegin(context, component);
        ResponseWriter writer = context.getResponseWriter();
        PuiAccordion tab = (PuiAccordion) component;
        writer.startElement("pui-accordion", component);
        renderNonEmptyAttribute(writer, "header", tab.getHeader());
        String collapsed = tab.getCollapsed();
        if (null == collapsed) {
            collapsed = "true";
        }
        renderNonEmptyAttribute(writer, "collapsed", collapsed);
        renderNonEmptyAttribute(writer, "toggleable", tab.getToggleable());
        renderNonEmptyAttribute(writer, "toggleOrientation", tab.getToggleOrientation());
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        super.encodeEnd(context, component);
        writer.endElement("pui-accordion");
    }

};
