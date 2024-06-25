package Main_code.Day05泛型_数据结构_List_Set集合.code.SetDemo1;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> set = new HashSet<>();

        //添加元素,无序
        set.add("java");
        set.add("my");
        set.add("htsl");
        set.add("Sql");
        set.add("javascript");
        set.add("javascript"); //自己删除重复元素
        System.out.println(set);

        //判断是否包含某个元素
        if (set.contains("my")) {
            set.remove("my");
        }
        System.out.println(set);

        System.out.println("----------");

        //删除重复方法，要在类里重写hashCode和equals方法
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("szl", 23));
        students.add(new Student("slw", 22));
        students.add(new Student("slw", 22));
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
