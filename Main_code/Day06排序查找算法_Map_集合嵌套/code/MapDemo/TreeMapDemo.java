package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;

import java.util.TreeMap;

/*TreeMap集合
    TreeMap的底层是红黑树实现的，有排序的能力，键去重。
    可以自然排序（键所在的类要实现Comparable）
    若自定义类没有自然排序功能，或自然排序功能不满足要求时。可以自定义比较器排序（Comparator）
    */
public class TreeMapDemo {
    public static void main(String[] args) {
        //  定义TreeMap集合存储键值对，键使用Integer，值使用String
        // 创建集合对象
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "张三");
        treeMap.put(3, "赵六");
        treeMap.put(2, "王五");
        treeMap.put(5, "牛马");

        System.out.println(treeMap);
    }
}
