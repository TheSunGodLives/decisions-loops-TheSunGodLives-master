import java.util.Scanner;
/**
 * Write a description of class Leap_Year here.
 *
 * @Will Kuna
 * @version (a version number or a date)
 */
public class Leap_Year
{
Scanner sc = new Scanner(System.in);
public Leap_Year()
{
}
    public static void isLeapYear()
    {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int rem1 = (year % 400);
    int rem2 = (year % 100);
    int rem3 = (year % 4);
    if((rem3 == 0 && rem1 == 0) || (rem3 == 0 && rem2 != 0))
    {
        System.out.println("It's a leap year!");
    }
    else
    {
        System.out.println("It's not leap year.");
    }
}


}
