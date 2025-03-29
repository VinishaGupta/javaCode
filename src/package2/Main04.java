package package2;// Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=in.nextInt();
        int b=in.nextInt();

        System.out.print("Enter operation(+,-,*,/,%): ");
        char c=in.next().charAt(0);

        calculate(a,b,c);

        in.close();
    }

    public static void calculate(int a,int b,char c){

        if(c=='+'){
            System.out.println("Addition :"+(a+b));
        } else if (c=='-'){
            System.out.println("Subtraction :"+(a-b));
        }
        else if (c=='*'){
            System.out.println("Multiplication :"+(a*b));
        } else if (c=='/'){
            if(b==0){
                System.out.println("cannot divide by 0");
                return;
            }
            double d=a/b;
            System.out.println("Division :"+d);
        } else if (c=='%'){
            System.out.println("Modulus :"+(a%b));
        } else {
            System.out.println("Invalid operation");
        }
    }
}
