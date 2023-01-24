<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.simplilearn.ClassReport" %>
<%@page import="com.simplilearn.dao.Dao" %>
<%@page import="java.util.List" %>

<!DOCTYPE html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 List<ClassReport>classreports=Dao.listClassReport();
 request.setAttribute("classreportlist",classreports);
%>

<table style="border:1px solid green;">
<tr>
  <th>ID</th>
  <th>Classnumber</th>
  <th>StudentFirstName</th>
  <th>StudentLastName</th>
  <th>SubjectName</th>
  <th>TeacherFirstName</th>
  <th>TeacherLastName</th>
<c:forEach items="${classreportlist}"  var="classreport">
<tr>
<td>${classreport.getId()}</td>
<td>${classreport.getClassNumber()}</td>
<td>${classreport.getFirstName()}</td>
<td>${classreport.getLastName()}</td>
<td>${classreport.getSubjectName()}</td>
<td>${classreport.getFname()}</td>
<td>${classreport.getLName()}</td>
</tr>




</c:forEach>
</table>
</body>
</html>