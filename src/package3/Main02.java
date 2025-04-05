// Fibonacci Series In Java Programs

package package3;

import java.util.*;

public class Main02 {
    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        fib(n);


        float a=12345.0f;
        System.out.printf("%f\n",a);
        System.out.printf("%.2f\n",a);

//        double b=12345;
//        System.out.printf("%f\n",b);
//
//        String formatted1 =String.format("%.3f",a);
//        System.out.println(formatted1);
//
//        String formatted2 =String.format("%.1f",b);
//        System.out.println(formatted2);
    }

    public static void fib(int n){

        if(n==0){
            System.out.println(n);
            return;
        } else if(n==1){

            System.out.print("0 1");
        }else{

            int a=0;
            int b=1;

            System.out.print(a+" "+b);

            for (int i = 2; i <n; i++) {
                int temp=a+b;
                System.out.print(" "+temp);
                a=b;
                b=temp;
            }

        }

    }
}
