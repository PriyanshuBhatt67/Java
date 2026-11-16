package Arithmetic;
/*
The PEMDAS Breakdown

• P — Parentheses: Solve everything inside parentheses, brackets,
 or grouping symbols first (innermost first if nested).
• E — Exponents: Evaluate powers and roots next.
• MD — Multiplication and Division: Perform multiplication and division from left to right.
• AS — Addition and Subtraction: Perform addition and subtraction from left to right.

What is the "Left-to-Right" Rule?

The left-to-right rule clarifies a common misconception about the acronym: Multiplication and division 
do not happen in strict isolation, nor does multiplication always 

come before division. The same applies to addition and subtraction.
• Multiplication & Division have equal priority: When an expression contains both 
multiplication and division (e.g., 12 ÷ 3 × 2), you do not automatically multiply first. Instead, 
you scan and solve from left to right, performing whichever of the two operations appears first.
	• Example (12 ÷ 3 × 2):
		1. Divide first (leftmost): 12 ÷ 3 = 4
		2. Then multiply: 4 × 2 = 8 (Doing multiplication first would incorrectly give 12 ÷ 6 = 2).
• Addition & Subtraction have equal priority: Similarly, when you are left with only addition and 
subtraction, you move from left to right and perform the one that shows up first.

*/
public class OrderOfOperations {
    

      public static void main(String[] args) {
        // ORDER OF OPERATIONS[P-E-M-D-A-S]
        // [Parentheses,Exponents,multiplication,addition,subtraction]

        double result=3+4*(7-5)/2.0;
        // 2.0 will be output beacuse we are using the double DataType and wanna retain the decimal

        System.out.println(result);
      }

}
