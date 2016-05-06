package assign3;

public class Pet {
	private String Petname;
	private String Name;
	private String Color;
	protected int Gender;
	
	Pet(String name, String ownerName, String color)
	{
		this.Petname = name;
		this.Name = ownerName;
		this.Color = color;
	}
	
	String getPetName()
	{
		return this.Petname;
	}
	String getOwnerName()
	{
		return this.Name;	
	}
	String getColor()
	{
		return this.Color;
	}
	void setGender(int genderid)
	{
		this.Gender = genderid;
	}
	String getGender()
	{
		String AlphaGender = null;
		if(this.Gender == 1) AlphaGender = "MALE";
		if(this.Gender == 2) AlphaGender = "FEMALE";
		if(this.Gender == 3) AlphaGender = "SPAYED";
		if(this.Gender == 4) AlphaGender = "NEUTERED";
		return AlphaGender;
		
	}
	public String toString()
	{
		String s = this.getPetName()+" owned by "+this.getOwnerName()+"\n Color: "+this.getColor()+"\n Gender: "+this.getGender()+"\n";
		return s;
	}
}

