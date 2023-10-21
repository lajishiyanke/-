package Map;

import java.util.*;
import java.util.function.BiConsumer;

public class Mapdemo5 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        String[]arr={"A","B","C","D"};
        ArrayList<String>arrayList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index=r.nextInt(arr.length);
            String s = arr[index];
            arrayList.add(s);
        }
        for (String s : arrayList) {
            if(map.containsKey(s)){
                int conut=map.get(s);
                conut++;
                map.put(s,conut);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);
//        final int[] max={0};
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                if(max[0]<integer){
//                    max[0]=integer;
//                }
//            }
//        });
        int max=0;
        for (String s : map.keySet()) {
            if(max<map.get(s)){
                max=map.get(s);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
