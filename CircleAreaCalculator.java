//Qn - can we use both Scanner Class and Math class together in same program?if yes then how?

/*  Answer is - Yes, you can use the Scanner class and the Math class together in the same Java program.
• The Scanner class (from java.util.Scanner) is used to read input from the user (such as keyboard input).
• The Math class (from java.lang.Math, which is imported automatically) provides static methods for 
mathematical operations like square roots (Math.sqrt), powers (Math.pow), rounding, and trigonometry
*/

/*  Lets see 
How to use them together (Example)

Here is a simple program that asks the user to enter the radius of a circle, reads it 
using Scanner, and then uses Math.pow() and Math.PI to calculate the area.
*/
import java.util.Scanner; // 1. Import the Scanner class

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Read user input

        // Use the Math class to calculate the area (pi * r^2)
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The calculated area is: " + area);

        // Close the scanner resource
        scanner.close();
    }
}
/*

Key Points to Remember

1. Importing: You must explicitly import java.util.Scanner. You do not need to import java.lang.Math
 because the java.lang package is automatically loaded in every Java program.
2. Static Math Methods: Because methods in the Math class are static, you call them directly 
using the class name (e.g., Math.sqrt(x), Math.abs(y)), without needing
 to create an object like new Math().
3. Scanner Object: You do need to instantiate an object of the Scanner 
class (e.g., new Scanner(System.in)) to capture values, which you can
then pass directly into Math functions.

*/