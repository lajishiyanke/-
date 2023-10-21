package Set;

import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {
//        int a=1,b=2,c=0;
//        TreeSet<Integer>treeSet=new TreeSet<>();
//        treeSet.add(a);
//        treeSet.add(b);
//        treeSet.add(c);
//        System.out.println(treeSet);

        Student s1=new Student("w",23);
        Student s2=new Student("q",24);
        Student s3=new Student("e",25);
        TreeSet<Student>treeSet=new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        System.out.println(treeSet);

    }
}
