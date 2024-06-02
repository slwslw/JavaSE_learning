package Simple_code;

import java.util.Scanner;

public class Method_01 {
    public static void main(String[] args) {
        System.out.println("Start");
        //调用方法
        study();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        getMax(a, b);

        int c = sc.nextInt();
        System.out.println("Max = " + returnMax(a, b, c) + '\n');

        //水仙花数
        System.out.println("1000以内水仙花数的个数: " + Daffodils(1000) + '\n');

        System.out.println("Ending...");
    }

    private static int Daffodils(int i) {
        int num = 0;
        for (int j = 0; j <= i; j++) {
            int ge = j % 10;
            int shi = j / 10 % 10;
            int bai = j / 100 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == j)
                num++;
        }
        return num;
    }

    private static int returnMax(int a, int b, int c) {
        return Math.max((a > b ? a : b), c);
    }

    private static void getMax(int a, int b) {
        if (a > b)
            System.out.println("max = " + a + '\n');
        else if (a < b) {
            System.out.println("max = " + b + '\n');
        } else System.out.println("equal");
    }

    public static void study() {
        System.out.println("学生在学习\n");
    }
}
