<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>About Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
            margin: 0;
            padding: 0;
        }
        .header {
            background: #2196F3;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .content {
            padding: 30px;
            text-align: center;
        }
        .footer {
            background: #333;
            color: white;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
            text-align: center;
        }
        .btn {
            padding: 10px 20px;
            background: #2196F3;
            color: white;
            border: none;
            text-decoration: none;
            font-size: 16px;
            border-radius: 5px;
            margin-top: 20px;
            display: inline-block;
        }
    </style>
</head>
<body>

    <div class="header">
        <h1>About Our Web App</h1>
    </div>

    <div class="content">
        <h2>Who We Are</h2>
        <p>This web application is a demo project to showcase JSP-based UI development integrated with Java backend.</p>
        <p>It includes features such as navigation, page structure, and server-side Java logic using Tomcat.</p>
        <a href="http://localhost:8082/BootMVCProj01-FirstApp/" class="btn">Back to Home</a>
    </div>

    <div class="footer">
        <p>&copy; 2025 My Web App. Built with Java & JSP.</p>
    </div>

</body>
</html>
