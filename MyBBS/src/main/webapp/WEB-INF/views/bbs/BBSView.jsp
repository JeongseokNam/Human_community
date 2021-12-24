<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴먼커뮤니티</title>
<link href="resources/css/bootstrap.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/test.js"></script>
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
			${sessionScope.name }(${sessionScope.id })
			<a href="logout">로그아웃</a>
			</div>
		</div>
	</nav>
	<form action="modPost" method="post">
		<div class="input-group mx-auto my-3 w-75 h100">
			<span class="input-group-text" id="basic-addon1">제목</span> <input
				name="title" type="text" class="form-control"
				placeholder="${bbsdata.title }" aria-label="Username"
				aria-describedby="basic-addon1">
		</div>
		<div class="input-group mx-auto my-3 w-75 h100">
			<span class="input-group-text">내용</span>
			<textarea name="memo" class="form-control" aria-label="With textarea"
				placeholder="${bbsdata.memo }"></textarea>
		</div>
		<div class="d-grid gap-2 col-4 mx-auto my-2" id="myPostDiv">
			<button name="myPost" type="submit" class="btn btn-primary btn-lg">수정</button>
			<button name="myPost" type="button" class="btn btn-primary btn-lg"
				onclick="location.href='delPost?bbsindex=${bbsdata.no }'">삭제</button>
		</div>
		<div class="d-grid gap-2 col-4 mx-auto ">
			<input type="hidden" name="name" value="${param.name }"> <input
				type="hidden" name="no" value="${bbsdata.no }"> <input
				type="hidden" name="writer" value="${bbsdata.writer }">
			<button type="button" class="btn btn-primary btn-lg"
				onclick="location.href='BBSMain'">목록</button>
		</div>
	</form>
	<div id= "commentForm" class="container">
		<div class="">
			<p class="fs-5 border-bottom">댓글 (${fn:length(commentList)})</p> 
			<c:forEach items="${commentList }" var="vo">
			<div class="">
				<p class="fs-5">${vo.commenter }</p>
				<p class="fs-6 border-bottom">${vo.content }</p>
			</div>
			</c:forEach>
			<form action="addComent" method="post">
				<div class="input-group mx-auto my-3 w-75 h100">
				<input type="hidden" name="bbsno" value="${bbsdata.no }">
					<textarea class="form-control" placeholder="text"
						name="content"></textarea>
					<button type="submit" class="btn btn-primary btn-lg">댓글 달기</button>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		//myPostOption("${param.name }", "${bbsdata.writer }")
	</script>
</body>
</html>