import java.util.Scanner;
/**
 * Write a description of class Substring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Substring
{
   Scanner sc = new Scanner(System.in);
   String answer = sc.nextLine();
   int length = answer.length();
   int count = 1;

   public void substringIt()
   {
    
       // for (;
       // count < length + 1;
       // count++)
    // {
       
           // System.out.println( answer.substring( count - 1, count ));
          
       // }
    for ( int i = 0;
    i <= length;
    i++)
    {
    
    for ( int a = 0;
    a <= length - i; 
    a++)
    {
    
    System.out.println( answer.substring( i, a) );   
        
    }
        
    }
}
}

