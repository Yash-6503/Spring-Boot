<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Help & Contact - Student Management System</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f6f8;
        }

        h1 {
            margin: 0;
            font-size: 32px;
            color:white;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 30px;
            background-color: white;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }

        h2 {
            color: #333;
            margin-top: 0;
        }

        p {
            font-size: 16px;
            color: #555;
            line-height: 1.6;
        }

    </style>
</head>
<body>

<header>
    <h1>Help & Contact</h1>
</header>

<div class="container">
    <h2>Need Assistance?</h2>
    <p>If you're facing any issues or have questions related to the Student Management System, we’re here to help you.</p>

    <div class="contact-info">
        <p>Email: support@smsapp.com</p>
        <p>Phone: +91 98765 43210</p>
        <p>Office Hours: Monday to Friday, 10 AM – 6 PM</p>
        <p>Address: 2nd Floor, ABC Tech Park, Nashik, Maharashtra</p>
    </div>

    <p>If your query is urgent or related to a student's academic data, please mention the roll number while contacting us.</p>

    <div class="links">
        <a href="/sms/">Home</a>
        <a href="${pageContext.request.contextPath}/sms/add">Add Student</a>
        <a href="${pageContext.request.contextPath}/sms/allStudents">View Students</a>
    </div>
</div>

<footer>
        &copy; 2025 Student Management System. All rights reserved.
    </footer>

</body>
</html>
