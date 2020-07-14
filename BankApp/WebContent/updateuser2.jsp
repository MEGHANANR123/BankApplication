<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="Plum";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">

<form action="admin">
enter uname to update - <input type="text" name="uname"><br>
enter account balance to update <input type="text" name="acbalance"><br>
enter Userid to update <input type="text" name="userid"><br>
enter password to update <input type="text" name="password"><br>
<input type="submit" name="btn" value="updateusers">
</form>
</body>
</html>