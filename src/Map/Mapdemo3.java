package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Mapdemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("张无忌","赵敏");
        //根据键值对遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
        //迭代器
        Iterator<Map.Entry<String, String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getKey());
        }
        //lambda
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey());
            }
        });
    }
}
