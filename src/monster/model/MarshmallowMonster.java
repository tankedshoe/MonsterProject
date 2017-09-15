package monster.model;

public class MarshmallowMonster
{
	//Declaration Section for data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless we specify values, all data members
		//are a zero, false, or null.
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount= armCount;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;	
	}
	
	public String toString()
	{
		String description = "Hi, I am a scary monster! My name is " + name + ", and I have " + eyeCount;
		description += " eyes and I have " + armCount + " arms, and I have " + tentacleAmount + " tentacles";
		description += " and my bloop existence is " + hasBloop;
				
		return description;
	}
}
