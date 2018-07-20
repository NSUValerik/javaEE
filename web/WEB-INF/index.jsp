<%--no body can view this jsp because it in WEB_INF directory--%>

<%@ page import="java.util.Date" %>
<%@ page import="jsp.JSPHelper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/WEB-INF/tag/MyTag.tld" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  index
  <br/>
  <tag:MyTag param="myParam">body Tag ${param_context} ${tag:doubleSum(3.0, 54)}
      <br/>
    <tag:InnerTag></tag:InnerTag>
  </tag:MyTag>
  <br/>
  <%--declaration--%>
  <%! int i = 5; %>
  <%! private String getString()
  {
     return "lalala" ;
  }%>
  <br/>
  <%--expression return string--%>
  <%= "hello new string"%>
  <br/>
  <%= 2 + 6%>
  <br/>
  <%= "current day"%>
  <br/>
  <%= new Date()%>
  <br/>
  <%= JSPHelper.getDouble( 2.0, 4.0 )%>
  <br/>
  <%--scriptlet--%>
  <%
    class JspClassScriptlet
    {
      public JspClassScriptlet( String name )
      {
          this.name = name;
      }

      public String getString() {
        return name;
      }

      public void setString(String string) {
        this.name = string;
      }

      private String name;

    }
  %>

  <%= new JspClassScriptlet( "hell" ).getString() %>
  <br/>
  <% if( Math.random() < 0.5 ) {%>
  <b> random </b>
  <%}%>
  </body>
</html>
