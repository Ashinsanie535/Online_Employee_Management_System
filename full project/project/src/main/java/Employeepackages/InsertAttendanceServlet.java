package Employeepackages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertAttendanceServlet")
public class InsertAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeid = request.getParameter("employeeid");
		String date = request.getParameter("date");
		String checkintime= request.getParameter("checkintime");
		String leavetime= request.getParameter("leavetime");
		
		boolean isTrue;
		isTrue = attendanceController.insertAttendance(employeeid, date, checkintime, leavetime);
		
		if(isTrue == true) {
						
			response.getWriter().println("<script> window.location.href='attendanceShowServlet' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("attendanceinsert.jsp");
			dis2.forward(request, response);
		}
		
	}

}
