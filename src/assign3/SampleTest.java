package assign3;
import java.util.HashMap;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Pet,String> data=new HashMap<Pet,String>();
		Cat c1=new Cat("Tiffy","Jacob","White","Short");
		c1.setGender(2);
		c1.setBoardStart(9, 11, 2015);
		c1.setBoardEnd(9, 16, 2015);

		Cat c2=new Cat("Silky","Jacob","Black","Long");
		c2.setGender(1);
		c2.setBoardStart(5, 25, 2015);
		c2.setBoardEnd(6, 17, 2015);

		Dog d=new Dog("Pepsi","Steve","Brown","Big");
		d.setGender(1);
		d.setBoardStart(11, 25, 2014);
		d.setBoardEnd(11, 30, 2014);

		Bird b1=new Bird("Chirpy","Jacob","Yellow");
		b1.setGender(3);
		b1.setBoardStart(1, 25, 2014);
		b1.setBoardEnd(1, 30, 2014);

		Bird b2=new Bird("Tango","Smith","Blue");
		b2.setGender(4);
		b2.setBoardStart(6, 11, 2015);
		b2.setBoardEnd(6, 30, 2015);
		b2.setClipped();

		Pet[] p=new Pet[5];
		p[0]=c1;
		p[1]=c2;
		p[2]=d;
		p[3]=b1;
		p[4]=b2;

		data.put(p[0], "Cat");
		data.put(p[1], "Cat");
		data.put(p[2], "Dog");
		data.put(p[3], "Dog");
		data.put(p[4], "Bird");
		AnimalHospital animalhosp=new AnimalHospital(data);
		animalhosp.printPetInfoByName("Chirpy");
		animalhosp.printPetInfoByOwner("Jacob");
		animalhosp.printPetsBoarding(6,12,2015);
	}

}
