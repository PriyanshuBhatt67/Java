 
 import java.util.Random;// tells the Java compiler to bring the built-in Random class into
 //  your program so you can generate random numbers
public class RandomClass3 {
 
    public static void main(String[] args)
    {
// Learning Continuation of RandomClass2.java

Random random= new Random(); // creating instance of Random Class

// Lets do the process for Random Integers generation
int num1;
int num2;
int num3;


num1= random.nextInt(1,109); /* this line of code generates random whole number between 1 and 108
And Stores in Variable Named   num1
*/ 
num3= random.nextInt(2,30);
num2=random.nextInt(1,30);

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);

// Lets Generate for Random Doubles

Double Double1;
Double Double2;
Double Double3;

Double1=random.nextDouble();
//By default, random.nextDouble() returns a decimal number 
// between 0.0 (inclusive) and 1.0 (exclusive , matlab ki below 1.0 samma vanna khojeko exclusive vaneko yesma).
System.out.println(Double1);

// Now I am Putting some Range by Myself inside the method   nextDouble()
Double2=random.nextDouble(2.34,4.5);
System.out.println(Double2);

// lets do for boolean as well, like for booleans like flipping a coin
 

boolean isHead=random.nextBoolean();

if(isHead=true)
{
 System.out.println("Head");
}
else{
    System.out.println("Tails");
}
    }
}
