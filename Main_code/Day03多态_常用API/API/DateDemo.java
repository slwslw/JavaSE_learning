package Main_code.Day03多态_常用API.API;

import java.util.Date;

/*
    Date类 : 代表的是一个瞬间 , 精确到毫秒

    构造方法 :
        public Date() : 代表的是当前系统时间
        public Date(long date) : Date对象 = 1970/1/1 0:0:0 + long类型的毫秒值

    成员方法 :
        public void setTime(long date) : Date对象 = 1970/1/1 0:0:0 + long类型的毫秒值
        public long getTime() : 返回的是毫秒值 = Date代表的时间 - 1970/1/1 0:0:0
 */
public class DateDemo {
    public static void main(String[] args) {
        //  public Date() : 代表的是当前系统时间
//        Date d = new Date();
//        System.out.println(d);

        //  public Date(long date) : Date对象 = 1970/1/1 0:0:0 + long类型的毫秒值
//        Date d2 = new Date(1000L * 60 * 60 * 24); // 1970/1/1 0:0:0 + 一天的毫秒值
//        System.out.println(d2);

        Date d = new Date();
        // public void setTime(long date) : Date对象 = 1970/1/1 0:0:0 + long类型的毫秒值
        // d.setTime(1000L * 60 * 60 * 24);
        System.out.println(d);

        // public long getTime() : 返回的是毫秒值 = Date代表的时间 - 1970/1/1 0:0:0
        // System.out.println(d.getTime());

    }
}
