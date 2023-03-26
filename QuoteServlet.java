import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuoteServlet extends HttpServlet {
    
    private String[] quotes = {"Be yourself; everyone else is already taken.", 
            "You only live once, but if you do it right, once is enough.", 
            "Be the change that you wish to see in the world.", 
            "In three words I can sum up everything I've learned about life: it goes on.", 
            "If you want to live a happy life, tie it to a goal, not to people or things."};
    
    private Random random = new Random();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String quote = quotes[random.nextInt(quotes.length)];
        
        out.println("<html>");
        out.println("<head><title>Random Quote</title></head>");
        out.println("<body>");
        out.println("<h1>Random Quote</h1>");
        out.println("<p>" + quote + "</p>");
        out.println("</body></html>");
    }

}
