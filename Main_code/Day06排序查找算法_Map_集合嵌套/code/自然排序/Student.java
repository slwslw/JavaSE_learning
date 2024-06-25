package Main_code.Day06排序查找算法_Map_集合嵌套.code.自然排序;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*compareTo方法如何指定排序规则 :
        此方法如果返回的是小于0 , 代表的是当前元素较小 , 需要存放在左边
        此方法如果返回的是大于0 , 代表的是当前元素较大, 需要存放在右边
        此方法如果返回的是0 , 代表的是当前元素在集合中已经存在 , 不存储
        */
    public int compareTo(Student stu) {
//            this : 当前要添加的元素
//            stu  : 集合中已经存在的元素

        //排序规则
        //String类自带compareTo方法
        //比较相同姓名，年龄排序
/*        int result = this.name.compareTo(stu.name);
        if(result == 0){
            result = this.age - stu.age;
        }*/

        //存储学生对象, 按照年龄的升序排序，并遍历
        int result = this.age - stu.age;
//        if(result == 0){
//            result = this.name.compareTo(stu.name);
//        }
//        return result;
        return result == 0 ? this.name.compareTo(stu.name) : result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
