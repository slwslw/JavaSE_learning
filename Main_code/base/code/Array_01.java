package Main_code.base.code;

import java.util.Random;

public class Array_01 {
    public static void main(String[] args) {
        //定义一个数组,并进行初始化
        int[] scores = {93, 96, 99};
        System.out.println(scores); //输出的数组所在的地址
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("-------------");

        //修改数组元素
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        System.out.println("-------------");
        //定义数组并初始化
        int[] arr = {77, 88, 99, 66, 55, 44};
        for (int i = 0; i < arr.length; i++) { //逐个输出数组内的数据
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int j : arr) { //简单的遍历
            System.out.println(j);
        }

        System.out.println("-------------");
        //获取最大数值
        //定义数组
        int[] arr1 = {12, 45, 98, 73, 60};
        //定义变量max存储最大值，取第一个数据为变量的初始值
        int max = arr1[0];
        //与数组中剩余数据逐个比对，每次比对将最大值保存到变量max中
//        for (int i = 1; i < arr1.length; i++) {
//            if (arr1[i] > max) {
//                max = arr[i];
//            }
//        }
        for (int j : arr1) {
            if (j > max) {
                max = j;
            }
        }
        //循环结束后输出变量max的值
        System.out.println("max:" + max);

        System.out.println("-------------");
        //定义数组
        int[] arr2 = {12, 45, 98, 73, 60};
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            int index = r.nextInt(arr2.length); //找到数组里的一个随机地址
            int temp = arr2[i]; //交换
            arr2[i] = arr2[index];
            arr2[index] = temp;
        }
        //遍历数组
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
