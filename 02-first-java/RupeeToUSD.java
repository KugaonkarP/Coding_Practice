import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rupees = input.nextDouble();
        double usd = rupees / 94.43;
        System.out.println(usd);
    }
}
