<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Management System - Home</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            scroll: none;
        }

        h1 {
            margin: 0;
            font-size: 32px;
            color:white;
        }

        .container {
            padding: 40px;
            text-align: center;
            height: 58vh;
            
        }
        
    </style>
    
</head>
<body>

    <header>
        <h1>Student Management System</h1>
    </header>

    <div class="container">
    
    	<div class="images">
    	
    		 <img src="${pageContext.request.contextPath}/assets/student.gif" alt="Student GIF" style="width: 300px; display: block; margin: 0 auto;">	 
    		
    	</div>

        <p class="description">Manage student records efficiently with options to add, view, and analyze student information and marks.</p>
        
        <div class="btn-group">
            <a href="/sms/add" class="btn">Add Student</a>
            <a href="/sms/allStudents" class="btn">View All Students</a>
            <a href="/sms/report" class="btn">Generate Reports</a>
            <a href="/sms/help" class="btn">Help / Contact</a>
        </div>
        
    </div>

    <footer>
        &copy; 2025 Student Management System. All rights reserved.
    </footer>

</body>
</html>
