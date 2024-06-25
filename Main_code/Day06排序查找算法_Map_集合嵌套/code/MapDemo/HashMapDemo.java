package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;
import java.util.HashMap;
import java.util.Set;

/*
    HashMap类 :
        存储数据，每位学生（姓名，年龄）都有自己的家庭住址。
        学生和地址有对应关系，将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值。
        要求：学生姓名相同并且年龄相同视为同一名学生，不能重复存储
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 学生作为键, 家庭住址作为值。
        HashMap<Student, String> hm = new HashMap<>();

        hm.put(new Student("迪丽热巴", 18) , "新疆"); //删除key重复的元素
        hm.put(new Student("迪丽热巴", 18) , "中国");

        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key + "--" + value);
        }
    }
}
