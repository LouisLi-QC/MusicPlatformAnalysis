package com.hwadee.scu.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * create by: fanyang
 * description: 封装好的redis工具类二，使用自己配置的RedisTemplate模板
 * key和value的序列化方式分别为String和json
 * 如果是<String,Object>类型的数据使用这个工具类
 * 如果是<String,String>类型的数据使用另外一个工具类
 * create time:
 */
@Service
public class RedisUtils {

    @Autowired
    private  RedisTemplate<String,Object> redisTemplate;

    /**
     * create by: fanyang
     * description: 存key,Object到redis中
     * params:key为键值，object为对象
     * return:返回是否插入成功
     * create time:
     */
    public boolean set(String key,Object object){
        try{
            redisTemplate.opsForValue().set(key,object);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }
    /**
     * create by: fanyang
     * description: 存一个对象到redis中
     * params:key为键值，map为value，也就是我们想要存的对象
     * 例如map为<name,fy><age,18>
     * return:返回是否插入成功
     * create time:
     */
    public  boolean Hset(String key, Map<String,Object> map){
        try{
            redisTemplate.opsForHash().putAll(key,map);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * create by: fanyang
     * description: 获得Hash类型中的值
     * params:key为Hash对象的key，hkey为Hash中某个key,value的key
     * return:返回hkey对应的value
     * create time:
     */
    public Object Hget(String key,Object hkey){
        return redisTemplate.opsForHash().get(key,hkey);
    }


    public boolean LPush(String key,String value){
        try{
            redisTemplate.opsForList().leftPush(key,value);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
