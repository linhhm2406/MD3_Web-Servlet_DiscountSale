import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountManagementServlet", urlPatterns = "/calculator")
public class DiscountManagementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String des = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        double afterDiscount = listPrice-(listPrice*percent*.01);

        printWriter.println("<html>");
        printWriter.println("<p>Product Description : " + des + "</p>");
        printWriter.println("<p>List Price : " + listPrice + "</p>");
        printWriter.println("<p>Discount Percent : " + percent + "%</p>");
        printWriter.println("<p>Price After Discount : " + afterDiscount + "</p>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
