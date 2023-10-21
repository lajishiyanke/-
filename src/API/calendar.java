package API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
        //Calendar.getInstance()
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTime());
        //细节 月份范围0-11，get(2)取出来的要+1
        //星期日是第一天
        //get取
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DATE);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+" "+month+" "+day);
        System.out.println(week);
        //set 直接对日历进行操作
        c.set(Calendar.YEAR,2019);
        c.set(Calendar.MONTH,6);
//        c.add(Calendar.MONTH,-1);
//        add()偏移减少一个月
        c.set(Calendar.DATE,22);
        System.out.println(c.getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(c.getTime()));

        //LocalDateTime

    }
}
