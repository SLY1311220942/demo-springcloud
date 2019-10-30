package com.sly.demo.cloud.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@ResponseBody
	@RequestMapping("/test")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("charset:" + request.getParameter("charset")); 
		System.out.println("data:" + request.getParameter("data")); 
		System.out.println("signType:" + request.getParameter("signType")); 
		System.out.println("sign:" + request.getParameter("sign")); 
		System.out.println("extend:" + request.getParameter("extend")); 
		return "success";
	}

}
