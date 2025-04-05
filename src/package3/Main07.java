// Take integer inputs till the user enters 0 and print the largest number from all.

package package3;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int max=Integer.MIN_VALUE;

        while (true){
            System.out.print("Enter a number: ");
            int a=in.nextInt();

            if(a==0){
                System.out.println("Max: "+max);
                break;
            }

            if(max<a){
                max=a;
            }

            System.out.println("Max: "+max);
        }
    }
}
