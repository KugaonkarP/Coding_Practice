import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int hcf = hcf(a, b);
        int lcm = (a / hcf) * b;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
