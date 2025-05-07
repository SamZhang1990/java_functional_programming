package com.sam.zhang;

import java.util.function.IntBinaryOperator;

public class LambdaDemo02 {

    public static void main(String[] args) {
        int total = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(total);

        total = calculateNum((int left, int right) -> {
            return left + right;
        });
        System.out.println(total);

        total = calculateNum((left, right) -> left + right);
        System.out.println(total);

        total = calculateNum(Integer::sum);
        System.out.println(total);

    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
