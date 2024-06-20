package Main_code.UpDay4.code.Regex_learn;

import java.util.Scanner;

/*
    设计程序让用户输入一个QQ号码，验证QQ号的合法性：
    1. QQ号码必须是5--15位长度
    2. 而且首位不能为0
    3. 而且必须全部是数字

 */
public class Regex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的qq号码:");
        String qq = sc.nextLine();

        System.out.println(checkQQ2(qq));

    }

    private static boolean checkQQ(String qq) {
//        1. QQ号码必须是5--15位长度
        if (qq.length() < 5 || qq.length() > 15) {
            return false;
        }
//       2 . 而且首位不能为0
        if (qq.charAt(0) == '0') {
            return false;
        }

//        2. 而且必须全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    // 正则表达式改进
    private static boolean checkQQ2(String qq) {
        return qq.matches("[1-9][0-9]{4,14}");
    }
}
