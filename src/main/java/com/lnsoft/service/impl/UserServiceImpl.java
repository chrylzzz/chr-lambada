package com.lnsoft.service.impl;

import com.lnsoft.dao.UserDao;
import com.lnsoft.po.UserInfo;
import com.lnsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Chr on 2019/1/14/0014.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserInfo> findAllUser() {
        return userDao.findAll();
    }
}
