package package1;// 1.1 Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=in.nextInt();
        in.close();
        if(checkLeap(year)){
            System.out.println(year+ " is a leap year.");
        } else{
            System.out.println(year+" is not a leap year");
        }

    }

    public static boolean checkLeap(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}