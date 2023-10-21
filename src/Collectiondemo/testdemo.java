package Collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class testdemo {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //60% 40%概率怎么写：if判断即可实现
        Collections.addAll(list,1,1,1,1,1,1,0,0,0,0);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
