package Main_code.Day05泛型_数据结构_List_Set集合.code.InterfaceDemo;

public class Test2 {
    public static void main(String[] args) {
        //子类实现接口时，没有指定接口泛型类型
        //创建子类对象时，明确泛型类型
        MycollectionImp1<String> mycollectionImp1 = new MycollectionImp1<>();
        mycollectionImp1.add("字符串");
    }
}
