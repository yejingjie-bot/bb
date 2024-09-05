package com.itheima.overload;

public class overlodeDemo {
    public static void main(String[] args) {

    }

    //方法重载关系：在同一个类中，定义了多个同名的方法，但每个方法具有不同的参数类型或参数个数，这些同名的方法讲究构成了重载关系
    //方法是否重载简单记：同一个类中，方法名相同，参数不同的方法
            //参数不同：个数不同 、类型不同、顺序不同
    //注意：识别方法之间是否是重载关系，只看方法名和参数，跟返回值无关
    //java虚拟机会通过参数的不同来区分同名的方法
    public static void method(int a, int b) {

    }

    public static void method(int a, int b, int c) {

    }
}
