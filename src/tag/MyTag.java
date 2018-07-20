package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyTag extends SimpleTagSupport {
    private String param;


    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute( "param_context", "some_value" );
        JspWriter jspWriter = getJspContext().getOut();
        jspWriter.print("Hello tag<br/>");
        jspWriter.print("myParam = " + param + "<br/>");
        jspWriter.print("<b>");
        getJspBody().invoke( jspWriter );
        jspWriter.print("</b>");
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
