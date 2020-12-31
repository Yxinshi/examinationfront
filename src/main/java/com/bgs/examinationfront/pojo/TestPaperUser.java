package com.bgs.examinationfront.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class TestPaperUser {
    private Integer testPaperId;//试卷表  主键ID
    private Integer userId;//用户表 主键ID
    private String userName;//用户名
    private String totalPoints;//总成绩
    private String passState;//通过状态
    private String joinState;//参加状态
    private Data startTime;//开始时间
    private Date emdTime;//结束时间

}
