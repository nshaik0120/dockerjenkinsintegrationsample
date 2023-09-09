package com.techie.dockerjenkinsintegrationsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/jenkins")
	public String test1() {
		
		return "welocme to docker jenkins in ec2";
	}

}
