<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴먼커뮤니티-관리자메뉴</title>
<link href="resources/css/bootstrap.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/test.js"></script>
</head>
<body>
	<nav class="navbar sticky-top navbar-expand-lg navbar-dark "
		style="background-color: #ff4500">
		<div class="container-fluid">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/">휴먼커뮤니티</a>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="memberManager">회원정보 관리</a></li>
					<li class="nav-item"><a class="nav-link" href="#">게시글 관리</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
				</ul>
			</div>
			<div class="d-flex justify-content-end">관리자</div>
		</div>
	</nav>
</body>
</html>