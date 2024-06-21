package Main_code.base.code_day1;

import java.util.Random;

public class Random_01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);//0到99里取随机值
        int num_1 = r.nextInt(100) + 1;//1到100里取随机值
        System.out.println(num);
        double num_2 = (Math.random()* 10);
        //用于生成一个伪随机数。
        // 这个函数返回一个介于0（包含）和1（不包含）之间的浮点数，即返回的数值范围是[0,1)
        System.out.println(num_2);
    }
}
