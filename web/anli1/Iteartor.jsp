<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2019/10/15
  Time: 下午6:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iteartor 标签</title>
</head>
<body>
<%
    List<String> list=new ArrayList<>();
    list.add("Leon");
    list.add("Jhon");
    list.add("Peter");
    list.add("Jeff");
    list.add("Linda");
    request.setAttribute("names",list);
%>
<h3>Names:</h3>
<ol>
    <s:iterator value="#request.names" status="statu">
        <S:if test="#statu.odd">
            <li>奇数行:<s:property /></li>
        </S:if>
        <s:else>
            <li>偶数行:<s:property /></li>
        </s:else>
    </s:iterator>
</ol>
</body>
</html>
