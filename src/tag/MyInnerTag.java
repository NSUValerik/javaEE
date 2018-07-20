package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyInnerTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        MyTag tag = (MyTag) findAncestorWithClass( this, MyTag.class );
        getJspContext().getOut().print( "INNER TAG " + tag.getParam() );
    }
}
