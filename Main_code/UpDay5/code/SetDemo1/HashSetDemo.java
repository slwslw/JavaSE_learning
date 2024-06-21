package Main_code.UpDay5.code.SetDemo1;

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
        System.out.println(set);

        //判断是否包含某个元素
        if (set.contains("my")) {
            set.remove("my");
        }
        System.out.println(set);

        System.out.println("----------");

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("szl", 23));
        students.add(new Student("slw", 22));
        students.add(new Student("slw", 22));
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
