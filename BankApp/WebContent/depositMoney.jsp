<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="MistyRose";
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
Enter account number -<input type="text" name="accno"><br>
Enter amount -<input type="text" name="acbalance"><br>
<input type="submit" name="btn" value="deposite">
</form>
</body>
</html>