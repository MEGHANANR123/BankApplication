<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <%
              String bgColor="Lavender";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">
<a href = "depositMoney.jsp"><h4>to deposite amount</h4></a><br>
<a href = "transferMoney.jsp"><h4>transfer money to other account</h4></a><br>
<a href = "withdrawlMoney.jsp"><h4>for withdraw money</h4></a><br>
<a href = "checkBalance.jsp"><h4>check account balance</h4></a><br>
<a href = "printStatement.jsp"><h4>print mini statement</h4></a><br>
<a href = "changePassword.jsp"><h4>to change password</h4></a>
</body>
</html>