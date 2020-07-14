<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="Aquamarine";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">

 
				<a href = "addusers.jsp"><h4>Add users</h4></a><br>
                <a href = "findusers.jsp"><h4>find users</h4></a><br>
  <a href = "updateuser1.jsp"><h4>update userdetails<h4></a><br>
  <a href = "showbalance.jsp"><h4>show balance of particular user</h4></a><br>
  <a href = "deleteusers.jsp"><h4>remove users from banksystem</h4></a><br>
  <a href = "admin"><h4>display all userdetails</h4></a><br>
 
 
</body>
</html>