package com.itheima.operator;

public class OperatorDemo4 {
    /*
    短路逻辑运算符：
    &&：具有短路效果，左边为false,右边不执行了  左边为true，右边要继续执行

    ||：具有短路效果，左边为true，右边不执行，左边为false，右边要继续执行

    常用逻辑运算符： &&    ||    ！
    */
    public static void main(String[] args) {
         int x = 3;
         int y = 4;

         boolean result = ++x > 5 && y-- < 4;

        System.out.println(x);   //4
        System.out.println(y);    //3
        System.out.println(result);     //false
    }
}
