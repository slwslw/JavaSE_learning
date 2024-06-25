package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    需求：创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(String)。
    学生属性姓名和年龄, 要求按照年龄进行升序排序并遍历
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        // 学生作为键, 家庭住址作为值。
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
//                return o1.getAge() - o2.getAge();
            }
        });

        tm.put(new Student("迪丽热巴", 18), "新疆");
        tm.put(new Student("迪丽热巴", 16), "中国");
        tm.put(new Student("阿迪达斯", 16), "中国");

//        System.out.println(tm);
        Set<Map.Entry<Student, String>> s = tm.entrySet();
        for (Map.Entry<Student, String> entries : s) {
            Student key = entries.getKey();
            String value = entries.getValue();
            System.out.println(key + "----" + value);
        }
    }
}
