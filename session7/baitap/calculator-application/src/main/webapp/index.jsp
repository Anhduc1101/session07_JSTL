<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator Application</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
<h1>Calculator Application</h1>
<form action="CalculatorServlet" method="post">
    <label>First Operand: </label>
    <input type="number" name="operand1" /><br/>
    <label>Operator: </label>
    <select name="operator">
        <option name="addition" selected>addition</option>
        <option name="transaction">subtraction</option>
        <option name="multiplication">multiplication</option>
        <option name="division">division</option>
    </select><br>
    <label>Second Operand:</label>
    <input type="number" name="operand2" /><br/>
    <input type = "submit" value = "Calculator"/>
</form>
</body>
</html>