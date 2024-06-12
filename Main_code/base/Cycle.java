package Main_code.base;

public class Cycle {
    public static void main(String[] args) {

        /*
         * do{
         * }while();
         * */
        System.out.println("Do_while: ");
        int i = 0;
        do {
            i += 1;
            System.out.print(i + " ");
        } while (i < 10);
        System.out.println('\n');

        System.out.println("while: ");
        int m = 0;
        while (m < 10) {
            m += 1;
            System.out.print(m + " ");
        }
        System.out.println('\n');

        System.out.println("For: 1到100的和");
        int sum = 0;
        for (int j = 0; j <= 100; j++) {
            sum += j;
        }
        System.out.println("sum: " + sum + '\n');

        System.out.println("【水仙花数】，在三位数里，数字每个位置立方和等于数本身");
        for (int num = 100; num < 1000; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == num) {
                System.out.println(num);
            }
        }
        System.out.println('\n');

        //9 x 9 乘法表
        for (int n = 1; n < 10; n++) {
            for (int h = 1; h <= n; h++) {
                System.out.print(n + " x " + h + " = " + n * h + "    ");
            }
            System.out.println();
        }

        //死循环
        /*
        * for(;;){}
        * while(true){}
        * do{}while(true)
        * continue直接进入下一个循环
        * break直接跳出循环
        * */
    }
}
