<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="css/stylesheet.css" type="text/css">
    <title>Binary brew</title>
</head>
<body>
<div class="wrapper">
    


<!-- LEFT side navigation, TODO Containers and spacing -->
<!--This part should contain paths to "main page", "new brew" and "brew history". Further down a path to "maintenance"-->
<div class="leftbar">
    <a href="#"><div id="mainPageButton" class="menu-button">Main page</div></a>
    <a href="#"><div id="mainNewBrewButton" class="menu-button">New brew</div></a>
    <a href="#"><div id="mainBrewHistoryButton" class="menu-button">Brew history</div></a>


    <progress id="maintenanceProgress" value="" max="100"> 0% </progress></br>
    <a href="#"><div class="menu-button">Maintenance</div></a>
</div>

<!-- Page content MIDDLE -->
<!--This part should contain current action (in this case an option to create a New brew)-->
<div class="main">

    <a href="#"><div id="goToNewBrewButton" class="menu-button-main">New brew</div></a>

</div>




<!-- Page content RIGHT side bar -->
<!--This part should contain current ingredient status and current brew status-->
<!--Current brew: "State" (of machine), % finnished and a link to "Current brew"-->
<div class="rightbar">
    <label for="maltValue">Malt:</label>
    <progress id="maltValue" value="" max="100"> 0% </progress></br>

    <label for="barleyValue">Barley:</label>
    <progress id="barleyValue" value="" max="100"> 0% </progress></br>

    <label for="wheatValue">Wheat:</label>
    <progress id="wheatValue" value="" max="100"> 0% </progress></br>

    <label for="hopsValue">Hops:</label>
    <progress id="hopsValue" value="" max="100"> 0% </progress></br>

    <label for="yeastValue">Yeast:</label>
    <progress id="yeastValue" value="" max="100"> 0% </progress></br></br></br>

    <label for="currentBrewProgress">Active brew:</label>
    <progress id="currentBrewProgress" value="" max="100"> 0% </progress></br>

</div>
</div>
</body>
</html>



