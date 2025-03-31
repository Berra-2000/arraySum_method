public class Main {
    public class ArraySum {
        // Method to calculate the sum of array elements
        public static int sumArray(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        // Main method to demonstrate the sumArray method
        public static void main(String[] args) {
            int[] exampleArray = {1, 2, 3, 4, 5};
            int sum = sumArray(exampleArray);
            System.out.println("Dizinin elemanlarının toplamı: " + sum);
        }
    }
}
