import java.util.Scanner;
public class BlackJack {
    static void play(int one, int two) {
        // check both nums are above 0
        if (one > 0 || two > 0) {
            if (Math.max(one,two) > 21) { // check if max is above 21
                // if yes return the min
                System.out.println("Closest to 21 is " + Math.min(one, two));
            } else {
                System.out.println("Closest to 21 is " + Math.max(one, two));
            }
        } else {
            System.out.println("Both numbers need to be above zero.");
        }
    }
    public static void main(String[] args ){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = Integer.parseInt(scn.next());
        System.out.print("Please enter second number: ");
        int num2 = Integer.parseInt(scn.next());
        play(num1, num2);
    }
}
