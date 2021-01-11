package com.bgs.examinationfront.controller;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.bgs.examinationfront.pojo.JsonResult;
import com.bgs.examinationfront.pojo.Result;
import com.bgs.examinationfront.pojo.User;
import com.bgs.examinationfront.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

//登录页面
@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private LoginService loginService;
/**
 *
 * 登录使用
 * */
    //电话号码登录
    @RequestMapping("/loginUser")
    @ResponseBody
    public Result loginUser(String phone, HttpSession session){
        //判断用户输入的手机号是否为空
        Assert.notNull(phone,"亲，手机号不能为空！");
        User selectPhone = loginService.selectPhone(phone);
        if(selectPhone!=null){
            //成功发送短信
            String code = SendMSUtils.getRandomNum(4);
            System.out.println(code);
            boolean sendMsm = SendMSUtils.sendMsm(phone,code);
            if(sendMsm){
                //将验证码存在session里面
                session.setAttribute("code",code);
                session.setAttribute("selectPhone",selectPhone);
                //设置session有效期
                session.setMaxInactiveInterval(5*60);
                return new JsonResult("0","短信发送成功，请注意查收!");
            }
            return new JsonResult("1","短信发送失败！");
        }
        return new JsonResult("1","该手机号不存在，请重新输入");
    }


    //登录
    @RequestMapping("/login")
    @ResponseBody
    public JsonResult login(String captcha,HttpSession session){
        //判断用户输入的验证码是否为空
        Assert.notNull(captcha, "亲，验证码不能为空！");
        //如果不为空 获取短信发送时的验证码
        String code = (String) session.getAttribute("code");
        //获取session中的值进行判断，如果为空 代表超时
        Assert.notNull(code,"验证码超时！");
        //基本数据类型比较用==String类型用equals
        //.itm()为去除字符串两端空格 防止用户登录输入验证码时存在空格出现判断出错
            if(code.equals(captcha.trim())){
                //用户输入的验证码和发送的验证码一致时返回成功
                return new JsonResult("0","登录成功!");
            }else{
                //反之返回登录失败
                return new JsonResult("1","登录失败!");
            }
        }


    }