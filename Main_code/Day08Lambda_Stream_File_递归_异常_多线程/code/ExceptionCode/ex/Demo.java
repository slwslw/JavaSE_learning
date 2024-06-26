package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex;

public class Demo  extends Thread{
    //重写方法
    public void run(){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
