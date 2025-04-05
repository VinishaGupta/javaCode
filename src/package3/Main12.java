// Calculate Discount Of Product

package package3;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter the price: ");
        double price=in.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discount=in.nextDouble();

        double dp=price-(price*(discount/100));
        System.out.printf("Discounted price: %.2f",dp);


    }
}
