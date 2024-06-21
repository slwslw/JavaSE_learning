package Main_code.Duotai_API_day3.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat类 :
        "2021年04月03日 16:48:10"  ---> Date
        Date(Sat Apr 03 16:41:38 CST 2021) --> "2021年04月03日 16:48:10"

        作用 :
            格式化 : Date --> String
            解析   : String --> Date

        构造方法 :
            public SimpleDateFormat(String pattern) : pattern : 字符串类型的日期模板

        成员方法 ;
            public final String format(Date date) : 接收一个Date对象返回指定模式的字符串
            public Date parse(String source) : 接收一个字符串  , 返回一个Date对象

        1 获取当前的日期对象，使用格式：yyyy-MM-dd HH:mm:ss 来表示，例如：2020-10-31 17:00:00【格式化】

        2 将字符串的 2020年10月31日  17:00:00，转换为日期Date对象。【解析】

 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 解析   : String --> Date
        String strDate = "2020年10月31日 17:00:00";
        // 注意 : 解析时 , SimpleDateFormat的参数(日期模板) , 必须和要解析字符串的模式匹配
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //  public Date parse(String source) : 接收一个字符串  , 返回一个Date对象
        Date date = sdf.parse(strDate);
        System.out.println(date); // Sat Oct 31 17:00:00 CST 2020
        method();
    }

    private static void method() {
        // 格式化 : Date --> String
        // 获取当前系统时间
        Date date = new Date();
        // System.out.println(date);// Sat Apr 03 16:53:35 CST 2024

        // public SimpleDateFormat(String pattern) : pattern : 字符串类型的日期模板
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // public final String format(Date date) : 接收一个Date对象返回指定模式的字符串
        String strDate = sdf.format(date);

        System.out.println(strDate);
    }
}