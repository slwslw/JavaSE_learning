package Main_code.Day06排序查找算法_Map_集合嵌套.code.Collections方法;

import java.util.ArrayList;
import java.util.Collections;

/*
    Collections类 : 单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。
        要特别注意的是sort方法只能对List集合进行排序，方法如下：

        public static <T extends Comparable> void sort (List<T> list)

        练习：定义List集合，存储若干整数，进行排序
 */
public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        // 使用此方法 , 需要集合中存储的元素实现Comparable接口
        Collections.sort(list);

        System.out.println(list);
    }
}