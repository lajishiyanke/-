package API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pachong {
    public static void main(String[] args) {
        String str="Java 是由 Sun Microsystems 公司于 1995 年 5 月推出的高级程序设计语言。. " +
                "Java 可运行于多个平台，如 Windows, Mac OS 及其他多种 UNIX 版本的系统。. 本教程通过简单的实例将让大家更好的了解 Java 编程语言。";
        //获取正则表达式对象
        Pattern p=Pattern.compile("Java");
        Pattern o=Pattern.compile("UNIX");
        //文本匹配器对象
        Matcher m=p.matcher(str);
        Matcher n=o.matcher(str);
        //m.find()找到返回true m.group()截取找到的
        while (m.find()){
            String s=m.group();
            System.out.println(s);
        }
        while (n.find()){
            String s=n.group();
            System.out.println(s);
        }
    }
}
