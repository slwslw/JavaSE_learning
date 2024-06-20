package Main_code.UpDay4.code.Collection_learn;

import java.util.ArrayList;
import java.util.Collection;

/*增强for循环
增强for循环（foreach），专门用来遍历集合或者数组，底层实现使用迭代器

定义格式 :
        for(元素的类型 变量名 : 数组/单列集合 ){
变量代表的就是集合或者数组的元素
}*/
public class For_learn {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {10, 4, 5, 6, 12};

        //使用增强for遍历数组
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("---------");


        Collection<String> collection = new ArrayList<String>();
        //向集合中添加元素
        collection.add("Java");
        collection.add("MySQL");
        collection.add("Mybatis");
        collection.add("Spring");

        for (String str : collection) {
            System.out.println(str);
        }
    }
}
