package Employeepackages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/salaryInsertServlet")
public class salaryInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeid = request.getParameter("employeeid");
		int basic = Integer.parseInt(request.getParameter("basic"));
		int bonus = Integer.parseInt(request.getParameter("bonus"));
		int salary =   basic + bonus;                  
		String paydate = request.getParameter("paydate");
		
		boolean isTrue;
		isTrue = salaryController.insertsalary(employeeid, basic, bonus, salary, paydate);
		
		if(isTrue == true) {
						
			response.getWriter().println("<script> window.location.href='getAllSalaries' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("salary.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
