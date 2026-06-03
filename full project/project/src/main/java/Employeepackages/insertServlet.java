package Employeepackages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertServlet")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String notice = request.getParameter("notice");
		
		boolean isTrue;
		isTrue = noticesController.insertdata(notice);
		
		if(isTrue == true) {
						
			response.getWriter().println("<script> window.location.href='GetAllNotices' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("Notices.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
