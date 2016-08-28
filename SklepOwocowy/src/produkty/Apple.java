package produkty;

public class Apple extends Fruit{
	
	private String odmiana;

	public String getOdmiana() {
		return odmiana;
	}

	public void setOdmiana(String odmiana) {
		this.odmiana = odmiana;
	}
	
	public Apple(String odmiana, String wielkosc){
		super(wielkosc);
		setOdmiana(odmiana);
	}
	
	@Override
	public void printInfo(){
		System.out.print("Jab³ko " + getOdmiana());
		super.printInfo();
	}
	
}
