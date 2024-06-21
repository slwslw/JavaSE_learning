package Main_code.base.code_day1;

public class Method_02 {
    /*函数重载
     * 多个方法在同一个类里
     * 多个方法有相同的名字
     * 多个方法参数不同，类型不同或者数量不同
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        double c = 40.2;
        System.out.println(sum(a, b));
        System.out.println(sum(a, c));
        System.out.println(sum(a, b, c));
    }

    private static double sum(int a, double c) {
        return a + c;
    }

    private static double sum(int a, int b, double c) {
        return a + b + c;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
