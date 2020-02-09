package com.lnsoft.lambada;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * lambada
 * <p>
 * Created by Chryl on 2020/2/9.
 */
public class TestLamdba {
    public static void main(String[] args) {
        //java 8 打印
        Consumer consumer = System.out::println;
        consumer.accept("hello---");

        Student student = new Student("1", null);
        //java 8 判null,代替if判断
        String s = Optional.ofNullable(student)
                .map(Student::getB)
//                .map(Student::getA)
                .orElse(null);
        System.out.println(s);

    }


    public static class Student {
        private String a;
        private String b;

        public Student() {
        }

        public Student(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }
    }
}
