package Main_code.Extend_study_day2.Lei;

/*
 * 测试类
 * */
public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象s和s2
        //类名 对象名 = new 类名();
        Student s = new Student(); // 调用无参构造方法
        s.name = "吴彦祖";
        s.age = 18;
        // 栈: 所有局部变量都会在栈里储存
        // 局部变量：方法里定义和声明的变量，随方法调用而存在，随方法调用完毕而消失
        // 方法运行在栈内存中
        // 对象存储于堆内存中
        // 这个代码里方法main和Student s都创建在栈内存里
        // new Student()代码开辟了一个新空间（对象），空间里存属性（name, age, height, iq）。
        // 运行时，通过进栈找到对应的空间，再修改属性值（堆内存）
        // 计算机在系统空闲时，会自动清理垃圾对象

        System.out.print(s.name + " ");
        System.out.println(s.age);
        s.eat();

        System.out.println("-----------------");
        Student s2 = new Student("彭于晏", 22); // 调用有参构造方法
//      s2.name = "彭于晏";
//      s2.age = 22;
        System.out.println(s2.name + " , " + s2.age);
        s2.call(s2.name, s.name); // call方法存在栈内存里
        s2.sendMessage(); // sendMessage方法存在栈内存里
        String gameName = "王者荣耀";
        s2.playgame(gameName);
        s2.setHeight(180); // 通过set方法设置height值
        System.out.println(s2.getHeight()); // 通过get方法输出height值
        s2.setIq(100);
        System.out.println(s2.getIq());
    }
}
