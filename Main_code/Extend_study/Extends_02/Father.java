package Main_code.Extend_study.Extends_02;

public class Father extends Grandfather {
    private String name;
    private int age;

    public Father() {
    }

    public Father(String name, int age) {
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

    int num = 10;
    private int high = 185; //不能设为private，私有成员变量，子类无法继承

    public void test1() {
        System.out.println("father.test1");
    }

    public void test2() {
        System.out.println("father.test2");
    }

    public void call() {
        System.out.println("我是爸爸");
    }
}
