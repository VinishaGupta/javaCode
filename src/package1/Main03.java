package package1;// 1.4 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter characters, the program will terminate if 'x' is entered");

        while (true){
            char a=in.next().charAt(0);
            if(a=='x' || a=='X'){
                System.out.println("Terminated");
                break;
            } else{
                System.out.println(a);
            }
        }

        in.close();

    }
}
