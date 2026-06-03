package Employeepackages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertAccounts")
public class insertAccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		String joindate = request.getParameter("joindate");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = employeeControl.insertdata(id,name, phone, email, joindate, department, designation, password);
		
		if (isTrue == true) {
			response.getWriter().println("<script>window.location.href='showAllAccounts'</script> ");
				
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
	}

}
