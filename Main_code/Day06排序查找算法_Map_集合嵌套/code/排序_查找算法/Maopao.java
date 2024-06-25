package Main_code.Day06排序查找算法_Map_集合嵌套.code.排序_查找算法;

import java.util.Arrays;

/*
    冒泡排序 : 将一组数据按照从小到大的顺序进行排序
    冒泡排序的原理 : 相邻元素两两作比较 , 大的元素往后放

    需求 : 将数组中的元素 {3,5,2,1,4} 进行升序排序
 */
public class Maopao {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        for (int i = 0; i < arr.length - 1; i++) { //比较轮次
            // 每轮相邻元素比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序:" + Arrays.toString(arr));
        }
    }
}
