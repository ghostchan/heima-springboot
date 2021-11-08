package com.itheima.service;

import com.itheima.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    //根据id查询
    public User queryById(Long id) {
        return new User();
    }

    //新增保存用户
    @Transactional
    public void saveUser(User user) {
        System.out.println("新增用户...");
    }
}
