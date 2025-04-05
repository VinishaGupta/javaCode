// Calculate Average Of N Numbers

package package3;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        double sum=0;
        double count=0;
//        double avg=0;

        while (true){
            System.out.print("Enter a number (zero to break): ");
            int a=in.nextInt();

            if(a==0){
                if(count==0){
                    System.out.println("No numbers entered");
                    break;
                }
                double avg=sum/count;
                System.out.println("Average: "+avg);
                break;
            }

            sum+=a;
            count++;


        }

        in.close();
    }
}
