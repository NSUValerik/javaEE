package filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("Filter doFilter ");
        filterChain.doFilter( servletRequest, servletResponse );
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy");

    }
}
