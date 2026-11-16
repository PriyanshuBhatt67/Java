import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args)
{

        // If statements= performs a block of code if its condition is true
Scanner scanner = new Scanner(System.in);

int age;
System.out.println("Enter your Age yaar");
age =  scanner.nextInt();

if(age>=18)
{

System.out.println("You are an adult");
}
else if(age<18)
{
    System.out.println("you are A Child");
}

else
{
    System.out.println("Timi tw janmeko ni xainau");
}
scanner.close();

}


}
