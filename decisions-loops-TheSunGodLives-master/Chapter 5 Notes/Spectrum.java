import java.util.Scanner;
/**
 * Write a description of class Spectrum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spectrum
{
   public Spectrum()
   {
   }
   public static void determine()
   {
       Scanner sc = new Scanner(System.in);
       double wave = sc.nextDouble();
       if(wave > Math.pow(10, -1))
       {
           System.out.println("Radio Waves, Frequency is < 3 x 10^9");
       }
       else if(wave < Math.pow(10, -1) && wave > Math.pow(10, -3))
       {
           System.out.println("Microwaves, Frequency is 3 x 10^9 to 3 x 10^11");
       }
       else if(wave < Math.pow(10, -3) && wave > 7 * Math.pow(10, -7))
       {
           System.out.println("Infrared, Frequency is 3 x 10^11 to 4 x 10^14");
       }
       else if(wave < 7 * Math.pow(10, -7) && wave > 4 * Math.pow(10, -7))
       {
           System.out.println("Visible Light, Frequency is 4 x 10^14 to 7.5 x 10^14");
       }
       else if(wave < 4 * Math.pow(10, -7) && wave > Math.pow(10, -8))
       {
           System.out.println("Ultra Violet, Frequency is 7.5 x 10^14 to 3 x 10^16");
       }
       else if(wave < Math.pow(10, -8) && wave > Math.pow(10, -11))
       {
           System.out.println("Xrays, Frequency is 3 x 10^16 to 3 x 10^19");
       }
       else if( wave < Math.pow(10, -11))
       {
           System.out.println("Gamma rays, Frequency is > 3 x 10^19");
       }
   }
   
}
