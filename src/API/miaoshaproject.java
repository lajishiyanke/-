package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class miaoshaproject {
    public static void main(String[] args) throws ParseException {
        /*
        * 秒杀活动：2023年11月11日 0：0：0
        * 截止时间：2023年11月11日 0：01：0
        * 1号下单时间：0：01：0
        * 2号下单时间0：11：0
        * 判断谁参加上了
        * */
        //定义字符串
        //解析字符串
        //转为毫秒数
        //计算
        //转为指定格式
        String start="2023年11月11日 00:00:00";
        String player1="2023年11月11日 00:01:00";
        String player2="2023年11月11日 00:11:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d=sdf.parse(start);
        Date d1=sdf.parse(player1);
        Date d2=sdf.parse(player2);
        long time = d.getTime();
        long[] arr=new long[2];
        arr[0]=d1.getTime();
        arr[1]=d2.getTime();
        for (int i = 0; i < 2; i++) {
            long result=arr[i]-time;
            if(result<=1000*60){
                System.out.println("抢到了");
            }else{
                System.out.println("没抢到");
            }
        }
    }
}
