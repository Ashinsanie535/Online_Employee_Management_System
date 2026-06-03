package Employeepackages;

public class salaryModel {
	
	int salaryid;
	String employeeid;
	int basic;
	int bonus;
	int salary;
	String paydate;
	
	public salaryModel(int salaryid, String employeeid, int basic, int bonus, int salary, String paydate) {
		super();
		this.salaryid = salaryid;
		this.employeeid = employeeid;
		this.basic = basic;
		this.bonus = bonus;
		this.salary = salary;
		this.paydate = paydate;
	}

	public int getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(int salaryid) {
		this.salaryid = salaryid;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPaydate() {
		return paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	
	
	
	
	
	
	

}
