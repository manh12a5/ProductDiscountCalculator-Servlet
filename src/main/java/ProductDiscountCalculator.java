import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/home")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));

        float discount = price * (percent / 100);
        float totalPrice = price - discount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + "So tien duoc giam: " + "</h1>");
        writer.println("<h1>" + discount + "</h1>");
        writer.println("<h1>" + "Tong tien phai tra la: " + "</h1>");
        writer.println("<h1>" + totalPrice + "</h1>");
        writer.println("</html>");
    }

}
