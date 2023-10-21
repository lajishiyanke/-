package testdemo;

import java.util.Arrays;

public class feibonaqie {
    public static void main(String[] args) {
        //斐波那契
        int[]arr=new int[10];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.print(Arrays.toString(arr)+" ");
        int num=10;
        int a=method(num);
        System.out.println(a);
    }
    private static int method(int num) {
        if(num==1||num==0)return 1;
        return method(num-1)+method(num-2);
    }
}
