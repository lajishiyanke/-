package API;

import java.math.BigDecimal;

public class BigDecemodemo {
    public static void main(String[] args) {
        //小数可能存不准确：2的负几次方，然后加起来凑出那个数，可能使得位数很多，超出float double的32 64位，舍去，使得不准\
        //1.构造函数 不精确
        BigDecimal bigDecimal=new BigDecimal(0.01);
        System.out.println(bigDecimal);
        //2.传字符串
        BigDecimal bigDecimal1=new BigDecimal("0.01");
        System.out.println(bigDecimal1);
        //3.valueOf  不超过double的范围 0-10之间系统以创建好对象
        //4.各种方法
    }
}
