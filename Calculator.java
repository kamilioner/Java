public class Calculator{
	
	//double number1;
	//double number2;
	
	double add(double a,double b){
		return (a+b);
	}
	double subtract(double a,double b){
		return (a-b);
	}
	double multiply(double a,double b){
		return (a*b);
	}
	double divide(double a,double b){
		if (b == 0) {
			System.out.println("Nie mozna dzieliz przez 0!");
			
			return 0;
			
			}
		else return (a/b);
	}
	
}