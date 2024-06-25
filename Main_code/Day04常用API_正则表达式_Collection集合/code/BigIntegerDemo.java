package Main_code.Day04常用API_正则表达式_Collection集合.code;

import java.math.BigInteger;

/*
    构造方法 :
        BigInteger(String value)	可以将整数的字符串，转换为BigInteger对象
    成员方法 :
        public BigInteger add (BigInteger value)	    超大整数加法运算
        public BigInteger subtract (BigInteger value)	超大整数减法运算
        public BigInteger multiply (BigInteger value)	超大整数乘法运算
        public BigInteger divide (BigInteger value)	超大整数除法运算，除不尽取整数部分

 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        // 获取大整数对象
        BigInteger bigInteger1 = new BigInteger("2147483648");
        // 获取大整数对象
        BigInteger bigInteger2 = new BigInteger("2");
        // public BigInteger add (BigInteger value)	    超大整数加法运算
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);

        System.out.println("=============");

        // public BigInteger subtract (BigInteger value)	超大整数减法运算
        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        System.out.println(subtract);

        System.out.println("=============");

        // public BigInteger multiply (BigInteger value)	超大整数乘法运算
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println(multiply);

        System.out.println("=============");
        // public BigInteger divide (BigInteger value)	超大整数除法运算，除不尽取整数部分
        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println(divide);
    }
}
