import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
