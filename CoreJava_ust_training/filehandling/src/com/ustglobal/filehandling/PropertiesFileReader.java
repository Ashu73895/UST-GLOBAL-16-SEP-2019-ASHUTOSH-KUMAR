package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			System.out.println("URL is "+url);
			System.out.println("User is "+user);
			System.out.println("Password is "+password);
//			
//			
//			int i;
//			while((i=reader.read())!=-1){
//				System.out.print((char)i);
//			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
