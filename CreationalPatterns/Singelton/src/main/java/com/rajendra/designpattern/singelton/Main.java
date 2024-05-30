package com.rajendra.designpattern.singelton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        SingletonExample singletonExample3 = SingletonExample.getInstance();

        System.out.println("instance count : " + SingletonExample.count);
        System.out.println("singletonExample == singletonExample2 : " + (singletonExample == singletonExample2));
    }
}
