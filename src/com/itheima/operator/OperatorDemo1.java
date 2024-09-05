package com.itheima.operator;

public class OperatorDemo1 {
    /*
    赋值运算符：
    1.基本赋值运算符
            =：将等号右侧的数据赋值给左边的变量

    2.扩展赋值运算符
            +=：将符号左右两边的数据做加法运算，再将结果赋值给左边
            -=：
            *=：
            /=:
            %=:

            细节补充：扩展运算符，内部自带强转效果
    */
    public static void main(String[] args) {
        int num = 10;

        num += 20;      //num = num + 20;
        System.out.println(num);


        short s = 1;
        s += 1;      //s = (short)(s + 1);
        System.out.println(s);

        double a = 12.3;
        int b = 10;

        b += a;
        System.out.println(b);



    }
}
