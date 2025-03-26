// 1.3 Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=in.nextInt();
        System.out.print("Enter the number that you want to extend the table to: ");
        int b=in.nextInt();
        in.close();

        for (int i = 1; i <= b ; i++) {
            System.out.println(a+" x "+i+" = "+(a*i));
        }
    }
}
