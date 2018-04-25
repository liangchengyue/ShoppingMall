<%--
  Created by IntelliJ IDEA.
  User: liangchengyue
  Date: 2018/4/25 025
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title> 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link href="../resource/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link href="../resource/fonts/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="../resource/fonts/animate.min.css" rel="stylesheet">
    <link href="../resource/h/style.min.css" rel="stylesheet">
    <link href="../resource/h/login.min.css" rel="stylesheet">
    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if (window.top !== window.self) { window.top.location = window.location };
    </script>

</head>

<body class="signin">
<div class="signinpanel">
    <div class="row">
        <div class="col-sm-7">
            <div class="signin-info">
                <div class="logopanel m-b">
                    <img src="img/贵州大学明德学院.png" width="60px" />
                </div>
                <div class="m-b"></div>
                <h4>欢迎使用 <strong>大学生助学贷款管理系统</strong></h4>
                <ul class="m-b">
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>
                </ul>
                <strong>还没有账号？ <a href="#">立即注册&raquo;</a></strong>
            </div>
        </div>
        <div class="col-sm-5">
            <form method="post" action="#">
                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">登录大学生助学贷款管理系统</p>
                <input type="text" class="form-control uname" id="name" placeholder="用户名" />
                <input type="password" class="form-control pword m-b" id="password" placeholder="密码" />
                <select class="form-control" id="type" style="color:#888">
                    <option value="0">超级管理员</option>
                    <option value="1">学生</option>
                    <option value="2">学校</option>
                    <option value="3">贷款方</option>
                </select>
                <button class="btn btn-success btn-block" type="button" id="login">登录</button>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
            &copy; 2017-2018 H+
        </div>
    </div>
</div>
</body>

</html>