package com.lnsoft.lambada;

import com.lnsoft.dao.UserDao;
import com.lnsoft.po.UserInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 下面三个方法的效果一样
 * Created By Chr on 2019/3/22/0022.
 */
@Component
public class TestLambada {

    @Resource
    private UserDao userDao;

    private List<UserInfo> userStore = new ArrayList<>();


    //获取用户id的用户
    public List<UserInfo> getUserInfoById(List<Integer> ids) {

        List<UserInfo> allById = userDao.findAll(ids);

        return allById;
    }


    //lambada：动态传入条件筛选出来需要的数据
    public List<UserInfo> getUserInfo(Predicate<UserInfo> predicate, List<Integer> ids) {
        List<UserInfo> allById = userDao.findAll(ids);
        List<UserInfo> userInfoList = new ArrayList<>();
        allById.forEach(u -> {
            if (predicate.test(u)) {
                userInfoList.add(u);
            }
        });
        return userInfoList;
    }

    //stream进行过滤
    public List<UserInfo> getUserInfoByStream(Predicate<UserInfo> predicate, List<Integer> ids) {
        List<UserInfo> allById = userDao.findAll(ids);
        List<UserInfo> collect = allById.stream().filter(predicate).collect(Collectors.toList());
        return collect;
    }

}
