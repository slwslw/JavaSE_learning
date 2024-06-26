package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Throwable 的成员方法:
    public String getMessage()	返回此 throwable 的详细消息字符串
    public String toString()	返回此可抛出的简短描述
    public void printStackTrace()	把异常的错误信息输出在控制台
*/
public class ExceptionDemo5 {
    private static final Logger LOGGER = LoggerFactory.getLogger("ExceptionDemo5类");

    /*
        定义一个方法接收一个生日日期字符串(xxxx年xx月xx)
        main方法中让用户输入一个生日日期字符串，调用设计好的方法计算在地球上活了多少天。

        要求：如果解析发生异常，捕获异常，提示用户要重新输入生日日期字符串，直到输入正确的日期为止。
        思考：设计代此码的过程中想想什么时候捕获异常，什么时候声明异常？
     */
    public static void main(String[] args) {
//        String strDate = "2000年10月10日";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日(xxxx-xx-xx):");
        while (true) {
            try {
                //监视可能会发生异常的代码
                //调用的方法可能会发生异常（自己处理）
                Date birthday = method(sc.nextLine());
                System.out.println("生日：" + birthday);
                break;
            } catch (ParseException e) { //处理异常 ： 拿异常对象类型和当前定义的异常类型进行匹配（类型相同 或 是父类型）
                System.out.println("录入生日格式有误!");

                //toString()  把异常对象转换为字符串
                System.out.println("toString方法结果 " + e.toString());

                //在开发中，出现异常后，为了方便程序员调试代码，需要把异常信息打印出来（是哪个类、哪个位置）
                e.printStackTrace();

                //在日志中记录下异常
                LOGGER.error(e.getMessage());

                System.out.println("请输入生日(xxxx-xx-xx):");
            }
        }
    }


    private static Date method(String strDate) throws ParseException {
        //格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.parse(strDate);//有发生异常
    }
}
