package com.sly.demo.cloud.business.service.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.sly.demo.cloud.business.service.BusinessDemoService;

@Component
public class BusinessDemoServiceHystrixImpl implements BusinessDemoService {

	@Override
	public Object test() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status", 400);
		result.put("message", "出错了！");
		return result;
	}

}
