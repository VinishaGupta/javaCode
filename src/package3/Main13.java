package package3;

public class Main13 {
    public static void main(String[] args) {

        String fruit1="apple";
        String fruit2="banana";
        String fruit3="cherry";
        System.out.println(fun(fruit1));
        System.out.println(fun(fruit2));
        System.out.println(fun(fruit3));
    }

    public static String fun(String fruit){
        switch(fruit){

            case "apple":
                return "a red fruit";

            case "banana":
                return "a yellow fruit";

            default:
                return "Unknown fruit";
        }
    }
}
