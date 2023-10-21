package API;

import java.util.Scanner;

public class baozhuanglei {
    public static void main(String[] args) {
        //包装类
        //JDK5后自动装箱 自动拆箱
        Integer i=1;
        Integer b=2;
        Integer c=i+b;
        //JDK5以前 装箱：valueOf 拆箱：intValue()
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);

        System.out.println(i1.intValue());
        System.out.println(i1==i2);

        Integer i5 = Integer.valueOf(128);
        Integer i6 = Integer.valueOf(128);
        System.out.println(i5==i6);

        //-128，127间是同一地址，其余的new出来的地址不同

        //转二进制
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toHexString(100));
        //字符串转回int
        int ouo =Integer.parseInt("123");
        System.out.println(ouo);
        //改进后的键盘录入 next()遇到空格后会接收不到后面的
        Scanner sc=new Scanner(System.in);
        System.out.println("shuru:");
        String string = sc.nextLine();
        int i3 = Integer.parseInt(string);
        System.out.println(i3);
    }
}
