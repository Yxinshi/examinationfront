<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-12-26
  Time: 上午 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/static/layuiadmin/style/admin.css" media="all">
    <script src="/static\layuiadmin\layui\layui.js"></script>
    <script src="/static/js/jquery-3.3.1.min.js"></script>

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <div class="layui-header layui-bg-red">
        <div class="layui-logo">layui 后台布局</div>

        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>

    </div>


    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item">
                    <img src="/static\imgs\tubiao.jpg" style="height: 80px;width: 80px;margin: 15px 20px 25px 65px;">
                </li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a href="onlineExamination.jsp" style="margin: 15px 20px 25px 50px;">
                        在线考试
                    </a>
                </li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a href="examinationLog.jsp" style="margin: 15px 20px 25px 50px;">
                        考试记录
                    </a>
                </li>

                <li class="layui-nav-item">
                    <a href="xiugaimima.jsp" style="margin: 15px 20px 25px 50px;">修改密码</a>
                </li>

            </ul>
        </div>
    </div>

    <div class="layui-body">

        <iframe  frameborder="0" scrolling="no" id="iframeMain" src="" style="width: 100%"; height="90%";></iframe>

    </div>


    <div class="layui-footer">
        © layui.com - 底部固定区域
    </div>

</div>
<script src="../src/layui.js"></script>
<script>

    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

    //内嵌页面跳转
    $(document).ready(function(){
        $("li>a").click(function (e) {
            e.preventDefault();
            $("#iframeMain").attr("src",$(this).attr("href"));
        });
    });


</script>
</body>
</html>
