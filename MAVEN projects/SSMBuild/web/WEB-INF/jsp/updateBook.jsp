<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/9/30
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--SQL未传入ID--%>
        <input type="hidden" name="bookID" value="${QBook.bookID}">
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName" value="${QBook.bookName}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" value="${QBook.bookCounts}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" value="${QBook.detail}" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>

</body>
</html>
