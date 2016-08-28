package pizzaapp;

import java.util.Scanner;
 
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dost�pne pizze:");
        for(Pizza p: Pizza.values()) {
            System.out.println(p);
        }
         
        Scanner input = new Scanner(System.in);
        System.out.println("Jak� pizz� wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
         
        System.out.println("Dzi�kujemy za zam�wienie pizzy " + pizza.name());
        input.close();
    }
}