import java.util.Scanner;

public class SumofAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 0) {
            int sum = n;
            while (n >= 0) {
                System.out.println("Enter a number: ");
                n = sc.nextInt();
                if (n > 0) {
                    sum += n;
                    System.out.println("The sum of all numbers is: " + sum);
                } else if (n == 0) {
                    System.out.println("The sum of all numbers is: " + sum);
                    break;
                }

            }
        }else{
            System.out.println("The sum of all numbers is: 0");
        }
    }
}