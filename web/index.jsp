<%--
  Created by IntelliJ IDEA.
  User: HoangLinh
  Date: 5/13/2020
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculator" method="post">
    <p>Product Description: </p>
    <textarea name="description" cols="30" rows="5"></textarea>
    <p>List Price:</p>
    <input type="text" name="listPrice">
    <p>Discount Percent (%):</p>
    <input type="text" name="percent">
    <input type="submit" value="Submit">
</form>
</body>
</html>
