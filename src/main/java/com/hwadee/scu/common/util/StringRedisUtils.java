package com.hwadee.scu.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * create by: fanyang
 * description: 封装好的redis工具类一，使用springboot集成的StringRedisTemplate模板
 * key和value的序列化方式都为String
 * 如果是<String,String>类型的数据使用这个工具类
 * 如果是<String,Object>类型的数据使用另外一个工具类
 *
 * create time:
 */
@Service
public class StringRedisUtils {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * create by: fanyang
     * description: 添加键值对到redis数据库
     * params:key和value,均为String类型
     * return:返回是否插入成功
     * create time:
     */
    public boolean set(String key, String value){
        boolean result = false;
        try {
            stringRedisTemplate.opsForValue().set(key,value);
            result = true;
        } catch (Exception e) {
            System.out.println("RedisUtil写入redis缓存失败！错误信息为：" + e.getMessage());
        }
        return result;
    }
    /**
     * create by: fanyang
     * description: 传入key值，获取value值，value类型为String
     * params:String类型的key值
     * return:String类型的value值
     * create time:
     */
    public String get(String key){
        String result = null;
        try {
            result=stringRedisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            System.out.println("RedisUtil读取redis缓存失败！错误信息为：" + e.getMessage());        }
        return result;
    }









}

