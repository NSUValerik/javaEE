<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean
    </title>
</head>
<body>
    <jsp:useBean id="person" class="beans.Person" scope="application"/>
    <jsp:setProperty name="person" property="name" value="Mickey"/>
    <jsp:getProperty name="person" property="name"/>

    <jsp:setProperty name="person" property="age" value='<%=request.getParameter( "age" )%>'/>
    <jsp:getProperty name="person" property="age"/>

    <jsp:useBean id="person_2" class="beans.Person">
        <jsp:setProperty name="person_2" property="name" value='<%="Name Person"%>'/>
    </jsp:useBean>
    <jsp:getProperty name="person_2" property="name"/>
</body>
</html>
