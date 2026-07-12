
import java.util.Scanner;

public class ArmstrongNumberInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;  // Store the original number
        int sum = 0;
        while(num > 0) {
            int digit = num%10;
            sum= sum + (digit*digit*digit);
            num = num/10;
        }
        System.out.println(sum);
        if(sum==original){  // Compare with original number, not modified num
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}
