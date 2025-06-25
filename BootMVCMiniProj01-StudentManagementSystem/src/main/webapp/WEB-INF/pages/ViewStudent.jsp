<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <style>
        table {
            width: 60%;
            margin: 0 auto 40px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 12px 20px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
            width: 40%;
        }

        td {
            background-color: #fafafa;
            color: #333;
        }

        tr:last-child td, tr:last-child th {
            border-bottom: none;
        }
    </style>
</head>
<body>

    <h1>Student Details</h1>

    <c:choose>
        <c:when test="${!empty student}">
            <table>
                <tr><th>Roll No</th><td>${student.studRoll}</td></tr>
                <tr><th>Name</th><td>${student.name}</td></tr>
                <tr><th>Email</th><td>${student.email}</td></tr>
                <tr><th>English</th><td>${student.marks.english}</td></tr>
                <tr><th>Marathi</th><td>${student.marks.marathi}</td></tr>
                <tr><th>Maths</th><td>${student.marks.maths}</td></tr>
                <tr><th>Science</th><td>${student.marks.science}</td></tr>
                <tr><th>Social Science</th><td>${student.marks.socialScience}</td></tr>
                <tr><th>Total Marks</th><td>${student.marks.totalMarks}</td></tr>
                <tr><th>Percentage</th><td>${student.marks.percentage}</td></tr>
                <tr><th>Grade</th><td>${student.marks.grade}</td></tr>
            </table>
        </c:when>
        <c:otherwise>
            <h2 class="no-data">No Student Found...</h2>
        </c:otherwise>
    </c:choose>

    <div class="links">
        <a href="/sms/">Home</a>
        <a href="/sms/add">Add Student</a>
        <a href="/sms/allStudents">View All Students</a>
    </div>

</body>
</html>
