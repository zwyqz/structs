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
<s:form action="control/employee/year.action" >
<s:textfield name="year" label=" year" />
<s:submit value="�ύ" method="execute"/>
</s:form>
</body>
</html>
