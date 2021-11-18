<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title> Show Planets </title>
<body>
<h2> Planets </h2>
<br>
<table>
    <tr>
        <th> Name</th>
    </tr>
    <c:forEach var="planet" items="${planetList}">

        <c:url var="deleteButton" value="/destroyPlanet">
            <c:param name="planetId" value="${planet.id}"/>
        </c:url>
        <tr>
            <td>${planet.planetName}</td>
            <td>
            <input type="button" value="Destroy"
            onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>