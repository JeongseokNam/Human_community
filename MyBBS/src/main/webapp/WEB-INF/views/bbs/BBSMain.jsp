<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="BBSMain">게시판</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled" href="#">공사중</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						onclick="managerCheck();">관리자메뉴</a></li>
				</ul>
			</div>
			<div class="d-flex justify-content-end">
			${sessionScope.name }(${sessionScope.id })
			<a href="logout">로그아웃</a>
			</div>
		</div>
	</nav>

	<table class="table">
		<thead class="sticky-top">
			<tr>
				<th scope="col">#</th>
				<th scope="col">작성자</th>
				<th scope="col">제목</th>
				<th scope="col">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bbsList}" var="vo">
				<tr>
					<th scope="row">${vo.no}</th>
					<td>${vo.writer }</td>
					<td><a href="BBSView?bbsindex=${vo.no}">${vo.title }</a></td>
					<td>${vo.views }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button type="button" class="btn btn-primary btn-lg"
				onclick="location.href='addPostForm'">글쓰기</button>
	<div class="d-grid gap-2 col-4 mx-auto">
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<c:if test="${pageVO.prev}">
					<li class="page-item">
						<a class="page-link"
						href="BBSMain?&page=${pageVO.startPage-1}"
						aria-label="Previous">
							<span aria-hidden="true">&laquo;</span>
						</a>
					</li>
				</c:if>
				<c:forEach begin="${pageVO.startPage}" end="${pageVO.endPage}" var="idx">
					<li class="page-item">
						<a class="page-link"
						href="BBSMain?&page=${idx}">${idx}</a>
					</li>
				</c:forEach>
				<c:if test="${pageVO.next}">
					<li class="page-item">
						<a class="page-link"
						href="BBSMain?&page=${pageVO.endPage+1}"
						aria-label="Next"> 
							<span aria-hidden="true">&raquo;</span>
						</a>
					</li>
				</c:if>
			</ul>
		</nav>
	</div>
</body>
</html>