package Main_code.Lei;

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

    // 封装：将某些信息隐藏在类内部，不允许外部直接访问
    // 好处：1. 通过方法来控制成员变量的操作，提高代码安全性。
    //      2. 把代码用方法进行封装，提高代码复用性。
    // private定义的变量只能在本类里使用，访问需要使用set()和get()方法
    private int height;
    private int iq;

    // Alt + Insert 可以选择，直接生成构造方法和set_get方法

    // 构造方法，类成员的初始化
    public Student(){ // 无参构造方法
        System.out.println("无参构造方法");
    }

    public Student(String name,int age){ // 有参构造方法
        this.name = name;
        this.age = age;
    }

    public void setIq(int iq) { // this: 代表本类对象，可以调用本类成员
        this.iq = iq; // this.iq调用的成员变量，解决成员变量和局部变量重名问题
    } // 哪个对象调用方法， this就是哪个对象

    public int getIq() {
        return iq;
    }

    public void setHeight(int a) { // 通过set方法设置height值
        if (a < 150) System.out.println("输入身高有误");
        else height = a;
    }

    public int getHeight() { return height; } // 通过get方法输出height值

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
