package filter;

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/cookie")
public class NewFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("NewFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write( "NewFilter doFilter " );
        filterChain.doFilter( servletRequest, servletResponse );
    }

    @Override
    public void destroy() {
        System.out.println("NewFilter destroy");

    }
}
