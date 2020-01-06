<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2019/10/16
  Time: 上午9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <s:head/>
</head>
<body>
<s:form action="validationAction">
    <s:textfield name="requiredString" label="Required String" />
    <s:submit />
</s:form>
</body>
</html>
