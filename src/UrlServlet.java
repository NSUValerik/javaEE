import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/url")
public class UrlServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
        System.out.println("post header");
        Enumeration<String> enumeration = req.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element + " = " + req.getHeader(element));
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Enumeration<String> enumeration = req.getParameterNames();
        System.out.println("getParameterNames");
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element + " = " + req.getParameter(element));
        }

        System.out.println("getParameterMap");
        Map<String, String[]> map = req.getParameterMap();
        for (String s : map.keySet()) {
            System.out.println(s + "" + Arrays.toString(map.get(s)));
        }

/*
        System.out.println(req.getAuthType());
        System.out.println(req.getContextPath());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getMethod());
        System.out.println(req.getServletPath());
        System.out.println(req.getLocalAddr());
        System.out.println(req.getLocalPort());
        System.out.println(req.getQueryString());
        System.out.println(req.getContentType());
*/

        System.out.println("get header");
        Enumeration<String> enumerationHeader = req.getHeaderNames();
        while (enumerationHeader.hasMoreElements()) {
            String element = enumerationHeader.nextElement();
            System.out.println(element + " = " + req.getHeader(element));
        }

        String area = req.getParameter("area");
        area = area == null ? null : area.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(
                "<html>" +
                        "<head>It's a head</head>" +
                        "<body>" +
                        "<h3>param1 = " + req.getParameter("param1") + "</h3>" +
                        "<h3>param2 = " + req.getParameter("param2") + "</h3>" +
                        "area = " + area +
                        "<form action='url' method='post'>" +
                        "<input type='text' name='param1'/>" +
                        "<input type='text' name='param2'/>" +
                        "<textarea name='area'></textarea>" +
                        "<input type='submit' name='submit'/>" +
                        "</form>" +
                        "</body>" +
                        "</html>");
    }
}
