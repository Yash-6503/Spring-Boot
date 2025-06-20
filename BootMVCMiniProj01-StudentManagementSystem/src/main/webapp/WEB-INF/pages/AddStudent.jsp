<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        form {
            width: 60%;
            margin: auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
            color: #333;
        }

        input[type="text"],
        input[type="number"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
        }

        .form-actions {
            text-align: center;
            margin-top: 30px;
        }

        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

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

    <h1>Add Student</h1>

    <form action="/sms/save" method="post">
        <!-- Student Details -->
        <label for="studRoll">Roll Number</label>
        <input type="number" id="studRoll" name="studRoll" readonly style="background-color: lightgrey; border: none; outline: none;">

        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>

        <!-- Marks Details -->
        <label for="english">English Marks</label>
        <input type="number" id="english" name="marks.english" required>

        <label for="marathi">Marathi Marks</label>
        <input type="number" id="marathi" name="marks.marathi" required>

        <label for="maths">Maths Marks</label>
        <input type="number" id="maths" name="marks.maths" required>

        <label for="science">Science Marks</label>
        <input type="number" id="science" name="marks.science" required>

        <label for="socialScience">Social Science Marks</label>
        <input type="number" id="socialScience" name="marks.socialScience" required>

        <div class="form-actions">
            <button onclick="return alert('Student added Succesfully...');" type="submit">Add Student</button>
        </div>
    </form>

    <div class="links">
        <a href="/sms/">Home</a>
        <a href="/sms/allStudents">View All Students</a>
    </div>

</body>
</html>
