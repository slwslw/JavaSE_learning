package Main_code.Day06排序查找算法_Map_集合嵌套.code;

import java.util.TreeSet;
/*TreeSet特点
    不包含重复元素的集合[元素唯一]
    没有带索引的方法[无索引]
    可以按照指定的规则进行排序[可以排序]
*/
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        //添加元素
        set.add(100);
        set.add(88);
        set.add(78);
        set.add(66);
        set.add(99);

        System.out.println(set);

        for (Integer t : set) {  // 增强for
            t += 100;
            System.out.println(t);
        }
    }
}
