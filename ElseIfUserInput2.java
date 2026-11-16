import java.util.Scanner;
public class ElseIfUserInput2 {
    
        public static void main(String[] args) {
     // If statements= performs a block of code if its condition is true
     //  To add emojis use for windows=(Win+;)

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        Boolean isStudent;

        System.out.println("Hey Dude Enter your Name");
        name= scanner.nextLine();
        System.out.print("Enter your age: ");
        age=scanner.nextInt();

        System.out.println("Are you a student? (true/false: )");
        isStudent= scanner.nextBoolean();

        // GROUP 1 for String
        if (name.isEmpty()) {/*name.isEmpty() it is a built in method in java to
     check if the user entered string is empty or not.
     if user press "enters" instead of a String then the string is considered as empty */
            System.out.println("You didnt enter your name😅");
        }
        else{
            System.out.println("Hello  "+name+" !😊");
        }
          

        // GROUP 2 for age
        if (age>=65) {
            System.out.println("Youre a senior!👴");
        } 
        else if (age>=18) {
            System.out.println("Youre an adult!🧑");
        }
        else if(age<0){
            System.out.println("You havent been born yet!😇");
        }
        else if (age==0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        // GROUP 3 for booleans
        if (isStudent==true) {
            System.out.println("Youre a student!");
        }
        else{
            System.out.println("Youre not a student!");
        }
        scanner.close();
    }
}
    


