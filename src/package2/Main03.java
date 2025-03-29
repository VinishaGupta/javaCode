package package2;// 2.3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter principal: ");
        float p=in.nextFloat();
        System.out.print("Enter time: ");
        float t=in.nextFloat();
        System.out.print("Enter rate: ");
        float r=in.nextFloat();

        System.out.println("Simple Intrest: "+ calculateSI(p,t,r));

        in.close();
    }

    public static float calculateSI(float p, float t, float r){
        float a=p*t*r;
        return a/100;
    }
}
