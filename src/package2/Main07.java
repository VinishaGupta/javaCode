package package2;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=in.nextInt();
        fib(a);
    }

    public static void fib(int n){

        int a=0,b=1;
        System.out.print(a+" "+b);

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            System.out.print(" "+temp);
            a = b;
            b = temp;
        }
    }
}
