package sklepApp;

import produkty.Apple;

public class App {
	public static void main(String[] args) {
		Apple Champion = new Apple("Champion","du�y"); 
		//Przy tworzeniu obiektu Apple tworzy si� obiekt Fruit poprzez niejawne "super();" na pocz�tku konstruktora klasy Apple.
		Champion.printInfo();		
	}	
}
