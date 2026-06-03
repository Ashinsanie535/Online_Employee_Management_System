package Employeepackages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class loginController {
	
	

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
// login validate
	
	
	public static List<employeeModel> loginValidate(String ID, String Password){
		
		ArrayList<employeeModel> user = new ArrayList<>();
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select id , password from employees WHERE id = '"+ID+"' AND password = '"+Password+"'";
			rs = stmt.executeQuery(sql);
			

			if(rs.next()) {
				
				String id = rs.getString(1);
				String pass = rs.getString(2);
				
				
				employeeModel M = new employeeModel (id , pass);
				user.add(M);
	
				
			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
