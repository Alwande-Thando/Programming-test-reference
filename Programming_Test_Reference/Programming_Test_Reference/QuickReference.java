/*
JAVA PROGRAMMING TEST QUICK REFERENCE

1D ARRAY
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

2D ARRAY
int[][] numbers2D = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int row = 0; row < numbers2D.length; row++) {
    for (int col = 0; col < numbers2D[row].length; col++) {
        System.out.println(numbers2D[row][col]);
    }
}

INHERITANCE
class Child extends Parent { }

ABSTRACT CLASS
public abstract class Staff implements iStaff { }

INTERFACE
public interface iStaff {
    public int getStaffNumber();
}

CONSTRUCTOR + SUPER
public Child(parameters) {
    super(parameters);
}

OVERRIDE
@Override
public void display() { }

OBJECT
Child object = new Child();
object.display();

EXCEPTION
try {
    // risky code
} catch (Exception e) {
    // handle error
} finally {
    // runs afterward
}

THROW
throw new Exception("Error");

THROWS
public void method() throws Exception { }

STRING COMPARISON
if (name.equals("John")) { }

ARRAY LENGTH
numbers.length

STRING LENGTH
name.length()

SCANNER
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int number = input.nextInt();
double decimal = input.nextDouble();
String word = input.next();
String sentence = input.nextLine();

TEST REMINDER:
Read the question carefully.
Identify the required classes and methods.
Find the closest template.
Adapt names/logic to the question.
Compile, run and check output.
*/
public class QuickReference {
    public static void main(String[] args) {
        // Reference sheet only.
    }
}
