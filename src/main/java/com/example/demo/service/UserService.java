package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Page<User> getUsers(){
        return userMapper.getUsers();
    }

    /**
     *
     * 功能描述: 
     * 使用ehcache.xml配置users缓存，用用户id作为缓存主键
     * @param: id
     * @return: 
     * @auther: zzh
     * @date: 2019-08-17 09:18
     * 在方法执行前Spring先查看缓存中是否存在，如果存在，则直接返回缓存数据，若不存在则调用方法并将方法返回值放进缓存
     */
    @Cacheable(cacheNames = "users", key = "#id")
    public User selectById(String id){
        System.out.println("没有缓存，开始查询数据库……");
        return userMapper.selectByPrimaryKey(id);
    }

//    public List<User> getUsers(){
//        return userMapper.getUsers();
//    }

    // 当我们删除用户、修改用户等操作时，需要把缓存也更新。下面例子使用@CacheEvict注解来删除缓存。
    @CacheEvict(cacheNames = "users", key = "#id")
    public void evictUser(String id){
        System.out.println("evict user" + id);
    }

    public void test(){
        System.out.println("我是注入的service中的方法");
    }
}
