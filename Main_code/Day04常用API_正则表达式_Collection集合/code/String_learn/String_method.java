package Main_code.Day04常用API_正则表达式_Collection集合.code.String_learn;

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
        System.out.println("-------------------");

        String str = "I Love Java, I Love Heima";
        // 判断是否存在  “Java”
        System.out.println(str.contains("Java"));// true
        // 判断是否以Heima字符串结尾
        System.out.println(str.endsWith("Heima"));// true
        // 判断是否以Java开头
        System.out.println(str.startsWith("Java"));// false
        // 判断 Java在字符串中的第一次出现位置
        System.out.println(str.indexOf("Java"));// 7
        // 判断  itcast 所在的位置
        System.out.println(str.indexOf("itcast"));// 没找到返回-1
        // 将所有 Love 替换为 Like ,打印替换后的新字符串
        System.out.println(str.replace("Love", "Like"));
        // 截取字符串 "I Love Heima"
        System.out.println(str.substring(13));
        // 截取字符串 "Java"
        System.out.println(str.substring(7 , 11));
    }
}
