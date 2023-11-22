<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: trann
  Date: 11/22/2023
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width: 100%; border-collapse: collapse; margin-bottom: 20px;">
    <h1 style="font-size: 24px; margin-bottom: 10px;">List Customer</h1>
    <thead>
    <tr>
        <th style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd; background-color: #f2f2f2;">Name</th>
        <th style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd; background-color: #f2f2f2;">Birthday</th>
        <th style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd; background-color: #f2f2f2;">Address</th>
        <th style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd; background-color: #f2f2f2;">Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="item">
        <tr>
            <td style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd;">${item.name}</td>
            <td style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd;">${item.birthDay}</td>
            <td style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd;">${item.address}</td>
            <td style="padding: 8px; text-align: left; border-bottom: 1px solid #ddd; "><img style="height: 100px; width: 100px" src="${item.image}" alt=""></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
