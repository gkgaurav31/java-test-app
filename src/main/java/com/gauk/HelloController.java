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
	
	@GetMapping("/nulltest")
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
	
	
}
