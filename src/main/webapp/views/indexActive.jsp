<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>active brew</title>
</head>
<body>
<!-- LEFT side navigation-->
<div class="leftbar">

</div>

<!-- Page content MIDDLE -->
<div class="main">
    <button id="startButton" type="button">START</button>
    <button id="stopButton" type="button">STOP</button>
    <button id="restartButton" type="button">RESTART</button>
    <button id="abortButton" type="button">ABORT</button>
</div>

<!-- batch id, type and amount -->
<!-- TODO establish contact with database -->
<div class="production-value-label1"><label for="batchId">batch id:</label></div>
<div id="batchId" class="production-value1"></div>

<div class="production-value-label1"><label for="typeOfBeer">type:</label></div>
<div id="typeOfBeer" class="production-value1"></div>

<div class="production-value-label1"><label for="productionAmount">amount:</label></div>
<div id="productionAmount" class="production-value1"></div>

<!-- production buttons -->
<!-- TODO implement JS, production-value-->
<div class="production-value-label2"><label for="perMinute">per minute:</label></div>
<div id="perMinute" class="production-value2"> 0</div>

<div class="production-value-label2"><label for="produced">produced:</label></div>
<div id="produced" class="production-value2"> 0</div>

<div class="production-value-label2"><label for="acceptable">acceptable:</label></div>
<div id="acceptable" class="production-value2"> 0</div>

<div class="production-value-label2"><label for="defects">defects:</label></div>
<div id="defects" class="production-value2"> 0</div>

<div class="production-value-label2"><label for="remaining">remaining:</label></div>
<div id="remaining" class="production-value2"> -</div>

<!-- current state -->
<div>
    <div class="" >CURRENT STATE</div>
    <div class="" >IDLE</div>
</div>

<!-- RIGHT side navigation-->
<div class="rightbar">

</div>

</body>
</html>
