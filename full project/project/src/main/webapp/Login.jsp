<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
	<style>

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
body{
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.322), rgba(255, 254, 254, 0)), 
	url('images/bg2.jpeg');
  background-size: cover;
  background-position: center;
}
.login{
  width: 420px;
  height: 480px;
  background: transparent;
  border: 2px solid rgba(0, 0, 0, 0.086);
  backdrop-filter: blur(4px);
  box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.563);
  color: #fff;
  border-radius: 12px;
  padding: 30px 40px;
  justify-self: center;
}
.login h1{
  font-size: 36px;
  text-align: center;
  margin-top: 30px;
}
.login .textBox{
  position: relative;
  width: 100%;
  height: 50px;
  margin-top: 50px;
  
}
.textBox input{
  width: 100%;
  height: 100%;
  background: transparent;
  border: none;
  outline: none;
  border: 2px solid rgba(255, 255, 255, .2);
  border-radius: 40px;
  font-size: 16px;
  color: #fff;
  padding: 20px 45px 20px 20px;
}
.textBox input::placeholder{
  color: #ffffff;
}
.textBox i{
  position: absolute;
  right: 20px;
  top: 30%;
  transform: translate(-50%);
  font-size: 20px;

}

.login .btn{
  width: 100%;
  height: 45px;
  margin-top: 50px;
  background: #fff;
  border: none;
  outline: none;
  border-radius: 40px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.282);
  cursor: pointer;
  font-size: 16px;
  color: #333;
  font-weight: 600;
}

.header{
  width: 100%;
  height: 200px;
  display: flex;
  margin-top: 0px;

}

.mainbody{
  width: 100%;
  float: right;
  justify-content: center;
}

.logo{
	height: 100%;
	width: 200px;
	float: left;
  margin-top: 20px;
  margin-left: 20px;
}
.Cname{
	height: 100%;
	align-content: center;
	color: rgb(255, 255, 255);
	font-size: 25px;
	text-shadow: 4px 4px 4px rgba(0, 0, 0, 0.5);
  margin-left: 275px;
  
}

	</style>

<div class="mainbody">
<div class="header">

  <div class="logo"><img src="images/logo3.png" alt="logo" height="200px"></div>
  <div class="Cname"> <h1 style="font-family: serif;">CEYLON CROWN TEA</h1></div>
  
  
  </div>


  
  <div class="login">
    <form action="loginServlet" method="post">
      <h1>Login</h1>
      <div class="textBox">
        <input type="text" name="id" placeholder="Employee ID" required>
        <i class='bx bxs-user'></i>
      </div>
      <div class="textBox">
        <input type="password" name="password" placeholder="password" required>
        <i class='bx bxs-lock-alt' ></i>
      </div>
      <button type="submit" class="btn">Login</button>
    </form>
  </div></div>
</body>
</html>