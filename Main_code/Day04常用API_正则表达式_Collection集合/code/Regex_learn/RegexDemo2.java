package Main_code.Day04常用API_正则表达式_Collection集合.code.Regex_learn;

/*
    逻辑运算符 :
        1 && : 并且
        2 |  : 或者

    需求 :
        1 要求字符串是除a、e、i、o、u外的其它小写字符开头，后跟ad
        2 要求字符串是aeiou中的某个字符开头，后跟ad
 */
public class RegexDemo2 {
    public static void main(String[] args) {
//        1 要求字符串是除a、e、i、o、u外的其它小写字符开头，后跟ad
        System.out.println("vad".matches("[a-z&&[^aeiou]]ad"));
//        2 要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("aad".matches("[a|e|i|o|u]ad"));
    }
}
