package Main_code.Day05泛型_数据结构_List_Set集合.code;

import java.util.ArrayList;

/*
    已知存在继承体系：Integer继承Number，Number继承Object。
    定义一个方法，方法的参数是一个ArrayList。
    要求可以接收ArrayList<Integer>,ArrayList<Number>,ArrayList<Object>,ArrayList<String>这些类型的数据。

    结论 : 具体类型的集合,不支持多态 , 要想接收任意类型集合 , 需要使通配符集合
 */
public class AllTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        useList5(list1);
        useList5(list2);
        useList5(list3);
        useList5(list4);
    }

    // 此方法只能接收存储Integer类型数据的集合
    public static void useList1(ArrayList<Integer> list) {

    }

    // 此方法只能接收存储Number类型数据的集合
    public static void useList2(ArrayList<Number> list) {

    }

    // 此方法只能接收存储String类型数据的集合
    public static void useList3(ArrayList<String> list) {

    }

    // 此方法只能接收存储Object类型数据的集合
    public static void useList4(ArrayList<Object> list) {

    }

    public static void useList5(ArrayList<?> list) {

    }

}
