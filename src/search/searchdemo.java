package search;

public class searchdemo {
    public static void main(String[] args) {
        int[]arr={1,5,6,7,9,95};
        int look=look(arr,7);
        boolean look2=looktwice(arr,95);
        System.out.println(look);
        System.out.println(look2);
    }
    public static boolean looktwice(int[]arr,int num){
        int min=0,max=arr.length-1;
        while(true){
            if(min>max){
                return false;
            }
            int mid=(min+max)/2;
            if(arr[mid]>num){
                max=mid-1;
            }else if(arr[mid]<num){
                min=mid+1;
            }else{
                return true;
            }
        }
    }
    public static int look(int[]arr,int num){
        int min=0;
        int max=arr.length-1;
        while(true) {
            if(min>max){
                return -1;
            }
            int mid=(min +max)/2;
            if(arr[mid]>num){
                max=mid-1;
            }else if(arr[mid]<num){
                min=mid+1;
            }else{
                return mid;
            }
        }
    }
}
