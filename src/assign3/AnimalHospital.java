package assign3;

import java.util.*;

//import jdk.internal.org.objectweb.asm.tree.analysis.Interpreter;

public class AnimalHospital {
	HashMap<Pet, String> data = new HashMap<Pet,String>();
	AnimalHospital(HashMap<Pet,String> data)
	{
		this.data=data;
	}
	void printPetInfoByName(String name) 
	{
		for (Iterator iter = data.entrySet().iterator(); iter.hasNext();) {
			Map.Entry e = (Map.Entry) iter.next();
			Pet pet=(Pet)e.getKey();	
			if(pet.getPetName().equals(name))
			{
				System.out.println(pet.toString());
			}
		}
	}
	void printPetInfoByOwner(String name)
	{
		for (Iterator iter = data.entrySet().iterator(); iter.hasNext();) {
			Map.Entry e = (Map.Entry) iter.next();
			
			Pet pet=(Pet)e.getKey();	
			if(pet.getOwnerName().equals(name))
			{
				System.out.println(pet.toString());
			}
		}
	}
	void printPetsBoarding(int month, int day, int year)
	{
		for (Iterator iter = data.entrySet().iterator(); iter.hasNext();) {
			Map.Entry e = (Map.Entry) iter.next();
			
			Pet pet=(Pet)e.getKey();	
			
			if(pet instanceof Cat)
			{
				Cat cat=(Cat)pet;
				if(cat.boarding(month, day, year))
				{
					System.out.println(cat.toString());
				}
			}
			else if(pet instanceof Bird)
			{
				Bird bird=(Bird)pet;
				if(bird.boarding(month, day, year))
				{
					System.out.println(bird.toString());
				}
			}
			else if(pet instanceof Dog)
			{
				Dog dog=(Dog)pet;
				if(dog.boarding(month, day, year))
				{
					System.out.println(dog.toString());
				}
			}
		}	
	}
}

