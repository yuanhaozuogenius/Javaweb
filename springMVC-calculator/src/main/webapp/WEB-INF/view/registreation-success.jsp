<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>The Registration is successful</h2>
	<h3>The Details entered you are :</h3>
	name :${userReg.name}
	<br /> user name :${userReg.username}
	<br /> password :${userReg.password}
	<br /> country :${userReg.countryName}
	<br /> Hobbies :
	<c:forEach var="temp" items="${userReg.hobbies}">
	 
	 ${temp}
	 
	 </c:forEach>
	<br /> gender :${userReg.gender}
	<br /> age:${userReg.age}

	<br /> email:${userReg.comunicationDTO.email }
	<br /> phone:${userReg.comunicationDTO.phone }
</body>
</html>