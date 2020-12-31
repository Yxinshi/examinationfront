<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/28
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面 | 考试系统</title>
    <link href="${pageContext.request.contextPath}/static/login/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/login/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/login/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/login/switchery.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/login/bootstrap-select.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/login/pace.min.css" rel="stylesheet">

    <style>
        *{margin: 0;padding: 0;}
        #container {
            position: absolute;
            height: 100%;
            width: 100%;
        }
        #output {
            width: 100%;
            height: 100%;
        }
        .color{
            width: 220px;
            height: 20px;
            margin: 0 auto;
            position: fixed;
            left: 50%;
            margin-left: -75px;
            bottom: 20px;
        }
        .color li{
            float: left;
            margin: 0 5px;
            width: 20px;
            height: 20px;
            background: #ccc;
            box-shadow: 0 0 4px #FFF;
            list-style: none;
            cursor: pointer;
        }
        .color li:nth-child(1){
            background: #002c4a;
        }
        .color li:nth-child(2){
            background: #35ac03;
        }
        .color li:nth-child(3){
            background: #ac0908;
        }
        .color li:nth-child(4){
            background: #18bbff;
        }
        .color li:nth-child(5){
            background: #1d1e23;
        }
        .loginDiv {
            position: absolute;
            width: 100%;
        }
    </style>
    <script src="${pageContext.request.contextPath}/static/login/pace.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/vector.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.min.js"></script>


    <script>

        $(function(){
            //查看员工手机号是否存在
            $("#code").click(function (){
                var phone = $("#phone").val();
                $.ajax({
                    //后台类型
                    url:"${pageContext.request.contextPath}/login/loginUser",
                    //方法类型
                    type:"post",
                    //传的参数
                    data:{
                        "phone":phone
                    },
                    success:function(userLogin){
                        if(userLogin.code==0){
                            console.log(userLogin.messages);
                        }else{
                            console.log(userLogin.messages);
                        }
                    },
                    //error代表你的ajax访问出现问题后出现错误调用的方法
                    error:function(){
                        console.log("访问错误！");
                    }
                })
            })



            //登录
            $("#login").click(function () {
                //获取验证码
                var captcha = $("#captcha").val();
                $.ajax({
                    //后台类型
                    url:"${pageContext.request.contextPath}/login/login",
                    //方法类型
                    type:"post",
                    //传的参数
                    data:{
                        "captcha":captcha
                    },
                    success:function(loginCode){
                        if(loginCode){
                            console.log("成功");
                            window.location.href="EmployeesPage.jsp";
                        }else{
                            console.log("失败");
                        }
                    },
                    //error代表你的ajax访问出现问题后出现错误调用的方法
                    error:function () {
                        console.log("访问错误！");
                    }
                })
            })

        })

        
    </script>


</head>
<body class=" page-effect pace-done">
    <div class="pace  pace-inactive">
        <div class="pace-progress" data-progress-text="100%" data-progress="99" style="width: 100%;">
            <div class="pace-progress-inner"></div>
        </div>
        <div class="pace-activity"></div>
    </div>

    <div id="container">
        <div class="loginDiv">
            <div class="lock-wrapper">
                <div class="panel lock-box">
                    <h4>在线考试系统</h4>
                    <div class="row">
                        <form action="http://www.dxraceresports.cn/login.html" method="post" class="form-inline">
                            <div class="form-group col-md-12 col-sm-12 col-xs-12">
                                <div class="text-left">
                                    <label for="phone" class="text-muted">手机</label>
                                    <input id="phone" type="text" name="phone" placeholder="请输入用户名" class="form-control" required="">
                                </div>
                                <div class="text-left">
                                    <button type="button" class="btn btn-default" id="code">获取验证码</button>
                                    <input id="captcha" name="captcha" type="captcha" placeholder="请输入验证码" class="form-control lock-input" required="">
                                </div>
                                <button type="submit" class="btn btn-block btn-primary" id="login">登录</button>
                            </div>
                        </form>
                    </div>
                    <p>
                    </p>
                </div>
            </div>
        </div>
        <div id="output"></div>
    </div>


    <script src="${pageContext.request.contextPath}/static/login/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/fastclick.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/scripts.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/switchery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/login/bootstrap-select.min.js"></script>
</body>
</html>
