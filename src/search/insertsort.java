package search;

public class insertsort {
    public static void main(String[] args) {
        int[]arr={2,5,4,3,1,0,87,56,32,66};
        int[] already=sort(arr);
        for (int i = 0; i < already.length; i++) {
            System.out.print(already[i]);
        }
    }

    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
}
