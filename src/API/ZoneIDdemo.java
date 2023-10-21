package API;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIDdemo {
    public static void main(String[] args) {
        //获取时区ZoneId
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        System.out.println(ZoneId.systemDefault());
        //获取指定时区 将字符串变为ZoneId
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId);
        //Instant
        Instant now = Instant.now();
        System.out.println(now);//标准时间
        System.out.println(Instant.ofEpochMilli(0));
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));//东八区
        //isAfter
        System.out.println(Instant.ofEpochMilli(0).isAfter(Instant.ofEpochMilli(1000)));
        //minus
        System.out.println(Instant.ofEpochMilli(1000).minusSeconds(1));
        //ZoneDateTime

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
        System.out.println(ZonedDateTime.of(2023, 10, 16, 10, 45, 0, 0, ZoneId.of("Asia/Shanghai")));
    }
}
