package com.lnsoft.stream;

import com.lnsoft.dao.UserDao;
import com.lnsoft.viewobject.UserInfoVo;
import com.lnsoft.po.UserInfo;
import com.lnsoft.resp.ReturnResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/3/24/0024.
 */
@Repository
public class TestStream {

    @Resource
    private UserDao userDao;

    public ReturnResult testStream(List<Integer> ids) {

        List<UserInfo> userInfoList = userDao.findAll(ids);
        List<UserInfoVo> collect = userInfoList.stream().map(UserInfo -> {
            UserInfoVo user = convertUserFromUserInfo(UserInfo);
            return user;
        }).collect(Collectors.toList());
        return ReturnResult.create(collect);
    }

    private UserInfoVo convertUserFromUserInfo(UserInfo userInfo) {
        if (userInfo == null)
            return null;
        UserInfoVo user = new UserInfoVo();
        BeanUtils.copyProperties(userInfo, user);
        return user;
    }
}
