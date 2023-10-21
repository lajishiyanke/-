package search;

import java.time.LocalTime;
import java.util.Random;

public class quicksort {
    public static void main(String[] args) {
//        int[]arr={2,5,4,3,1,0,11,15,29,14,19};
        int[]arr=new int[1000000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        int i=0,j=arr.length-1;
        long start=System.currentTimeMillis();
//        sort(arr,i,j);
        sortagain(arr,i,j);
        long end=System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void sort(int[] arr, int i, int j) {
        int strat=i,end=j;
        if(strat>end){
            return;
        }
        int baseline=arr[i];//基准数必须在出口后面
        while(strat<end){
            //end从后往前找小，每次递减
            while (true){
                if(end<=strat||arr[end]<baseline){
                    break;
                }
                end--;
            }
            while (true){
                if(end<=strat||arr[strat]>baseline){
                    break;
                }
                strat++;
            }
            //交换end strat
            int temp=arr[strat];
            arr[strat]=arr[end];
            arr[end]=temp;
        }
        //strat,end指向同一位置，基准数归位
        int temp=arr[i];
        arr[i]=arr[strat];
        arr[strat]=temp;
//        return arr;
        sort(arr,i,strat-1);
        sort(arr,strat+1,j);
    }
    public static void sortagain(int[]arr,int i,int j){
        int start=i,end=j;
        if(start>end){
            return;
        }
        int baseline=arr[i];
        while(start<end){
            while(true){
                if(arr[end]<baseline||start>=end){
                    break;
                }
                end--;
            }
            while(true){
                if(arr[start]>baseline||start>=end){
                    break;
                }
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        sortagain(arr,i,start-1);
        sortagain(arr,start+1,j);
    }
}
