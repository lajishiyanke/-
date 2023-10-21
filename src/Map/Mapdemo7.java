package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Mapdemo7 {
    public static void main(String[] args) {
        Map<Student,String>map=new HashMap<>();
        Student s1=new Student(22,"wangyou");
        Student s2=new Student(25,"wuyilun");
        Student s3=new Student(28,"aabb");
        map.put(s1,"hubei");
        map.put(s2,"a");
        map.put(s3,"b");
        System.out.println(map);

    }


}
