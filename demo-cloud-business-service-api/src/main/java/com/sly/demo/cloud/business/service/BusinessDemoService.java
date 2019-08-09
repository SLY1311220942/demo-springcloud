package com.sly.demo.cloud.business.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.demo.cloud.business.service.hystrix.BusinessDemoServiceHystrixImpl;

@FeignClient(name = "demo-cloud-business-service", fallback = BusinessDemoServiceHystrixImpl.class)
public interface BusinessDemoService {

}
