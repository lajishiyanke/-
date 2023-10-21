package API;

import java.math.BigInteger;

public class BigIntegerdemo {
    public static void main(String[] args) {
        //1.构造函数
        BigInteger bigInteger=new BigInteger("1000");
        System.out.println(bigInteger);
        //2.valueOf
        BigInteger bigInteger1=BigInteger.valueOf(1000);
        System.out.println(bigInteger1 == bigInteger);
        //区别：valueOf的范围是long取值范围
        //对-16，+16进行了优化 内部提前创建了BigInteger对象，和Integer.valueOf()类似-128,127
        BigInteger bigInteger2=BigInteger.valueOf(17);
        BigInteger bigInteger3=BigInteger.valueOf(17);
        System.out.println(bigInteger2 == bigInteger3);

        //add() multiply() intValue()等方法
        //存储原理;把数分段存储，存到数组里

    }
}
