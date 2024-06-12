package Main_code.base;

/*
动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
格式：数据类型[] 变量名 = new 数据类型[数组长度];
范例：int[] arr = new int[3];
*/

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        //格式：数据类型[] 变量名 = new 数据类型[数组长度];
        int[] arr = new int[3]; //int[] arr存在栈内存，new int[3]在堆内存开一个空间
        //输出数组名
        System.out.println(arr); //[I@776ec8df
        //输出数组中的元素
        System.out.println(arr[0]); //默认初始化值为0
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");
        //修改数组中的元素
        arr[0] = 10; //通过栈内存的地址，修改堆内存的值
        arr[1] = 20;
        arr[2] = 30;
        //再次输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//      静态初始化：开始就存入元素值，适合一开始就能确定元素值的业务场景
//      动态初始化：指定数组长度，后期赋值，适合开始知道数据的数量，但是不确定具体元素值的业务场景
//      注意：两种初始化的方式是独立的，不可以混用
        System.out.println("------------");
        int[] arr3 = new int[3];
        System.out.println(arr3[2]);
        arr3 = null;
        //对象设置为null，不在指向堆内存数据了，还想继续访问堆内存数据
        // System.out.println(arr3[0]);

        System.out.println("------------");
        //用键盘输入
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //定义一个数组，并进行动态初始化
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素：");
            arr1[i] = sc.nextInt();
        }
        printArray(arr1); //构造输出方法
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
