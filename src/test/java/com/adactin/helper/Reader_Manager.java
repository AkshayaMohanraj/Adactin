package com.adactin.helper;

import java.io.IOException;

public class Reader_Manager {
	
private Reader_Manager() {
		
	}
	
	public static Reader_Manager getInstance() {
		
		Reader_Manager helper = new Reader_Manager();
		
		return helper;

	}
	
	public Configuration_Manager getInstanceCR() throws IOException {
		
		Configuration_Manager reader = new Configuration_Manager();
		
		return reader;

	}

}
