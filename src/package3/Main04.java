// Subtract the Product and Sum of Digits of an Integer

package package3;

import java.util.*;

public class Main04 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        fun(n);
        in.close();
    }

    public static void fun(int n){

        int sum=0;
        int product=1;

        while (n != 0) {
            int temp=n%10;
            sum+=temp;
            product*=temp;
            n=n/10;
        }

        System.out.println(sum);
        System.out.println(product);
        System.out.println(product-sum);
    }
}
