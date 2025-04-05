package package3;

public class Main17 {
    public static void main(String[] args) {

        String fruit="cherry";

        switch(fruit){
            case "apple" -> System.out.println("red");
            case "banana" -> System.out.println("yellow");
            default -> System.out.println("Unknown");
        }
    }
}
