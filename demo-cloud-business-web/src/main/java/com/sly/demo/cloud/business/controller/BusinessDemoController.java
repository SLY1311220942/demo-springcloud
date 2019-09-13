package com.sly.demo.cloud.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/business")
public class BusinessDemoController {
	
	@ResponseBody
	@RequestMapping("/test01")
	public Object test01() {
		return "test01";
	}
}
