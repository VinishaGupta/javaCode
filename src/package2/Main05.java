// Take 2 numbers as input and print the largest number.

package package2;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(max1(a,b));
        System.out.println(max2(a,b));

    }

    public static int max1(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static int max2(int a,int b){
        return Math.max(a,b);
    }
}
