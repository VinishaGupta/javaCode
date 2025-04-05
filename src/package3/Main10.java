// Calculate Electricity Bill
//₹1.50 per unit for the first 100 units
//
//₹2.00 per unit for the next 100 units (101–200)
//
//₹3.00 per unit for any units above 200

package package3;

public class Main10 {
    public static void main(String[] args) {

        int n=234;
        System.out.println(calculateBill(n));

    }

    public static double calculateBill(int n){
        double bill=0;

        if(n<=100){
            return n*1.50;
        }
        else if(n<=200){
            return n*2;
        }
        else{
            return n*3;
        }
    }
}
