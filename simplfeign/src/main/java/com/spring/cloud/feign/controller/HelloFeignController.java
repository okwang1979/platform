package com.spring.cloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.feign.service.HelloFeignService;

@RestController
public class HelloFeignController {
	
	@Autowired
	private HelloFeignService feignService;
	
	@GetMapping(value="/search/github")
	public String searchGithubRepoBystr(@RequestParam("str") String queryStr) {
		return String.valueOf(feignService.searchRepo(queryStr));
	}

}
