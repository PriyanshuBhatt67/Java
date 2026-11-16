package MiniProjects;
import java.util.Scanner;
public class Madlibsgame {
    public static void main(String[] args) {
        // MAD LIBS GAME
        // Madlibs is a game where we have a game and the user fill in the story
        // It will help us use user input

        Scanner scanner=new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective(description):");
        adjective1=scanner.nextLine();

        System.out.println("Enter a noun(animal or person):");
        noun1=scanner.nextLine();

        System.out.println("Enter an adjective(description):");
        adjective2=scanner.nextLine();

        System.out.println("Enter an verb ending with ing(action):");
        verb1=scanner.nextLine();

        System.out.println("Enter an adjective(description):");
        adjective3=scanner.nextLine();



        System.out.println("\nToday i went to a "+adjective1+" zoo");
        System.out.println("In an exehit, I saw a "+noun1+" .");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+"!");
        System.out.println("I was "+adjective3+"!");

        scanner.close();




    }
}
/* 

Topics Covered:
Accepting user input with Scanner
Created a small Mad Libs game

Learning Objectives:
Understand how to take input from users
Use variables to store user input
Apply basic logic to create a small program

Notes / Observations:
Remember to import java.util.Scanner
Must close Scanner object after use (scanner.close())
Learned simple string concatenation and formatting in Java


Next Steps:
Practice more small interactive programs
Prepare for loops and conditionals





*/