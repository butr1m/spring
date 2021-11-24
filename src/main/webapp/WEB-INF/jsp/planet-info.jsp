<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<title> Planet Info</title>
<body>
<h2> Planet Info </h2>
<br>
<form:form action="/savePlanet" modelAttribute="planet">
    <form:hidden path="id"/>
    Name <form:input path="planetName"/>
    <input type="submit" value="OK">

</form:form>

</body>
</html>