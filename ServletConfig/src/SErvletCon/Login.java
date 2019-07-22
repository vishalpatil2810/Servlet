package SErvletCon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends  HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		 
		PrintWriter pw =resp.getWriter();
		resp.setContentType("text/html");
		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		if(user.equals("vishal") && pass.equals("vishal"))
		pw.println("Login Succesful.........!!");
		else
			pw.println("Login Faild.....!");
		pw.close();
		
			
		
	
	
	
	}
	
	

}
