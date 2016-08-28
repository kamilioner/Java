package produkty;

public class Fruit {
	
	protected String wielkosc;
	
	public void setWielkosc(String wielkosc) {
		this.wielkosc = wielkosc;
	}
	
	public String getWielkosc() {
		return wielkosc;
	}
	
	
	public Fruit(String wielkosc){
			setWielkosc(wielkosc);
			System.out.println("Tworze owoc.");
		}
	
	
	public void printInfo(){
		System.out.print(" to " + getWielkosc() + " owoc.");
	}
	
}
