<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="true"%>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="Person" class="beans.Person" scope="request"/>
    <%--<jsp:useBean id="Person" class="beans.Person" scope="session"/>--%>
    <%--<jsp:useBean id="Person" class="beans.Person" scope="application"/>--%>
    <jsp:getProperty name="Person" property="name"/>
    <jsp:getProperty name="Person" property="age"/>

    ${Person.name}
    ${Person.age}
    ${Person["age"]}
    ${requestScope.Person.name}
    ${requestScope.Person.age}

    ${list[0]}
    ${list[1]}

    ${cookie.JSESSIONID}
</body>
</html>
