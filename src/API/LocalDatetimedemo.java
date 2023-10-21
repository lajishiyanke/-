package API;

import java.time.*;

public class LocalDatetimedemo {
    public static void main(String[] args) {
        //LocalDateTime 年月日时分秒
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 10, 1, 12, 0);
        System.out.println(localDateTime2);
        System.out.println(localDateTime);

        int y=localDateTime.getYear();
        Month month = localDateTime.getMonth();
        int dayOfMonth = localDateTime.getDayOfMonth();
        //with 修改 年月日
        LocalDateTime localDateTime1 = localDateTime.withYear(2022);
        System.out.println(localDateTime1);
        //LocalTime 时分秒 更准确
        //LocalDate 年月日
        LocalDate birDate=LocalDate.of(2000,10,16);
        LocalDate now=LocalDate.now();
        if(birDate.getMonth()==now.getMonth()&&birDate.getDayOfMonth()==now.getDayOfMonth()){
            System.out.println("1");
        }else System.out.println("0");
    }
}
