package model;

public class Snake 
{
	private double lengthInInches = 23.2;
	private boolean isPoisonous = false;
	private int age = 1;
	
	public Snake()
	{
		super();
		this.lengthInInches = lengthInInches;
		this.isPoisonous = isPoisonous;
		this.age = age;
	}
	public String speak()
	{
		return "Hisssss";
	}
	public void setLengthInInches(double newLength)
	{
		this.lengthInInches = newLength;
	}
	public double getLengthInInches()
	{
		return lengthInInches;
	}
	public void setIsPoisonous(boolean newPoison)
	{
		this.isPoisonous = newPoison;
	}
	public boolean getIsPosionous()
	{
		return isPoisonous;
	}
	public void setAge(int newAge)
	{
		this.age = newAge;
	}
	public int getAge()
	{
		return age;
	}
	
}
