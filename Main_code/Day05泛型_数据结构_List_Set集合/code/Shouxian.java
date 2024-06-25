package Main_code.Day05泛型_数据结构_List_Set集合.code;

import java.util.ArrayList;
/*
受限泛型
    受限泛型是指，在使用通配符的过程中 , 对泛型做了约束，给泛型指定类型时，只能是某个类型父类型或者子类型
分类 :
    泛型的下限 :
    //只能是某一类型，及其父类型，其他类型不支持
    泛型的上限 :
    //只能是某一个类型，及其子类型，其他类型不支持
任务 :
  基于上一个知识点，定义方法
    show1方法，参数只接收元素类型是Number或者其父类型的集合
    show2方法，参数只接收元素类型是Number或者其子类型的集合
 */
public class Shouxian {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();

        show1(list3); //接收Number父类Object
        show1(list2);

        show2(list2);
        show2(list1); //接受Number子类Integer
    }
    // 此方法可以接受集合中存储的是Number或者Number的父类型 , 下限泛型
    public static void show1(ArrayList<? super Number> list) {

    }
    // 此方法可以接受集合中存储的是Number或者Number的子类型 , 上限泛型
    public static void show2(ArrayList<? extends Number> list) {

    }
}