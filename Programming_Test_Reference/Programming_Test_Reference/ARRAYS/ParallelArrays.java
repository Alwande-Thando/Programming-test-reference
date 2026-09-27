public class ParallelArrays {
    public static void main(String[] args) {
        String[] names = {"John", "Sarah", "Mike", "Lisa"};
        int[] marks = {75, 82, 48, 91};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " scored " + marks[i]);
        }
    }
}
