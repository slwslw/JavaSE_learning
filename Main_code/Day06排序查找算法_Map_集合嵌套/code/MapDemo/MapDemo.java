package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
map集合的特点：
    1.可以存储两个元素（键值对元素）
    2.key元素不能重复， value元素允许重复
    3.一个key元素只能对应一个value元素（一一对应）//通过key可以找到value
    4.存取元素不保证顺序
    5.没有索引
java.util.Map（接口）
    HashMap：底层使用哈希表
    LinkedHashMap：底层使用哈希表+链表
    TreeMap：底层使用红黑树

    Map中常用方法 :
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中
        public boolean containKey(Object key): 判断该集合中是否有此键。

     需求 : 将以下数据保存到Map集合中 , 进行测试以上方法
        “文章“       "马伊琍
        “谢霆锋”     “王菲”
        “李亚鹏”     “王菲”
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建双链集合
/*    HashMap：
        此前的HashSet底层实现就是HashMap完成的，
        HashSet保存的元素其实就是HashMap集合中保存的键，底层结构是哈希表结构，具有键唯一，无序，特点。*/
        Map<String, String> hm = new HashMap<>();

        //添加元素,public V put(K key, V value):把指定的键与指定的值添加到Map集合中
        hm.put("文章", "马伊琍");
        hm.put("谢霆锋", "王菲");
        hm.put("李亚鹏", "王菲");
        hm.put("李亚", "王菲");
        hm.put("李亚鹏", "王菲"); //不储存键重复的元素

        System.out.println(hm);

        //public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
        System.out.println(hm.remove("谢霆锋")); //输出王菲

        // public V get(Object key) 根据指定的键，在Map集合中获取对应的值
        System.out.println(hm.get("李亚鹏")); //输出王菲
        System.out.println("-----------------");

        // public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中
        Set<String> set = hm.keySet();
        for (String s : set) {
            System.out.println("键: " + s + "  对象: " + hm.get(s));
        }
        System.out.println("-----------------");

        // public boolean containKey(Object key): 判断该集合中是否有此键。
        System.out.println(hm.containsKey("李亚鹏"));
        System.out.println("-----------------");

        //键值对：获取Map集合中所有的Map.Entry，遍历所有的Map.Entry，通过Entry中的API方法获取到key、value
/*      Map.Entry：
            Object  getKey()
            Object  getValue()*/
        Set<Map.Entry<String, String>> entry = hm.entrySet(); // 获取键值对对象集合
        for (Map.Entry<String, String> stringEntry : entry) {
            System.out.println("键: " + stringEntry.getKey() +
                    "  对象: " + stringEntry.getValue());// 通过entry对象获取键
        }
    }
}
