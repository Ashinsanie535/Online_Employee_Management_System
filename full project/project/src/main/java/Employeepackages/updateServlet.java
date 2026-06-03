package Employeepackages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("ID");
		String notice = request.getParameter("notice");
		
		boolean isTrue;
		isTrue = noticesController.updatedata(ID, notice); //
		
		
		
		if(isTrue == true) {
			
			
			
			List <noticeModel> notices = noticesController.getById(ID);
			request.setAttribute("notices",notices);
						
			response.getWriter().println("<script>  window.location.href='GetAllNotices' </script> ");
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("Notices.jsp");
			dis2.forward(request, response);
			
		}
		
		
		
	}

}
