// To find out whether the given String is Palindrome or not.

package package2;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        if(reverse(str)){
            System.out.println(str+ " is a palindrome");
        } else{
            System.out.println(str+ " is not a palindrome");
        }

        if(reverse2(str)){
            System.out.println(str+ " is a palindrome");
        } else{
            System.out.println(str+ " is not a palindrome");
        }


    }

    public static boolean reverse(String str){
        int len=str.length();

//        String a="";
//
//        for (int i = len-1; i >=0; i--) {
//            a+=str.charAt(i);
//        }

        StringBuilder a=new StringBuilder(str);
        if(str.equals(a.reverse().toString())){
            return true;
        }


//        if(str.equals(a)){
//            return true;
//        }
        return false;
    }

    public static boolean reverse2(String str){
        int left=0;
        int right=str.length()-1;

        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
