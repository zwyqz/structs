<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>���������</title>
</head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<body>
�������
<br/>
<s:form action="control/employee/Sum.action" >
<s:textfield name="operator1" label=" ������1"/>
<s:textfield name="operator2" label=" ������2" />
<s:submit value="������" method="doSum"/>
<s:submit value="zui'xiao's" method="doMin"/>
</s:form>
</body>
</html>
