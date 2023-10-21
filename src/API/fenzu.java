package API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fenzu {
    public static void main(String[] args) {
        //replaceAll split
        String st="dasdsafgsajdasvkasd";
        String nb = st.replaceAll("das", "nb");
        System.out.println(nb);
        String[] split = st.split("das");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //组号特点：只看左括号，按从左到右的左括号排序0
        //捕获分组 \\1把第一个括号的拿来 \\2 第二个括号
        String q="a123a";
        String w="abc123abc";
        System.out.println(q.matches("(.).+\\1"));
        System.out.println(w.matches("(.+).+\\1"));
        //$1 把正则表达式中第一组中的内容拿到正则表达式外面用
        String str="我我我最最最牛牛牛";
        String result=str.replaceAll("(.)\\1+","$1");
        System.out.println(result);

        //非捕获分组 ?:获取所有  ?=获取前面部分 ?!获取不是指定内容的前面部分  (?i)忽略大小写
        //?:仅仅把数据括起来 不占用组号 非捕获分组
        String s="Java是gajsidasdJava8和sdadasJava11asdasdJava17dasdas";
        //捕获Java8 11 17，返回Java
//        Pattern p =Pattern.compile("Java(?=8|11|17)");
        Pattern p =Pattern.compile("Java(?:8|11|17)");
//        Pattern p =Pattern.compile("Java(?!8|11|17)");
        Matcher m =p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
