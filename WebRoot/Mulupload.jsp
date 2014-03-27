<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <script language="javascript">

function addComponent()
{
        var uploadHTML = document.createElement( "<input type='file'  name='upload'/>");
        document.getElementById("files").appendChild(uploadHTML);
        uploadHTML = document.createElement( "<p/>");
        document.getElementById("files").appendChild(uploadHTML);
}
</script>
    </head>
    <body>
        <input type="button" onclick="addComponent();" value="添加文件" />
        <br />
        <form onsubmit="return true;" action="/struts2/test/upload.action"
            method="post" enctype="multipart/form-data">
            <span id="files"> <input type='file' name='upload' />
                <p />
            </span>
            <input type="submit" value="上传" />
        </form>
    </body>

</html>