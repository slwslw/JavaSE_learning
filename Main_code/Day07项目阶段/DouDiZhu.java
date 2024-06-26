package Main_code.Day07项目阶段;

/*
    按照斗地主的规则，完成洗牌发牌的动作。
    要求完成以下功能：
    准备牌：组装54张扑克牌
    洗牌：54张牌顺序打乱
    发牌：三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
    看牌：查看三人各自手中的牌（按照牌的大小排序）、底牌

    规则：手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
 */

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        HashMap<Integer, String> pokers = new HashMap<>();
        //存大小王
        pokers.put(0, "大王");
        pokers.put(1, "小王");

        // 牌的颜色
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int key = 2;
        for (String number : numbers) { //先创建大牌，再创小牌
            for (String color : colors) {
                pokers.put(key, number + color);
                key++;
            }
        }
        System.out.println(pokers);

        //用集合打乱编号，再在Map集合里get值
        Set<Integer> set = pokers.keySet();
        List<Integer> list = new ArrayList<>();
        //把键存到list集合里去，再用Collections.shuffle打乱
        list.addAll(set);
        Collections.shuffle(list);

        //发牌,牌要有序储存，所以需要用TreeSet。这里每个人存编号
        TreeSet<Integer> 赌神 = new TreeSet<>();
        TreeSet<Integer> 赌圣 = new TreeSet<>();
        TreeSet<Integer> 赌侠 = new TreeSet<>();
        TreeSet<Integer> 底牌 = new TreeSet<>();
        //遍历牌的编号,自然规律排序
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                赌神.add(list.get(i));
            } else if (i % 3 == 1) {
                赌圣.add(list.get(i));
            } else {
                赌侠.add(list.get(i));
            }
        }
        //最后三张是底牌
        底牌.add(list.get(51));
        底牌.add(list.get(52));
        底牌.add(list.get(53));
        System.out.println("赌神:" + 赌神);
        System.out.println("赌圣:" + 赌圣);
        System.out.println("赌侠:" + 赌侠);
        System.out.println("底牌:" + 底牌);

        // 看牌
        // 赌神
        lookPoker(pokers, 赌神, "赌神:  ");

        // 赌圣
        lookPoker(pokers, 赌圣, "赌圣:  ");

        // 赌侠
        lookPoker(pokers, 赌侠, "赌侠:  ");

        // 底牌
        lookPoker(pokers, 底牌, "底牌:  ");
    }

    private static void lookPoker(HashMap<Integer, String> pokers, TreeSet<Integer> treeSet, String s) {
        System.out.print(s);
        for (Integer integer : treeSet) {
            System.out.print(pokers.get(integer) + "\t");
        }
        System.out.println();
    }
}
