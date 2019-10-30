package com.sly.demo.cloud.business.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.sly.demo.cloud.business.model.BaseParam;
import com.sly.demo.cloud.business.model.BaseResult;
import com.sly.demo.cloud.business.model.User;
import com.sly.demo.cloud.business.service.BusinessDemoService;

@Controller
@RequestMapping("/business")
public class BusinessDemoController {
	@Autowired
	private BusinessDemoService businessDemoService;
	
	@ResponseBody
	@RequestMapping("/test")
	public Object test() {
		BaseParam baseParam = new BaseParam();
		List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        Map<Object, Object> map = new HashMap<>();
        map.put("id", "id");
        map.put("name", "name");

        
        baseParam.put("key1", "key");
        baseParam.put("key2", new User());
        baseParam.put("key3", list);
        baseParam.put("key4", map);
        
        BaseResult result = businessDemoService.test(baseParam);
        System.out.println(result.getResultObject("key1", String.class));
        System.out.println(JSON.toJSONString(result.getResultObject("key2", User.class)));
        System.out.println(JSON.toJSONString(result.getResultArray("key3", User.class)));
        System.out.println(JSON.toJSONString(result.getResultObject("key4",User.class)));
		
		return result;
	}

}