import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble();
      System.out.print("Input the x coord of the first circle: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y coord of the first circle: ");
      double ycenter1 = in.nextDouble();
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      System.out.print("Input the x coord of the first circle: ");
      double xcenter2 = in.nextDouble();
      System.out.print("Input the y coord of the first circle: ");
      double ycenter2 = in.nextDouble();

      // if( radius1 + radius2 == 40)
      // {
          // System.out.println("The circles are tangent");
      // }
      
      // else if( radius1 + radius2 < 40)
      // {
          // System.out.println("The circles are disjointed");
      // }
      
      // else if( radius1 + radius2 > 40)
      // {
          // System.out.println("The circles are overlapping");
      // }
      
      double distancebetween = Math.sqrt(((Math.pow((xcenter1 - xcenter2), 2)) + (Math.pow((ycenter1 - ycenter2), 2))));
      
      if( radius1 + radius2 == distancebetween)
      {
          System.out.println("The circles are tangent");
      }
      
      else if( radius1 + radius2 < distancebetween)
      {
          System.out.println("The circles are disjointed");
      }
      
      else if( radius1 + radius2 > distancebetween)
      {
          System.out.println("The circles are overlapping");
      }
      
    }
}
