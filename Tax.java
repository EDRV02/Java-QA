//Imports go here
import java.util.Scanner;
public class Tax {
    static void taxCalc(int salary) {
        int remaining;
        double tax10 = 0.10;
        double tax15 = 0.15;
        double tax20 = 0.2;
        double tax25 = 0.25;
        if (salary <= 14999) {
            remaining = salary;
            System.out.println("Your tax rate is 0% and so your remainining is £" + remaining );
        } else if (salary <= 19999 && salary >= 15000) {
            remaining = (int) (salary - tax10 * salary);
            System.out.println("Your tax rate is 10% and so your remainining is £" + remaining );
        }else if ( salary <= 29999 && salary >= 20000) {
            remaining = (int) (salary - tax15 * salary);
            System.out.println("Your tax rate is 15% and so your remainining is £" + remaining );
        }else if ( salary <= 44999 && salary >= 30000) {
            remaining = (int) (salary - tax20 * salary);
            System.out.println("Your tax rate is 20% and so your remainining is £" + remaining );
        } else if ( salary >= 45000){
            remaining = (int) (salary - tax25 * salary);
            System.out.println("You are on max tax bracket of 25% and so your remaining salary is £" + remaining);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your salary in £.");

        int salary = Integer.parseInt(scn.nextLine());
        Tax.taxCalc(salary);

    }
}
