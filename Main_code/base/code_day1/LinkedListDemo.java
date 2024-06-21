package Main_code.base.code_day1;

/*
LinkedList类
LinkedList底层结构是双向链表。
每个节点有三个部分的数据，一个是保存元素数据，一个是保存前一个节点的地址，一个是保存后一个节点的地址。可以双向查询，效率会比单向链表高。
LinkedList特有方法
    public void addFirst(E e):将指定元素插入此列表的开头。
    public void addLast(E e):将指定元素添加到此列表的结尾。
    public E getFirst():返回此列表的第一个元素。
    public E getLast():返回此列表的最后一个元素。
    public E removeFirst():移除并返回此列表的第一个元素。
    public E removeLast():移除并返回此列表的最后一个元素。
*/

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(3,500);

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i); //调用List方法,取元素
            System.out.println(num);
        }

        list.addFirst(999);
        list.addLast(1000);
        System.out.println(list);
    }
}
