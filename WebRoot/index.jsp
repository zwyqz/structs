<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>输入操作数</title>
</head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<body>
求代数和
<br/>
<s:form action="control/employee/Sum.action" >
<s:textfield name="operator1" label=" 操作数1"/>
<s:textfield name="operator2" label=" 操作数2" />
<s:submit value="代数和" method="doSum"/>
<s:submit value="zui'xiao's" method="doMin"/>
</s:form>
</body>
</html>
