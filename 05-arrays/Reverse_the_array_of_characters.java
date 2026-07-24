public class Reverse_the_array_of_characters {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Original array:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
