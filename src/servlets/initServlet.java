package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class initServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write( "init servlet" );
        Enumeration<String> enumeration = getServletConfig().getInitParameterNames();
        while( enumeration.hasMoreElements() )
        {
            String element = enumeration.nextElement();
            System.out.println( element + " " + getServletConfig().getInitParameter( element ) );
        }

        System.out.println( getServletContext().getInitParameter("email"));
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }
}
