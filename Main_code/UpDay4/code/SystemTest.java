package Main_code.UpDay4.code;

public class SystemTest {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis(); //获取当前系统时间毫秒值

        method();

        long endTime = System.currentTimeMillis();

        System.out.println("方法执行时间: " + (endTime - beginTime) + "毫秒");

        System.exit(0); //强制停止程序
    }

    private static void method() {
        long count = 0;
        for (int i = 0; i <= 10000000; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
