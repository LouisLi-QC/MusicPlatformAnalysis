package com.hwadee.scu.common.util;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * create by: fanyang
 * description: 封装好的redis工具类二，使用自己配置的RedisTemplate模板
 * key和value的序列化方式分别为String和json
 * 如果是<String,Object>类型的数据使用这个工具类
 * 如果是<String,String>类型的数据使用另外一个工具类
 * create time:
 */
public class RedisUtils {
    private RedisTemplate redisTemplate;

    public boolean LPush(String key,String value){
        try{
            redisTemplate.opsForList().leftPush(key,value);
            return true;
        }catch (Exception e)
        {
            System.out.println("RedisUtil写入redis缓存失败！错误信息为：" + e.getMessage());

        }
        return false;
    }
}
