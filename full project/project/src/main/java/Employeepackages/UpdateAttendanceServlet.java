package Employeepackages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateAttendanceServlet")
public class UpdateAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	      int attendanceid = Integer.parseInt(request.getParameter("attendanceid"));
	      String employeeid = request.getParameter("employeeid");
	      String date = request.getParameter("date");
	      String checkintime = request.getParameter("checkintime");
	      String leavetime = request.getParameter("leavetime");
		
		
		boolean isTrue;
		isTrue = attendanceController.updateAttendance(attendanceid,employeeid,date,checkintime,leavetime);
		
		
		
		if(isTrue == true) {
			
			
			
			List <attendanceModel> attend = attendanceController.getAttendance(attendanceid); 
			request.setAttribute("attend",attend);
						
			response.getWriter().println("<script>  window.location.href='attendanceShowServlet' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("attendance.jsp");
			dis2.forward(request, response);
			
		}
	

		
		
		
	}

}
