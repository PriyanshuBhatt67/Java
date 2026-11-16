/*if anytime we need value of PI , there is also the Built in constant of the math class in 
Our Lovely Java😁*/
import java.util.Scanner;
public class MathClassEx {
    public static void main(String[] args)
    {

System.out.println(Math.PI); /* instead of creating a variable for PI, we 
// can also use PI cuz its within Math Class */ 
System.out.println(Math.E);
double result;
result = Math.pow(2,3);
/*Math.pow(base, exponent) is a method that calculates base raised to the power of exponent.
Here it calculates 2^3 = 8.0
The result is stored in the result variable.(Note: Math.pow 
always returns a double, even if the mathematical result is a whole number.)
*/
result = Math.sqrt(9); // gives square root values  
result= Math.abs(-11);
result= Math.max(10,90); // tells maximum number between  2 given numbers
// we can also find for  minimum one as well
result=Math.max(20,80);// tells minimum number between 2 given numbers 
System.out.println(result); 


// Finding Hypotenus of Right Angled Triangle using Pythagoras Theorm
// Hypotenus c = Math.sqrt(a^2 + b^2)
Scanner scanner = new Scanner(System.in);

Double a;
Double b;
Double c;

System.out.println("Enter value of A ");
a =scanner.nextDouble();
System.out.println("Enter value of B ");
b =scanner.nextDouble();

c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
System.out.println("The Hypotenus side(C) is "  + c + " cm");

scanner.close();
    }
}
