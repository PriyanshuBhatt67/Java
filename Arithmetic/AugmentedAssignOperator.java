package Arithmetic;
 /*
 In Java, an Augmented assignment operator (also called a compound assignment operator) is a shortcut 
 that combines a math operation And variable assignment into a single step. Instead of writing
a variable's name twice to update its value, we use these operators to keep  
code shorter and easier to read
 
 */
public class AugmentedAssignOperator {
    public static void main(String[] args) {
        
    
    int x = 2;
    x += 2; // 4 will be output As This means  x=x+2
    System.out.println(x);
    int y=5;
    y -=3; //y=y-5 vanna khojeko yesma & 5-3 vayera 2 aauxa & this 2 store in y cuz yesmae raakhya xau.
    //  lets print this as well
    System.out.println(y);

    // x=x+y;
        // x+=y shortcut for the x=x+y

        // x=x-y;
        // x-=y; shortcut for x=x-y

        // x=x*y;
        // x*=y; shortcut for x=x*y

        // x=x/y;
        // x/=y shortcut for x=x/y

        x=x%y; // x%=y; shortcut for x=x%y
        // Lets print this , Modulus Division Vayekole Out Output will be 0 cuz    4 % 2(4 Modulus 2)=0
        
System.out.println(x);

}

}
