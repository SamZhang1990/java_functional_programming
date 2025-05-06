package com.sam.zhang;

public class LambdaDemo01 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello Lambda");
//            }
//        }).start();

        new Thread(() -> {
                System.out.println("Hello Lambda");
            }).start();
    }
}
