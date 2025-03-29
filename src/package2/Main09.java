// To find Armstrong Number between two given number.


package package2;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a=in.nextInt();

        if(check(a)){
            System.out.println(a+" is an armstrong number");
        } else{
            System.out.println(a+" is not an armstrong number");
        }
    }

    public static boolean check(int a){

        int c=a;
        int d=a;
        int len=0;

        while(a!=0){
            a=a/10;
            len++;
        }

        int prod=0;

        while(c!=0){
            prod+=Math.pow(c%10,len);
            c=c/10;
        }

        if(d==prod){
            return true;
        }
        return false;
    }
}
