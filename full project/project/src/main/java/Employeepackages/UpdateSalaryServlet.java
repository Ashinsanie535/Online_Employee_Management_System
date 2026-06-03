package Employeepackages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateSalaryServlet")
public class UpdateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int salaryid = Integer.parseInt(request.getParameter("salaryid"));
		String employeeid = request.getParameter("employeeid");
		int basic = Integer.parseInt(request.getParameter("basic"));
		int bonus = Integer.parseInt(request.getParameter("bonus"));
		int salary =  basic + bonus;
		String paydate = request.getParameter("paydate");
		
		
		boolean isTrue;
		isTrue = salaryController.updatesalary(salaryid,employeeid,basic,bonus,salary,paydate);
		
		
		
		if(isTrue == true) {
			
			
			
			List <salaryModel> salaries = salaryController.getsalary(salaryid);
			request.setAttribute("salaries",salaries);
						
			response.getWriter().println("<script>  window.location.href='getAllSalaries' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("salary.jsp");
			dis2.forward(request, response);
			
		}
	}

}
