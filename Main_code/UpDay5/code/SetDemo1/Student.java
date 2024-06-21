package Main_code.UpDay5.code.SetDemo1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); //相同对象和数据算出的哈希值相同
    }
/*
哈希表数据结构：

底层是使用大小为16的数组+链表组成的存储方式
哈希表存储数据的方式 （ 借助：哈希值[存储位置] ）

拿要存储的元素，结合哈希算法， 计算出哈希值(存储位置) // 调用：  元素.hashCode()

判断 ： 计算出的存储位置上是否有元素存在
    情况1 ： 没有元素存在     =>  直接存储
    情况2 ： 已有元素存在
        拿要存储的元素 和 已经存在的元素 进行比较（比较内容是否相同） //元素.equals()
        相同： （重复元素）  =>  不存储
        不相同： （不重复元素）
            再次拿当前存储空间作为算法因子，再次进行哈希算法，计算新的存储空间*/
}
