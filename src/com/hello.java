import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int c;
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		String initValue = config.getInitParameter("initial");
		try{
		c = Integer.parseInt(initValue);
		}
		catch(NumberFormatException e){
		c = 0;
		}}
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		c++;
		pw.println("Since loading this servlet has been accessed" + c + "times");
		}

}