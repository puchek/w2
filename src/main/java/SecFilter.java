import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Aleksey on 17.08.2014.
 */
public class SecFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        System.out.println("request.getRequestURI() = " + request.getRequestURI());

        if (request.getRequestURI().equals("/login.do")) {
            System.out.println("will pass");
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        User userId = (User) request.getAttribute("USER_ID");
        if (userId == null) {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.do");
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.sendRedirect("login.do");
        } else
        {
            filterChain.doFilter(servletRequest,servletResponse);
        }


    }

    @Override
    public void destroy() {

    }
}
