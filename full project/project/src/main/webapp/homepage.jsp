<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
</head>
<body>
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
nav .start-home, a:nth-child(1):hover~.animation{
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
nav a:nth-child(5):hover~.animation{
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
	height: 800px ;
	z-index: 10;

}
.informations{
	height: 100%;
	width: 50%;
	float: left;
	background-color: rgba(128, 255, 0, 0);

}
.cards{
	height: 100%;
	width: 50%;
	float: right;
	background-color: rgba(137, 43, 226, 0);
	
}
.title{

	align-content: center;
	height: 200px;
	width: 80%;
	color: white;
	margin-left: 30px;
	background-color: rgba(165, 42, 42, 0);
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.504);
	font-size: 20px;
}
.para1{
	justify-self: end;
	height: 200px;
	width: 80%;
	background-color: rgba(0, 225, 255, 0);
	color: white;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
	font-size: large;
	text-align: justify;
}
.para2{
	
	height: 200px;
	width: 80%;
	color: white;
	margin-left: 30px;
	background-color: rgba(128, 255, 0, 0);
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
	font-size: large;
	text-align: justify;
}
.card {
	width: 200px;
	height: 250px;
	background: #ffffff00;
	display: flex;
	align-items: flex-end;
	padding: 2rem 1rem;
	position: relative;
	transition: 0.5s all ease-in-out;
	margin-top: 50px;
	box-shadow: 8px 8px 10px rgba(0, 0, 0, 1);
	border-radius: 10px;
}
.card:hover {
	transform: translateY(-10px);
}
.card::before {
	content: '';
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background: linear-gradient(to bottom, rgba(10, 249, 6, 0), rgb(0, 0, 0));
	z-index: 2;
	opacity: 0;
	transition: 0.5s all;
	border-radius: 10px;
}
.card:hover::before {
	opacity: 1;
}
.card img {
	width: 100%;
	height: 100%;
	object-fit: cover;
	position: absolute;
	top: 0;
	left: 0;
	border-radius: 10px;
    
}
.card .info {
	position: relative;
	color: #ffffff;
	z-index: 3;
	opacity: 0;
	transform: translateY(30px);
	transition: 0.5s all;
	
}
.card:hover .info {
	opacity: 1;
	transform: translateY(0);
	
}
.card .info h1 {
	line-height: 40px;
	margin-bottom: 10px;
}
.card .info p {
	font-size: 15px;
	letter-spacing: 1px;
	margin-bottom: 20px;
	
}
.card .info .btn {
	background: #fff;
	padding: 0.5rem 1rem;
	color: #000;
	font-size: 12px;
	cursor: pointer;
	border-radius: 20px;
	text-decoration: none;
	font-weight: bold;
	transition: .4s ease-in-out;
}
.card .info .btn:hover {
	background: #23ff0288;
	color: #fff;
	box-shadow: 0 7px 10px rgba(0, 0, 0, 0.5);
}
.leftCards{
	float: left;
	background-color: rgba(226, 43, 144, 0);
	width: 50%;
	justify-items: center;
	margin-top: 50px;
}
.RightCards{
	float: right;
	background-color: rgba(128, 255, 0, 0);
	width: 50%;
}


</style>
<!--.............................Header................................-->

<div class="header">
<div class="header1">

<div class="logo"><img src="images/logo3.png" alt="logo" height="200px"></div>
<div class="Cname"> <h1>CEYLON CROWN TEA</h1></div>
<div class="profileIcon"><a href="#"><img src="images/profile3.png" alt="logo" height="100px"></a></div>

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

<!--.............................mainBody................................-->
	<div class="mainContent">


		<div class="informations"> 

			<div class="title"><h1>Brewing Royalty, The Legacy Behind Ceylon Crown Tea</h1></div>
			<div class="para1"><p>
				High in the lush, mist covered hills of Sri Lanka, where the air is crisp and the soil rich with history,
				the story of Ceylon Crown Tea began not as a factory, but as a vision. A vision to craft world class tea 
				that would carry the essence of Ceylon to every corner of the globe. Founded by a group of passionate tea
				experts and local farmers, our journey started with a simple promise to honor the heritage of Sri Lankan
				tea while uplifting the communities and landscapes that make it possible.
			</p></div>
			<div class="para2"><p>
				What began as a modest operation has grown into a proud symbol of quality, integrity, and tradition. At Ceylon 
				Crown Tea, every leaf is hand picked with care, every process rooted in centuries old craftsmanship, and every 
				blend created with a deep respect for nature. But our story is more than tea it’s about people. It’s about
				empowering our workers, preserving our environment, and creating something meaningful. Today, we stand as a crown 
				on Sri Lanka’s tea legacy, offering not just a beverage, but an experience steeped in authenticity, purpose, and pride.
				</p></div>

		</div>

		<div class="cards">


			<div class="LeftCards"> 

			<div class="card">
				<img src="images/profile5.png" alt="">
				<div class="info">
					<h1>notices</h1>
					<p>Check out important notices </p>
					<a href="http://localhost:8082/EmployeeManagementSystem/GetAllNotices" class="btn">Check</a>
				</div>
			</div>

			<div class="card">
				<img src="images/Attendance.jpg" alt="">
				<div class="info">
					<h1>Attendance</h1>
					<p>Check out employees attendance</p>
					<a href="http://localhost:8082/EmployeeManagementSystem/attendanceShowServlet" class="btn">Check</a>
				</div>
			</div>
			</div>



			<div class="Rightcards">
				
				<div class="card">
					<img src="images/salary1.jpg" alt="">
					<div class="info">
						<h1>Payroll</h1>
						<p>Check out your salary details</p>
						<a href="http://localhost:8082/EmployeeManagementSystem/getAllSalaries" class="btn">Check</a>
					</div>
				</div>
	
				<div class="card">
					<img src="images/manage1.png" alt="">
					<div class="info">
						<h1>Accounts</h1>
						<p>check out our employees details</p>
						<a href="http://localhost:8082/EmployeeManagementSystem/showAllAccounts" class="btn">Check</a>
					</div>
				</div>
				</div>
	
			
			</div>







		</div>
	
	</div>
<!--.............................mainBody................................-->

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