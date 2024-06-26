package Main_code.Day06排序查找算法_Map_集合嵌套.code.集合嵌套;

import java.util.*;

/*
    Map嵌套Map

    使用场景举例：一个年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息，班级有与之对应的班级名称。

    思路：
    可以使用Map集合保存一个班级的学生（键是学号，值是名字）

    可以使用Map集合保存所有班级（键是班级名称，值是班级集合信息）

    因此我们可以定义集合如下：
    班级： Map<String,String> 键：学号，值：姓名
        举例 :
            Map<String,String> 三年一班 = {it001 = 迪丽热巴 , it002 = 古力娜扎 ,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
            Map<String,String> 三年二班 = {it001 = 李小璐 , it002 = 白百何 , it003 = 马蓉}
            Map<String,String> 三年三班 = {it001 = 林丹 ,it002 = 文章, it003 = 陈赫}

    年级： Map<String , Map<String,String>> 键：班级名称，值：具体班级信息
        举例:
            Map<String, Map<String,String>> 年级 = {"三年一班" = 三年一班 , "三年二班" = 三年二班 , "三年三班" = 三年三班 }

 */
public class Map_Map {
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


        Map<String, Map<String, String>> 年级 = new HashMap<>();
        年级.put("三年一班", 三年一班);
        年级.put("三年二班", 三年二班);
        年级.put("三年三班", 三年三班);

        Set<String> 班级名字集合 = 年级.keySet();
        for (String 班级名字 : 班级名字集合) {
            Map<String, String> 班级信息 = 年级.get(班级名字);

            Set<String> 学生学号 = 班级信息.keySet();
            for (String 学号 : 学生学号) {
                String 姓名 = 班级信息.get(学号);
                System.out.println("班级名字:" + 班级名字 + " ,学号:" + 学号 + " , 名字:" + 姓名);
            }
            System.out.println("============");
        }

    }
}