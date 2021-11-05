<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="src/main/webapp/css/stylesheet.css">
    <title>front page</title>
</head>
<body>

<!-- LEFT side navigation, TODO Containers and spacing -->
<!--This part should contain paths to "main page", "new brew" and "brew history". Further down a path to "maintenance"-->
<div class="leftbar">
    <a href="#">Main pagez</a>
    <a href="#">New brew</a>
    <a href="#">Brew history</a>


    <progress id="maintenanceProgress" value="" max="100"> 0% </progress></br>
    <a href="#">Maintenance</a>
</div>

<!-- Page content MIDDLE -->
<!--This part should contain current action (in this case an option to create a New brew)-->
<div class="main">



    <a href="#">
        <button class="button" id="newBrewButton" type="button">New brew</button>
    </a>

</div>

<!-- Page content RIGHT side bar -->
<!--This part should contain current ingredient status and current brew status-->
<!--Current brew: "State" (of machine), % finnished and a link to "Current brew"-->
<br class="rightbar">
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

</body>
</html>


<button class="submit" type="submit">Submit</button>
