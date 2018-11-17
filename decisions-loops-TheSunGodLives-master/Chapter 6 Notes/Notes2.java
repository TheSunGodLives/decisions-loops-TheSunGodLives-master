import java.util.Scanner;
/**
 * Write a description of class Notes2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notes2
{
    public static void whileExample()
    {
        int count = 1;
        
        while( count <= 5 )
        {
            System.out.println(count);
            count++;
        }
        
        System.out.println("Done");
        
        
    }
    
    public static void whileExample2()
    {
        int count = 1;
        
        while( count != 50 )
        {
            System.out.println( count );
            count += 2;
        }
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         * three parts of the for statement
         *  1. initialization - executed once
         *  2. boolean expression - tested at the start of each iteration
         *  3. updating the condition variable
         */
        
        for (int count = 1;     // initialization
             count <= 5;        // boolean condition
             count++ )          // update the condition variable
        {
            System.out.println(count);
        }
        
        System.out.println("Done");
        
        // System.out.println("final value of count: " + count );
        // The variable count only exists within the for loop
        
    }
    
    public static void forExample2()
    {
        int count = 1;
        for ( ;                 // optional to initalize in the for statement
                count <= 5;
                count++ )
        {
            System.out.print(count);
            count++;
        }
        
        System.out.println("Done");
    }
    
    public static void offByOne()
    {
        /*
         * Carefully step back and ask, shoudl the inital value start at 0 or 1?
         *      Shoudl the condition be < or <=?
         */
        
        for (int i = 0;
            i <= 5;
            i++ )
            {
                System.out.println("*");
            }
        System.out.println("Done");
    }    
    public static void doExample()
    {
        /*
         * do while loop
         *  1. executes the body of the loop
         *  2. evaluates the condition
         */
        
        int count = 1;
        
        do
        {
                System.out.println( count );
                
                count++;
    }
    while (count <= 5 );
}
      public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit: ");
            
            /*
             * Sentinel Value
             *      value (e.g., -1) used to terminate a loop
             *      it is often entered by a user
             */
            value = s.nextInt();
            
            // this is a bug! sum is 1 less than it should be
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sum2()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit): ");
            value = s.nextInt();
            
            if(value == -1)
            {
                /*
                 * break: immediately exits the inner-most loop
                 *      it is in (similar behavior as used in
                 *      switch statements)
                 */
                break;
            }
            
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    public static int sum3()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit): ");
            
            /*
             * The hasNextInt method of the Scanner class returns
             *      true if the next token to be read is an integer;
             *      otherwise, it returns false. It does not consume
             *      the next token.
             */
            if(s.hasNextInt() == false)
            {
                System.out.println(s.next() +   // consume next token
                        " is not an integer; try again.");
                /*
                 * continue:
                 *      1. immediately skips to the end of the
                 *          inner-most loop it is in
                 *      2. re-evaluates the loop condition at that
                 *          point and continues if the condition is
                 *          true
                 */        
                continue;
            }
            
            value = s.nextInt();
            
            if(value == -1)
            {
                break;
            }
            
            sum += value;
        }
        while(value != -1);
        
        return sum;
    }
    
    
    
}
    

