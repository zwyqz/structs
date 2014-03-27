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
<s:form action="control/employee/year.action" >
<s:textfield name="year" label=" year" />
<s:submit value="提交" method="execute"/>
</s:form>
</body>
</html>
