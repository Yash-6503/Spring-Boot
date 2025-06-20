<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<style>
	 .links {
            text-align: center;
            margin-top: 20px;
        }

       .links a {
            display: inline-block;
            margin: 0 10px;
            padding: 10px 20px;
            background-color: #2196F3;
            color: white;
            text-decoration: none;
            font-weight: bold;
            border-radius: 6px;
            transition: background-color 0.3s ease;
        }

        .links a:hover {
            background-color: #1976D2;
        }
</style>
</head>
<body>
	<h1>Result...</h1>
	ModelAttribue :: ${message} 
	
	
	
	<div class="links">
        <a href="/sms/">Home</a>
        <a href="/sms/allStudents">View All Students</a>
    </div>
	
</body>
</html>