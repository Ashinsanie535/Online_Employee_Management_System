<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>



	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	String joindate = request.getParameter("joindate");
	String department = request.getParameter("department");
	String designation = request.getParameter("designation");
	String password = request.getParameter("password");
	
	%>

<style>
body {
	font-family: 'Open Sans', sans-serif;
	background-image: linear-gradient(to right, rgba(0, 0, 0, 0.73), rgba(255, 254, 254, 0)), 
	url('images/bg2.jpeg');
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
	background-attachment: fixed;	

	
}
nav{

	position:relative;
	height: 50px;
	font-size: 0;
  	display: flex;            
 	justify-content: flex-end; 	
}
nav a{
	font-size: 15px;
	text-transform: uppercase;
	color: white;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
	text-decoration: none;
	line-height: 50px;
	position: relative;
	z-index: 1;
	display: inline-block;
	text-align: center;
}
nav .animation{
	position: absolute;
	height: 100%;
	top: 0;
	z-index: 0;
	background: #00ff086a;
	box-shadow: 1px 2px 3px 0px rgba(0,0,0,1);
	border-radius: 8px;
	transition: all .5s ease 0s;
}
nav a:nth-child(1){
	width: 100px;
}
nav  a:nth-child(1):hover~.animation{
	width: 100px;
	right: 560px;
}
nav a:nth-child(2){
	width: 160px;
}
nav a:nth-child(2):hover~.animation{
	width: 160px;
	right: 400px;
}
nav a:nth-child(3){
	width: 120px;
}
nav a:nth-child(3):hover~.animation{
	width: 120px;
	right: 280px;
}
nav a:nth-child(4){
	width: 140px;
}
nav a:nth-child(4):hover~.animation{
	width: 140px;
	right: 140px;
}
nav a:nth-child(5){
	width: 140px;
}
nav .start-home, a:nth-child(5):hover~.animation{
	width: 140px;
	right: 0px;
}
.navigationBar{
  width: 100%; 
  border-radius: 10px;
  box-shadow: 1px 2px 3px 0px rgba(0,0,0,1);
  background-color: rgba(255, 255, 255, 0.114);
  backdrop-filter: blur(5px);
  align-content: center;
}
.header{

  background-color: rgba(204, 52, 29, 0);
  width: 100%;
  height: 250px;
}
.header1{
  background-color: rgba(42, 165, 65, 0);
  width: 100%;
  height: 200px;
  display: flex;
  margin-top: 0px;

}
.logo{
	height: 100%;
	width: 200px;
	float: left;
}
.Cname{
	height: 100%;
	align-content: center;
	margin: 0 auto;
	color: rgb(255, 255, 255);
	font-size: 25px;
	text-shadow: 4px 4px 4px rgba(0, 0, 0, 0.5);
	font-family: serif;
}
.profileIcon{
	height: 100%;
	width: 150px;
	float: right;
	align-content: center;
	
}
.mainBody{

	height: 100%;
	width: 100%;
	background-color: rgba(0, 0, 255, 0);
}
.menu-button {
      font-size: 24px;
      cursor: pointer;
	  float: left;
	  margin-left: 20px;
	  margin-top: 8px;
    }
.sidebar {
      position: absolute; 
      left: -350px;
      width: 250px;
      height: 750px;
	  border-radius: 10px;
 	  box-shadow: 1px 2px 3px 0px rgba(0,0,0,1);
 	  background-color: rgba(255, 255, 255, 0);
 	  backdrop-filter: blur(5px);
      color: white;
      padding: 24px;
      transition: left 0.3s ease-in-out;
      z-index: 50;	  
}
.sidebar.active {
      left: 0;
	  
}
.sidebar .link {
      display: block;
      padding: 12px;
      color: white;
	  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
	  text-decoration: none;     
}
.sidebar .link:hover {
      background-color: #00ff086a;
	  box-shadow: 1px 2px 3px 0px rgba(0,0,0,1);
	  border-radius: 10px;
	  backdrop-filter: blur(2px);
}

    .form-employee {
      background-color: rgba(255,255,255,0.3);
      padding: 30px;
      border-radius: 10px;
      color: black;
      width: 850px;
      position: absolute;
  	  top: 50%;
      left: 20%;
     
 
    }
    .form-employee h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    .form-employee label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
      
    }
    .form-employee input[type="text"],
    .form-employee input[type="number"],
    .form-employee input[type="tel"],
    .form-employee textarea,
    .form-employee select {
      width: 100%;
      padding: 8px;
      margin-bottom: 15px;
      border: none;
      border-radius: 5px;
    }
    .form-employee input[type="checkbox"] {
      margin-right: 10px;
    }
    
    .form-employee button {
      width: 100%;
      padding: 10px;
      background-color: #00c2cb;
      color: black;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      font-weight: bold;
    }
    .form-employee button:hover {
      background-color: #009da3;
    }
     

</style>
<!--.............................Header................................-->
<body>
<div class="header">
<div class="header1">

<div class="logo"><img src="images/logo3.png" alt="logo" height="200px"></div>
<div class="Cname"> <h1>CEYLON CROWN TEA</h1></div>

