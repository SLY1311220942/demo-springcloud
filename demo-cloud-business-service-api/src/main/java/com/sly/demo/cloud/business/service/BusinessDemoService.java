package com.sly.demo.cloud.business.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sly.demo.cloud.business.service.hystrix.BusinessDemoFallbackFactory;

//@FeignClient(name = "demo-cloud-business-service", fallback = BusinessDemoServiceHystrixImpl.class)
@FeignClient(name = "demo-cloud-business-service", fallbackFactory = BusinessDemoFallbackFactory.class)
//@FeignClient(name = "demo-cloud-business-service")
public interface BusinessDemoService {
	
	@RequestMapping(value = "/businessDemo/test", method = RequestMethod.POST)
	public Object test();
}
