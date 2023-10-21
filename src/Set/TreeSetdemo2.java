package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetdemo2 {
    public static void main(String[] args) {
        TreeSet<Student2>treeSet=new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                int sum1=o1.getChinese()+o1.getEnglish()+o1.getMath();
                int sum2=o2.getChinese()+o2.getEnglish()+o2.getMath();
                int i=sum1-sum2;
                i=i==0?o1.getChinese()-o2.getChinese():i;
                i=i==0?o1.getMath()-o2.getMath():i;
                i=i==0?o1.getEnglish()-o2.getEnglish():i;
                i=i==0?o1.getAge()-o2.getAge():i;
                i=i==0?o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        });
        Student2 s1=new Student2("a",23,6,6,7);
        Student2 s2=new Student2("a",23,6,7,8);
        treeSet.add(s1);
        treeSet.add(s2);
        System.out.println(treeSet);
    }
}
