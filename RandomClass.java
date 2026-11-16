import java.util.Random;
/*
In Java, Random random = new Random(); (note the capital R in new Random()) is simply known 
as instantiating a Random object (or creating an instance of the Random class).
In general object-oriented programming terms, this single line combines declaration,
 instantiation, and initialization of a pseudorandom number generator.

Breaking Down the Statement

each part of the statement plays a specific role:
• Random (Declaration). This specifies the reference variable's data type,
 telling Java that the variable will hold a Random object.
• random (Identifier). This is the variable name chosen by the programmer
 to reference the object later in the code.
• new (Instantiation). This Java keyword allocates memory on the heap for a brand-new object.
• Random() (Initialization). This calls the default constructor 
of the java.util.Random class, which initializes the generator with a unique seed value.
Note: Java is case-sensitive, so new random() with a lowercase "r" will cause 
a compilation error unless you have defined your own custom class named random.


*/

public class RandomClass {
    public static void main(String[] args)
    {
Random random = new Random(); /* This Statement means the Creating an instance of Random Class
OR 
Can be simply said as This creates a new Random object and names the object as        random
 */
int number;

number=random.nextInt();/* In Simple Understanding langugae - This line of code generates a random 
whole number (an int) and stores it inside a variable named number *

But
 Little Technically it means
 This asks the random generator to create a random integer and stores it in the number variable.
nextInt() method with no arguments gives a random number anywhere from about -2 billion to +2 billion.

*/
System.out.println(number);
    }
}
