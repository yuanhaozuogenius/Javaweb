<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>

<style type="text/css">
.error{
color: Red;
position: fixed;
text-align: left;
margin-left: 30px;

}
</style>


<script type="text/javascript">

function validateUserName(){
	
	var username=document.getElementById('yn').value;
	if(username.length < 3){
     alert("your name should have atleast one charter");
       return false;
		}
	else {
		
      return true;
      
		}
	
}

</script>

</head>
<body>


	<h1 align="center">welcome to calculatorApp</h1>
	<hr/>
	
	<form:form modelAttribute="userInfo" method="get" action="process-homepage">
		<div align="center">
		    <%-- <p>
			   <label for= "yn">Your Name : </label>
				<form:input id = "yn" path="username"/>
				<form:errors path="username" />
			</p> --%>
			
			<p>
			<label for="yn">your Name</label>
			<form:input id="yn" path="username"/>
			<form:errors path="username"></form:errors>
			</p>
			
             <p>
				<label for="cn">Crush Name : </label>
				<form:input id="cn" path="crushname"/>
			</p>
			
			<p>
			<form:checkbox path="termandCondition" id="check"/>
			<label>Iam agree that this is for fun</label>
			<form:errors path="termandCondition" cssClass="error"></form:errors>
			</p>
         <input type="submit" value="calculate">

		</div>
	</form:form>
	

</body>
</html>

