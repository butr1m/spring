<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title> Transfer </title>
<body>
<h2> Transfer </h2>
<form:form action="/saveTransfer" modelAttribute="transferForm" >
    Planet name <form:input path="planet.planetName"/>
    Lord name <form:input path="lord.lordName"/>
    <input type="submit" value="Transfer">
</form:form>
</body>
</html>



