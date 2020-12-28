<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-12-27
  Time: 下午 8:43
  To change this template use File | Settings | File Templates.
  在线考试页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static\bootstrap\css\bootstrap.min.css">
    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static\bootstrap\js\bootstrap.js"></script>

    <link rel="stylesheet" href="/static\bootstrap\table\bootstrap-table.css">
    <script src="/static\bootstrap\table\bootstrap-table.js"></script>
    <script src="/static\bootstrap\js\bootstrap-table-zh-CN.min.js"></script>

</head>
<body>
<table id="table"></table>
</body>
</html>
<script>

    $(function () {
        genjuUserId();
    })

    function genjuUserId(){
        $('#table').bootstrapTable({
            url: '/EPCon/selectuserAllEp',
            method: "post",
            pagination: true,
            pageNumber: 1,
            pageSize: 2,
            pageList: [5, 10],
            sidePagination: "client",         //分页方式：client客户端分页，server服务端分页（*）
            cache: false,
            columns: [
                {title: '课程名称', field: 'testPaperName'},
                {title: '考试日期', field: 'testPaperDate'},
                {title: '考试时间', field: '',
                    formatter: function (value, row, index) {
                        return row.testPaperStartTime+' — '+row.testPaperEndTime;
                    }},
                {title: '考试次数', field: 'testPaperTime'},
                {title: '及格分数', field: 'testPaperPassMark'},
                {title: '总分', field: 'testPaperFullMark'},
                {title: '操作', field: '',
                    formatter: function (value, row, index) {
                        return row.testPaperId+"进去考试";
                    }
                }
            ]
        });
    }


</script>
