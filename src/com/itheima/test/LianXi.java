package com.itheima.test;

public class LianXi {
    public static void main(String[] args) {
            study();

    }

    public static void sleep (){
        System.out.println("睡觉");
    }

    public static void eat() {
        System.out.println("吃饭");

    }

    public static void study() {
        System.out.println("学习");
        eat();
        sleep();
    }
}
