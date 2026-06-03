package Employeepackages;

public class employeesmodel {
	
	private String id;
	private String name;
	private int phone;
	private String email;
	private String joindate;
	private String department;
	private String designation;
	private String password;
	
	
	public employeesmodel(String id, String name, int phone, String email, String joindate, String department,
			String designation, String password) {
	
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.joindate = joindate;
		this.department = department;
		this.designation = designation;
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getJoindate() {
		return joindate;
	}


	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	

}