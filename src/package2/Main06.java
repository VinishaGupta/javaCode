// Input currency in rupees and output in USD.

package package2;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double a=in.nextDouble();

        System.out.println("USD: "+convert(a));
    }

    public static String convert(double a){

        return String.format("%.2f",(a*0.012));
    }
}
