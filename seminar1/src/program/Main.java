package program;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		
		Girafa girafa=new Girafa("Girafa1");
		Girafa girafa2=new Girafa("Girafa2");
		z.addAnimal(girafa);
		z.addAnimal(girafa2);
		
		z.feedAnimals();
		
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		z.addAnimal(zebra1);
		z.addAnimal(zebra2);
		z.feedAnimals();
	}

}
