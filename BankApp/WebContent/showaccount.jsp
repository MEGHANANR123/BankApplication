<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

  <%
              String bgColor="Lightblue";
              String myColor=request.getParameter("color");
              if(myColor!=null){
            	  myColor=myColor;
              }
              else{
            	  myColor=bgColor;
              }
              
              
          %> 
         

<body bgColor="<%=myColor%>">
 <style>
        table,tr,td{
             border:1px solid black;
             width : 40%;
             text-align: center;
           }
        </style>
</head>
<c:forEach var="us" items="${list}">
               <table>
                    <tr>
                        <td>
                            <h5><c:out value="${us.getAccno()}"></c:out></h5>
                        </td>
                        <td>
                            <h5><c:out value="${us.getUname()}"></c:out></h5>
                        </td>
                        <td>
                            <h5><c:out value="${us.getAcbalance()}"></c:out></h5>
                        </td>
                        <td>
                            <h5><c:out value="${us.getUserid()}"></c:out></h5>
                        </td>
                        <td>
                            <h5><c:out value="${us.getPassword()}"></c:out></h5>
                        </td>
                      </tr>
                </table>
                </c:forEach>

</body>
</html>