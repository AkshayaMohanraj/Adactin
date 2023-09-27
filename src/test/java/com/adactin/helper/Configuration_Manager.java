package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Manager {
	
public static Properties p;
	
	public Configuration_Manager() throws IOException {
		
		File f = new File("C:\\Users\\home\\eclipse-workspace\\Adactin1\\src\\test\\java\\com\\adactin\\helper\\File.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);

	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;

	}

}
