package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        List<User> users = userMapper.selectList(wrapper);
//        users.forEach(user->{
//            System.out.println(user.toString());
//        });
//        System.out.println("测试");


        Object bean = SpringContextUtil.getBean(UserMapper.class);
        System.out.println(bean);
    }

}
