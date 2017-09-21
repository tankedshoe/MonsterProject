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
	
	//Gives the MarshmallowMonster class parameters to be set later.
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount= armCount;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;	
	}
	
	//Sets the parameters and gets them too.
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	// Uses the values to create cohesive text.
	public String toString()
	{
		String description = "Hi, I am a scary monster! My name is " + name + ", and I have " + eyeCount;
		description += " eyes and I have " + armCount + " arms, and I have " + tentacleAmount + " tentacles";
		description += " and my bloop existence is " + hasBloop;
				
		return description;
	}
}
