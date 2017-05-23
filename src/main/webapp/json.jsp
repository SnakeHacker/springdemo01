<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Annotation</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    
    <script type="text/javascript">
        $(document).ready(function () {
            $("#add").click(function () {
               var userName = encodeURI($("#userName").attr("value"));
               var age = encodeURI($("#age").attr("value"));

               var user = {userName:"周铭吉",age:"134455"};

               $.ajax(
                   {
                       url:"/springdemo01/user/data/adduserJson",
                       type:"GET",
                       data:{userName:"周铭吉",age:"134455"},
                       success:function (data) {
                            alert("userName--->"+ data.userName + "age--->" + data.age);
                       }

                   }
               );

            });
        });

    </script>
</head>
<body>
    <h2>Json</h2>
    姓名<input type="text" id="userName" name="userName">
    年龄<input type="text" id="age" name="age">
    <input type="button" id="add" value="添加">
</body>
</html>
