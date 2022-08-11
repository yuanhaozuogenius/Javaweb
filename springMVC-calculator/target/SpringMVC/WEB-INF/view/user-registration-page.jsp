<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegPage</title>

<style type="text/css">
.error {
	color: Red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>


<body>
	<h1 align="center">Please Register here</h1>

	<form:form action="registreation-success" method="Get"
		modelAttribute="userReg">

		<div align="center">
			<label>Name : </label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
 <br/>
			<br /> <label>User Name : </label>
			<form:input path="username" />
			<form:errors path="username" cssClass="error" />
<br/>
			<br /> <label>Password : </label>
			<form:password path="password" />

			<br /> <label>Country : </label>
			<form:select path="countryName">
				<form:option value="Ind" label="india"></form:option>
				<form:option value="nz" label="newzeland"></form:option>
				<form:option value="aus" label="australia"></form:option>
				<form:option value="kn" label="kenya"></form:option>
			</form:select>
			<br /> <label>Hobbies : </label> cricket:
			<form:checkbox path="Hobbies" value="cricket" />
			read:
			<form:checkbox path="Hobbies" value="read" />
			travel:
			<form:checkbox path="Hobbies" value="travel" />
			programming:
			<form:checkbox path="Hobbies" value="programming" />

			<br /> <label>Gender :</label> Male
			<form:radiobutton path="gender" value="male" />
			FeMale
			<form:radiobutton path="gender" value="female" />
			<br /> <label>Age:</label>
			<form:input path="age" />
			<form:errors path="age" cssClass="error"></form:errors>
			<br />

		</div>


		<div align="center">
			<h3>communication</h3>

			<label>email</label>
			<form:input path="comunicationDTO.email" />
			<form:errors path="comunicationDTO.email" cssClass="error"></form:errors>
   <br/>
			<label>Phone</label>
			<form:input path="comunicationDTO.phone" />

		</div>

		<br />

		<div align="center">
			<input type="submit" value="Register">
		</div>
	</form:form>

</body>
</html>
