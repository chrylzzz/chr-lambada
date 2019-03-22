package com.lnsoft.dao;

import com.lnsoft.po.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Chr on 2019/1/14/0014.
 */
@Repository("userDao")
public interface UserDao extends JpaRepository<UserInfo, Integer> {//第一个参数，那个实体类，第二个参数，实体类的主键类型

}
