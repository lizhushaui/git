package com.bw.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class TuLing {

	
	public static String tuling(String name) throws Exception {
		
		final String APIKEY = "ebf73d1ab79645caaaaf8da71baf2c52";
		String info = URLEncoder.encode(name, "UTF-8");
		String getUrl = "http://www.tuling123.com/openapi/api?key="+APIKEY+"&info="+info;
		
		URL url = new URL(getUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line = "";
		while((line = br.readLine()) != null){
			sb.append(line);
		}
		
		connection.disconnect();
		
		return sb.toString().substring(23,sb.length()-3);
	}

	
}
