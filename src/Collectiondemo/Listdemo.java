package Collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Listdemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String>iterator= list.iterator();
        //迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //增强for
        for (String string : list) {
            System.out.println(string);
        }
        //lambda
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //普通for
        list.forEach(s -> System.out.println(s));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //列表迭代器
        ListIterator<String>listIterator= list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
