package Main_code.Day06排序查找算法_Map_集合嵌套.code.排序_查找算法;

import java.util.Arrays;

/*
    选择排序工作原理 :
        它的工作原理是每一次从待排序的数据元素中选出最小的一个元素，
        存放在序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
        以此类推，直到全部待排序的数据元素排完。

    注意 :
        1 有n个元素，那么就要比较n-1趟。
        2 每一趟中都会选出一个最值元素，较前一趟少比较一次
 */
public class Xuanze {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3, 2};

        // 遍历数组
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
