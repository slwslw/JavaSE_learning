package GUI;

/*
   装箱:把基本数据类型转换为对应的包装类类型
   拆箱:把包装类类型转换为对应的基本数据类型
*/
public class IntegerDemo03 {
    public static void main(String[] args) {
        //装箱:把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100); // 通过静态工厂方法装箱
        Integer ii = 100; //直接将基本数据类型的值赋值给包装类对象，并且 Java 会自动执行装箱操作
        //拆箱:把包装类类型转换为对应的基本数据类型
        ii += 200;
        /*
        ii = ii.intValue() // 通过 intValue() 方法拆箱
        ii = ii + 200;
        ii = ii.intValue() + 200; //自动拆箱
        ii = 300; //Integer.valueOf(300);
        */
        System.out.println(ii);
        //拆箱和装箱可以在基本数据类型和包装类之间实现无缝转换
    }
}