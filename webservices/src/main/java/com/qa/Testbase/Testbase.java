package com.qa.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testbase {
	public static Properties prop;
 
	 public Testbase()
	 {
	 	try
	 	{
	 	prop= new Properties();
	 	FileInputStream fis = new FileInputStream("E:/TestMaven/webservices/src/main/java/com/qa/config/config.properties");
	 	prop.load(fis);
	 	}
	 	catch(FileNotFoundException e)
	 	{
	 		e.printStackTrace();
	 	}
	 	catch(IOException e)
	 	{
	 		e.printStackTrace();
	 	}
	 	catch(NullPointerException e)
	 	{
	 		e.printStackTrace();
	 	}
	 }


 }

