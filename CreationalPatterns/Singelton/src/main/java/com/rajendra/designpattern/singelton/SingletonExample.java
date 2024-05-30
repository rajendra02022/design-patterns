package com.rajendra.designpattern.singelton;

public class SingletonExample { // lazy construction
    // the class variable is null if no instance is
// instantiated
    public static int count = 0;
    private static SingletonExample uniqueInstance = null;
    private SingletonExample() {
    }

    // lazy construction of the instance
    public static SingletonExample getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonExample();
            System.out.println("instance created ");
            count++;
        }
        return uniqueInstance;
    }

}