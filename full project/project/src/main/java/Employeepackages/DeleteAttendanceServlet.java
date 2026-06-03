package Employeepackages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteAttendanceServlet")
public class DeleteAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int attendanceid = Integer.parseInt(request.getParameter("attendanceid"));
		boolean isTrue;
		
		isTrue = attendanceController.deleteAttendance(attendanceid);
		
		
		if(isTrue == true) {
				
			
			response.getWriter().println("<script>  window.location.href='attendanceShowServlet' </script> ");
			
		}else {
			
			String alertMessage = "Delete not successful";
			response.getWriter().println("<script>  alert('"+alertMessage+"'); window.location.href='attendanceShowServlet' </script> ");
			
		}
	}

}
