package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo8 {
    public static void main(String[] args) {
        String a="aababncsadsadqweasd";
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(map.containsKey(c)){
                int count=map.get(c);
                count++;
                map.put(c,count);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
        TreeMap<Character,Integer>treeMap=new TreeMap<>(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             );
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(treeMap.containsKey(c)){
                int count=treeMap.get(c);
                count++;
                treeMap.put(c,count);
            }else {
                treeMap.put(c,1);
            }
        }
        System.out.println(treeMap);
    }
}
