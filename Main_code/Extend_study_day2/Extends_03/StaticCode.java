package Main_code.Extend_study_day2.Extends_03;

import java.util.ArrayList;

/*
代码块划分：
静态代码块 //开发中使用最多
    书写位置：在类中方法外（和成员变量、成员方法属于同一级）
    在构造代码块上添加：static
    特点：随着类的加载，执行1次静态代码块（类只会被加载1次）
    作用：用于对静态成员数据进行初始化
构造代码块
    书写位置：在类中方法外（和成员变量、成员方法属于同一级）
    特点：在每个构造方法执行前，都会先执行构造代码块
    作用：当类中多个构造方法中有共性内容时，可能抽取到构造代码块
局部代码块
    书写位置：写在方法体中
    特点：在方法执行时，才会调用
    作用：用于作用域
*/
public class StaticCode {
    private static ArrayList<String> list = new ArrayList<String>();
    static{
        System.out.println("静态代码块~"); //对静态成员初始化

        list.add("Java");
        list.add("MySQL");
        list.add("Mybatis");
        list.add("html");
    }

    public static String getData(int index){
        return list.get(index);
    }
}
