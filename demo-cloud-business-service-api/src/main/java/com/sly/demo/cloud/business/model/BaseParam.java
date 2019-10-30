package com.sly.demo.cloud.business.model;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用参数（用于在feign调用时传递多个对象参数）
 *
 * @author SLY
 * @time 2019/10/30
 */
public class BaseParam extends HashMap<String, Object> {

    /**
     * 获取参数里的对象
     *
     * @param key
     * @param clazz
     * @return
     * @author SLY
     * @time 2019/10/30
     */
    public <T> T getParamObject(String key, Class<T> clazz) {
        String jsonString = JSON.toJSONString(get(key));
        T object = JSON.parseObject(jsonString, clazz);
        return object;
    }

    /**
     * 获取参数里的list
     *
     * @param key
     * @param clazz
     * @return
     * @author SLY
     * @time 2019/10/30
     */
    public <T> List<T> getParamArray(String key, Class<T> clazz) {
        String jsonString = JSON.toJSONString((List<Object>) get(key));
        List<T> list = JSON.parseArray(jsonString, clazz);
        return list;
    }
}
