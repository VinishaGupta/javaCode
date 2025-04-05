//Input a number and print all the factors of that number (use loops).

package package3;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
//        factors(n);
        factors2(n);
    }

    public static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {  // Loop only till sqrt(n)
            if (n % i == 0) {  // If i is a factor of n
                System.out.print(i + " "); // Print the smaller factor

//                if (i != n / i) {  // Avoid duplicate printing for perfect squares
                    System.out.print((n / i) + " \n"); // Print the corresponding larger factor

            }

        }
    }

    public static void factors2(int n){

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.print(i+" x ");
                System.out.print(n/i);
                System.out.println();
            }

        }
    }
}
