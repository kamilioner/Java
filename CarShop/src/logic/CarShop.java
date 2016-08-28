package logic;

import data.Car;

public class CarShop {

	public static void main(String[] args) {

		Car car1 = new Car(1993, "Polonez", "domyœlny", "czarny");

		System.out.println("Niezyt " + "d³ugi " + "napis");

		System.out.print("To jest " + car1.getColor() + " " + car1.getBrand() + " z roku " + car1.getYear());

	}

}
