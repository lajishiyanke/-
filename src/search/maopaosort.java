package search;

public class maopaosort {
    //相邻元素比较，大的放后面
    //第一轮比较结束后，第二轮少循环一次
    //一共n-1轮
    public static void main(String[] args) {
        int[]arr={2,5,4,3,1,0};
        int[] already=sort(arr);
        for (int i = 0; i < already.length; i++) {
            System.out.print(already[i]);
        }
    }
    public static int[] sort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
