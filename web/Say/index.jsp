<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2019/10/16
  Time: 上午8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="login" method="POST">
    <s:textfield name="username" label="User Name:" /><br/>
    <s:password name="password" label="Password" /><br/>
    <s:submit value="Submit" />
</s:form>
</body>
</html>
