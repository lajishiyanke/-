package Map;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo1 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("郭靖","黄蓉");
        m.put("杨过","小龙女");
        m.put("张无忌","赵敏");
        System.out.println(m);
        System.out.println(m.get("张无忌"));
        System.out.println(m.size());
        System.out.println(m.remove("郭靖"));
        System.out.println(m.containsKey("杨过"));

    }
}
