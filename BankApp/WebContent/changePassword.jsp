<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="Beige";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">
<form action ="user">
Enter new password<input type="text" name="password"><br>
confirm new password-<input type="text" name="cpassword"><br>
<input type="submit" name="btn" value="passwordchange">
</form>
</body>
</html>