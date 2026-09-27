public class CountValues {
    public static void main(String[] args) {
        int[] marks = {45, 67, 82, 35, 91, 54, 78};

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Passes: " + passCount);
        System.out.println("Fails: " + failCount);
    }
}
