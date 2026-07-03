import java.util.Scanner;

public class SubtractProductAndSumOfDigits {

    public static void main(String[] args) {

        int n = 234;
        int prod = 1;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            int div = n / 10;

            prod = prod * rem;
            sum = sum + rem;
            n = div;
        }
        System.out.println(prod - sum);
    }
}
