// 1.2 Take two numbers and print the sum of both.

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=in.nextInt();
        System.out.print("Enter second number: ");
        int b=in.nextInt();
        in.close();

        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
