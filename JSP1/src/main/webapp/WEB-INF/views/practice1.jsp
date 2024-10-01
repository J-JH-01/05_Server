<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 결과</title>
</head>
<body>
<h1>회원 가입 결과 페이지 입니다</h1>
	<h3>입력되어 전달된 값들</h3>
	
	<div>
		<ul>
			<li>ID : ${param.inputId}</li>
			<li>PW : ${param.inputPw}</li>
			<li>확인 : ${param.sure}</li>
			<li>이름 : ${param.name}</li>
			<li>나이 : ${param.age}</li>
		</ul>
		<c:if test="${param.inputPw == param.sure}">
			<H1 style="color : blue;">회원가입 성공!</H1>
		</c:if>
		<c:if test="${param.inputPw != param.sure}">
			<H1 style="color : red;">비밀번호가 불일치합니다</H1>
		</c:if>
	</div>


</body>
</html>