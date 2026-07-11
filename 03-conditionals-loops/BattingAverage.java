import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int runs = sc.nextInt();
        System.out.println("Enter the number of runs: ");
        int runs = sc.nextInt();
        System.out.println("Enter the number of runs: ");
        int balls = sc.nextInt();

        double battingAverage = ((double) runs / balls)*100;
        System.out.println("The batting average is: " + battingAverage);

    }
}
