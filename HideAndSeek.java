// Printing Statements

/*  About System.out.print()
- Here the Cursor Behaviour is 
Cursor	Stays on the same line right after the text
& Regarding Next Print Output - Appears immediately next to the previous text.
& Regarding Empty Argument - System.out.print(); causes a compiler error.

Yaha Cursor means In programming and command-line interfaces, the cursor refers to the invisible
pointer that marks the exact spot where the computer will write the next character on the screen.

About System.out.println() -
Here the Cursor Behaviour is Moves to the next line after the text.
& Regarding Next Print Output is Appears at the beginning of a brand-new line.
& Regaring Empty Argument - System.out.println(); works and just prints a blank line.

*/

public class HideAndSeek {
  public static void main(String[] args) {
    System.out.print("Three...");  // here prints   Three...   and leaves the cursor on the same line.
    System.out.print("Two..."); // here prints Two... right next to it on the same line
    
System.out.println("One..."); //  prints One... right next to the previous text and 
// then moves the cursor to a new line (the ln stands for "line").

System.out.println("Ready or not, here I come!"); // so yesari  prints the final message
//  on its own new line




  }
}