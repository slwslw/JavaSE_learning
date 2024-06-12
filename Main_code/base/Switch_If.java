package Main_code.base;

import java.util.Scanner;

public class Switch_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * if(){}
         * else if(){}
         * else{}
         * */
        int member = sc.nextInt();
        if (member < 10) {
            System.out.println("<10");
        } else if (member == 10) {
            System.out.println("=10");
        } else
            System.out.println(">10");
        System.out.println();

        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;

            case 3, 4, 5:
                System.out.println("spring");
                break;

            case 6, 7, 8:
                System.out.println("summer");
                break;

            case 9, 10, 11:
                System.out.println("autumn");
                break;

            default:
                System.out.println("error");
                break;
        }
    }
}
