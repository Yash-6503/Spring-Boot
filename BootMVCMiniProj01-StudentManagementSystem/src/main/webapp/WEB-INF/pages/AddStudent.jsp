<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

    <h1>Add Student</h1>

    <form action="/sms/save" method="post" onsubmit="return alert('student added successfully....');">
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
            <button type="submit">Add Student</button>
        </div>
    </form>

    <div class="links">
        <a href="/sms/">Home</a>
        <a href="/sms/allStudents">View All Students</a>
    </div>

</body>
</html>
