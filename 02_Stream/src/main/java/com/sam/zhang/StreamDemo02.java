package com.sam.zhang;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
Stream creation
 */
public class StreamDemo02 {
    public static void main(String[] args) {

        //单列集合
//        test01();

        //数组：Arrays.stream(arr) or Stream.of()
//        test02();

        //双列集合：转换成单列集合再创建
        test03();
    }

    private static void test03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("小明", 19);
        map.put("小花", 18);
        map.put("小兰", 17);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream = entrySet.stream();
//        stream.filter(new Predicate<Map.Entry<String, Integer>>() {
//            @Override
//            public boolean test(Map.Entry<String, Integer> entry) {
//                return entry.getValue() > 17;
//            }
//        })
//                .forEach(new Consumer<Map.Entry<String, Integer>>() {
//            @Override
//            public void accept(Map.Entry<String, Integer> entry) {
//                System.out.println(entry.getKey() + "的年龄是：" + entry.getValue());
//            }
//        });

        stream.filter(entry -> entry.getValue() > 17)
                .forEach(entry -> System.out.println(entry.getKey() + "的年龄是：" + entry.getValue()));
    }

    private static void test02() {
        Integer[] arr = {1,2,3,4,4,5};
//        Stream<Integer> stream = Arrays.stream(arr);
        Stream<Integer> stream = Stream.of(arr);
//        stream.distinct()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer > 2;
//                    }
//                })
//                .forEach(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer integer) {
//                        System.out.println(integer);
//                    }
//                });

        stream.distinct()
                .filter(integer -> integer > 2)
                .forEach(System.out::println);
    }

    private static void test01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,4, 5);
        Stream<Integer> stream = list.stream();
//        stream.distinct()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer > 2;
//                    }
//                })
//                .forEach(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer integer) {
//                        System.out.println(integer);
//                    }
//                });

        stream.distinct()
                .filter(integer -> integer > 2)
                .forEach(System.out::println);
    }


}
