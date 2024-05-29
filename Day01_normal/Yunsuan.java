package Day01_normal;

public class Yunsuan {
    public static void main(String[] args) {
        int num = 456;
        num = 789;

        //数据拆分
        int ge = num % 10;//取余
        int shi = num / 10 % 10; //取整
        int bai = num / 100 % 10;
        System.out.println("个: " + ge + "\n" + "十: " + shi + '\n' + "百: " + bai);

        int a = 10;
        a += 20;
        int b = 10;
        b = b + 20;
        System.out.println(a + " = " + b);
        short s = 1;
        s = (short) (s + 2);
        short d = 1;
        d += 2;//自动进行强制转换
        System.out.println(s + " = " + d);

        double dou = 10.3;
        int manba = 1;
        System.out.println(dou+manba);//manba提升为double类型，再运算

        int ii = (int) (manba+dou);
        System.out.println(ii);//double转为int类型，小数点后会消失

        //ASCII表参考
        System.out.println('0');//'0'
        System.out.println('0' + 1);//49
        System.out.println('A' + 1);//66
        System.out.println('a' + 1);//98
    }
}
