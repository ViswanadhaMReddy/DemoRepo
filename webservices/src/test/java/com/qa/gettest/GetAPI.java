package com.qa.gettest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Testbase.Testbase;
import com.qa.client.Restclient;

public class GetAPI extends Testbase {

	Testbase testbase;
	String serviceUrl;
	String apiUrl;
	String url;
	Restclient restclient;
	
	@BeforeMethod
	public void setUp()throws ClientProtocolException,IOException
	{
		testbase = new Testbase();
		serviceUrl=prop.getProperty("URL");
		apiUrl=prop.getProperty("serviceURL");
		
//		Get main URL 
		url=serviceUrl+apiUrl;
	
}

   @Test
   public void GetAPI()throws ClientProtocolException,IOException
   {
	 restclient= new Restclient();
	 restclient.get(url);
   }
}
   