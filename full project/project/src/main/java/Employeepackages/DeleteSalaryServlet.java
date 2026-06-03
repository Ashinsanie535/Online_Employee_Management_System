package Employeepackages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteSalaryServlet")
public class DeleteSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int salaryID = Integer.parseInt(request.getParameter("salaryid"));
		boolean isTrue;
		
		isTrue = salaryController.deletesalary(salaryID);
		
		
		if(isTrue == true) {
				
			
			response.getWriter().println("<script>  window.location.href='getAllSalaries' </script> ");
			
		}else {
			
			String alertMessage = "Delete not successful";
			response.getWriter().println("<script>  alert('"+alertMessage+"'); window.location.href='GetAllNotices' </script> ");
			
		}
	}

}
