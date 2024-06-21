package Main_code.Extend_study_day2.Extends_03;


/*
权限修饰符是java语言中的关键字，用于修饰：类、变量、方法
权限修饰符,从小到大排序：
1. private //访问范围： 仅现本类中访问
2. 默认     //访问范围： 只能在同一个包下的类
3. protected  //访问范围： 同一个包下的任意类 或 不同包下的子类
4. public     //访问范围 ：没有限制
限制程序中的访问权限（类的访问权限、变量的访问权限、方法的访问权限）
* */
public class Modifiers_01 {
    //成员变量（私有权限：本类中使用）
    private String name;

    //默认权限（权限：当前包下的任意类）
    void show(){

    }
    //protected（权限：子类）
    protected void method(){}
}
//方法重写时：保障子类中重写访问的访问权限必须 >= 父类中方法的权限