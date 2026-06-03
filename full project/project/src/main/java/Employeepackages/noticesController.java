package Employeepackages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class noticesController {
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	
	
	
	
	// insert data
	
	
	
	public static boolean insertdata(String notice) {
		
		boolean isSuccess = false ;
		
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO notices values (0 , '"+notice+"')";
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

	
	
	
	
	
	
	
	// select one row
	
	
	public static List<noticeModel> getById (String id){
		
		int convertedID = Integer.parseInt(id);
		
		ArrayList <noticeModel> notices = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM notices WHERE ID = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			 
			while(rs.next()) {
				
				int ID = rs.getInt(1);
				String notice = rs.getString(2);
				
				noticeModel NM = new noticeModel(ID,notice);
				notices.add(NM);
				
				
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notices;
	}
	
	
	
	
	//select all rows
	
	
	
	public static List<noticeModel> getAllnotices (){
		
		ArrayList <noticeModel> notices = new ArrayList<>();
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM notices";
			rs = stmt.executeQuery(sql);
			
			 
			while(rs.next()) {
				
				int ID = rs.getInt(1);
				String notice = rs.getString(2);
				
				noticeModel NM = new noticeModel(ID,notice);
				notices.add(NM);
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notices;
	
	}
	
	
	
	
	// update a row
	
	
	
	public static boolean updatedata(String id ,String notice) {
		
		
		try {
			
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "UPDATE notices SET Notices = '"+notice+"' WHERE ID = '"+id+"'";

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
	
	
	
	
	// Delete a row
	
	
	public static boolean deletedata(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		boolean isSuccess = false ;
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "DELETE FROM notices WHERE ID = '"+id+"'";
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
	
	
	
	
	
	
	
	
	
	
}
