import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/synch")
public class SynchronizedServlet extends HttpServlet /*implements SingleThreadModel*/ {
    private int i = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        synchronized (this)
        {
            for (int j = 0; j < 1_000_000; j++) {
                this.i++;
            }
        }
        System.out.println(i);
        System.out.println(Thread.currentThread());
    }
}