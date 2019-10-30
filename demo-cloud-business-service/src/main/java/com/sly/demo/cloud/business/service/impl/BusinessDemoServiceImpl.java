package com.sly.demo.cloud.business.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.sly.demo.cloud.business.service.BusinessDemoService;

@RestController
public class BusinessDemoServiceImpl implements BusinessDemoService {


//	public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        System.out.println(simpleDateFormat.format(new Date()));
//    }
	@Override
	public Object test() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status", 200);
		result.put("message", "正常！");
		return result;
	}
}
