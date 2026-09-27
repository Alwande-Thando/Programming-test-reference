public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
