package Main_code.Day04常用API_正则表达式_Collection集合.code.String_learn;

/*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：
    1 计算字符 a 出现的次数（要求使用toCharArray）
    2 计算字符 a 出现的次数（要求使用charAt）
    3 将字符串中所有英文字母变成小写
    4 将字符串中所有英文字母变成大写
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";
        //1 计算字符 a 出现的次数（要求使用toCharArray）
        int count1 = 0;
        char[] chars = str.toCharArray(); //把String里每个字符创建到数组里
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                count1++;
            }
        }
        System.out.println("字符a出现了" + count1 + "次");


        //2 计算字符 a 出现的次数（要求使用charAt）
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //返回第i个数据的char值
            if (ch == 'a') {
                count2++;
            }
        }
        System.out.println("字符a出现了" + count2 + "次");

        //3 将字符串中所有英文字母变成小写
        String s1 = str.toLowerCase();
        System.out.println(s1);

        //4 将字符串中所有英文字母变成大写
        String s2 = str.toUpperCase();
        System.out.println(s2);
    }
}