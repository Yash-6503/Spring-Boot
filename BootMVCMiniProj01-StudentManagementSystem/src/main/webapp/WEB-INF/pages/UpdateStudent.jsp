<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

    <h1>Update Student</h1>

    <form action="/sms/modify" method="post" onsubmit="return alert('Student updated successfully....');">
        <!-- Student Details -->
        <label for="studRoll">Roll Number</label>
        <input type="number" id="studRoll" name="studRoll" value="${student.studRoll}" readonly style="background-color: lightgrey; border: none; outline: none;">

        <label for="name">Name</label>
        <input type="text" id="name" name="name" value="${student.name}" required>

        <label for="email">Email</label>
        <input type="email" id="email" name="email" value="${student.email}" required>

        <!-- Marks Details -->
        <label for="english">English Marks</label>
        <input type="number" id="english" name="marks.english" value="${student.marks.english}" required>

        <label for="marathi">Marathi Marks</label>
        <input type="number" id="marathi" name="marks.marathi" value="${student.marks.marathi}" required>

        <label for="maths">Maths Marks</label>
        <input type="number" id="maths" name="marks.maths" value="${student.marks.maths}" required>

        <label for="science">Science Marks</label>
        <input type="number" id="science" name="marks.science" value="${student.marks.science}" required>

        <label for="socialScience">Social Science Marks</label>
        <input type="number" id="socialScience" name="marks.socialScience" value="${student.marks.socialScience}" required>

        <div class="form-actions">
            <button type="submit">Update Student</button>
        </div>
    </form>

    <div class="links">
        <a href="/sms/">Home</a>
        <a href="/sms/allStudents">View All Students</a>
    </div>

</body>
</html>
