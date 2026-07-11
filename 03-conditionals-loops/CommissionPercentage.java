


import java.util.Scanner;
import java.util.*;

public class CommissionPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int sales = sc.nextInt();
        int originalPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profit = sellingPrice - originalPrice;
        double abc = (profit * 100.0) / originalPrice;
        System.out.println(abc);

    }
}
