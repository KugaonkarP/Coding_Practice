public class DepreciationofValue {
    public static void main(String[] args) {
        double initialValue = 10000; // Initial value of the asset
        double depreciationRate = 0.15; // Depreciation rate (15%)
        int years = 5; // Number of years

        System.out.println("Year\tValue");
        System.out.println("-------------------");

        for (int year = 1; year <= years; year++) {
            initialValue -= initialValue * depreciationRate; // Calculate depreciation
            System.out.printf("%d\t%.2f\n", year, initialValue); // Print year and value
        }
    }
}
