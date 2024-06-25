package Main_code.Day06排序查找算法_Map_集合嵌套.code.自然排序;

import java.util.TreeSet;
/*使用步骤
    使用空参构造创建TreeSet集合对象
    存储元素所在的类需要实现Comparable接口
    重写Comparable接口中的抽象方法 compareTo方法,指定排序规则*/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student("熊大",24));
        set.add(new Student("熊大",23));
        set.add(new Student("光头强",23));
        set.add(new Student("光头强",25));
        set.add(new Student("熊二",22));
        set.add(new Student("熊二",26));

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
