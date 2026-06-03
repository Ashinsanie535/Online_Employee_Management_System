package Employeepackages;

public class noticeModel {
	
	private int ID;
	private String notice;
	
	
	public noticeModel(int iD, String notice) {
		super();
		ID = iD;
		this.notice = notice;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNotice() {
		return notice;
	}


	public void setNotice(String notice) {
		this.notice = notice;
	}
	
	
	

}
