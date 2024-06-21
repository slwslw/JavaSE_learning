package Main_code.UpDay4.code.Collection_learn;


import java.util.ArrayList;
import java.util.Collection;

/*集合和数组的区别
        长度区别
数组 : 长度固定
集合 : 长度可变
        存储数据类型
数组 : 可以存储基本数据类型, 也可以存储引用数据类型
集合 : 只能存储引用数据类型 , 要想存储基本数据类型 , 需要存储对应的包装类类型*/

/*集合
三种集合：List 、Set 、Map

集合有什么好处？

大小可变（随意扩容）
集合中可以存储多种不同类型数据
底层使用数据结构（存取效率高）*/
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);//自动装箱： list.add( Integer.valueOf(100) )
        System.out.println(list);

        Collection coll = new ArrayList(); //多态,ArrayList是Collection的子类

        //集合常用方法
        coll.add("Java");
        coll.add("MySQL");
        System.out.println(coll);

        if(coll.contains("MySQL")){ //搜索判断
            coll.remove("MySQL"); //删除
        }
        System.out.println(coll);
        coll.clear(); //清空
        if(coll.isEmpty()) { //判断是否为空
            System.out.println(coll.size());
        }
    }
}
/*
Collection集合： 是一个接口
    子接口： List 、 Set
    子类： ArrayList
ArrayList集合对象可以使用传统的for循环，进行遍历
       ArrayList集合有索引
Collection集合： 没有索引。 遍历集合使用专用方式：迭代器*/

/*
Collection集合常用的方法:
public boolean add(E e)： 把给定的对象添加到当前集合中 。
public void clear() :清空集合中所有的元素。
public boolean remove(E e): 把给定的对象在当前集合中删除。
public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
public boolean isEmpty(): 判断当前集合是否为空。
public int size(): 返回集合中元素的个数。
public Object[] toArray(): 把集合中的元素，存储到数组中
*/
