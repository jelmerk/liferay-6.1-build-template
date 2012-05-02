package nl.orange11.portlet;

import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author Jelmer Kuperus
 */
public class TestPortlet extends MVCPortlet {

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {

        renderRequest.setAttribute("now", new Date());

        super.doView(renderRequest, renderResponse);
    }
}
