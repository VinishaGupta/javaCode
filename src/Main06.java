// 2.2 Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a=in.nextLine();
        System.out.println(print(a));
        in.close();
    }

    public static String print(String str){
        return  "Hello, "+str;
    }
}
