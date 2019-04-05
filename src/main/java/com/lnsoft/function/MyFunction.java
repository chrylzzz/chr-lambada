package com.lnsoft.function;

/**
 * 函数是接口的三种情况：
 * 1.@FunctionalInterface 修饰的接口， 函数式接口，只有一个抽象方法
 * 2.如果不加该 @FunctionalInterface 注解，如果只有一个方法，可以自动识别为函数式接口，例如动态代理的InvocationHandler
 * 3.如果多余的抽象方法 是Object类的方法，不影响第一条规则
 * <p>
 * Created By Chr on 2019/3/27/0027.
 */
@FunctionalInterface
public interface MyFunction {

    //抽象的方法
    void sayHel();

    //Object类的
    String toString();

    /**
     * 函数是接口只能有一个抽象方法，
     * 如果想把函数是接口有多个方法
     * <p>
     * 就可以用default关键字实现
     */
    default void sayHel2() {
        System.out.println("default~");
    }

}
