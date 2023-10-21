package API;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer>integers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            int i = Integer.parseInt(string);
            integers.add(i);
            int max=getmax(integers);
            if(i<1||i>100) {
                System.out.println("fanwei");
                return;
            }
            if(max>200) {
                break;
            }
            }
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        }

    private static int getmax(ArrayList<Integer> integers) {
        int max=0;
        for (int i = 0; i < integers.size(); i++) {
            max+=integers.get(i);
        }
        return max;
    }
}
