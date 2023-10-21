package testdemo;

public class palouti {
    public static void main(String[] args) {
        //小米爬楼梯，可迈一个台阶，也可两个，若楼梯共20个，问有几种爬法
        //第20个=第19个+第18个的爬法
        System.out.println(getCount(20));
        System.out.println(method(20));
    }

    private static int getCount(int i) {
        if(i==1)return 1;
        if(i==2)return 2;
        return getCount(i-1)+getCount(i-2);
    }
    //若能爬1，2，3个台阶，还是20，问有几个

    private static int method(int i){
        if(i==1)return 1;
        if(i==2)return 2;
        if(i==3)return 4;
        return method(i-1)+method(i-2)+method(i-3);
    }
}
