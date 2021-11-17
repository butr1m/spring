<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<title> Lord info</title>
<body>
<h2> Lord Info</h2>
<br>
<form:form action="/saveLord" modelAttribute="lord">

    <form:hidden path="id"/>
    Name <form:input path="lordName"/>
    <br>
    <br>
    Age <form:input path="lordAge"/>
    <br>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>