</div>
<div class="navigationBar">
	<div class="menu-button" onclick="toggleSidebar()">☰</div>
  <nav>
    <a href="homepage.jsp">Home</a>
    <a href="http://localhost:8082/EmployeeManagementSystem/attendanceShowServlet">Attendance</a>
    <a href="http://localhost:8082/EmployeeManagementSystem/getAllSalaries">Payroll</a>
    <a href="http://localhost:8082/EmployeeManagementSystem/GetAllNotices">notices</a>
    <a href="http://localhost:8082/EmployeeManagementSystem/showAllAccounts">Accounts</a>
    <div class="animation start-home"></div>
  </nav>
  
</div>
</div>

<!--.............................Body................................-->

<div class="mainBody"> 
	<div class="sidebar" id="sidebar">
		<a href="#" class="link">Profile</a>
		<a href="#" class="link">Notifications</a>
		<a href="#" class="link">Apply for leave</a>
		<a href="#" class="link">Contact us</a>
		<a href="#" class="link">About us</a>
	</div>
</div>

<!--.............................mainBody................................-->
	<div class="form-employee">
    <h2>Update Employee Details</h2>
    <form method = "post" action = "AccountUpdateServelet">
    
      <label for="id">Employee ID</label>
      <input type="text" id="id" name = "id" value = "<%=id%>" placeholder="Enter Employee ID" required />

      <label for="name">Employee Name</label>
      <input type="text" id="name"  name = "name" value = "<%=name%>" placeholder="Enter Employee Name" />

      <label for="phone">Phone</label>
      <input type="text" id="phone" name = "phone" value = "<%=phone%>" placeholder="Enter Employee Phone" />
      
       <label for="mail">E-mail</label>
      <input type="email" id="mail" name = "email" value = "<%=email%>" placeholder="Enter Employee mail" /><br>

      <br><label for="date">Join Date</label>
      <input type="date"  name = "joindate" value = "<%=joindate%>" placeholder="Enter Join Date"/> <br>

      
      <br><label for="department">Departments</label>
      <select id="department"  name = "department" onchange="updateDesignations()">
        <option value="Human Resources (HR)" <%= "Human Resources (HR)".equals(department)?  "selected" : "" %>>Human Resources (HR)</option>
        <option value="IT" <%= "IT".equals(department) ? "selected" : "" %>>IT</option>
        <option value="Finance and Accounting" <%= "Finance and Accounting".equals(department) ? "selected" : ""%>>Finance and Accounting</option>
        <option value="Marketing" <%= "Marketing".equals(department) ? "selected" : "" %>>Marketing</option>
        <option value="Sales" <%= "Sales".equals(department) ? "selected" : "" %>>>Sales</option>
        <option value="Operations" <%= "Operations".equals(department) ? "selected" : "" %>>Operations</option>
        <option value="Research and Development (R and D)" <%= "Research and Development (R and D)".equals(department) ? "selected" : "" %>>Research and Development (R and D)</option>
        <option value="Product Management" <%= "Product Management".equals(department) ? "selected" : "" %>>Product Management</option>
        <option value="Legal" <%= "Legal".equals(department) ? "selected" : "" %>>Legal</option>
        <option value="Customer Service"  <%= "Customer Service".equals(department) ? "selected" : "" %>>Customer Service</option>
      </select>
      
      

      <label for="designation">Designation</label>
      <select id="designation"  name = "designation"  >
        <option value = "" >Designation</option>
      </select><br>
      
      <br><label for="password">Password</label>
      <input type="password"  name = "password" value = "<%=password%>" placeholder="Enter Join Password"/> <br>
      
      

      <br><button type="submit">Update Employee</button>
    </form>
<!--.............................mainBody................................-->

</div>
</body>
<script>
    function toggleSidebar() {
      let sidebar = document.getElementById('sidebar'); 
      sidebar.classList.toggle('active');  
    }
</script>
<script>
    function updateDesignations() {
        var department = document.getElementById("department").value;
        var designation = document.getElementById("designation");

       
        designation.innerHTML = "";

        var options = {
            "Human Resources (HR)": ["Head of HR", "HR Manager", "HR Executive", "Recruiter"],
            "IT": ["IT Manager", "IT Support Specialist", "Software Engineer", "System Analyst", "Cybersecurity Analyst"],
            "Finance and Accounting": ["Accountant", "Accounts Payable", "Finance Analyst", "Auditor"],
            "Marketing": ["Marketing Manager", "Brand Manager", "Social Media Manager", "SEO Specialist", "Content Creator"],
            "Sales": ["Sales Executive", "Sales Manager", "Account Executive", "Business Development Manager", "Sales Representative", "Key Account Manager"],
            "Operations": ["Operations Manager", "Logistics Coordinator", "Supply Chain Analyst", "Production Supervisor", "Quality Assurance Manager", "Warehouse Manager"],
            "Research and Development (R and D)": ["Research Scientist", "Product Developer", "Lab Technician"],
            "Product Management": ["Product Manager", "Product Owner", "Product Analyst"],
            "Legal": ["Legal Advisor", "Compliance Officer", "Paralegal"],
            "Customer Service": ["Customer Service Rep", "Support Specialist", "Call Center Agent"]
        };

        if (department in options) {
            options[department].forEach(function(item) {
                var opt = document.createElement("option");
                opt.value = item;
                opt.text = item;
                designation.appendChild(opt);
            });
        }
    }
</script>

</body>
</html>