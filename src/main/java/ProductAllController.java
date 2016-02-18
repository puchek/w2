import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

public class ProductAllController extends HttpServlet{
    private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MiscUtils.getClassName());

    private ProductDAO productDAO = new ProductMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.trace("logger name = " + MiscUtils.getClassName());
        logger.trace(" === Servlet init Parameters === "  );

        ServletConfig servletConfig = this.getServletConfig();
        Enumeration<String> parameterNames = servletConfig.getInitParameterNames();
        for (String k : Collections.list(parameterNames)) {
           logger.trace("Key: " + k + ": value: " + servletConfig.getInitParameter(k) );
        }


        HttpSession session = req.getSession();

//        logger.trace(" === Context Parameter === ");
//        ServletContext servletContext = this.getServletContext();
//        for (String k: Collections.list(servletContext.getAttributeNames())) {
//            logger.trace("key: " + k + "; value: " + servletContext.getAttribute(k));
//        }


        logger.trace(" == request attributes ===");
        for (String k: Collections.list(req.getAttributeNames())) {
            logger.trace("key: " + k + "; value: " + req.getAttribute(k));
        }

        System.out.println("personDAO.getAll().size() = " + productDAO.getAll().size());
        req.setAttribute("productList", productDAO.getAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("t1.jsp");
        requestDispatcher.forward(req, resp);


    }


}
