import beans.Model;
import beans.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/myContr")
public class MyController extends HttpServlet {
    private Model model = new Model();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = model.getPerson();
        req.setAttribute("Person", person);
//        req.getSession().setAttribute( "Person", person );
//        req.getServletContext().setAttribute("Person", person);

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("list");
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/view.jsp");
        requestDispatcher.forward( req, resp );
    }
}
