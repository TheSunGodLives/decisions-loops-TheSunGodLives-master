import java.util.Scanner;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
   public static void tester()
   {
   int score = 0;
Scanner in = new Scanner(System.in);
System.out.print("Enter your score: ");
score = in.nextInt();
if (score < 40) 
{
   System.out.println("F"); 
}   
else if (score >= 40 || score < 50) 
{ 
   System.out.println("D"); 
}   
else if (score >= 50 || score < 60) 
{ 
   System.out.println("C"); 
}   
else if (score >= 60 || score < 70) 
{ 
   System.out.println("B");
}   
else if (score >= 70 || score < 80) 
{ 
   System.out.println("B+"); 
}   
else 
{ 
   System.out.println("A");
}
}
}
