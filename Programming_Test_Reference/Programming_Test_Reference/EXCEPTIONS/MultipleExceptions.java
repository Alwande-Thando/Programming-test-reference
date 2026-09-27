public class MultipleExceptions {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);

            int result = 10 / 0;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
