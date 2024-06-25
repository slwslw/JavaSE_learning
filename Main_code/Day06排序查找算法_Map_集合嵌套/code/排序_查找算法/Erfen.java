package Main_code.Day06排序查找算法_Map_集合嵌套.code.排序_查找算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    二分查找 :
        原理 : 每次去掉一般的查找范围
        前提 : 数组必须有序
        步骤 :
            1，定义两个变量，表示要查找的范围。默认min = 0 ， max = 最大索引
            2，循环查找，但是min <= max
            3，计算出mid的值
            4，判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引
            5，如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找
            6，如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找
            7，当 min > max 时，表示要查找的元素在数组中不存在，返回-1.
 */
public class Erfen {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.binarySearch(arr,7)); //这个方法是自带的，但是要搞懂方法
        int i = binarySearch(arr, 8);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr, int num) {
        // 定义两个变量，表示要查找的范围。默认min = 0 ， max = 最大索引
        int max = arr.length - 1;
        int min = 0;

        // 2，循环查找，但是min <= max
        while (min <= max) {
            // 3，计算出mid的值
            int mid = (min + max) / 2;

            if (arr[mid] == num) {
                //  4，判断mid位置的元素是否为要查找的元素，如果是直接返回对应索引
                return mid;
            } else if (arr[mid] > num) {
                // 5，如果要查找的值在mid的左半边，那么min值不变，max = mid -1.继续下次循环查找
                max = mid - 1;
            } else if (arr[mid] < num) {
                // 6，如果要查找的值在mid的右半边，那么max值不变，min = mid + 1.继续下次循环查找
                min = mid + 1;
            }
        }
        return -1;
    }
}
