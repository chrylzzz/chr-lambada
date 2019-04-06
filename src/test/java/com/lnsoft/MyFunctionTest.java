package com.lnsoft;

import org.junit.Test;

import java.util.function.Function;

/**
 * lambda：第一种写法，只能是一个完成的语句（一个语句）
 * expression表达式
 * Created By Chr on 2019/3/27/0027.
 */
public class MyFunctionTest {

    public interface MyInterface {
        void sayHello(String name, String content);
    }

    public interface MyInterface2 {
        String sayHello(String name, String content);
    }
    //========================expression，只有一个语句

    @Test
    public void show() {
        Function<Object, Object> identity = Function.identity();
        Object lambda = identity.apply("lambda");
        System.out.println(lambda);
    }


    @Test
    public void show2() {
        Function<String, String> f = t -> t;
        System.out.println(f.apply("lambda"));
    }


    @Test
    public void show3() {
        MyInterface i = (String n, String c) ->
                System.out.println(n + ":" + c);

        i.sayHello("Chr", "thanks~");
    }

    //========================语句块

    @Test
    public void show4() {
        MyInterface2 i = (String n, String c) -> {
            System.out.println(n + ":" + c);
            return n + "->" + c;
        };
        i.sayHello("Chr", "thanks~");
    }

}
