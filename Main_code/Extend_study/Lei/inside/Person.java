package Main_code.Extend_study.Lei.inside;

public class Person {
    private String name = "张三";
    private int num = 10;

    // 成员内部类
    public class Heart {
        int num = 100;
        // 频率变量
        private int rate;
        // 跳动方法
        public void beats() {
            System.out.println("咚咚咚!");
        }
        // 调用外部类的成员
//        成员内部类访问外部类的成员
//        1.在内部类中有代表外部类对象的格式 : 外部类名的.this , 私有的也可以访问
//        2.外部类要想访问内部类成员 , 需要创建内部类对象
        public void show(){
            int num = 1000;
            System.out.println(Person.this.name);
            System.out.println(num);// 1000 就近原则
            System.out.println(this.num);// 100
            System.out.println(Person.this.num);// 10

        }
    }
}

class Test {
    public static void main(String[] args) {
        //创建内部类对象
        //创建成员内部类对象格式 : 外部类名.内部类名 对象名 = new 外部类名().new 内部类名(参数);
        Person.Heart heart = new Person().new Heart();
        // 调用内部类中的方法
        heart.beats();
    }
}