package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Mapdemo2 {
    public static void main(String[] args) {
        Map<String,String>m=new HashMap<>();
        m.put("郭靖","黄蓉");
        m.put("杨过","小龙女");
        m.put("张无忌","赵敏");
        //根据键去遍历
        //m.keySet()得到单列集合， 遍历集合，m.get(key)得到value
        //增强for
        Set<String> strings = m.keySet();
        for (String s : strings) {
            //s:key
            String value=m.get(s);
            System.out.println(s+" "+value);
        }
        //迭代器
        Iterator<String>it=m.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(m.get(it.next()));
        }
        //lambda表达式
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(m.get(s));
            }
        });


    }
}
