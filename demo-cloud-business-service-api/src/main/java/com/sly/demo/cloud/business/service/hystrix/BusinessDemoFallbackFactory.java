package com.sly.demo.cloud.business.service.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sly.demo.cloud.business.service.BusinessDemoService;

import feign.hystrix.FallbackFactory;

@Component
public class BusinessDemoFallbackFactory implements FallbackFactory<BusinessDemoService> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessDemoFallbackFactory.class);

	@Override
	public BusinessDemoService create(Throwable cause) {
		LOGGER.error(ExceptionUtils.getStackTrace(cause));
		System.out.println("-------------");
		LOGGER.error(cause.getMessage());
		return new BusinessDemoService() {

			@Override
			public Object test() {
				Map<String, Object> result = new HashMap<String, Object>();
				result.put("status", 400);
				result.put("message", "出错了！");
				return result;
			}

		};
	}

}
