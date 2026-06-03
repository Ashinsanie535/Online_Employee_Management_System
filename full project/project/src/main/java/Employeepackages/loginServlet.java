package Employeepackages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			
			List<employeeModel> userlogin = loginController.loginValidate(id, password);
			
			if(userlogin != null && !userlogin.isEmpty()) {
				
				response.getWriter().println("<script>  window.location.href='homepage.jsp' </script> ");
				
			}else {
				String alert = "Your Employee ID or Password is incorrect";
				response.getWriter().println("<script> alert('"+alert+"');  window.location.href='Login.jsp' </script> ");
				
			}
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
