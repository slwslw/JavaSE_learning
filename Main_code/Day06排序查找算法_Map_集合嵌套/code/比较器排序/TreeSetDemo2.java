package Main_code.Day06排序查找算法_Map_集合嵌套.code.比较器排序;

import java.util.Comparator;
import java.util.TreeSet;
/*
      TreeSet集合练习
         存储学生对象, 按照年龄的升序排序，并遍历
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new ComparatorImpl());

        Teacher s1 = new Teacher("dilireba", 19);
        Teacher s2 = new Teacher("gulinazha", 20);
        Teacher s3 = new Teacher("maerzhaha", 18);
        Teacher s4 = new Teacher("ouyangnanan", 18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Teacher t : ts) {
            System.out.println(t);
        }
    }
}

// 比较器排序
    /*TreeSet的带参构造方法使用的是 “比较器排序” 对元素进行排序的
    比较器排序，就是让TreeSet集合构造方法接收Comparator接口的实现类对象
    重写Comparator接口中的 compare(T o1,T o2)方法 , 指定排序规则
    注意 : o1代表的是当前往集合中添加的元素,
    o2代表的是集合中已经存在的元素,排序原理与自然排序相同!*/
class ComparatorImpl implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int result = o1.getAge() - o2.getAge();
        return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
    }
}