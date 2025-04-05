package package3;

// Factorial Program In Java

import java.util.*;

public class Main09{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(factorial(n));
//        System.out.println(false);
        in.close();
    }
        public static int factorial(int n){
            if(n==0){
                return 1;
            }

            int fact=1;

            for(int i=2;i<=n;i++){
                fact*=i;
            }

            return fact;

        }

    }