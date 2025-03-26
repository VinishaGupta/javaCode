// 1.5 Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=in.nextInt();
        System.out.print("Enter another number: ");
        int b=in.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);

        int c=hcf(a,b);
        System.out.println("HCF: "+c);

        System.out.println("LCM: "+lcm(a,b,c));

        in.close();

    }

    public static int hcf(int a, int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int lcm(int a,int b, int hcf){
        return (a*b)/hcf;
    }
}
