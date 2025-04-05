package package3;

public class Main19 {
    public static void main(String[] args) {

        String fruit="banana";
        System.out.println(fun(fruit));
    }

    public static String fun(String fruit){

        switch(fruit){
            case "apple" -> {
                return  "red";
            }

            case "banana" -> {
                return "yellow";
            }

            default -> {
                return "unknown";
            }

        }
    }
}
