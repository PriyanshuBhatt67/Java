// Doing This Project After Completing Arthmetic Folder

package MiniProjects;

import java.util.Scanner;

public class ShoppingCart {
    


    public static void main(String[] args) {
        // Shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("how many would you like?: ");
        quantity=scanner.nextInt();

       total=price*quantity;

       System.out.println("\nYou have bought "+quantity+""+item+"/s");
       System.out.println("Your total is "+currency+total);

        scanner.close();
    }
}
/*
Pseudo Code for this program

START
    SET currency to '$'

    DISPLAY "What item would you like to buy?: "
    READ item from user - tesaile scanner object use gareko Scanner Class banaaye paxi

    DISPLAY "What is the price for each?: "
    READ price from user

    DISPLAY "How many would you like?: "
    READ quantity from user

    CALCULATE total = price * quantity

    DISPLAY "You have bought " + quantity + " " + item + "/s"
    DISPLAY "Your total is " + currency + total
END


*/