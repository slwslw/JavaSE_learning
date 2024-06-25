package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*LinkedHashMap类 , 在最底层采用的数据结构 : 是链表+哈希表。
特点 :
    元素唯一 (用哈希表)
    元素有序 (用链表)
    */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "刘备");
        linkedHashMap.put(2, "诸葛亮");
        linkedHashMap.put(3, "周瑜");
        linkedHashMap.put(4, "曹操");

        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "---" + value);
        }

        System.out.println("----------");

        LinkedHashMap<Student, String> map = new LinkedHashMap<>();

        map.put((new Student("张三", 18)), "武汉");
        map.put((new Student("赵四", 20)), "南京");
        map.put((new Student("王刚", 33)), "武汉"); //使用哈希表，删除键相同的元素
        map.put((new Student("王刚", 33)), "上海");

        Set<Student> s = map.keySet();
        for (Student student : s) {
            System.out.println(student + "----" + map.get(student));
        }
    }
}
