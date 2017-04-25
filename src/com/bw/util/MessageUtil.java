package com.bw.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bw.vo.TextMessage;
import com.thoughtworks.xstream.XStream;

public class MessageUtil {
	/** 
	   * 返回消息类型：文本 
	   */ 
	  public static final String RESP_MESSAGE_TYPE_TEXT = "text"; 
	 
	  /** 
	   * 返回消息类型：音乐 
	   */ 
	  public static final String RESP_MESSAGE_TYPE_MUSIC = "music"; 
	 
	  /** 
	   * 返回消息类型：图文 
	   */ 
	  public static final String RESP_MESSAGE_TYPE_NEWS = "news"; 
	 
	  /** 
	   * 请求消息类型：文本 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_TEXT = "text"; 
	 
	  /** 
	   * 请求消息类型：图片 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_IMAGE = "image"; 
	 
	  /** 
	   * 请求消息类型：链接 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_LINK = "link"; 
	 
	  /** 
	   * 请求消息类型：地理位置 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_LOCATION = "location"; 
	 
	  /** 
	   * 请求消息类型：音频 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_VOICE = "voice"; 
	 
	  /** 
	   * 请求消息类型：推送 
	   */ 
	  public static final String REQ_MESSAGE_TYPE_EVENT = "event"; 
	 
	  /** 
	   * 事件类型：subscribe(订阅) 
	   */ 
	  public static final String EVENT_TYPE_SUBSCRIBE = "subscribe"; 
	 
	  /** 
	   * 事件类型：unsubscribe(取消订阅) 
	   */ 
	  public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe"; 
	 
	  /** 
	   * 事件类型：CLICK(自定义菜单点击事件) 
	   */ 
	  public static final String EVENT_TYPE_CLICK = "CLICK";
	public Map<String, String> xmlToMap(InputStream inputStream) throws Exception{
		
		Map<String,String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		
		
		try{
			//File ins = new File("src/com/bw/config/aaa.xml");  
			//InputStream qq = this.getClass().getResourceAsStream("/com/bw/config/aaa.xml");
			System.out.println(inputStream);
			Document doc = reader.read(inputStream);
			Element root= doc.getRootElement();
			List<Element> list = root.elements();
			
			for(Element e:list){
				map.put(e.getName(), e.getText());
				System.out.println(e.getName()+e.getText());
			}
			return map;
		}catch(Exception e){
			System.out.println("发生未知错误");
			e.printStackTrace();
		}finally{
			inputStream.close();
		}
		return null;
	}
	public static String textMessageToXml(TextMessage text) {

		XStream xstream = new XStream();
		xstream.alias("xml", text.getClass());
		return xstream.toXML(text);
	}
}
