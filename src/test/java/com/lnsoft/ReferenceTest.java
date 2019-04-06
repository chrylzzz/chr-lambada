package com.lnsoft;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created By Chr on 2019/4/5/0005.
 */
public class ReferenceTest {

    public String sayHel(String name) {
        System.out.println(name);
        return name + "Hello~";
    }

    public interface myLove {
        String getLove();
    }

    public interface Compare {
        int doCompare(String name1, String name2);
    }

    public interface Compare2 {
        int doCompare(Integer num1, Integer num2);
    }

    //========================reference方法引用
    @Test
    public void test1() {
        ReferenceTest test = new ReferenceTest();
        //（1）基于实例方法的引用
        Function<String, String> f = test::sayHel;

        f.apply("chr");
    }

    @Test
    public void test2() {
        ReferenceTest test2 = new ReferenceTest();

        Function<String, String> sayHel = test2::sayHel;
        sayHel.apply("nancy");
    }

    //========================构造方法引用
    @Test
    public void test3() {
        //（2）构造方法引用
        //为什么是String：String getLove();因为该方法是String
        myLove myLove = String::new;
        String love = myLove.getLove();
        System.out.println(love);

        //工厂方法
        Supplier supplier = String::new;
        System.out.println(supplier);
    }


    //========================基于参数实例方法引用
    @Test
    public void test4() {
        //（3）基于参数实例方法引用
        Compare compare = String::compareTo;
        int i = compare.doCompare("a", "b");
        System.out.println(i);

    }

    @Test
    public void test5() {
        //（3）基于参数实例方法引用
        Compare2 compare2 = Integer::compareTo;
        int i = compare2.doCompare(1, 2);
        System.out.println(i);

    }

    //========================静态方法引用
    public interface Compare3 {
        int toInt(String str);
    }

    @Test
    public void test6() {
        //（4）静态方法引用
        Compare3 compare3 = Integer::valueOf;
        int i = compare3.toInt("12");
        System.out.println(i);

    }
}
