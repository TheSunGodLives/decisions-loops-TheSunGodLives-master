import java.util.Scanner;
public class RockPaperScissors2
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        
        if(player1.equals("rock"))
        {
            if(player2.equals("rock"))
            {
                System.out.println("Both players picked the same option");
            }
            if(player2.equals("scissors"))
            {
                System.out.println("Player 1 won with rock!");
            }
            if(player2.equals("paper"))
            {
                System.out.println("Player 2 won with paper!");
            }
        }
        if(player1.equals("scissors"))
        {
            if(player2.equals("rock"))
            {
                System.out.println("Player 2 won with rock!");
            }
            if(player2.equals("scissors"))
            {
                System.out.println("Both players picked the same option");
            }
            if(player2.equals("paper"))
            {
                System.out.println("Player 1 won with scissors!");
            }
        }
        if(player1.equals("paper"))
        {
            if(player2.equals("rock"))
            {
                System.out.println("Player 1 won with paper!");
            }
            if(player2.equals("scissors"))
            {
                System.out.println("Player 2 won with scissors!");
            }
            if(player2.equals("paper"))
            {
                System.out.println("Both players picked the same option");
            }
        }
    }
}