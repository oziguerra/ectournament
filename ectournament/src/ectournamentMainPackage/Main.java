/**
 * 
 */
package ectournamentMainPackage;

/**
 * @author Ozi_g
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* TODO
		 * 
		 * Create Main menu Loop that:
		 * Has option to create a new tournament
		 * Option to load other tournaments (to implement later)
		 * Exit
		 * 
		 * Create tournament list to hold tournaments
		 * 
		 * For Inside tournament menu:
		 * Add Player
		 * Remove Player
		 * Print player bracket
		 * 
		 */
		
		int optionSelected = 0;
		
		while (optionSelected != 0)
		{
			System.out.println("Choose an option from the menu below:  ");
			System.out.println();
		}

	}
	
	public Tournament createTournament()
	{
		return new Tournament();
	}

}
