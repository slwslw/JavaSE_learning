package Main_code.base.code_day1;

import java.util.Scanner;

public class In_out_put {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age);
        int add_age = scanner.nextInt();
        System.out.println(age + "+" + add_age + "=" +(add_age + age));

        int a = 10, b = 20 , c = 30;
        int m = a > b ? a : b; //先比较a和b，返回a和b中最大值
        System.out.println("a : b = " + m);
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c; //先比较a和b,如果其中最大值比c大则返回
        System.out.println("a : b : c" + max);
    }
}
