<%--
  Created by IntelliJ IDEA.
  User: trann
  Date: 11/22/2023
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator Result</h1>
<p>Operand 1: <%= request.getAttribute("operand1") %></p>
<p>Operand 2: <%= request.getAttribute("operand2") %></p>
<p>Operator: <%= request.getAttribute("operator") %></p>
<p>Result: <%= request.getAttribute("result") %></p>
</body>
</html>
