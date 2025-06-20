<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 12px 20px;
            text-align: left;
            border-bottom: 1px solid #ddd;
            text-align: center;
        }

        th {
            background-color: #4CAF50;
            color: white; 
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        td {
            color: #333;
        }

        td:nth-child(4), td:nth-child(5), td:nth-child(6) {
            text-align: center;
        }

        .action-btn {
            padding: 5px 12px;
            margin: 0 2px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            color: white;
            font-size: 0.9em;
        }

        .view-btn { background-color: #2196F3; }
        .update-btn { background-color: #FFC107; }
        .delete-btn { background-color: #F44336; }

        .no-data {
            text-align: center;
            color: #777;
        }
        
        /* Style for Home and Add Student buttons */
		a[href="/sms/"], a[href="/sms/add"] {
		    display: inline-block;
		    text-decoration: none;
		    padding: 10px 20px;
		    margin: 30px 10px 0 10px;
		    font-weight: bold;
		    border-radius: 8px;
		    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
		    transition: background-color 0.3s ease;
		    color: white;
		}

		/* Home button */
		a[href="/sms/"] {
		    background-color: #4CAF50;
		}
		
		a[href="/sms/"]:hover {
		    background-color: #45a049;
		}
		
		/* Add Student button */
		a[href="/sms/add"] {
		    background-color: #2196F3;
		}
		
		a[href="/sms/add"]:hover {
		    background-color: #1976D2;
		}
		
		.links{
			display: flex;
			justify-content: center;
			align-items: center;
			
		}
	        
        
    </style>
</head>
<body>

    <h1>All Students</h1>

    <!--  <p style="text-align:center; color: #888;">ModelAttributes :: ${students}</p>-->

    <c:choose>
        <c:when test="${!empty students}">
            <table>
                <tr>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>View</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <c:forEach var="stud" items="${students}">
                    <tr>
                        <td>${stud.studRoll}</td>
                        <td>${stud.name}</td>
                        <td>${stud.email}</td>
                        <td>
                        	<a href="/sms/view/${stud.studRoll}">
	                        	<button class="action-btn view-btn">View</button>
                        	</a>
                        </td>
                        <td>
                        	<a href="/sms/update/${stud.studRoll}">
                        		<button class="action-btn update-btn">Update</button>
                        	</a>
                        </td>
                        <td>
                        	<a onclick="return confirm('you want to delete Student');" href="/sms/delete/${stud.studRoll}" >
                        		<button class="action-btn delete-btn">Delete</button>
                        	</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h2 class="no-data">Students Not Found...</h2>
        </c:otherwise>
    </c:choose>

	<div class="links">
		<a href="/sms/">Home</a>
		<a href="/sms/add">Add Student</a>
	</div>
</body>
</html>
