<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="com.simplilearn.ClassReport"%>
<%@page import ="com.simplilearn1.Student"%>
<%@page import ="com.simplilearn2.Subject"%>
<%@page import ="com.simplilearn3.Teacher"%>
<%@page import ="java.util.ArrayList"%>
<%@page import ="java.util.List"%>
<%@page import ="com.simplilearn.dao.Dao"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String classNumber=request.getParameter("cnumber");
String firstName=request.getParameter("fName");
String lastName=request.getParameter("lName");

Student student=new Student();
student.setFirstName(firstName);
student.setLastName(lastName);

String subjectname1=request.getParameter("subjectname1");
String subjecttype1=request.getParameter("subjecttype1");

String subjectname2=request.getParameter("subjectname2");
String subjecttype2=request.getParameter("subjecttype2");

String subjectname3=request.getParameter("subjectname3");
String subjecttype3=request.getParameter("subjecttype3");

Subject s1=new Subject();
s1.setSubjectName(subjectname1);
s1.setSubjectType(subjecttype1);

Subject s2=new Subject();
s2.setSubjectName(subjectname2);
s2.setSubjectType(subjecttype2);

Subject s3=new Subject();
s3.setSubjectName(subjectname3);
s3.setSubjectType(subjecttype3);

List<Subject>subject=new ArrayList<Subject>();
 subject.add(s1);
 subject.add(s2);
 subject.add(s3);
 

String Fname=request.getParameter("Fname");
String Lname=request.getParameter("Lname");

Teacher teacher=new Teacher();

teacher.setFname(Fname);
teacher.setLname(Lname);

ClassReport classreport= new ClassReport();
classreport.setClassNumber(classNumber);
classreport.setStudent(student);
classreport.setSubject(subject);
classreport.setTeacher(teacher);

Dao.addEmployee(classreport);
response.sendRedirect("success.jsp");
%>
</body>
</html>