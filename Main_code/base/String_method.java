package Main_code.base;

/*
String类表示字符串。 Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例
构造方法：
String()：初始化新创建的 String对象，使其表示空字符序列
String(String original)：初始化新创建的String对象，使其表示与参数相同的字符序列
*/
public class String_method {
    public static void main(String[] args) {
        //String()：初始化新创建的 String对象，使其表示空字符序列
        String s1 = new String();
        System.out.println(s1);
        //int length() 返回此字符串的长度
        System.out.println(s1.length());
        System.out.println("------------");

        //String(String original)：初始化新创建的String对象，使其表示与参数相同的字符序列
        String s2 = new String("itheima");
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println("------------");

        //Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例
        String s3 = "itheima";
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println("------------" + '\n');

        String s4 = "itheima";
        String s5 = "itheima";
        String s6 = "Itheima";
        //boolean equals(Object anObject)：将此字符串与指定的对象进行比较
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));

        //boolean equalsIgnoreCase(String anotherString)：将此 String与另一个 String比较，忽略了大小写
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println(s4.equalsIgnoreCase(s6));
        System.out.println("-------------------");

        String s7 = " itheima ";
        //String trim()：返回一个字符串，其值为此字符串，删除了所有前导和尾随空格
        System.out.println(s7);
        System.out.println(s7.trim());
        String s8 = " it heima "; // 中间的空格不会删除
        System.out.println(s8.trim());
    }

}
