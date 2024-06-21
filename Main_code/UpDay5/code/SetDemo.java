package Main_code.UpDay5.code;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //创建Set集合
        Set<String> set = new HashSet<>();
        //添加是乱序的
        set.add("my");
        set.add("SQL");
        set.add("Py");
        set.add("torch");

        System.out.println(set);

        //Set没有索引，用迭代器或者增强for循环
        for (String s : set) {
            System.out.println(s);
        }
    }
}
/*
Set集合
Set集合也是Collection集合的子类型，没有特有方法。Set比Collection定义更严谨
特点 :
    元素不能保证插入和取出顺序（无序）
    元素是没有索引的(无索引)
    元素唯一(元素唯一)
Set常用子类
    HashSet：底层由HashMap，底层结构哈希表结构。 去重，无索引，无序。 哈希表结构的集合，操作效率会非常高。
    LinkedHashSet:底层结构链表加哈希表结构。 具有哈希表表结构的特点，也具有链表的特点。
    TreeSet：底层是有TreeMap，底层数据结构 红黑树。 去重，让存入的元素具有排序（升序排序）
*/
