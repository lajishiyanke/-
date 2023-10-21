package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class collectiondemo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        //往List系列添加时返回true 往Set添加遇到重复元素则会返回false
        coll.add("a");
        //只能
        coll.remove("a");
        coll.clear();
        coll.contains("1");
        System.out.println(coll);
    }
}
