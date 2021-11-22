<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title> Transfer </title>
<body>
<h2> Transfer </h2>
<table>
    <tr>

        <td>
            <table>
                <tr>
                    <td>
                <tr>
                    <th> Planet name</th>
                </tr>
                <c:forEach var="planet" items="${planetListWithoutLords}">
                    <tr>
                        <td>${planet.planetName}</td>
                    </tr>
                </c:forEach>
                </td>
                </tr>
            </table>
        </td>

        <td>
            <table>
                <tr>
                    <td>
                <tr>
                    <th> Lord name</th>
                </tr>
                <c:forEach var="lord" items="${listAllLords}">
                    <tr>
                        <td>${lord.lordName}</td>
                    </tr>
                </c:forEach>
                </td>
                </tr>
            </table>
        </td>

    </tr>
</table>
</body>
</html>


