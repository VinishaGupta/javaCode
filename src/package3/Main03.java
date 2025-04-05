package package3;

import java.util.*;

public class Main03 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        fib(n);
        in.close();
    }

    public static void fib(int n){
        if(n<=0){
            System.out.println("Enter a positive number");
            return;
        }

        if(n==1){
            System.out.println(0);
            return;
        }

        int a=0,b=1;

        System.out.print(a+" "+b);

        for(int i=2;i<n;i++){

            int temp=a+b;
            System.out.print(" "+temp);
            a=b;
            b=temp;
        }
    }
}
