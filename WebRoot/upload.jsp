<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>�ϴ������ļ�</title>
</head>
<body>
<s:form action="upload" namespace="/test"
enctype="multipart/form-data" method="post">
<s:file name="upload" label="����Ҫ�ϴ����ļ���" />
<s:submit value="�ϴ�" />
</s:form>

  
    <form action="${pageContext.request.contextPath}/test/upload" enctype="multipart/form-data" method="post">
    	�ļ�:<input type="file" name="upload">
    	<input type="submit" value="�ϴ�"/>
    </form>

</body>