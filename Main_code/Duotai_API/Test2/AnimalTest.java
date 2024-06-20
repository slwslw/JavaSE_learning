package Main_code.Duotai_API.Test2;
/*
一个对象在不同时刻体现出来的不同形态
举例 : 一只猫对象
我们可以说猫就是猫 : Cat cat = new Cat();
我们也可以说猫是动物 : Animal cat = new Cat();
这里对象在不同时刻,体现出来的不同形态 , 我们就可以理解为多态

    多态的三个前提条件
        1 需要有继承/实现关系
        2 需要有方法重写
        3 父类的引用指向子类的对象
 */

/*
    如果方法的参数是一个类的话 , 那么调用此方法需要传入此类的对象 , 或者子类对象

    多态的好处 :
        提高代码的扩展性 , 灵活性
    多态的缺点:
        不能调用子类的特有功能
 */
public class AnimalTest {
    public static void main(String[] args) {
        useAnimal(new Cat());

        System.out.println("---------");

        useAnimal(new Dog());

        System.out.println("---------");

        useAnimal(new Pig());
    }

    public static void useAnimal(Animal a){// Animal a = new Dog()
        a.eat();
        // 多态不能访问子类特有的功能
        // 如果解决 ?

        // 向下转型
        if(a instanceof Cat) { //关键字 instanceof:判断关键字左边的变量，是否是右边的类型，返回boolean类型结果
            Cat cat = (Cat) a;
            cat.catchMouse();
        }
        if(a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.lookDoor();
        }

        if(a instanceof Pig) {
            ((Pig) a).sleep();
        }
    }
/*多态的转型
    向上转型 : 把子类类型数据转成父类类型数据 Animal a = new Cat();
    向下转型 : 把父类类型数据转成子类类型数据 Cat cat = (Cat)a;
*/

//    // 定义一个使用猫类的方法
//    public static void useAnimal(Cat c) {// Cat c = new Cat();
//        c.eat();
//        c.catchMouse();
//    }
//
//    // 定义一个使用狗类的方法
//    public static void useAnimal(Dog d) {// Dog d = new Dog();
//        d.eat();
//        d.lookDoor();
//    }
//
//    // 定义一个使用猪类的方法
//    public static void useAnimal(Pig pig) {
//        pig.eat();
//        pig.sleep();
//    }
}


