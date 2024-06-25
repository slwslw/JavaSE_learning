package Main_code.Day01匿名对象_继承_抽象类.Extends_02;

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

    @Override //抽象类中的抽象方法，必须由子类重写
    public void method() {
        System.out.println("爷爷在散步");
    }

/*
1、当某个变量不允许修改数据值时，可以使用final修饰变量
2、当某个方法不允许被子类重写时，可以使用final修饰方法
3、当某个类不允许被继承时，可以使用final修饰类。  举例：String类
4、final和abstract不能共存使用
*/
    private final int COUNT=100;
    public final void finalmethod(){
    }
}
