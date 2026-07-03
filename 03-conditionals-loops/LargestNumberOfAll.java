import java.util.Scanner;

public class LargestNumberOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = n;
        if(n != 0){
            while(n >= 0){
                System.out.println("Enter a number: ");
                n = sc.nextInt();
                if(n > largest){
                    largest = n;
                }else if(n == 0){
                    System.out.println("The largest number is: " + largest);
                    break;
                }
            }
        }else{
            System.out.println("The largest number is: 0");
        }
    }
}