import java.util.Scanner;
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond
{
   public Diamond()
   {
    
   }
   
   int star;

   public void makeDiamond()
   {
       Scanner sc = new Scanner(System.in);
       int side = sc.nextInt();
       int b = side;
       int d = 1;
       int e = side;
       int f = 1;
       for (int count = 0;
            count <= side;
            count++)
       {
            for (int a = (b - 1);
                 a >= 1;
                 a--)
            {
                System.out.print(" ");
                
            }
            
            for ( int c = 1;
                    c <= d;
                    c += 1)
                {
                    System.out.print("*");
                }
            d += 2;
            
            if ( d > ((2 * side) - 1))
            {
                break;
            }
            
            System.out.print("\n");
            b--;

       }
       
       for (int count = 0;
            count <= (side - 1);
            count++)
       {
            for (int a = 1;
                 a <= (e - 1);
                 a++)
            {
                System.out.print(" ");
                
            }
            
            for ( int c = (side + 1);
                    c >= f;
                    c -= 1)
                {
                    System.out.print("*");
                }
            f -= 2;
            
            if ( f < 0)
            {
                break;
            }
            
            System.out.print("\n");
            e--;

       }
   }
}
