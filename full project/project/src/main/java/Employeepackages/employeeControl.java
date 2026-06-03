package Employeepackages;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

public class employeeControl {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt =null;;
	private static ResultSet rs=null;
	
	public static boolean insertdata(String id, String name, int phone, String email,  String joindate, String department, String designation, String password) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into employees values ('"+id+"' , '"+name+"' , '"+phone+"' , '"+email+"' , '"+joindate+"' ,'"+department+"' , '"+designation+"' , '"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			
			else {
				isSuccess = false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
	//display
	
	public static List <employeesmodel> getid (String Id){
		
		
		
		ArrayList <employeesmodel> emp = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from employees where id= '"+Id+"' ";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int phone = rs.getInt(3);
				String email = rs.getString(4);
				String joindate = rs.getString(5);
				String department = rs.getString(6);
				String designation = rs.getString(7);
				String password = rs.getString(8);
				
				employeesmodel em = new employeesmodel(id,name,phone,email,joindate,department,designation,password);
				emp.add(em);
				
			}
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return emp;
		
	}
	
	public static List<employeesmodel> getAllemployee(){
		
		ArrayList <employeesmodel> emps = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from employees";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int phone = rs.getInt(3);
				String email = rs.getString(4);
				String joindate = rs.getString(5);
				String department = rs.getString(6);
				String designation = rs.getString(7);
				String password = rs.getString(8);
				
				employeesmodel em = new employeesmodel(id,name,phone,email,joindate,department,designation,password);
				emps.add(em);
				
			}
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return emps;
	}

	//update
	
	public static boolean updatedata(String id,String name,int phone,String email,String joindate,String department,String designation,String password) {
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			

			String sql = "update employees set id='"+id+"', name='"+name+"', phone='"+phone+"', email='"+email+"', joindate='"+joindate+"', department='"+department+"',  designation='"+designation+"', password='"+password+"' where id = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
			
		}
	
	//delete
	
	public static boolean deletedata(String id) {
		
		
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			

			String sql = "delete from employees where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
