<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new brew</title>
</head>
<body>
<form action="indexActive.jsp">
    <label for="name">Name</label>
    <input placeholder="name" value="{{}}" type="text" id="name" name="name">

    <label for="type">Beer type</label>
    <select id="type" name="type">
        <option value="ale">Ale</option>
        <option value="pilsner">Pilsner</option>
        <option value="stout">Stout</option>
        <option value=""></option>
    </select>

    <label for="amount">Amount</label>
    <input placeholder="amount" value="" type="number" id="amount" name="amount">



</form>

</body>
</html>