import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        double average = (double)sum / n;
        System.out.println("The average is: " + average);
    }
}