package search;

public class fenkuaichazhao {
    public static void main(String[] args) {
        int[]arr={27,22,30,40,36,13,19,20,7,10,43,50,48};
        block b1=new block(22,40,0,5);
        block b2=new block(13,20,5,8);
        block b3=new block(7,10,9,10);
        block b4=new block(43,50,11,13);
        //索引表
        block[] b={b1,b2,b3,b4};
        int num=50;
        int look = look(b, arr, num);
        System.out.println(look);
    }
    public static int look(block[] b,int arr[],int num){
        for (int i = 0; i < b.length; i++) {
            if(num<=b[i].getMax()&&num>=b[i].getMin()){
                for (int i1 = 0; i1 < (b[i].getMaxindex() - b[i].getMinindex()); i1++) {
                    if(num==arr[i1+b[i].getMinindex()]){
                        return i1+b[i].getMinindex();
                    }
                }
            }
        }
        return -1;
    }
}
class block{
    private int min;
    private int max;
    private int minindex;
    private int maxindex;

    public block(int min, int max, int minindex, int maxindex) {
        this.min = min;
        this.max = max;
        this.minindex = minindex;
        this.maxindex = maxindex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMinindex() {
        return minindex;
    }

    public void setMinindex(int minindex) {
        this.minindex = minindex;
    }

    public int getMaxindex() {
        return maxindex;
    }

    public void setMaxindex(int maxindex) {
        this.maxindex = maxindex;
    }
}
