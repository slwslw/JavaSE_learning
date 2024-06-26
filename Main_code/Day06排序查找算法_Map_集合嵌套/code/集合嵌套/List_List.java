package Main_code.Day06排序查找算法_Map_集合嵌套.code.集合嵌套;

import java.util.ArrayList;
import java.util.List;

/*
    使用场景举例：一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，保存一个年级所有的班级信息

    思路：
    可以使用List集合保存一个班级的学生
    可以使用List集合保存所有班级

    因此我们可以定义集合如下：
    班级：List<String>
        举例 :
            List<String> 三年一班 = {迪丽热巴 , 古力娜扎 ,马尔扎哈 ,欧阳娜娜}
            List<String> 三年二班 = {李小璐 , 白百何 , 马蓉}
            List<String> 三年三班 = {林丹 ,文章, 陈赫}

    年级：List<List<String>>
        举例 :
            List<List<String>> 年级 = {三年一班 , 三年二班 , 三年三班}
 */
public class List_List {
    public static void main(String[] args) {
        List<String> 三年一班 = new ArrayList<>();
        三年一班.add("迪丽热巴");
        三年一班.add("古力娜扎");
        三年一班.add("马尔扎哈");
        三年一班.add("欧阳娜娜");

        List<String> 三年二班 = new ArrayList<>();
        三年二班.add("李小璐");
        三年二班.add("白百何");
        三年二班.add("马蓉");

        List<String> 三年三班 = new ArrayList<>();
        三年三班.add("林丹");
        三年三班.add("文章");
        三年三班.add("陈赫");

        List<List<String>> 年级 = new ArrayList<>();
        年级.add(三年一班);
        年级.add(三年二班);
        年级.add(三年三班);

        for (List<String> 班级 : 年级) {
            for (String name : 班级) {
                System.out.println(name);
            }
            System.out.println("-----------------");
        }
    }
}