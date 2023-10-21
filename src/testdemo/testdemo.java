package testdemo;

import java.util.Arrays;
import java.util.Comparator;

public class testdemo {
    public static void main(String[] args) {
        //定义数组存储对象，Arrays中sort方法排序
        //1.有姓名 身高 年龄
        //2.按年龄 身高 姓名排序
        girl g1=new girl("a",18,1.67);
        girl g2=new girl("b",18,1.70);
        girl g3=new girl("c",19,1.72);
        girl[] g={g1,g2,g3};
        Arrays.sort(g, new Comparator<girl>() {
            @Override
            public int compare(girl o1, girl o2) {
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0?o1.getHeight()-o2.getHeight():temp;
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp>0){
                return  0;
                } else if (temp<0) {
                    return -1;
                }else return 0;
            }
        });
        System.out.println(Arrays.toString(g));
    }
}
