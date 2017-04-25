package com.bw.controller;

import java.io.PrintWriter;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.util.AutoResponse;
import com.bw.util.SignUtil;

@Controller
public class VerifyController {

	@RequestMapping("verify")
	@ResponseBody
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
       // 微信加密签名
      String signature = request.getParameter("signature");  
      //随机字符串
     String timestamp = request.getParameter("timestamp");  
     // 时间戳 
    String nonce = request.getParameter("nonce");  
     // 随机数
    String echostr = request.getParameter("echostr"); 
    
    PrintWriter out = null;
	try {
		out = response.getWriter();
    //判断token是否有效，有效则向微信返回echostr
    if (SignUtil.checkSignature(signature, timestamp, nonce)) { 
    	//接受用户发送的文本
    	ServletInputStream inputStream = request.getInputStream();

    	String text = AutoResponse.responseText(inputStream); 
    	if(text != null){
    		System.out.println(text);
    		out.print(text);
    	}
          out.print(echostr);
     }  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		out.close();		
	}
    
 }
	
}
