package Main_code.Day04常用API_正则表达式_Collection集合.code;

public class MathTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = Math.max(a, b); //计算最大值
        int min = Math.min(a, b); //计算最小值

        double num = Math.pow(2,3); //计算次幂 2^3
        System.out.println(num);

        double round = Math.random(); //生成一个0到1之间的随机数
        System.out.println(round);

        double num1 = Math.ceil(4.4); //向上取整
        double num3 = Math.floor(4.6); //向下取整
        double num2 = Math.round(4.5); //四舍五入
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(num2);
    }
}
