package com.tfs.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	
	@GetMapping("data")
	public ResponseEntity<String> getAllStudents() {
		
		System.out.println("Insideeeee");
		return new ResponseEntity<String>("Hello response", HttpStatus.OK);
	}
}
