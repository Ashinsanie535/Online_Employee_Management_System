package Employeepackages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("ID");
		boolean isTrue;
		
		isTrue = noticesController.deletedata(ID);
		
		
		if(isTrue == true) {
				
			
			response.getWriter().println("<script>  window.location.href='GetAllNotices' </script> ");
			
		}else {
			
			String alertMessage = "Delete not successful";
			response.getWriter().println("<script>  alert('"+alertMessage+"'); window.location.href='GetAllNotices' </script> ");
			
		}
		
	}

}
