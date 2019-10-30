package com.sly.demo.cloud.business.service.impl;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sly.demo.cloud.business.model.BaseParam;
import com.sly.demo.cloud.business.model.BaseResult;
import com.sly.demo.cloud.business.model.ResultStatus;
import com.sly.demo.cloud.business.model.User;
import com.sly.demo.cloud.business.service.BusinessDemoService;

@RestController
public class BusinessDemoServiceImpl implements BusinessDemoService {


//	public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        System.out.println(simpleDateFormat.format(new Date()));
//    }
	@Override
	public BaseResult test(@RequestBody BaseParam baseParam) {
		System.out.println(baseParam.getParamObject("key1", String.class));
        System.out.println(JSON.toJSONString(baseParam.getParamObject("key2", User.class)));
        System.out.println(JSON.toJSONString(baseParam.getParamArray("key3", User.class)));
        System.out.println(JSON.toJSONString(baseParam.getParamObject("key4",User.class)));
		
		BaseResult result = new BaseResult(ResultStatus.QUERY_SUCCESS, baseParam);
		return result;
	}
}
