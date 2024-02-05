import java.util.Scanner;

public class code
{
	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		String player1 = "";
		String player2 = "";
		String winner = "" ;
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Player 1: Choose rock, scissors, or paper: ");
		player1 = scan.nextLine();
		player1 = player1.toLowerCase();
		System.out.println("Player 2: Choose rock, scissors, or paper: ");
		player2 = scan.nextLine();
		player2 = player2.toLowerCase();
		
		if (player1.equals("rock") && player2.equals("paper"))
			{
				System.out.println("Player teacher wins.");
			}
		else
			if (player1.equals("scissors") && player2.equals("paper"))
			{
				System.out.println("Player 1 wins.");
			}
			else
				if (player1.equals("paper") && player2.equals("rock"))
				{
					System.out.println("Player 1 wins.");
				}
				else
					if (player1.equals("paper") && player2.equals("scissors"))
					{
						System.out.println("Player 2 wins.");
					}
					else
						if (player1.equals("rock") && player2.equals("scissors"))
						{
							System.out.println("Player 1 wins.");
						}
						else
							if (player1.equals("scissors") && player2.equals("rock"))
							{
								System.out.println("Player 2 wins.");
							}
		else
		{
			if (player1.equals(player2) )
			{
				System.out.println("It is a tie.");
			}
			else
			{
				System.out.println("Wrong choice!");
			}
		}
			
		
		
		scan.close();
			
	}
}
