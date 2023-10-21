package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class iteratordemo {
    public static void main(String[] args) {
        Collection<String>coll=new ArrayList<>();
        coll.add("1");
        coll.add("a");
        coll.add("c");
        //获取迭代器对象
        Iterator<String>iterator=coll.iterator();
        //用迭代器遍历
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        //增强for遍历 string第三方变量表示coll中的一个数据
//        for (String string : coll) {
//            System.out.println(string);
//        }
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);//s表示集合中每个数据
//            }
//        });
        coll.forEach(s->System.out.println(s));
    }
}
