<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<style>
	<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f6f8;
        margin: 0;
        padding: 20px;
    }

    .container {
        background-color: #fff;
        padding: 30px;
        margin: auto;
        max-width: 1000px;
        box-shadow: 0 8px 16px rgba(0,0,0,0.1);
        border-radius: 8px;
    }

    h1 {
        color: #333;
        text-align: center;
        margin-bottom: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    table, th, td {
        border: 1px solid #ddd;
    }

    th {
        background-color: #007BFF;
        color: white;
        padding: 12px;
        text-align: center;
    }

    td {
        padding: 10px;
        text-align: center;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
    }

    a:hover {
        text-decoration: underline;
        color: white;
        
    }

    p {
        text-align: center;
        margin: 20px 0;
    }

    p a {
        margin: 0 5px;
        padding: 5px 10px;
        border: 1px solid #007BFF;
        border-radius: 5px;
        background-color: #007BFF;
        color: white;
        transition: background-color 0.3s ease;
    }

    p a:hover {
        background-color: #0056b3;
    }

    .message {
        color: green;
        text-align: center;
        font-weight: bold;
        margin-top: 20px;
    }

    .error {
        color: red;
        text-align: center;
        font-weight: bold;
    }
</style>
	
</style>

<div class="container">
	<h1>Pagination & Sorting of Employees</h1>
	<c:choose>
		<c:when test="${!empty empsData.getContent()}">
		
			<table>
				<tr>
					<th>EmpNo</th>
					<th>EmpName</th>
					<th>Job</th>
					<th>Email</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
				
				<c:forEach var="emp" items="${empsData.getContent()}">
					<tr>
						<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.job}</td>
						<td>${emp.email}</td>
						<td>
							<a href="edit?no=${emp.empId}">Update</a>
							
						</td>
						<td>
							<a onclick="return confirm('you really want to delete?')" href="delete?no=${emp.empId}">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
			</table>
			
			<p>
			    <c:if test="${empsData.hasPrevious()}">
			        <a href="report?page=${empsData.number - 1}">Previous</a>
			    </c:if>
			
			    <c:if test="${!empsData.isFirst()}">
			        <a href="report?page=0">First</a>
			    </c:if>
			
			    <c:forEach var="i" begin="1" end="${empsData.totalPages}">
			        <a href="report?page=${i-1}">${i}</a>
			    </c:forEach>
			
			    <c:if test="${!empsData.isLast()}">
			        <a href="report?page=${empsData.totalPages - 1}">Last</a>
			    </c:if>
			
			    <c:if test="${empsData.hasNext()}">
			        <a href="report?page=${empsData.number + 1}">Next</a>
			    </c:if>
			</p>

		</c:when>
		
		<c:otherwise>
			<h1>Records not Found..</h1>
		</c:otherwise>
	</c:choose>
	
	
	<c:if test="${!empty resultMsg }">
		<h1>${resultMsg}</h1>
		
	</c:if>
	
	<br> <br>
</div>