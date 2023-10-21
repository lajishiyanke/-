package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myDate {
    public static void main(String[] args) throws ParseException {
        //Date()：
        //new Date()  new Date(指定偏移毫秒值)
        //setTime() getTime()
        //SimpleDateFormat 格式化、解析
        //jdk8的时间 Date类 SimpleDateFormat类 Calendar类 工具类Duration Period
        Date d=new Date();
        System.out.println(d);
        Date d2=new Date(0);
        System.out.println(d2);
        //用get方法可返回偏移的毫秒数，在此之上可进行时间的加减Long类型o
        long time=d2.getTime();
        time=time+1000L*60*60*24*365;
        d.setTime(time);
        System.out.println(d);
        //SimpleDateFormat格式化Date()生成的字符串

        SimpleDateFormat spf=new SimpleDateFormat();
        System.out.println(spf.format(d));
        SimpleDateFormat spf1=new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss EE");
        System.out.println(spf1.format(d));


        //将格式化的时间转为字符串,调用getTime()方法得到偏移的毫秒数Long类型，进行计算
        String str="2023-11-11 11:11:11";
        SimpleDateFormat spf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=spf2.parse(str);
        System.out.println(date1);
        System.out.println(date1.getTime());

        //转换日期的格式：1.先解析成Date类型 再format成想要的
        String zifuchuan="2000-11-02";
        SimpleDateFormat jiexi=new SimpleDateFormat("yyyy-MM-dd");
        Date z=jiexi.parse(zifuchuan);
        SimpleDateFormat turn=new SimpleDateFormat("yyyy年MM月dd日");
        String format = turn.format(z);
        System.out.println(format);
    }
}
