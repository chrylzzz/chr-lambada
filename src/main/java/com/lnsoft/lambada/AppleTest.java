package com.lnsoft.lambada;

import com.lnsoft.po.Apple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/4/23/0023.
 */
public class AppleTest {

    public static List<Apple> showApple() {

        Apple apple1
                = new Apple("a1", "红富士", new Date(2018, 2, 28), new BigDecimal(5), 66);
        Apple apple2
                = new Apple("a2", "黑富士", new Date(2018, 4, 25), new BigDecimal(4), 16);
        Apple apple3
                = new Apple("a3", "白富士", new Date(2018, 6, 11), new BigDecimal(3), 6);
        Apple apple4
                = new Apple("a4", "蓝富士", new Date(2018, 7, 20), new BigDecimal(7), 30);
        Apple apple5
                = new Apple("a5", "绿富士", new Date(2018, 9, 13), new BigDecimal(6), 76);
        Apple apple6
                = new Apple("a6", "灰富士", new Date(2018, 5, 28), new BigDecimal(9), 76);
        Apple apple7
                = new Apple("a7", "粉富士", new Date(2018, 8, 4), new BigDecimal(3), 76);
        Apple apple8
                = new Apple("a8", "黄富士", new Date(2018, 3, 29), new BigDecimal(2), 76);
        Apple apple9
                = new Apple("a9", "橙富士", new Date(2018, 1, 16), new BigDecimal(7), 76);


        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
        return appleList;
    }

    public static void main(String args[]) {
        List<Apple> appleList = showApple();

        List<Apple> collect = appleList.stream()
                .filter(
                        d -> d.getAppleSaleDate().getTime() - new Date(2018, 5, 30).getTime() > 0
                )
                .filter(
                        d -> new Double(d.getApplePrice().doubleValue()) - 3 > 0
                )
                .filter(
                        d -> d.getAppleNums() >= 30
                )
                .collect(Collectors.toList());

        for (Apple apple : collect) {
            System.out.println(apple);
        }


//        Date date = new Date(2018, 2, 3);
//        System.out.println(date.getTime());
    }
}
