package Main_code.Duotai_API.Test1;

/*
    多态的成员访问特点 :
        1 构造方法 : 和继承一样 , 都是通过super()访问父类的构造方法
        2 成员变量 : 编译看左边(父类) , 执行看左边(父类)
        3 成员方法 : 编译看左边(父类) , 执行看右边(子类) , 注意 , 如果执行时
            1) 子类没有回动态去找父类中的方法
            2) 子类的特有方法无法进行调用(多态的缺点)
 */
public class MemberTest {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Fu f = new Zi();

        // 多态对象调用成员变量
        System.out.println(f.num);

        // 多态对新乡调用调用成员方法
        f.show();

        // 多态对象不能调用子类特有的方法
        // f.show2();
    }
}

class Fu {
    int num = 100;

    public void show() {
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu {
    int num = 10;

    public void show() {
        System.out.println("子类的show方法");
    }

    public void show2(){
        System.out.println("子类特有的方法");
    }
}

