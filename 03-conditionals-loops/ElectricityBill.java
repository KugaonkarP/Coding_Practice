import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt(); // Read units consumed from user input
        double billAmount;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            billAmount = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 3.5);
        }

        System.out.println("Electricity Bill Amount: $" + billAmount);

    }
}
