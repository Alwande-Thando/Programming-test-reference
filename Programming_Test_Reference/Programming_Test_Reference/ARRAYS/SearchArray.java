public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int searchValue = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " was found.");
        } else {
            System.out.println(searchValue + " was not found.");
        }
    }
}
