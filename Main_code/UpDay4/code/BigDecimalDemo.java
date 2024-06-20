package Main_code.UpDay4.code;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
    构造方法 :
        public BigDecimal(String val)	将 BigDecimal 的字符串表示形式转换为 BigDecimal
    成员方法 :
        public BigDecimal add(BigDecimal value)	加法运算
        public BigDecimal subtract(BigDecimal value)	减法运算
        public BigDecimal multiply(BigDecimal value)	乘法运算
        public BigDecimal divide(BigDecimal value)	除法运算(除不尽会有异常)
        public BigDecimal divide(BigDecimal value, int scale, RoundingMode roundingMode)	除法运算(除不尽，使用该方法)
        参数说明：
        scale 精确位数，
        roundingMode取舍模式
                   BigDecimal.ROUND_HALF_UP 四舍五入
                   BigDecimal.ROUND_FLOOR 去尾法
                   BigDecimal.ROUND_UP  进一法
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        // public BigDecimal add(BigDecimal value)	加法运算
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);

        System.out.println("=================");

        // public BigDecimal subtract(BigDecimal value)	减法运算
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);

        System.out.println("=================");

        // public BigDecimal multiply(BigDecimal value)	乘法运算
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);

        System.out.println("=================");

        // public BigDecimal divide(BigDecimal value)	除法运算(除不尽会有异常)
        // BigDecimal divide = bigDecimal1.divide(bigDecimal2);
        // System.out.println(divide);

        /*
            public BigDecimal divide(BigDecimal divisor, int roundingMode)	除法运算(除不尽，使用该方法)
            参数说明：
            scale 精确位数，
            roundingMode : 取舍模式
                       BigDecimal.ROUND_HALF_UP 四舍五入
                       BigDecimal.ROUND_FLOOR 去尾法
                       BigDecimal.ROUND_UP  进一法
        */

        //新版本写法，这里scale不写自动保留一位小数
         BigDecimal divide = bigDecimal1.divide(bigDecimal2, RoundingMode.HALF_UP);
         BigDecimal divide1 = bigDecimal1.divide(bigDecimal2, 3, RoundingMode.FLOOR);
         BigDecimal divide2 = bigDecimal1.divide(bigDecimal2, 3, RoundingMode.UP);
         System.out.println(divide);
         System.out.println(divide1);
         System.out.println(divide2);
    }
}