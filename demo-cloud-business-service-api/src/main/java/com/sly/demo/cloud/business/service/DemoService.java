package com.sly.demo.cloud.business.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.sly.demo.cloud.business.service.hystrix.DemoServiceHystrixImpl;

@FeignClient(name = "demo-cloud-business-service", fallback = DemoServiceHystrixImpl.class)
public interface DemoService {

}
