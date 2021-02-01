<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2/1/2021
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Product</h1><br/>
<form method="post" action="/home">
    <label>Product Description</label><br/>
    <input type="text" placeholder="Miêu tả"/><br/>
    <label>List Price</label><br/>
    <input type="text" name="price" placeholder="Price"/><br/>
    <label>Discount Percent</label><br/>
    <input type="text" name="percent" placeholder="%"/><br/>
    <input type="submit" id="submit" value="Total Price"/>
</form>
</body>
</html>
