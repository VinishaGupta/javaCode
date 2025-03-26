package a;

// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter a number");
//        int a=in.nextInt();

        int[] a=new int[]{1,2,3};
        int[] b=a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0]=99;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
