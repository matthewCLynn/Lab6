//Matt Lynn

package co.grandcircus;

import java.util.Scanner;

public class DiceRoller
{

	public static void main(String[] args)
	{
		String quit = "";
		Scanner scan = new Scanner(System.in);
		int numberOfSides, die1, die2, numberOfRolls, rollCounter = 0;
		
		System.out.println("Welcome to Grand Circus Casino!");
		do
		{
			System.out.println("Input how many sides you would like the die to have: ");
			
			numberOfSides = scan.nextInt();
			System.out.println("Input the number of times you would like to roll both dice: ");
			numberOfRolls = scan.nextInt();
			scan.nextLine(); //garbage line
			
			for(int i = 0; i<numberOfRolls; i++)
			{
				rollCounter++;
				rollOutput(numberOfSides, rollCounter);
			}
			rollCounter=0;
			
			System.out.print("Do you want to roll again? (y/n) :");
			quit = scan.nextLine();
			
			
			
			
		} while(quit.equalsIgnoreCase("y") || quit.equalsIgnoreCase("yes"));
		
		System.out.println("Goodbye!");

	}

	public static int generateRandomDieRoll(int sides)
	{
		return (int)(sides*Math.random()+1);
		
	}
	
	public static void rollOutput(int numberOfSides, int rollCounter)
	{
		int die1 = generateRandomDieRoll(numberOfSides);
		int die2 = generateRandomDieRoll(numberOfSides);
		System.out.println("Roll " + rollCounter + ":");
		
		System.out.println(die1 + ",  " + die2);
		
		
	}
	
}
