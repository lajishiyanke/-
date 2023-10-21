package API;

public class zhengzebiaodashi {
    public static void main(String[] args) {
        String regix="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regix));
        String regex="\\w+@{1}\\w+\\.{1}[comcncnn][comcncnn][comcncnn]";
        System.out.println("3233@qq.com".matches(regex));
        String rege="[1-9]\\d{16}[\\dXx]";

    }
}
