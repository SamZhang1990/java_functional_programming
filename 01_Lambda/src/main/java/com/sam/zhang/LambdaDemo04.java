package com.sam.zhang;

import java.util.function.Function;

public class LambdaDemo04 {

    public static void main(String[] args) {
        Integer in = typeConvert(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println(in);

        in = typeConvert((String s) -> {
            return Integer.valueOf(s);
        });
        System.out.println(in);

        in = typeConvert(s -> Integer.valueOf(s));
        System.out.println(in);

        in = typeConvert(Integer::valueOf);
        System.out.println(in);

        String convertedStr = typeConvert(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "convert" + s + " to String";
            }
        });
        System.out.println(convertedStr);

        convertedStr = typeConvert((String s) -> {
            return "convert" + s + " to String";
        });
        System.out.println(convertedStr);

        convertedStr = typeConvert(s -> "convert" + s + " to String");
        System.out.println(convertedStr);
    }

    public static <R> R typeConvert(Function<String, R> function) {
        String str = "12345";
        return function.apply(str);
    }
}
