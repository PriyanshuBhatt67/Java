import java.util.Scanner;

public class ElseIfUserInput {
    public static void main(String[] args) {
        // If statements= performs a block of code if its condition is true

// Input lina ko lagi Scanner class & scanner object banaudae
Scanner scanner=new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age=scanner.nextInt();


        if (age>=65) {
            System.out.println("Youre a senior!");
        } 
        else if (age>=18) {
            System.out.println("Youre an adult!!");
        }
        else if(age<0){
            System.out.println("You havent been born yet!");
        }
        else if (age==0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }
        scanner.close();
    }
}
