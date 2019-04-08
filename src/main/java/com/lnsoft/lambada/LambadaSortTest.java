package com.lnsoft.lambada;

import com.lnsoft.dao.UserDao;
import com.lnsoft.po.UserInfo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 不用数据库做逻辑，用Java代码做逻辑：stream流
 * Created By Chr on 2019/4/6/0006.
 */
@Repository
public class LambadaSortTest {

    @Resource
    private UserDao userDao;


    //排序对比
    public void sortTest(List<Integer> ids) {
        //1.优化之前
        List<UserInfo> allByIds = userDao.findAll(ids);
        Collections.sort(allByIds, new Comparator<UserInfo>() {
            @Override
            public int compare(UserInfo o1, UserInfo o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //2.lambada优化
        Collections.sort(allByIds, (o1, o2) -> o1.getAge() - o2.getAge());
        //3.stream优化，性能更好：可以把stream()换位parallelStream(),根据cpu并行调用
        //(1)list
        List<UserInfo> chrList = allByIds.stream()
                .filter(u -> u.getAge() == 24)//过滤得到24的
                .filter(u -> u.getName().equals("Chr"))//过滤得到姓名为Chr的
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                //.collect(Collectors.groupingBy(u->u.getGender()==1))//再分组为男的
                .collect(Collectors.toList());
        //(2)map
        Map<Boolean, List<UserInfo>> chrMap = allByIds.stream()
                .filter(u -> u.getAge() == 24)//过滤得到24的
                .filter(u -> u.getName().equals("Chr"))//过滤得到姓名为Chr的
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .collect(Collectors.groupingBy(u -> u.getGender() == 1));//再分组为男的


        ///==========================
//        (1)steam的遍历
        allByIds.stream().forEach(u -> System.out.println(u.getName()));


    }

}
