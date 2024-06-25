package Main_code.Day01匿名对象_继承_抽象类.Extends_02;

public class Son extends Father {
    int num = 20;
    //静态成员方法,当程序中的某个数据需要共享时使用static修饰
    //通过类名访问静态内容（静态的私有成员变量不能访问）
    private static String city;//静态成员变量
    public static void jingtai(){

    }
    static String school;
/*
1、静态内容是随着类的加载就存在了（早于对象创建）
2、静态内容通常是使用： 类名.成员变量     类名.成员方法()
3、静态方法中只能访问静态成员（静态变量、静态方法）
4、静态方法中不能使用this关键字
5、非静态方法中可以直接访问：静态成员
*/
    public Son() {
        this("无参",0); //调用Son(String name, int age)
    }

    //有参构造，用super直接带参调用父类的构造函数
    public Son(String name, int age) {
        super(name, age);
    }

    public void test() {
        int num = 30;
        System.out.println("局部变量 = " + num); //就近原则：先访问局部变量，再找本类，最后找父类，如果没有就报错
        System.out.println("本类成员变量 = " + this.num); //this调用本类成员变量
        System.out.println("父类成员变量 = " + super.num); //super调用父类的成员变量和方法
    }

    @Override
    public void test1() {
        System.out.println("son.test1");}

    public void test3() {
        System.out.println("son.test3");}

    public void show() {
        //调用本类的test1
        test1();
        //调用父类的test1,因为都有方法所以需要super来调用父类方法
        super.test1();
        //调用父类的test2
        test2(); //本类没有可以直接写，自动输出父类的方法
        //调用本类的test3
        test3();
        System.out.println(school);
    }

    //父类方法重写，私有方法不能被重写，方法名和参数必须同父类一样
    @Override  //注解，提醒是方法重写，方便阅读
    public void call() {
        System.out.println("我是儿子");
        super.call(); //继承父类方法
    }
}
