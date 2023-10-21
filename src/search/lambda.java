package search;

import java.util.Arrays;
import java.util.Comparator;

public class lambda {
    public static void main(String[] args) {
        Integer[]arr={2,3,1,5,9,7};
        //匿名内部类的写法
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //Lambda表达式完整写法
        Arrays.sort(arr,(Integer o1,Integer o2)->{
            return o2-o1;
        });
        //Lambda简化写法
        Arrays.sort(arr,(o1,o2)->o1-o2);
        System.out.println(Arrays.toString(arr));
    }
}
