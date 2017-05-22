<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Annotation</title>
    <script type="text/javascript">
        function adduser() {
            var form = document.forms[0];
            form.action="/springdemo01/user/data/adduser";
            form.method="post";
            form.submit();
        }
    </script>
</head>
<body>
    <h2>添加用户</h2>
    <form action="">
        姓名<input type="text" name="userName">
        年龄<input type="text" name="age">
        <input type="button" value="添加" onclick="adduser()">

    </form>
</body>
</html>
