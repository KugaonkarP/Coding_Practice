import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOFNegativePositiveOddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <=num; i++) {
            int n = sc.nextInt();
            System.out.println("Number " + i + ": " + n);
        }
        if (num == 0) {
                System.out.println("The number is zero. Program terminated.");
                return;
            }


        int sumPositive = 0;
        int sumNegative = 0;
        int sumOdd = 0;
        int sumEven = 0;

        if (num > 0) {
            sumPositive += num;
        } else {
            sumNegative += num;
        }

        if (num % 2 == 0) {
            sumEven += num;
        } else {
            sumOdd += num;
        }

        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
    }
}
