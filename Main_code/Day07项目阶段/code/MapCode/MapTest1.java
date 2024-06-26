package Main_code.Day07项目阶段.code.MapCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        //使用Map集合，记录字符出现次数
        Map<Character, Integer> map = new HashMap<>();

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //取出每个字符
            Character ch = str.charAt(i);

            //判断集合是否存在
            if (map.containsKey(ch)) {
                Integer value = map.get(ch);
                value++;
                map.put(ch, value);
            } else
                map.put(ch, 1);
        }
        //遍历键
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.print(character + "(" + map.get(character) + ")   ");
        }
        System.out.println("\n");
        //遍历键值对
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey()+ "(" + entry.getValue() + ")   ");
        }
    }
}
