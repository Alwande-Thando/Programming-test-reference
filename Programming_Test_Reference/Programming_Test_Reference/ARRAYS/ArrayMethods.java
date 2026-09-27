public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        displayArray(numbers);

        int total = calculateTotal(numbers);
        System.out.println("Total: " + total);

        int largest = findLargest(numbers);
        System.out.println("Largest: " + largest);
    }

    public static void displayArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int calculateTotal(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }
}
