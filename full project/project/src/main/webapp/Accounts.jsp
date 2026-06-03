<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Account Details</title>
</head>


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


.mainContent{
	background-color: rgba(0, 0, 255, 0);
	width: 100%;
	height: 100%px ;
	z-index: 10;
	
}
.showdetails{
width: 100%;
height: 100%;
justify-items: center;
padding-top: 10px;
}
.add{
    padding-top: 30px;
    padding-left: 70px;
}


table {
      width: 90%;
      margin: 20px auto;
      border-collapse: collapse;
      font-family: Arial, sans-serif;
      font-size: 16px;
      border: 3px solid #ffffff;
    }

    th, td {
      padding: 12px 15px;
      border: 1px solid #ccc;
      text-align: center;
      color: #fff;
      border: 3px solid #ffffff;
    }
.btnUpdate { 
 
 font-size: 16px;
 color: #fff;
 background-color: #eaff00b8;
 border-radius: 6px;
 cursor: pointer; 
}
.btnDelete {
 
 font-size: 16px;
 color: #fff;
 background-color: #ff1e00b5;
 border-radius: 6px;
 cursor: pointer; 
}

.addbtn {
 padding: 10px 20px;
 font-size: 16px;
 color: #fff;
 background-color: #33ff0096;
 border-radius: 6px;
 cursor: pointer; 
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

<div class="mainContent">


	<div class="add">
	<button class= "addbtn" onclick= "window.location.href='Accountinsert.jsp'"> Add employee</button>
    </div>
	
	
<div class="showdetails">	
    
      <table class ="tablecont" border = 1>
        <thead>
          <tr>
            <th width ="250">Employee ID</th>
            <th width ="250">Employee Name</th>
            <th width ="150">Mobile No</th>
            <th width ="250">E mail</th>
            <th width ="200">Join Date</th>
            <th width ="150">Department</th>
            <th width ="150">Designation</th>
            <th width ="150">Password</th> 
            <th width ="150">Action</th> 
           </tr>
           
           
           <c:forEach var ="emps" items = "${allemployees}">
           <tr>
           	<td width = "150">${emps.id}</td>
           	<td width = "150">${emps.name}</td>
           	<td width ="150">${emps.phone}</td>
           	<td width = "250">${emps.email}</td>
           	<td width ="150">${emps.joindate}</td>
           	<td width ="150">${emps.department}</td>
           	<td width ="150">${emps.designation}</td>
           	<td width ="150">${emps.password}</td>
           	
           	 <td><br>
           	 	<a href="Accountupdate.jsp?id=${emps.id}&name=${emps.name}&phone=${emps.phone}&email=${emps.email}&joindate=${emps.joindate}&department=${emps.department}&designation=${emps.designation}&password=${emps.password}">
           	 	 	<button class="btnUpdate">Update</button>
           	 	</a>
           	 	<br><br>
           	 	<form action = "AccountDeleteServlet" method = "post">
           	 	<input type="hidden" name="id" value="${emps.id}"/>
           	 	<button class="btnDelete">Delete</button><br>
           	 	</form>
           	 </td>
           	 	
           	</tr>
           
           </c:forEach>
       </thead>
      </table>
    </div>
     </div>
     
    
    
</body>
<script>
    function toggleSidebar() {
      let sidebar = document.getElementById('sidebar'); 
      sidebar.classList.toggle('active');  
    }
</script>
</body>
</html>