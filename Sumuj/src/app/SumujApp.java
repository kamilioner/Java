package app;

import java.util.Scanner;

public class SumujApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iterator;
		int suma = 0;
		
		System.out.println("Ile wstawic liczb?");
		iterator = sc.nextInt();
		System.out.println();
		while (iterator!=0){
			System.out.println("wstaw liczbe");
			suma = suma + sc.nextInt(); 
			iterator--;
		};
		sc.close();
		System.out.println("Suma to: "+suma);
		
	}
	
}
