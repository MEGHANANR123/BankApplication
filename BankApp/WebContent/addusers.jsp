<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="PaleGoldenRod";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">

 <form action ="admin">
Enter accountno -<input type="text" name="accno"><br>
Enter username -<input type="text" name="uname"><br>
Enter accountbalance-<input type="text" name="acbalance"><br>
Enter userid-<input type="text" name="userid"><br>
Enter password-<input type="text" name="password"><br>
<input type="submit" name="btn" value="addusers">



 </form>
   
   
</body>
</html>