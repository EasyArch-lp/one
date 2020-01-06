<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2019/10/16
  Time: 下午7:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="loginPage" /></title>
</head>
<body>
<h3><s:text name="loginTip" /></h3>
<s:form action="Login" method="POST">
    <S:textfield name="username" key="user" />
    <s:textfield name="password" key="password" />
    <s:submit name="submit" key="submit" />
</s:form>
</body>
</html>
