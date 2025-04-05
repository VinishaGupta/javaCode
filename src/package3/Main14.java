// Power In Java

package package3;

public class Main14 {
    public static void main(String[] args) {

        int number=6;
        int power=3;

        int ans=1;

        for (int i=0;i<power;i++){
            ans*=number;
        }
        System.out.println(ans);
        System.out.println(Math.pow(number,power));
    }
}
