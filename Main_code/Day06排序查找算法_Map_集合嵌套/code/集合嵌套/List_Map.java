package Main_code.Day06排序查找算法_Map_集合嵌套.code.集合嵌套;

import java.util.*;

/*
    List嵌套Map :

    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息。

    思路：
        1 可以使用Map集合保存一个班级的学生（键是学号，值是名字）
        2 可以使用List集合保存所有班级

    因此我们可以定义集合如下：

    班级：Map<String,String> 键是学号，值是姓名
        举例 :
            Map<String,String> 三年一班 = {it001 = 迪丽热巴 , it002 = 古力娜扎 ,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
            Map<String,String> 三年二班 = {it001 = 李小璐 , it002 = 白百何 , it003 = 马蓉}
            Map<String,String> 三年三班 = {it001 = 林丹 ,it002 = 文章, it003 = 陈赫}

    年级：List<Map<String,String>>保存每个班级的信息
        举例 :
              List<Map<String,String>> 年级 = {三年一班 , 三年二班 , 三年三班}
 */
public class List_Map {
    public static void main(String[] args) {
        Map<String, String> 三年一班 = new HashMap<>();
        三年一班.put("it001", "迪丽热巴");
        三年一班.put("it002", "古力娜扎");
        三年一班.put("it003", "马尔扎哈");
        三年一班.put("it004", "欧阳娜娜");


        Map<String, String> 三年二班 = new HashMap<>();
        三年二班.put("it001", "李小璐");
        三年二班.put("it002", "白百何");
        三年二班.put("it003", "马蓉");

        Map<String, String> 三年三班 = new HashMap<>();
        三年三班.put("it001", "林丹");
        三年三班.put("it002", "文章");
        三年三班.put("it003", "陈赫");


        List<Map<String, String>> 年级 = new ArrayList<>();
        年级.add(三年一班);
        年级.add(三年二班);
        年级.add(三年三班);

        for (Map<String, String> 班级 : 年级) {
            Set<String> studentId = 班级.keySet();
            for (String id : studentId) {
                String name = 班级.get(id);
                System.out.println(id + "---" + name);
            }
            System.out.println("=================");
        }
    }
}