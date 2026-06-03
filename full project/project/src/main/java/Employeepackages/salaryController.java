package Employeepackages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class salaryController {
	
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	
	//insert salary
	
	public static boolean insertsalary(	String employeeid, int basic,int bonus,int salary, String paydate) {
		
		boolean isSuccess = false ;
		
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
						
			String sql = "insert into salary values (0,'"+employeeid+"','"+basic+"','"+bonus+"','"+salary+"','"+paydate+"')";
			int rs = stmt.executeUpdate(sql);
			
			
			
			
			
			
			if(rs > 0) {
				
				isSuccess = true;
				
			}else {
				
				isSuccess = false;
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return isSuccess ;
		
	}


	
	
	
//get  all salaries 	
	
	

	public static List<salaryModel> getAllsalaries (){
		
		ArrayList <salaryModel> salaries = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM salary";
			rs = stmt.executeQuery(sql);
			
			 
			while(rs.next()) {
				
				int salaryid = rs.getInt(1);
				String employeeid = rs.getString(2);
				int basic = rs.getInt(3);
				int bonus = rs.getInt(4);
				int salary = rs.getInt(5);
				String paydate = rs.getString(6);
				
				
				
				
				
				
				salaryModel sl = new salaryModel(salaryid,employeeid,basic,bonus,salary,paydate);
				salaries.add(sl);
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salaries;
	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	//delete salaries
	
	
	

	public static boolean deletesalary(int id) {
		
		
		
		boolean isSuccess = false ;
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "DELETE FROM salary WHERE salaryID = '"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
				
			}else {
				
				isSuccess = false;
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		return isSuccess ;
		
			
	}
	
	
	
	
	
	
	// update salary
	
	
public static boolean updatesalary(int salaryid, String employeeid, int basic, int bonus, int salary, String paydate) {
		
		
		try {
			
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "update salary set employeeID = '"+employeeid+"' , basicSalary = '"+basic+"', bonus = '"+bonus+"', salary = '"+salary+"', paydate = '"+paydate+"'  where salaryID = '"+salaryid+"'";

			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
				
			}else {
				
				isSuccess = false;
			}
			
			 
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	
	
	
	
// select one row
 	



	public static List<salaryModel> getsalary (int id){
		
		ArrayList <salaryModel> salaries = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM salary WHERE salaryID = '"+id+"'";
			rs = stmt.executeQuery(sql);
			
			 
			while(rs.next()) {
				
				int salaryid = rs.getInt(1);
				String employeeid = rs.getString(2);
				int basic = rs.getInt(3);
				int bonus = rs.getInt(4);
				int salary = rs.getInt(5);
				String paydate = rs.getString(6);
				
				
				
				salaryModel sl = new salaryModel(salaryid,employeeid,basic,bonus,salary,paydate);
				salaries.add(sl);
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salaries;
	
	}
	
	
	
	
	
	
	
	
	
}





















