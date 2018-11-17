
/**
 * Write a description of class Nested_Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nested_Loops
{
   public void printing()
   {
   for( int i = 1;
        i <= 2;
        i++)
   {
        for( int j = 1;
            j <= 4;
            j++)
            {
                System.out.println( i + " " + j );
            }
        }
}
public void doLoop()
   {
       int a = 1;
       int b = 1;
       do
       {
           System.out.println( a + " " + b);
           do
           {
               b++;
               System.out.println( a + " " + b);
           }
           while ( b <= 3 );
           a++;
           b -= 3;
       }
       while ( a <= 2 );
   }
}
