public class SingleArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 15, 40, 30};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Total: " + total);
        double average = (double) total / numbers.length;
        System.out.println("Average: " + average);
    }
}
