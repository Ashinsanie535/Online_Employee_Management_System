package Employeepackages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class attendanceController {
	
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	
	
	
	// insert attendance data
	
	
	
	public static boolean insertAttendance(String employeeid,String date,String checkintime,String leavetime) {
		
		boolean isSuccess = false ;
		
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into attendance values(0,'"+employeeid+"','"+date+"','"+checkintime+"','"+leavetime+"')";
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

	
	
	
	//get  all attendance 	
		
		

		public static List<attendanceModel> getAllattendance (){
			
			ArrayList <attendanceModel> attend = new ArrayList<>();
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "SELECT * FROM attendance";
				rs = stmt.executeQuery(sql);
				
				 
				while(rs.next()) {
					
					int attendanceid = rs.getInt(1);
					String employeeid = rs.getString(2);
					String date = rs.getString(3);
					String checkintime = rs.getString(4);
					String leavetime = rs.getString(5);
					
					
	
					
					attendanceModel at = new attendanceModel(attendanceid, employeeid, date, checkintime, leavetime);
					attend.add(at);
					
				}
						
			} catch (Exception e) {
				e.printStackTrace();
			}
			return attend;
		
		}
			
		
		
	//update attendance	
		
		public static boolean updateAttendance(int attendanceid, String employeeid, String date, String checkintime, String leavetime) {
			
			
			try {
				
				
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "update attendance set employeeID = '"+employeeid+"' , date = '"+date+"', checkintime = '"+checkintime+"', leavetime = '"+leavetime+"'  where attendanceID = '"+attendanceid+"'";

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
	 	


		public static List<attendanceModel> getAttendance (int attendanceID){
			
			ArrayList <attendanceModel> attend = new ArrayList<>();
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "SELECT * FROM attendance where attendanceID = '"+attendanceID+"'";
				rs = stmt.executeQuery(sql);
				
				 
				while(rs.next()) {
					
					int attendanceid = rs.getInt(1);
					String employeeid = rs.getString(2);
					String date = rs.getString(3);
					String checkintime = rs.getString(4);
					String leavetime = rs.getString(5);
					
					
	
					
					attendanceModel at = new attendanceModel(attendanceid, employeeid, date, checkintime, leavetime);
					attend.add(at);
					
				}
						
			} catch (Exception e) {
				e.printStackTrace();
			}
			return attend;
		
		}
				
	
	
		
		
		// attendance delete
		
		
		
		
	
		public static boolean deleteAttendance(int id) {
			
			
			
			boolean isSuccess = false ;
			
			try {
				
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "DELETE FROM attendance WHERE attendanceID = '"+id+"'";
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
