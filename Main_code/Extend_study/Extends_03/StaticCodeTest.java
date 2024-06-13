package Main_code.Extend_study.Extends_03;

public class StaticCodeTest {
    public static void main(String[] args) {
        String data = StaticCode.getData(2); //调用静态方法，不需要创建对象
        System.out.println(data);
    }
}
