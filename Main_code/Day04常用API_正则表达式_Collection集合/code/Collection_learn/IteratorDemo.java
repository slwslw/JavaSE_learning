package Main_code.Day04常用API_正则表达式_Collection集合.code.Collection_learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();

        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");
        collection.add("Spring");

        //使用迭代器：遍历集合
        //1.通过集合对象，获取到迭代器对象
        Iterator<String> it = collection.iterator();

        //2.while循环，判断迭代器对象中是否有下一个元素,快捷键itit
        while (it.hasNext()) {
            //3.使用迭代器对象，取出下一个元素
            String str = (String) it.next();
            if (str.equals("MySQL")) {
                it.remove(); //只能通过迭代器对象删除元素
            }
            System.out.println(str);
        }
        System.out.println(collection);
    }
}
/*
boolean  hasNext();   //检查迭代器对象中是否有下一个元素
Object  next(); //利用迭代器，取出下一个元素
default void remove()
*/

/*
Iterator迭代器在使用中的细节：
    1.在迭代器完成集合的遍历后，不要在使用：next()方法
    2.在迭代器遍历集合的过程中，不能使用集合对象来增删元素
        删除元素： 使用迭代器对象中的remove方法实现
        增加元素： 不用考虑（解决方案：使用其他的集合对象。例：List集合）
*/
