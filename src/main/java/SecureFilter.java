import org.apache.log4j.Logger;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class SecureFilter implements Filter {

    private final Logger logger = Logger.getLogger(MiscUtils.getClassName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.trace("reading init parameters");

        for (String key: Collections.list(filterConfig.getInitParameterNames())) {
            String value = filterConfig.getInitParameter(key);
            logger.trace("key   : " + key);
            logger.trace("value : " + value);
        }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//
//        System.out.println("request.getRequestURI() = " + request.getRequestURI());
//
//        if (request.getRequestURI().equals("/login.do")) {
//            System.out.println("will pass");
//
//            filterChain.doFilter(servletRequest,servletResponse);
//            return;
//        }
//
//        User userId = (User) request.getAttribute("USER_ID");
//        if (userId == null) {
////            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.do");
//            HttpServletResponse response = (HttpServletResponse) servletResponse;
//            response.sendRedirect("login.do");
//        } else
//        {
//            filterChain.doFilter(servletRequest,servletResponse);
//        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
