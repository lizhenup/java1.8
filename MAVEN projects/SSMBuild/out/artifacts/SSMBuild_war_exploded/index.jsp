<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/9/13
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <STYLE>
      a {
        text-decoration: none;
        color: black;
        font-size: 18px;

      }
      h3 {
        width: 180px;
        height: 38px;
        margin: 100px auto;
        line-height: 38px;
        background: deeppink;
        border: -r;
      }
    </STYLE>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>
