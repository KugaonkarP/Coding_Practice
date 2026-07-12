import java.sql.SQLOutput;
import java.util.Scanner;

public class ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nFact = 1;
        int rFact = 1;
        int n_rFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            n_rFact *= i;
        }
        System.out.println("nCr: " + (nFact / (rFact * n_rFact)));
        System.out.println("nPr: " + (nFact / n_rFact));

    }
}