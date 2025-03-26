// 2.3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        float p=in.nextFloat();
        float t=in.nextFloat();
        float r=in.nextFloat();

        System.out.println(abc(p,t,r));
    }

    public static float abc(float p,float t,float r){
        float a=p*t*r;
        return a/100;
    }
}
