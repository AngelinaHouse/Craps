import java.util.Scanner;

public class craps
	{
		static int roleTotal;
		static int reRoleTotal;
		static String fake;
		static boolean restart;
		public static void main(String[] args)
			{				
				restart = true;
				while (restart)
					{
						Scanner userIntInput = new Scanner(System.in);
						Scanner userStringInput = new Scanner(System.in);
						System.out.println("Welcome to Craps!");
						boolean play = true;
						int roleOne =  (int) (Math.random() * 6) + 1;
						int roleTwo =  (int) (Math.random() * 6) + 1;
						roleTotal = roleOne + roleTwo;
						fake = userStringInput.nextLine();
						System.out.println("You rolled a " + roleOne + " & " + roleTwo + " for a total of " + roleTotal);
						if (roleTotal == 7 || roleTotal == 11)
							{
								System.out.println("You Win!!");
								play = false;
								askPlayAgain();
									
							}
						else if (roleTotal == 2 || roleTotal == 12)
							{
								System.out.println("You Lose!!");
								play = false;
								askPlayAgain();
							}
						else 
							{
								
								System.out.println("Role Again");
		
							}
							
						while (play)
							{
								int reRoleOne =  (int) (Math.random() * 6) + 1;
								int reRoleTwo =  (int) (Math.random() * 6) + 1;
								reRoleTotal = reRoleOne + reRoleTwo;
								fake = userStringInput.nextLine();
								System.out.println("You rolled a " + reRoleOne + " & " + reRoleTwo + " for a total of " + reRoleTotal);
								if (reRoleTotal == roleTotal)
									{
										System.out.println("You Win!!");
										play = false;
										askPlayAgain();

									}
								else if (reRoleTotal == 7)
									{
										System.out.println("You Lose!!");
										play = false;
										askPlayAgain();

									}
								else 
									{
										System.out.println("Role Again");
									}
								}
							}
						}
		public static void askPlayAgain()
			{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Do you want to play again?");
				String playAgain = userStringInput.nextLine();
				if (playAgain.equals("yes"))
					{
						System.out.println("Ok!");
					} 
				else
					{
						System.out.println("Bye bye!");
						restart = false;
					}
			}
	


		}


