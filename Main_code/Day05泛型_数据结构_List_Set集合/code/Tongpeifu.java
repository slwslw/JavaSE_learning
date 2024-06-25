package Main_code.Day05泛型_数据结构_List_Set集合.code;

import java.util.ArrayList;
import java.util.List;

/*当我们对泛型的类型确定不了，而是表达的可以是任意类型，可以使用泛型通配符给定
符号就是一个问号：? 表示任意类型，用来给泛型指定的一种通配值。如下*/
public class Tongpeifu {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("asd");
        list.add("qwe");
        // 方法的参数是一个集合 , 集合的泛型是一个通配符 , 可以接受任意类型元素的集合
        show(list);
    }

    public static void show(List<?> list) {
        // 如果集合的泛型是一个通配符 , 那么集合中元素以Object类型存在
        Object o = list.get(0);

        // 如果集合的泛型是一个通配符 , 那么此集合不能进行添加和修改操作 , 可以删除和获取
        // list.add(??);

        // 删除可以
        list.remove(0);
        // 获取元素可以
        for (Object o1 : list) {
            System.out.println(o1);
        }
    }
}
