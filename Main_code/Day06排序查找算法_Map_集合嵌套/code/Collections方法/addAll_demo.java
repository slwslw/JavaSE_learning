package Main_code.Day06排序查找算法_Map_集合嵌套.code.Collections方法;

import java.util.ArrayList;
import java.util.Collections;

/*
    Collections的addAll方法
        static <T> boolean  addAll(Collection<? super T> c , T... elements) : 添加任意多个数据到集合中
        分析： 该方法就是一个含有可变参数的方法，使用时可以传入任意多个实参，实用方便！
        练习：创建一个List集合，使用addAll方法传入若干字符串
 */
public class addAll_demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40);
        System.out.println(list);// [10, 20, 30, 40]

        ArrayList<Object> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 20, 30, 40,"man");
        System.out.println(list1);
    }
}