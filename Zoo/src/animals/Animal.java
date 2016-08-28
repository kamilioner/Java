package animals;

public class Animal {
	public String kolor;
	protected String typ;
	
	public void setTyp(String a){
		this.typ=a;
	}
	
	public String getTyp(){
		return typ;
}
	
	public void makeSound(){
		System.out.print("Burp!");
	};
}
