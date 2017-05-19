<%--
  Created by IntelliJ IDEA.
  User: Snake
  Date: 2017/5/15
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>传递数据</h1>
    ${result}
    欢迎你 周博士
    <div>
        <c:forEach items="${map}" var="m">
            ${m.key} -------> ${m.value}
        </c:forEach>

    </div>
</body>
</html>
