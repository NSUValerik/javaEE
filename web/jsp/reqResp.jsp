<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reqResp</title>
</head>
<body>
    <%= request.getParameter("param1")%>
    <br/>
    <% response.getWriter().write("responce");%>
    <br/>
    <%= pageContext.getPage().toString()%>
    <br/>
    <%= session.getId()%>
    <br/>
    <%= application.getContextPath()%>

    <%--not to do--%>
    <% response.getWriter().write("include");%>
    <%@ include file="../WEB-INF/index.jsp"%>
    i

    <% response.getWriter().write("jsp include");%>
    <jsp:include page="../WEB-INF/index.jsp"/>
</body>
</html>
