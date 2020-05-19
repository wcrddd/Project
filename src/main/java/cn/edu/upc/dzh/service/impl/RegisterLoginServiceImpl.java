package cn.edu.upc.dzh.service.impl;

import cn.edu.upc.dzh.service.RegisterLoginService;
import cn.edu.upc.manage.dao.UserMapper;
import cn.edu.upc.manage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterLoginServiceImpl implements RegisterLoginService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public void insertUser(User user){
        userMapper.insertSelective(user);
    }

    @Override
    public User selectByUsername(String username){
        return userMapper.selectByUsername(username);
    }

    @Transactional
    @Override
    public void changePasswordByEmail(String newPassword,String email){
        userMapper.changePasswordByEmail(newPassword,email);
    }

    @Override
    public User selectByEmail(String email){
        return userMapper.selectByEmail(email);
    }
}