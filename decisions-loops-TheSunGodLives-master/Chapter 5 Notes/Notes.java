import java.util.Scanner;
/**
 * Write a description of class Notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notes
{
    public static void ifExample()
    {
        // Model a coin flip, where 1 = heads and 0 = tails\
        int coinFlip = (int) ( Math.random() * 2);
        
        /*
         * if statement
         *      executed if true
         */
        
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads");
        }
        
        /*
         * ( ) are not required if it's a single statement
         */  
        
        if(coinFlip == 1)
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time!");
        }
        
        /*
         * if-else works like in python
         */
        
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!")
            ;
        }
        else
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time!");
        }
        
        int fourSidedDice = (int) (Math.random() * 5);
        
        if(fourSidedDice == 1)
        {
            System.out.println("You rolled a 1!");
        }
        else if(fourSidedDice == 2)
        {
            System.out.println("You rolled a 2!");
        }
        else if(fourSidedDice == 3)
        {
            System.out.println("You rolled a 3!");
        }
        else
        {
            System.out.println("You rolled a 4!");
        }
    }
        public static boolean doublesAreEqual( double num1, double num2)
        {
            /*
             * If we are using the == equailty operator it returns true if they're the same
             * 
             * For "equal" numbers this is probably not the case due to floating point rounding
             *      and therefore, not what we want
             * We will check if they are "close enough" (i.e. epsilon value)
             */
            
            final double EPSILON = 1e-14; // 1 x 10^-14
            
            if ( Math.abs( num1 - num2 ) < EPSILON )
            {
                return true;
            }
            else
            {
                return false;
            }
            
            // don't have to use an if statement when working with a boolean
            // return (Math.abs(num1 - num2) < EPSILON );
        }
        
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println( "Enter two strings: " );
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two values contain the same value.
         *  For objects, including strings, this means they contain the same reference. That is,
         *  they contain the same objects in the computer's memory, not that they have the same
         *  sequence of characters.
         */
        
        if( str1 == str2 )
        {
            System.out.println("Strings references are equal.");
        }
        else
        {
            System.out.println("Strings references are not equal.");
        }
        
        /*
         * The equals method with return true if the two objects are "equal"
         *      What equal means is defined by the class. For strings, it means that the two objects
         *      have the same sequence of characters.
         */
        
        if( str1.equals( str2 ))
    {
        System.out.println("Strings are equal.");
    }
    else
    {
        System.out.println("Strings are not equals.");
    }
    
    /*
     * We will determine which string comes first lexographically using the compareTo method
     *      of the String class
     *      
     * compareTo returns an int:
     *      0: if the strings are equal (name sequence of characters)
     *      <0: if str1 < str2 lexographically
     *      >0: if str1 > str2 lexographically
     */
    
    int result = str1.compareTo(str2);
    String firstStr = null; //no object referenced
    
    if (result < 0)
    {
        firstStr = str1;
    }
    else if (result > 0)
    {
        firstStr = str2;
    }
    
    if( firstStr != null )
    {
        System.out.println("The first string is: ");
    }
    
    // System.out.println("It's length is: " + firstStr.length());
    
    // This is an example of a short circuit
    //      if the left operand is false, the right part won't even go,
    //      because the AND operand is already false
    
    if( firstStr != null && firstStr.length() > 3)
    {
        System.out.println("The first string has more than 3 characters.");
    }
    
    /*
     * This is another short circuit example
     *      If the left operand is true, the right operand will not even be evaluated
     *      because the OR operation will already be true
     * This may result in a bug, if the first word is "kiwi" and will never read
     *      in the second fruit
     */
    
    System.out.print("Enter your two favorite fruits: ");
    if(s.next().equals("kiwi") || s.next().equals("kiwi"))
    {
        System.out.println("Kiwi is one of my favorite fruits too!");
    }
    
    System.out.println("Enter your favorite ice cream flavor: ");
    String flavor = s.next();
    System.out.println("Favorite flavor: " + flavor);
   
    }
    
    public static String getStudentClass( int gradeNumber )
    {
        /*
         * Switch statement
         *      another conditional statement (like if statement)
         *      preferred when evaluating "discrete" values
         *      can be used for type, short, char, in primitive
         *      can be used for enumerations and String objects
         * Condition is evaluated, flow of execution jumps to which ever case matches
         */
        String studentClass = "";
        
        switch( gradeNumber )
        {
            case 9:
            {
            studentClass = "freshman";
            /*
             * break causes the flow of execution to leave the switch
             * 
             *      (without a break, the flow of execution contiues into the next case)
             */
            break;
            }
            case 10:
            {
            studentClass = "sophomore";
            break;
            }
            case 11:
            {
            studentClass = "junior";
            break;
            }
            case 12:
            {
            studentClass = "senior";
            break;
            }
        
        /*
         * by leaving out break multiple cases can run
         */
        case 6:
        case 7:
        case 8:
        {
            studentClass = "junior high";
            break;
        }
        
        /*
         * default matches everything not matched by the cases
         */
        
        default:
        {
            studentClass = "elementary";
            break;
        }
        
        
    
    
    }
    return studentClass;
}

public static void assignmentOperatorExample()
{
    int x = 7;
    int y = 7;
    int z = 7;
    
    x = x + 1;
    y += 1;
    z++;
    
    System.out.println("x = " + x + ";y = " + y + ";z = " + z);
    
    int a = 7;
    int b = a++;
    System.out.println("a = " + a + ";b = " + b);
    
    int c = 7;
    int d = ++c;
    System.out.println("c = " + c + ";d = " + d);
}

}
    

