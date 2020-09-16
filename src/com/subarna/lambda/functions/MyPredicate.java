package com.subarna.lambda.functions;

@FunctionalInterface
public interface MyPredicate<T> {

    public boolean predicateTest(T t);

    public static boolean staticCheck(String str) {
        return str.toString().contains("A");
    }

}
