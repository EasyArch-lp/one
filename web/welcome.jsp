<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2019/10/14
  Time: 下午11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+".//"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
</head>
<body>
Struts2Demo<br>
欢迎您，登录成功！
</body>
</html>
