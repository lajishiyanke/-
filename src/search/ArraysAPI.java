package search;

import java.util.Arrays;

public class ArraysAPI {
    public static void main(String[] args) {
        //Arrays类，全是静态方法
        //toString()数组拼成字符串
        //fill()填充
        //binarySearch
        //copyOf
        //sort
        //Arrays.fill(arr,1);
        int[] arr={1,2,3,4,5,6,7,0,9};
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, 8);
        System.out.println(arr);
        //地址不同
        System.out.println(Arrays.copyOf(arr, 10));
        System.out.println(Arrays.toString(arr));

    }
}
