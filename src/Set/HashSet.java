package Set;

public class HashSet {
    public static void main(String[] args) {
         Student s1=new Student("zhangsan",23);
         Student s2=new Student("zhangsan",23);
         //如果没重写hashCode方法，默认根据地址值进行计算，不同对象算出来的哈希值不同
        //如果重写了，则不同对象只有属性值相同，计算的哈希值就一样
        //在Student类中alt insert eaqulas()and hashcode方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //存在哈希碰撞，小部分情况下不同地址值、属性值算出来一样
        java.util.HashSet<Student>hs=new java.util.HashSet<>();
        hs.add(s1);
        hs.add(s2);
    }
}
