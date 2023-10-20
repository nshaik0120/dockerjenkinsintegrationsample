package com.techie.dockerjenkinsintegrationsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/jenkins")
	public String test1() {
		
		return "welcome to docker jenkins in ec2";
	}
	
	@GetMapping("/jenkins2")
	public String test2() {
		
		return "welcome to docker jenkins2 in ec2";
	}

}
