package com.lnsoft.lambada;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Chr on 2019/4/23/0023.
 */
public class Test {

    public static void main(String args[]) {
        //按天算：10分钟一次
//        List<Object> liObjst=query();
//        List<All>
        List<Integer> integerList = new ArrayList<>();

        Integer i1 = 1;
        Integer i2 = 8;
        Integer i3 = 9;
        Integer i4 = 4;
        Integer i5 = 5;
        Integer i6 = 7;
        Integer i7 = 8;
        Integer i8 = 4;
        integerList.add(i1);
        integerList.add(i2);
        integerList.add(i3);
        integerList.add(i4);
        integerList.add(i5);
        integerList.add(i6);
        integerList.add(i7);
        integerList.add(i8);

        int asInt = integerList.stream().mapToInt(a -> a).max().getAsInt();
        System.out.println(asInt);


    }


}

