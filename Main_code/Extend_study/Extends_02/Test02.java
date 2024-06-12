package Main_code.Extend_study.Extends_02;


public class Test02 {
    public static void main(String[] args) {
        Son son = new Son(); //调用无参构造
        son.setDoing("喝水");
        System.out.println(son.getDoing()); //继承可以多层继承，孙子也可以调用爷爷的方法

        System.out.println("----------");
        son.test();

        System.out.println("----------");
        son.show();

        System.out.println("----------");
        son.call();
        Father father = new Father();
        father.call(); //方法重写后，不会改变父类的方法

        System.out.println("----------");
        Son son2 = new Son(); //调用无参构造
        System.out.println(son2.getAge());
        System.out.println(son2.getName());
        Son son1 = new Son("儿子",18); //调用有参构造
        System.out.println(son1.getAge());
        System.out.println(son1.getName());
    }
}
