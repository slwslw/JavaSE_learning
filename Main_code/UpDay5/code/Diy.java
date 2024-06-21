package Main_code.UpDay5.code;

import java.util.ArrayList;
import java.util.Arrays;
public class Diy {
    public static void main(String[] args) {
        // Collection集合中 : public <T> T[] toArray(T[] a) : 把集合中的内容存储到一个数组中 , 进行返回
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("ads");
        list.add("qwe");
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }

    // 接收一个集合 , 往集合中添加三个待指定类型的元素
    public static <X> void addElement(ArrayList<X> list, X x1, X x2, X x3) {
        list.add(x1);
        list.add(x2);
        list.add(x3);
    }
}
