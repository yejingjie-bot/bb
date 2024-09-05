package com.itheima.test;

import java.util.Scanner;

public class OperatorTest1 {
    /*
    需求：键盘录入三个整数，求出最大值并打印在控制台
    */
    public static void main(String[] args) {
        //1.召唤Scanner键盘录入精灵
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        //2.指挥精灵从键盘录入三个整数
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //3.计算出前俩个整数的最大值- tempMax
        int tempMax = num1 > num2 ? num1 : num2;

        //4.计算出三个整数的最大值  -tempMax和第三个整数进行计算
        int max = tempMax > num3 ? tempMax : num3;
        //5.将最大值打印在控制台
        System.out.println("最大值为："  + max);


    }
}
