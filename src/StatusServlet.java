import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.sendError( HttpServletResponse.SC_BAD_REQUEST, "lalala" );
//        resp.setStatus( HttpServletResponse.SC_FOUND );
//        resp.sendRedirect( "/javaEE/hello" );
          resp.setHeader( "Refresh", "3;URL=http://google.com" );
    }
}
