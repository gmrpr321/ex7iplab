import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GrossSalaryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        int empId = Integer.parseInt(request.getParameter("empId"));
        double basicPay = Double.parseDouble(request.getParameter("basicPay"));
        double hra = Double.parseDouble(request.getParameter("hra"));
        
        double da = 0.5 * basicPay;
        double grossPay = basicPay + hra + da;
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Gross Salary Result</title></head>");
        out.println("<body>");
        out.println("<h1>Gross Salary Result</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Employee ID: " + empId + "</p>");
        out.println("<p>Basic Pay: " + basicPay + "</p>");
        out.println("<p>HRA: " + hra + "</p>");
        out.println("<p>DA: " + da + "</p>");
        out.println("<p>Gross Pay: " + grossPay + "</p>");
        out.println("</body></html>");
    }

}
