package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Restclient {

	
//	GET Method 
	public void get(String url) throws ClientProtocolException, IOException
	{
	CloseableHttpClient httpClient=HttpClients.createDefault();
		
//		HTTP get request
		HttpGet httpget= new HttpGet(url);
		
//		Hit the URL
		CloseableHttpResponse closableHttpResponse=httpClient.execute(httpget); 
		 
//		Get Status Code 
		int statusCode=closableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("status code:"+statusCode);
		
//		Response string(Response Output)
		String responseString=EntityUtils.toString(closableHttpResponse.getEntity(),"UTF-8");
		
//		Get output in Json format 
		JSONObject responsejson= new JSONObject(responseString);
		System.out.println("Response json API:"+responsejson);
		
//		To get headers 
		Header[] headersArray=closableHttpResponse.getAllHeaders();
		
//		Store headers data in key and value 
		HashMap<String, String> allHeaders= new HashMap<String,String>();
		
		for(Header header :headersArray)
		{
			allHeaders.put(header.getName(),header.getValue());
		}
		System.out.println("HeaderArray:"+allHeaders);
	} 
}
