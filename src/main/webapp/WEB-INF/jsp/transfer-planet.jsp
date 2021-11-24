<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title> Transfer </title>
<body>
<h2> Transfer </h2>
<form:form action="/saveTransfer" modelAttribute="transferForm" >
    <div class="field_wrapper">
        Planet name: <form:input path="planet.planetName"/>
    </div>
    <div class="field_wrapper">
        Lord name: <form:input path="lord.lordName"/>
    </div>
    <input type="submit" value="OK">
</form:form>
</body>
</html>

