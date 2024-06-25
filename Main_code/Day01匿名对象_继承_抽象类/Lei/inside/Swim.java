package Main_code.Day01匿名对象_继承_抽象类.Lei.inside;

/*
    1 如果方法的参数是一个类的话 , 调用此方法需要传入此类的对象或者此类的子类对象
    2 如果方法的返回值类型是一个类的话 , 需要返回此类的对象 , 或者此类的子类对象
    3 如果方法的参数是一个接口的话 , 调用此方法需要传入此接口的实现类对象
    4 如果方法的返回值类型是一个接口的话 , 需要返回此接口的实现类对象

     匿名内部类 : 代表的就是子类对象!!!
        new 类名/接口名(){
            重写抽象类或者接口中的抽象方法
        };

     使用方向 :
        1 调用方法
        2 作为方法参数传递
        3 作为方法的返回值
 */

public interface Swim {
    public abstract void swimming();
}

class Test1 {
    public static void main(String[] args) {
//        // 子类对象!!!
        //  1 调用方法
//       new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("匿名内部类 , 重写了接口中的抽象方法...");
//            }
//        }.swimming();


//        //   2 作为方法参数传递
//        useSwim(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("匿名内部类 , 重写了接口中的抽象方法...");
//            }
//        });

//        // 3 作为方法的返回值
//        Swim s = getSwim();
//        s.swimming();
    }


    public static Swim getSwim() {
        return new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类 , 重写了接口中的抽象方法...");
            }
        };
    }


    /*
        Swim swim = new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类 , 重写了接口中的抽象方法...");
            }
        };
     */
    public static void useSwim(Swim swim) {
        swim.swimming();
    }
}