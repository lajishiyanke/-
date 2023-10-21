package search;

import java.util.Random;

public class selectsort {
    public static void main(String[] args) {
        //0索引与后面的索引比较，如果0更大，则交换数据
//        int[]arr={2,5,3,4,1};
        int[]arr=new int[10000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start=System.currentTimeMillis();
        extracted(arr);
        long end=System.currentTimeMillis();
        System.out.println(end - start);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
    }
    private static void extracted(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = j+1; i < arr.length; i++) {
                if(arr[j]> arr[i]){
                    int temp= arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
        }
        return ;
    }
}
