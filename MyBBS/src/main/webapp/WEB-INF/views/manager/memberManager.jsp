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
					<li class="nav-item"><a class="nav-link" href="#">게시글 관리</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="managerMain">관리자메뉴</a></li>
				</ul>
			</div>
			<div class="d-flex justify-content-end">관리자</div>
		</div>
	</nav>
	<table class="table">
		<thead class="sticky-top">
			<tr>
				<th scope="col">#</th>
				<th scope="col">이름</th>
				<th scope="col">아이디</th>
				<th scope="col">비밀번호</th>
				<th scope="col">수정/삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${memberList}" var="vo">
				<tr>
					<th scope="row"><span id="memberno">${vo.no}</span></th>
					<td>${vo.name }</td>
					<td>${vo.id }</td>
					<td>${vo.pwd }</td>
					<td>
					<input class="btn btn-primary" type="button" value="수정" onclick="location.href='modMemberForm?no=${vo.no}'">
					<input class="btn btn-primary" type="button" value="삭제" onclick="deletecheck(${vo.no});">
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>