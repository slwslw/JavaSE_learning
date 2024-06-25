package Main_code.Day05泛型_数据结构_List_Set集合.code.InterfaceDemo;

public class Test1 {
    public static void main(String[] args) {
        //子类实现接口时，明确了接口泛型类型
        MycollectionImp2 mycoll = new MycollectionImp2();
        mycoll.add(100);
    }
}
