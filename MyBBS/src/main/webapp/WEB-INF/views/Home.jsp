<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>휴먼커뮤니티</title>
<link href="resources/css/Main2.css" rel="stylesheet" />
<style type="text/css">
@charset "UTF-8";

* {
	padding: 0px;
	margin: 0px;
	font-family: sans-serif;
}

body {
	background-image: url(resources/images/main-back.jpg)
}

h3 {
	/* margin: 20px; */
	font-family: "Paytone One";
	color: #202020;
	text-transform: uppercase;
	letter-spacing: -2px;
}

h3 span {
	display: block;
	margin: 0px 0 0px 0;
	font-size: 43px;
	line-height: 55px;
	color: #ff4500;
	text-shadow: 0 10.36px 6.896px #1c1913, 0 -2px 1px #ffb69b;
	letter-spacing: -2px;
	text-align: center;
}

input.login-input, input.signup-input {
	border: none;
	border-bottom: 1px solid;
	outline: none;
	width: 100%;
	padding: 10px 0;
	margin: 5px 0;
	background: transparent;
}

input.login-input::placeholder, input.signup-input::placeholder {
	color: black;
}

input.login-input:focus, input.signup-input:focus {
	border-bottom: 2px solid;
}

form#login {
	left: 50px;
	top: 180px;
	position: absolute;
	width: 280px;
	transition: .5s;
}
form#signUp {
	left: 50px;
	top: 80px;
	position: absolute;
	width: 280px;
	transition: .5s;
}

.div-form {
	width: 380px;
	height: 480px;
	position: relative;
	margin: 6% auto;
	padding: 5px;
	background-color: rgba(255, 255, 255, 0.3);
	box-shadow: 0 20px 15px #000;
	border: 2px solid #FF4500;
}

.div-input {
	margin-bottom: 50px;
}

button.FromButton {
    position: relative;
    display: block;
    margin: auto;
    margin-top:30px;
    background-color: #FF4500;
    box-shadow: 0 4px 16px rgba(255, 69, 0, 0.3);
    border: none;
    padding: 15px 50px;
    width: 200px;
    text-align: center;
    transition-duration: 0.4s;
    text-decoration: none;
    overflow: hidden;
    border-radius: 30px;
    color: white;
    font-weight: 900;
	font-size: 19px;
	cursor:pointer;
}

button.FromButton:hover{
   background:#fff;
   box-shadow:0px 2px 10px 5px #97B1BF;
   color:#000;
}

</style>
</head>
<body>
	<div>
		<div class="div-form">
			<div class="title">
				<h3> <span>Human</span> <span>Academy</span> <span>Community</span></h3>
			</div>
			<div>
				<form action="login" id="login" method="POST">
					<div class="div-input">
						<input class="login-input" name="id" type="text"placeholder="Please enter ID"> 
						<input class="login-input" name="pwd" type="password" placeholder="Please enter PWD">
					</div>
					<button class="FromButton" type="submit">Sign in</button>
					<button class="FromButton" type="button" onclick="location.href='SignUpForm'">Sign up</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>