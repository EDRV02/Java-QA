import java.util.Scanner;
public class FizzBuzz {
    static void FB(int input) {
        for(int i = 0; i != input; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int userInput = Integer.parseInt(scn.nextLine());
        FB(userInput);
    }
}
