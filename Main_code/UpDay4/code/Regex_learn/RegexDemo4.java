package Main_code.UpDay4.code.Regex_learn;

/*
    数量词 :
        - X?    : 0次或1次
        - X*    : 0次到多次
        - X+    : 1次或多次
        - X{n}  : 恰好n次
        - X{n,} : 至少n次
        - X{n,m}: n到m次(n和m都是包含的)

    需求 :
      1 验证str是否3位数字
      2 验证str是否是多位(大于等于1次)数字
      3 验证str是否是手机号 ( 1开头，第二位：3/5/8，剩下9位都是0-9的数字)
      4 验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0

 */
public class RegexDemo4 {
    public static void main(String[] args) {
//        1 验证str是否3位数字
        System.out.println("123".matches("\\d{3}"));

//        2 验证str是否是多位(大于等于1次)数字
        System.out.println("123456".matches("\\d+"));

//        3 验证str是否是手机号 ( 1开头，第二位：3/5/8，剩下9位都是0-9的数字)
        System.out.println("15188888888".matches("1[358]\\d{9}"));

//        4 验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0
        System.out.println("122103987".matches("[1-9]\\d{4,14}"));
    }
}
