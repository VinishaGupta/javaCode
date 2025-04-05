// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package package3;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int sum=0;

        while(true){
            System.out.print("Enter a number (0 to stop) : ");
            int a=in.nextInt();

            if(a==0){
                break;
            }

            sum+=a;
            System.out.println("Sum: "+sum);
        }


        in.close();

    }
}
