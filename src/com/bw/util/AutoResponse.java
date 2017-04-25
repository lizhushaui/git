package com.bw.util;

import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import com.bw.vo.TextMessage;

public class AutoResponse {

	public static String responseText(InputStream inputStream) throws Exception{
		String respMessage = null;


	      // xml请求解析
	      Map<String, String> requestMap = new MessageUtil().xmlToMap(inputStream);

	      if(requestMap == null){
	    	  return respMessage;
	      }
	      // 发送方帐号（open_id）
	      String fromUserName = requestMap.get("FromUserName");
	      // 公众帐号
	      String toUserName = requestMap.get("ToUserName");
	      // 消息类型
	      String msgType = requestMap.get("MsgType");
	      // 消息内容
	      String content = requestMap.get("Content");

	      // 回复文本消息
	      if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
	    	  TextMessage text = new TextMessage();
	          text.setContent("<![CDATA["+TuLing.tuling(content)+"]]>");
	          text.setToUserName("<![CDATA["+fromUserName+"]]>");
	          text.setFromUserName("<![CDATA["+toUserName+"]]>");
	          text.setCreateTime(new Date().getTime() + "");
	          text.setMsgType("<![CDATA["+msgType+"]]>");
	      
	          respMessage = MessageUtil.textMessageToXml(text);
	      }

	      return respMessage;

	}


}
