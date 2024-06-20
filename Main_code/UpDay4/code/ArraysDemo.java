package Main_code.UpDay4.code;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int[10];

        // 创建随机数对象
        Random r = new Random();

        // 采用随机数给数组的每一个元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }

        // 对数组进行排序
        Arrays.sort(arr);
        // 把数组转成指定格式的字符串
        System.out.println(Arrays.toString(arr)); //把字符转化为字符串

        // 打印数组中元素的格式：元素1 元素2
        String str = Arrays.toString(arr);
        str = str.substring(1, str.length() - 1);//从1号位开始到-1，把括号删掉
        str = str.replaceAll(",", " ");//将所有的“,”都替换为空格“ ”
        System.out.println(str);
    }
}
