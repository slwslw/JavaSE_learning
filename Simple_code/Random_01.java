package Simple_code;

import java.util.Random;

public class Random_01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);//0到99里取随机值
        int num_1 = r.nextInt(100) + 1;//1到100里取随机值
        System.out.println(num);
    }
}
