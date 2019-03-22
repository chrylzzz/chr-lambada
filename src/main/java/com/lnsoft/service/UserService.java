package com.lnsoft.service;

import com.lnsoft.po.UserInfo;

import java.util.List;

/**
 * Created By Chr on 2019/1/14/0014.
 */
public interface UserService {

    List<UserInfo> findAllUser();
}
