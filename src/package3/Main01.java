package package3;

import java.util.Scanner;

public class Main01{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();

        int a=0,b=1;
        System.out.print(a+" "+b);

        for(int i=2;i<=n;i++){


            int temp=a+b;
            System.out.print(" "+temp);
            a=b;
            b=temp;
        }
    }

}
