<!DOCTYPE html>
<html>
<title> Control Panel </title>
<h1>Control Panel</h1>
<hr>
<body>

<h2> Methods from Lords </h2>

<input type="button" value="Add new Lord"
       onclick="window.location.href='/addNewLord'"/>

<input type="button" value="Transfer the planet to the lord"
       onclick="window.location.href='/transferPlanet'"/>

<input type="button" value="Lords without planets"
       onclick="window.location.href=''"/>

<input type="button" value="10 the youngest lords"
       onclick="window.location.href='/theYoungestLords'"/>

<br>

<h2> Methods from Planets </h2>

<input type="button" value="Add new planet"
onclick="window.location.href='/addNewPlanet'"/>

<input type="button" value="Destroy the planet"
onclick="window.location.href='/showPlanets'">

</body>
</html>