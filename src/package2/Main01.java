package package2;// 2.1 Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=in.nextInt();
        check(a);
        in.close();

    }

    public static void check(int a){
        if(a==0){
            System.out.println("Zero");
        }
        else if(a%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
