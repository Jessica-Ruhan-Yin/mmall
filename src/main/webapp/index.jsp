<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
springmvc上传文件
<form name="form1" action="${pageContext.request.contextPath}/manage/product/upload.do" method="post"
      enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="springmvc上传文件"/>
</form>
</body>
</html>
