package com.bgs.examinationfront.controller;

import java.util.HashMap;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

public class SendMSUtils {

	public static boolean sendMsm(String phone,String code) {
		HashMap<String,Object> result=null;
		//初始化SdK
		CCPRestSmsSDK restAPI=new CCPRestSmsSDK();

		//初始化服务器地址和端口
		restAPI.init("app.cloopen.com", "8883");
		//设置业务信息
		//初始化主账号名称和主账号令牌
		restAPI.setAccount("8aaf07086812057f0168313b618c106e", "c56fc2d0fe2b40bb8cd6bf5ad4761165");
		restAPI.setAppId("8aaf07086812057f0168313b61dd1074");
		//请使用管理控制台中已创建的应用的APPID，则13000000000手机号收到的短信内容是：【云通讯】您使用的是云通讯短信模板，您的验证码是6532，请于5分钟内

		result=restAPI.sendTemplateSMS(phone, "1", new String[] {code,"5"});
		System.out.println(result);
		//获取发送结果
		if("000000".equals(result.get("statusCode"))) {
			return true;
		}else {
			return false;
		}

	}
	/**
	 * 获取一个几位随机数（num=4则为4位数的随机数）
	 */
	public static String getRandomNum(int num) {
		String dataCode = "";
		for (int i = 0; i < num; i++) {
			dataCode += String.valueOf(Math.round(Math.random() * 9));
		}
		return dataCode;
	}
}
