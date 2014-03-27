<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="<s:url value="/styles/styles.css"/>">
<html>
  <head>
    <title>验证数据</title>
  </head>  
  <body>
    <s:form action="new_validate" namespace="/test" >
        <s:textfield name="msg" label="姓名" />
<s:textfield name="age" label="年龄"/>
<s:textfield name="user.name" label="姓名1" />
<s:textfield name="user.age" label="年龄1"/>
        <s:submit/>
    </s:form> 
  </body>  
</html>