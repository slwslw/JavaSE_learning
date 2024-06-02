package Lei;

/*
 * 类：对一类具有共同“属性”和“行为”事物的描述
 * 1. 属性 -> 成员变量
 * 2. 行为 -> 成员方法
 *
 * 对象：根据类创建出来的实体“实物”
 * */

public class Student {
    // 成员变量，在方法外，存在堆内存中
    // 随对象存在而存在，随对象消失而消失
    // 有默认初始值
    String name;
    int age;

    // private定义的变量只能在本类里使用，访问需要使用set()和get()方法
    private int height;

    public void setHeight(int a) {
        if (a < 150) System.out.println("输入身高有误");
        else height = a;
    }

    public int getHeight() {
        return height;
    }

    public void eat() {
        System.out.println("我开始吃饭" + '\n');
    }

    public void call(String name1, String name2) {
        System.out.println(name1 + "给" + name2 + "打电话");
    }

    public void sendMessage() {
        System.out.println("正在输入中......");
    }

    // 局部变量在方法里，存在栈内存中（例如这里的String gameName）
    // 随方法调用而存在，随方法调用完毕而消失
    // 没有默认初始值，必须先定义，赋值，才能使用
    public void playgame(String gameName) {
        System.out.println(gameName + "五排");
    }
}
