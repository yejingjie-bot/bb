package com.itheima.test;

public class MethodTest {
    public static void main(String[] args) {

       int result =  getMax(10, 20 );
        System.out.println(result);

    }
    /*
    需求：定义一个方法，方法中定义俩个整数变量，求出最大值打印在控制台
    */

   /*
   带返回值方法的定义和调用：
        public static 数据类型  方法名 （数据类型 变量名1，数据类型 变量名2）{
        return 数据值；
        }

        数据类型  变量名 = 方法名（参数...）;
   */

    //void:当前方法，没有返回值
    public static int getMax (int num1, int num2){
        //int num1 = 10;
        //int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        return max;

    }
}
//return语句下面不能编写代码，因为永远执行不到，属于无效代码
//方法的返回值类型是void，表示该方法没有返回值，没有返回值的方法可以省略return语句不写，如果偏要写return，后面不能跟具体数据