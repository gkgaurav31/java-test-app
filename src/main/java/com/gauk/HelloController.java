package com.gauk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/filetest")
	public String nullExceptionTest() throws FileNotFoundException {
		FileReader fr = 
			      new FileReader("C:\\test.txt");
		return "OK";
	}
	
	@GetMapping("/oom")
	public String OOMTest() {
		
		 Map m = new HashMap(); 
	        m = System.getProperties(); 
	        Random r = new Random(); 
	        while (true) { 
	            m.put(r.nextInt(), "randomValue"); 
	        } 
		
	}
	
	@GetMapping("/nulltest")
	public String nullTest() {
		User user = null;
		return user.getName();
	}
	
	
}


class User{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
