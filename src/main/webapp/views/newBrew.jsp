<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new brew</title>
</head>
<body>
<form action="indexActive.jsp"> <!-- TODO insert link-->

    <label for="name">Name</label>
    <input placeholder="name" value="" type="text" id="name" name="name">

    <label for="beerType">Beer type</label>
    <select id="beerType" name="beerType">
        <option value="ale">Ale</option>
        <option value="pilsner">Pilsner</option>
        <option value="stout">Stout</option>
        <option value="ipa">IPA</option>
    </select>

    <label for="amount">Amount</label>
    <input placeholder="amount" value="" type="number" id="amount" name="amount">

    <label for="speed">Speed</label>
    <input value="" type="number" id="speed" name="speed"><!-- "value skal indeholde en sti til der hvor vi regner fart ud-->

    <input class="submit" type="submit" value="start">
</form>

</body>
</html>