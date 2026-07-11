import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        double price = sc.nextDouble();
        System.out.println("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();
        double discountAmount = (discountPercentage / 100) * price;
        double finalPrice = price - discountAmount;
        System.out.println("The final price after discount is: " + finalPrice);
    }
}
