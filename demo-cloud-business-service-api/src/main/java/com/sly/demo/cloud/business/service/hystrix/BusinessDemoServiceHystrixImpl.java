package com.sly.demo.cloud.business.service.hystrix;

import org.springframework.stereotype.Component;

import com.sly.demo.cloud.business.model.BaseParam;
import com.sly.demo.cloud.business.model.BaseResult;
import com.sly.demo.cloud.business.model.ResultStatus;
import com.sly.demo.cloud.business.service.BusinessDemoService;

@Component
public class BusinessDemoServiceHystrixImpl implements BusinessDemoService {

	@Override
	public BaseResult test(BaseParam baseParam) {
		return new BaseResult(ResultStatus.SYSTEM_ERROR);
	}

}
