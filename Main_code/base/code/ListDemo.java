package Main_code.base.code;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //多态

        //添加元素
        list.add("where");
        list.add("are");
        list.add("you");
        list.add("my");
        list.add("lord");

        System.out.println(list);

        list.set(0, "What"); //修改元素

        list.remove(2); //删除位置元素

        list.add(2, "hello"); //添加元素，原有元素后移存储

        System.out.println(list);
        System.out.println(list.get(3)); //获取地址上的集合元素
    }
}
/*List集合是Collection集合子类型，继承了所有Collection中功能，同时List增加了带索引的功能

特点 :
    元素的存取是有序的【有序】
    元素具备索引 【有索引】
    元素可以重复存储【可重复】
常见的子类
    ArrayList：底层结构就是数组【查询快，增删慢】
    Vector：底层结构也是数组（线程安全，同步安全的，低效，用的就少)
    LinkedList：底层是链表结构（双向链表）【查询慢，增删快】
List中常用的方法
    public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
    public E get(int index):返回集合中指定位置的元素
    public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。\
    public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素*/
