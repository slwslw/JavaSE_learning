package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex.exception.demo4;

public class ExceptionDemo1 {
    //演示：throws、throw、try..catch的基本配合使用
    public static void main(String[] args) {

        int[] arr = null;

        //调用方法
//        printArray(arr);

        try {
            showArray(arr);
            showArray2(arr);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            //日志
        }

        System.out.println("程序执行执行.....");
    }

    public static void showArray(int[] array) /*throws RuntimeException*/ {
        //验证传递的参数是否合法
        if (array == null || array.length == 0) {
            throw new RuntimeException("传递的参数为空!");
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

    public static void showArray2(int[] array) {
        //验证传递的参数是否合法
        if (array == null || array.length == 0) {
            throw new RuntimeException("传递的参数为空!");
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }


    //遍历并打印数组中的元素
    public static void printArray(int[] array) {
        //验证传递的参数是否合法
        if (array == null || array.length == 0) {
            System.out.println("传递的数组为空!");
            //日志记录：
            return;
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }


    //遍历并打印数组中的元素
    public static void printArray2(int[] array) {
        //验证传递的参数是否合法
        if (array == null || array.length == 0) {
            System.out.println("传递的数组为空!");
            //日志记录
            return;
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

    //遍历并打印数组中的元素
    public static void printArray3(int[] array) {
        //验证传递的参数是否合法
        if (array == null || array.length == 0) {
            System.out.println("传递的数组为空!");
            //日志记录
            return;
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
