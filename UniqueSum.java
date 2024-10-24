import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(num1);
        uniqueNumbers.add(num2);
        uniqueNumbers.add(num3);

        int sum = 0;
        for (int number : uniqueNumbers) {
            sum += number;
        }

        System.out.println("The sum of unique integers is: " + sum);
    }
}
