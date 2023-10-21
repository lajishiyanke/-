package Set;

import java.util.LinkedHashSet;

public class Lineksetdemo {
    public static void main(String[] args) {
        Student s1=new Student("w",23);
        Student s2=new Student("q",24);
        Student s3=new Student("e",25);
        LinkedHashSet<Student>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        System.out.println(linkedHashSet);
    }
}
