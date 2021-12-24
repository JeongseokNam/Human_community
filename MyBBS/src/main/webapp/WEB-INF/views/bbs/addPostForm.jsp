<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴먼커뮤니티</title>
<link href="resources/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
	<nav class="navbar sticky-top navbar-expand-lg navbar-dark "
		style="background-color: #ff4500">
		<div class="container-fluid">
			<a class="navbar-brand" href="BBSMain">휴먼커뮤니티</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="BBSMain">게시판</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled">공사중</a></li>
				</ul>
			</div>
			<div class="d-flex justify-content-end">
				${sessionScope.name }(${sessionScope.id }) <a href="logout">로그아웃</a>
			</div>
		</div>
	</nav>
	<form action="addPost" method="post" encType="multipart/form-data">
		<div class="input-group mx-auto my-3 w-75 h100">
			<span class="input-group-text" id="basic-addon1">제목</span> <input
				name="title" type="text" class="form-control" placeholder="제목"
				aria-label="Username" aria-describedby="basic-addon1">
		</div>
		<input type="hidden" name="writer" value="${sessionScope.name }">
		<div class="input-group mx-auto my-3 w-75 h100">
			<span class="input-group-text">내용</span>
			<textarea name="memo" class="form-control" aria-label="With textarea"></textarea>
		</div>
		<div class="d-grid gap-2 col-4 mx-auto">
			<button type="submit" class="btn btn-primary btn-lg">저장</button>
			<button type="button" class="btn btn-primary btn-lg"
				onclick="location.href='BBSMain'">뒤로가기</button>
			<input type="file" name="file" value="파일선택">
		</div>
	</form>

</body>
</html>