package Simple_code;

public class HelloWorld {
    //main+回车
    public static void main(String[] args) {
   //sout+回车
        System.out.println();
        System.out.println();//Ctrl+D 复制数据到下一行
        //Ctrl+Alt+L 格式化代码，建议自己写注释掉就行
        //Ctrl+/ 对选中的代码添加单行注释
        //Ctrl+Shift+/ 对对选中代码进行多行注释

        //整数
        System.out.println(666);
        System.out.println(-18);

        //字符串
        System.out.println("Hello World");
        System.out.println("我是最厉害的学习者");

        //字符
        System.out.println('A');
        System.out.println('0');
        System.out.println('我');

        //布尔
        System.out.println(true);
        System.out.println(false);

        //变量
        int price = 888;
        double unit = 666.66;
        System.out.println(price);
        System.out.println(unit);
        unit = 999.99;
        System.out.println(unit);

        //定义变量，进行手机描述
        String brand = "Huawei";
        String type = "Mate 60";
        int memory = 256;
        String color = "亮黑色";
        double prices = 3098.9;
        System.out.println(brand);
        System.out.println(type);
        System.out.println(memory);
        System.out.println(color);
        System.out.println(prices);
        //双十一打9折
        prices *= 0.9;
        System.out.println(prices);
        if(prices > 1000) {
            System.out.println(true);
            prices = 999;
        }
        if (prices < 1000)
            System.out.println(false);
    }
}
