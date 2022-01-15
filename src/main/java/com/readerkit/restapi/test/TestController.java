package com.readerkit.restapi.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping
	public String Home() {
		return "test";
	}
	
	@PostMapping("save")
	public ResponseEntity<Object> testSave() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
