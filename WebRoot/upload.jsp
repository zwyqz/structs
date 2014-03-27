<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>上传单个文件</title>
</head>
<body>
<s:form action="upload" namespace="/test"
enctype="multipart/form-data" method="post">
<s:file name="upload" label="输入要上传的文件名" />
<s:submit value="上传" />
</s:form>

  
    <form action="${pageContext.request.contextPath}/test/upload" enctype="multipart/form-data" method="post">
    	文件:<input type="file" name="upload">
    	<input type="submit" value="上传"/>
    </form>

</body>