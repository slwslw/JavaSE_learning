package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex;

/*
    抛出异常演示 :
        格式 :
            修饰符  返回值类型  方法名(参数列表)  {
                throw new 异常对象();
            }

        注意 :
            1 抛出异常的格式必须在方法的内部完成
            2 如果手动抛出一个异常，下面的代码无法执行
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("家里有一个貌美如花的老婆");
        System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要?");

        // 程序不想往下执行了 ,怎么做 ???
        // 1 自己手动制造出一个异常
        // 2 当前异常也是交给了方法的调用者处理 , 也就是jvm处理
        // 3 下面代码无法执行
        throw new RuntimeException();

        //System.out.println("武大郎的标准生活!"); 如果手动抛出一个异常，下面的代码无法执行
    }
}