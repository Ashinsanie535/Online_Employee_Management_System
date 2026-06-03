package Employeepackages;

public class employeeModel {
	
	
	String ID;
	String Password;
	


	public employeeModel(String iD, String password) {
		super();
		this.ID = iD;
		this.Password = password;
		
		
		
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	

}
