package Main_code.Day04常用API_正则表达式_Collection集合.code;

public class Baozhuang {
    public static void main(String[] args) {
/*      自动装箱和拆箱是JDK1.5开始的
        自动装箱 : 基本数据类型自动转成对应的包装类类型
        自动拆箱 : 包装类类型自动转成对应的基本数据类型*/

        //使用Integer作为代表
        Integer num = 100;
        int x = num; //自动拆箱 x = num.intValue();
        num += 200; //自动拆箱 num = num.intValue() + 200
        Boolean flag = true;
        Double dou = 3.14;
        Integer num1 = null;

        //使用包装类：解决String类型和基本类型之间数据转换

        //基本类型数据 => String类型
//        直接在数值后加一个空字符串
//        通过String类静态方法valueOf()
        int num2 = 100;
        String str = num + ""; //任意类型和字符串相加，结果都是String类型
        String str1 = String.valueOf(num2);
//        包装类在使用时存在：自动装箱、自动拆箱
//        自动装箱： Integer.valueOf( 数值 )
//        自动拆箱： Integer对象.intValue()

        //String类型 => 基本类型数据
        String str2 = "1234";
        int a = Integer.parseInt(str); //1.Integer x = Integer.valueOf(str2) 2. int a = x.intValue();

        String s = "true";
        boolean f1 = Boolean.parseBoolean(s);
    }
}
