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
<div class="nested-main-menu">
    <div id="mainLogo" class="box0"><a href="#"><img src="binary-logo.png" height="140" width="127"></a></div>
    <div id="mainPageButton" class="box1"><a href="#">Main page</a></div>
    <div id="mainNewBrewButton" class="box1"><a href="#">New brew</a></div>
    <div id="mainBrewHistoryButton" class="box1"><a href="#">Brew history</a></div>
    <div></div>
    <progress class="progress-left" id="maintenanceProgress" value="" max="100"> 0% </progress>
    <div class="box1"><a href="#">Maintenance</a></div>
</div>

<!-- Page content MIDDLE -->
<!--This part should contain current action (in this case an option to create a New brew)-->
<div class="main">

    <a href="#"><div id="goToNewBrewButton" class="menu-button-main">New brew</div></a>

</div>

<!-- Page content RIGHT side bar -->
<!--This part should contain current ingredient status and current brew status-->
<!--Current brew: "State" (of machine), % finished and a link to "Current brew"-->
<div class="nested-right-bar">
    <div></div>
    <div></div>
    <div class="right-bar-label"><label for="maltValue">Malt:</label></div>
    <div><progress class="progress-right" id="maltValue" value="" max="100"> 0% </progress></div>

    <div class="right-bar-label"><label for="barleyValue">Barley:</label></div>
    <div><progress class="progress-right" id="barleyValue" value="" max="100"> 0% </progress></div>

    <div class="right-bar-label"><label for="wheatValue">Wheat:</label></div>
    <div><progress class="progress-right" id="wheatValue" value="" max="100"> 0% </progress></div>

    <div class="right-bar-label"><label for="hopsValue">Hops:</label></div>
    <div><progress class="progress-right" id="hopsValue" value="" max="100"> 0% </progress></div>

    <div class="right-bar-label"><label for="yeastValue">Yeast:</label></div>
    <div><progress class="progress-right" id="yeastValue" value="" max="100"> 0% </progress></div>


    <div class="right-bar-label"><label for="currentBrewProgress">Active brew:</label></div>
    <div><progress class="progress-right" id="currentBrewProgress" value="" max="100"> 0% </progress></div>

</div>
</div>
</body>
</html>



