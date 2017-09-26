package monster.controller;

import java.util.Scanner;
import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	//Experimental code dealing with popups and printlns.
	public void start()
	{
		boolean finished = true;
		int count = 0;
//		while(count < 100)
//		{
//			popup.displayText("I am so neat!");
//			count++;
//		}
		
//		for (int loop = 0; loop < 15; loop += 1)
//		{
//			popup.displayText("I am looping " + (loop + 1) + " times out of 15.");
//		}
		
		MarshmallowMonster sample = new MarshmallowMonster();
//		System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary", 10, 3, 4.3, true);
		
//		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
//		System.out.println("Cody is hungry, so he is going to eat a tentacle");
		popup.displayText("I'm hungry, so I'm gonna eat a tentacle");
		realMonster.setTentacleAmount(4.2);
//		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		
		interactWithTheMonster(realMonster);
	}
	
	//Allowing interaction with monster through scanners and if statements to react to proper and improper inputs.
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + "wants to know what to eat next");
//		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
//		System.out.println("How many do you want to eat?");
		int specialAnswer = 0;
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		while(!isValidInteger(unconverted))
		{
			popup.displayText("Try again!");
			unconverted = popup.getResponse("How many arms?????");
		}
		
//		if(isValidInteger(unconverted))
//		{
			specialAnswer = Integer.parseInt(unconverted);
//		}
		
		Scanner myScanner = new Scanner(System.in);
		int consumed = 0;
		consumed = specialAnswer;
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human");
			consumed = 0;
		}
		else if(consumed == 0)
		{
			System.out.println("Not that hungry are you?");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossible - I only have " + currentMonster.getArmCount() + " arms!!!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
		}
		
		System.out.println("What part of " + currentMonster.getName() + " are we gonna eat next?");
		System.out.println("I say we eat some eyes, " + currentMonster.getName() + " has a lot of them. He has " + currentMonster.getEyeCount());
		System.out.println("How many?");
		Scanner myScannerDeux = new Scanner(System.in);
		int confuzzled = myScannerDeux.nextInt();
		
		if(confuzzled == 0)
		{
			System.out.println("You'll be starving in an hour, just you wait.");
		}
		else if(confuzzled < 0)
		{
			System.out.println("Dude. What friggin monster has negative arms.");
		}
		else if(confuzzled > currentMonster.getEyeCount())
		{
			System.out.println("That's too many. You're honestly pissing me off.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - confuzzled);
			System.out.println("Those better taste good. The poor monster only has " + currentMonster.getEyeCount() + " eyes left :(");
		}
		
		popup.displayText("Hey dude how are ya?!");
		String answer = popup.getResponse("How many meals are you eating today?");
		System.out.println(answer);
		popup.displayText(answer);
	}
	
	//Helper Methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + " is not");
		}
		return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid: " + sampleDouble + " is not.");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean) 
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only true and false are valid: " + sampleBoolean + " is not.");
		}
		
		return valid;
	}
}
