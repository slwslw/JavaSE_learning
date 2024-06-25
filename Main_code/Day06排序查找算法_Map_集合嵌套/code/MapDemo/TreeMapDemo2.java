package Main_code.Day06排序查找算法_Map_集合嵌套.code.MapDemo;

import java.util.Set;
import java.util.TreeMap;
//任务
// :将老师年龄从低到高排列
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Teacher, String> tm = new TreeMap<>();

        tm.put((new Teacher("乐老师", 44)), "数学");
        tm.put((new Teacher("乐老师", 46)), "地理");
        tm.put((new Teacher("闵老师", 30)), "英语");
        tm.put((new Teacher("李老师", 44)), "语文");

        Set<Teacher> s = tm.keySet();
        for (Teacher teacher : s) {
            System.out.println(teacher + "----" + tm.get(teacher));
        }
    }
}
