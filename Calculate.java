import java.io.IOException;

public class Calculate{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		double pliczba = 8;
		double dliczba = 0;
	/*	
	 System.out.println("Podaj pliczbe:");
	 try {
      pliczba = System.in.read();
      System.out.print("Wpisales ");
      System.out.println(pliczba);
    }
    catch (IOException e){
      System.out.println("Error");
    }
	 
	// pliczba = System.in.read();
	System.out.println("Podaj dliczbe:");
	
	try {
      dliczba = System.in.read();
      System.out.print("Wpislaes ");
      System.out.println(dliczba);
    }
    catch (IOException f){
      System.out.println("Error");
    }
	*/
	// dliczba = System.in.read();
	 System.out.println("Suma: "+ calc.add(pliczba,dliczba));
	 System.out.println("Roznica: "+ calc.subtract(pliczba,dliczba));
	 System.out.println("Iloczyn: "+ calc.multiply(pliczba,dliczba));
	 System.out.println("Iloraz: "+ calc.divide(pliczba,dliczba));
	}
}
