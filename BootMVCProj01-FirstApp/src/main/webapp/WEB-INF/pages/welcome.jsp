<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .header {
            background: #4CAF50;
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
            background: #4CAF50;
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
        <h1>Welcome to My Web App</h1>
    </div>

    <div class="content">
        <h2>This is the Home Page</h2>
        <p>Thank you for visiting our website.</p>
        <a href="http://localhost:8082/BootMVCProj01-FirstApp/about" class="btn">Learn More</a>
    </div>

    <div class="footer">
        <p>&copy; 2025 My Web App. All rights reserved.</p>
    </div>

</body>
</html>
