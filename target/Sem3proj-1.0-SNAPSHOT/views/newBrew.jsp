<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new brew</title>
</head>
<body>

<!-- Page content MIDDLE -->
<form action="indexActive.jsp"> <!-- TODO insert link-->

    <label for="name">Name</label>
    <input id="name" placeholder="name" value="" type="text" name="name">

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
    <input value="" type="number" id="speed" name="speed"> <!-- TODO value skal indeholde en sti til der hvor vi regner fart ud-->
    <!-- Skal vi overhovedet have denne her? Ville det ikke være nok at have den på active brew? -->

    <a href="#"><input id="newBrewSubmit" class="submit" type="submit" value="start" name="newBrewSubmit" ></a> <!-- TODO skal starte maskinen. How to?-->
</form>

</body>
</html>