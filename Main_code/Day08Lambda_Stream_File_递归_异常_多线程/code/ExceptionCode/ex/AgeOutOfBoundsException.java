package Main_code.Day08Lambda_Stream_File_递归_异常_多线程.code.ExceptionCode.ex;

//自定义异常类
public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
