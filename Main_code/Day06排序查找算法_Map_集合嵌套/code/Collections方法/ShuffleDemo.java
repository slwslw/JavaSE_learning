package Main_code.Day06排序查找算法_Map_集合嵌套.code.Collections方法;

import java.util.ArrayList;
import java.util.Collections;

/*
    Collections类 : 操作单列集合的工具类
        public static void shuffle(List<?> list) 对集合中的元素进行打乱顺序
        1 乱序只能对List集合进行乱序
        2 集合中元素类型可以任意类型

        需求 : 定义一个List集合，里面存储若干整数。对集合进行乱序
 */
public class ShuffleDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(20);

        Collections.shuffle(list);

        System.out.println(list);// 打印集合中的元素
    }
}