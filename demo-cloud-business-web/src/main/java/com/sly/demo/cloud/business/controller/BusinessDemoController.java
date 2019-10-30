package com.sly.demo.cloud.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sly.demo.cloud.business.service.BusinessDemoService;

@Controller
@RequestMapping("/business")
public class BusinessDemoController {
	@Autowired
	private BusinessDemoService businessDemoService;
	
	@ResponseBody
	@RequestMapping("/test")
	public Object test() {
		return businessDemoService.test();
	}

}