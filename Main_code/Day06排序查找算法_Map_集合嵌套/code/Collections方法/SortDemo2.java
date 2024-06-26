package Main_code.Day06排序查找算法_Map_集合嵌套.code.Collections方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    Collections类 : 单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。
        要特别注意的是sort方法只能对List集合进行排序，方法如下：

        public static <T extends Comparable> void sort (List<T> list) : 只能对集合中的元素自然排序

        需求1：定义一个List集合，存储若干整数，要求对集合进行降序排序
        分析：整数类型Integer具备自然排序能力，但是题目要求降序排序

        需求2：定义一个学生类，属性有姓名，年龄。创建若干对象放到List集合中。要求对List集合中学生对象进行年龄的升序排序。
        分析：自定义类型默认是没有自然排序能力的，我们使用自定义比较器方式排序。
 */
public class SortDemo2 {
    public static void main(String[] args) {
        System.out.println("需求1 ------------");
        ArrayList<Integer> lst =new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(7);
        lst.add(0);
        lst.add(10);
        Collections.sort(lst);
        System.out.println(lst);

        System.out.println("需求2 ------------");
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student("小明",18));
        list.add(new Student("小红",22));
        list.add(new Student("小紫",20));
//        Collections.sort(list, new Comparator<Student>() {,下面list直接调用父类方法
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
