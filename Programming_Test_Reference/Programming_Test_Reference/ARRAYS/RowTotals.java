public class RowTotals {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        for (int row = 0; row < numbers.length; row++) {
            int total = 0;

            for (int col = 0; col < numbers[row].length; col++) {
                total += numbers[row][col];
            }

            System.out.println("Row " + (row + 1) + " total: " + total);
        }
    }
}
