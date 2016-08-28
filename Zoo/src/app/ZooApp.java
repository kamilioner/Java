package app;
	
import animals.Cat;
import animals.Bird;

public class ZooApp {
	public static void main(String[] args){
		Cat kot = new Cat();
		Bird ptak = new Bird();
		kot.kolor = "Czarny";
		ptak.kolor = "Niebieski";
		System.out.print(kot.kolor + " kot robi "); 
		kot.makeSound();
		System.out.println();
		System.out.print(ptak.kolor + " ptak robi ");
		ptak.makeSound();
		System.out.println();
		System.out.println(kot.getTyp());
		System.out.println(ptak.getTyp());
	}
}
