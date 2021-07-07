package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户
 *
 * @author: wolfly
 * @CreateDate: 2021/6/10 12:46
 * @ClassName: User
 * @Description: 用户
 */
@TableName("user")
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
//    private String email;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
