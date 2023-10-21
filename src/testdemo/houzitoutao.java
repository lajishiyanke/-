package testdemo;

public class houzitoutao {
    //反向递归问题
    //猴子一天吃一半加一个桃子，吃了10天剩1个，问第一天有多少个
    public static void main(String[] args) {
        int day=1;
        int result=calculate(day);
        System.out.println(result);
    }

    private static int calculate(int day) {
        //出口 规律
        if(day==10)return 1;
        //若要知道第一天，则需要知道第二天，以此类推直到第十天，第十天能求出来，然后一级一级的return回去
        return (calculate(day+1)+1)*2;
    }
}
