package API;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        int num=1234;
        while(true){
            if(num==0)break;
            int remaindar=num%2;
            stringBuilder.insert(0,remaindar);
            num=num/2;
        }
        System.out.println(stringBuilder);
    }
}
