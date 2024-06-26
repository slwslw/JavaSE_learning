package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex;
/*
    抛出异常存在的意义所在 :
        1 在方法中，当传递的参数有误，没有继续运行下去的意义了，则采取抛出处理，表示让该方法结束运行。
        2 告诉调用者方法中出现了问题

    练习   : 定义一个方法 , 方法的参数接收一个数组 , 在方法中遍历数组 .
    需求1  : 如果方法接收的数组为null  , 使用输出语句提示
    需求2  : 如果方法接收的数组为null  , 使用抛出异常解决
    思考   : 两种方式的区别在哪里 ?
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] array = null;

        try {
            method1(array);
        }catch (RuntimeException e){
            // getMessage()  从异常对象中获取消息（异常的原因）
            System.out.println(e.getMessage());
        }

        System.out.println("main方法程序继续执行");
    }


    public static void method1(int[] arr) throws RuntimeException{
        if(arr == null){
            //手动引发异常并抛出
            throw new RuntimeException("传递的参数不能为空!");
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void method2(int[] arr){
        if (arr == null ){
            System.out.println("传递的参数不能为空");
            return;//结束当前方法运行
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
