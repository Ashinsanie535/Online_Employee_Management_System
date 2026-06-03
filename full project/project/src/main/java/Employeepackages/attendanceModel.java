package Employeepackages;

public class attendanceModel {
	
	int attendanceid;
	String employeeid;
	String date;
	String checkintime;
	String leavetime;
	
	public attendanceModel(int attendanceid, String employeeid, String date, String checkintime, String leavetime) {
		super();
		this.attendanceid = attendanceid;
		this.employeeid = employeeid;
		this.date = date;
		this.checkintime = checkintime;
		this.leavetime = leavetime;
	}
	public int getAttendanceid() {
		return attendanceid;
	}
	public void setAttendanceid(int attendanceid) {
		this.attendanceid = attendanceid;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}
	public String getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(String leavetime) {
		this.leavetime = leavetime;
	}
	
	


	
	
	
	
	
	

}
