import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductAllController extends HttpServlet{

    private ProductDAO productDAO = new ProductMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("personDAO.getAll().size() = " + productDAO.getAll().size());
        req.setAttribute("productList", productDAO.getAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("t1.jsp");
        requestDispatcher.forward(req, resp);
    }
}
