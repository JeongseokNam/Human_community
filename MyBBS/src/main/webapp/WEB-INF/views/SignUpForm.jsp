<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
<link href="resources/css/Main.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/formCheck.js"></script>
</head>
<body>
	<div>
		<div class="div-form">
			<div>
				<form action="signUp" id="signUp" method="post" onsubmit="return checkAll(this)">
					<div class="div-input">
						<input class="signup-input" type="text" placeholder="ID" name="id">
						<div id="pid" style="color:red; display:none;">
						<p > ! 조건에 만족하지 못합니다.</p>
						</div>
						<input class="signup-input" type="password" placeholder="PWD" name="pwd">
						<div id="ppw" style="color:red; display:none;">
						<p > ! 조건에 만족하지 못합니다.</p>
						</div>
						<input class="signup-input" type="text" placeholder="Name" name="name"> 
						<div id="pname" style="color:red; display:none;">
						<p > ! 조건에 만족하지 못합니다.</p>
						</div>
					</div>
					<div class="FromButton">
						<button class="FromButton" type="submit">Sign up</button>
						<button class="FromButton" type="button"
							onclick="location.href='${pageContext.request.contextPath}/'">Back</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>