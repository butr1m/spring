<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title> Show Lords </title>
<body>
<h2> Lords </h2>
<br>
<table>
    <tr>
        <th> Name</th>
        <th> Age</th>
    </tr>
    <c:forEach var="lord" items="${listTheYoungestLords}">
        <tr>
            <td>${lord.lordName}</td>
            <td>${lord.lordAge}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>