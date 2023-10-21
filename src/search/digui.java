package search;

public class digui {
    public static void main(String[] args) {
        //出口 规律 靠近出口
        System.out.println(get(100));
    }
    public static int get(int num){
        if(num==1){
            return 1;
        }
        return num+get(num-1);
    }
}
