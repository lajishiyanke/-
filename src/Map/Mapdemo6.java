package Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Mapdemo6 {
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(5,"b");
        treeMap.put(3,"d");
        System.out.println(treeMap);
        TreeMap<Integer,String>treeMap1=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeMap1.put(1,"a");
        treeMap1.put(5,"b");
        treeMap1.put(3,"d");
        System.out.println(treeMap1);
    }
}
