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
	
	public void start()
	{
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
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + "wants to know what to eat next");
//		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
//		System.out.println("How many do you want to eat?");
		int specialAnswer;
		String unconverted = popup.getResponse("How many do you want to eat?");
		specialAnswer = Integer.parseInt(unconverted);
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		
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
}
